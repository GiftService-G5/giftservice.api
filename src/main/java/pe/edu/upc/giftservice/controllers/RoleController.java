package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.RoleDTO;
import pe.edu.upc.giftservice.entities.Role;
import pe.edu.upc.giftservice.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("roles")
public class RoleController {
    @Autowired
    private IRoleService iR;

    @PostMapping
    public void insertar(@RequestBody RoleDTO roleDTO){
        ModelMapper m=new ModelMapper();
        Role r=m.map(roleDTO, Role.class);
        iR.insert(r);
    }

    @GetMapping
    public List<RoleDTO> listar(){
        return iR.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ iR.delete(id);}

    @GetMapping("/{id}")
    public RoleDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(iR.listId(id), RoleDTO.class);
        return dto;
    }
}
