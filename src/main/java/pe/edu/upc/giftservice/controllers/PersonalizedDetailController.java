package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.PersonalizedDetailDTO;
import pe.edu.upc.giftservice.entities.PersonalizedDetail;
import pe.edu.upc.giftservice.servicesinterfaces.IPersonalizedDetailService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PersonalizedDetailController")
public class PersonalizedDetailController {
    @Autowired
    private IPersonalizedDetailService ipS;
    @PostMapping
    public void insertar(@RequestBody PersonalizedDetailDTO typeDTO){
        ModelMapper m = new ModelMapper();
        PersonalizedDetail r = m.map(typeDTO, PersonalizedDetail.class);
        ipS.insert(r);
    }

    @GetMapping
    public List<PersonalizedDetailDTO> listar(){
        return ipS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,PersonalizedDetailDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ipS.delete(id);
    }

    @GetMapping("/{id}")
    public PersonalizedDetailDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        PersonalizedDetailDTO dto = m.map(ipS.listId(id), PersonalizedDetailDTO.class);
        return dto;
    }

}
