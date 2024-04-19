package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.CityDTO;
import pe.edu.upc.giftservice.entities.City;
import pe.edu.upc.giftservice.servicesinterfaces.ICityService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Ciudades")
public class CityController {
    @Autowired
    private ICityService icS;

    @PostMapping
    public void insertar(@RequestBody CityDTO cityDTO){
        ModelMapper m=new ModelMapper();
        City ct=m.map(cityDTO, City.class);
        icS.insert(ct);
    }

    @GetMapping
    public List<CityDTO> listar(){
        return icS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, CityDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ icS.delete(id);}
}
