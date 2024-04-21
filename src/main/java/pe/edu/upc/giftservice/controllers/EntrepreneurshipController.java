package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.EntrepreneurshipDTO;
import pe.edu.upc.giftservice.entities.Entrepreneurship;
import pe.edu.upc.giftservice.servicesinterfaces.IEntrepreneurshipService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entrepreneurships")
public class EntrepreneurshipController {
    @Autowired
    private IEntrepreneurshipService iE;

    @PostMapping
    public void insertar(@RequestBody EntrepreneurshipDTO entrepreneurshipDTO){
        ModelMapper m=new ModelMapper();
        Entrepreneurship e=m.map(entrepreneurshipDTO, Entrepreneurship.class);
        iE.insert(e);
    }

    @GetMapping
    public List<EntrepreneurshipDTO> list(){
        return iE.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, EntrepreneurshipDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        iE.delete(id);
    }

    @PutMapping
    public void update(@RequestBody EntrepreneurshipDTO entrepreneurshipDTO){
        ModelMapper m=new ModelMapper();
        Entrepreneurship e=m.map(entrepreneurshipDTO, Entrepreneurship.class);
        iE.update(e);
    }

    @GetMapping("/{id}")
    public EntrepreneurshipDTO listById(@PathVariable("id") Long id){
        ModelMapper m=new ModelMapper();
        Entrepreneurship e=iE.getById(id);
        return m.map(e, EntrepreneurshipDTO.class);
    }
}
