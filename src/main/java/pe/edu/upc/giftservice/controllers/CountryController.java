package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.CountryDTO;
import pe.edu.upc.giftservice.entities.Country;
import pe.edu.upc.giftservice.servicesinterfaces.ICountryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("countries")
public class CountryController {
    @Autowired
    private ICountryService iC;

    @PostMapping
    public void insertar(@RequestBody CountryDTO countryDTO){
        ModelMapper m=new ModelMapper();
        Country c=m.map(countryDTO, Country.class);
        iC.insert(c);
    }

    @GetMapping
    public List<CountryDTO> listar(){
        return iC.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, CountryDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ iC.delete(id);}

}
