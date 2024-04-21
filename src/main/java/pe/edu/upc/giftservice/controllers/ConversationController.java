package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.ConversationDTO;
import pe.edu.upc.giftservice.entities.Conversation;
import pe.edu.upc.giftservice.servicesinterfaces.IConversationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Conversation")
public class ConversationController {
    @Autowired
    private IConversationService cS;

    @PostMapping
    public void insertar(@RequestBody ConversationDTO conversationDTO) {
        ModelMapper m = new ModelMapper();
        Conversation e = m.map(conversationDTO, Conversation.class);
        cS.insert(e);
    }

    @GetMapping
    public List<ConversationDTO> list() {
        return cS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ConversationDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        cS.delete(id);
    }


    @GetMapping("/Mensajes")
    public List<ConversationDTO> listByUserID(@RequestParam int id_user,@RequestParam int id_entre){
        return  cS.findAllByUserEntrepre(id_user,id_entre).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ConversationDTO.class);
        }).collect(Collectors.toList());
    }


}
