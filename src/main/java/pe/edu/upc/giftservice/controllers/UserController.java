package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.UserDTO;
import pe.edu.upc.giftservice.entities.User;
import pe.edu.upc.giftservice.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Usuarios")
public class UserController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void insertar(@RequestBody UserDTO userDTO){
        ModelMapper m=new ModelMapper();
        User us=m.map(userDTO, User.class);
        uS.insert(us);
    }

    @GetMapping
    public List<UserDTO> listar(){
        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ uS.delete(id);}
}
