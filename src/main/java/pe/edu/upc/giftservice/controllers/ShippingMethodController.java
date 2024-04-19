package pe.edu.upc.giftservice.controllers;

import jakarta.persistence.Access;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.giftservice_tipoentrega.dtos.ShippingMethodDTO;
import pe.edu.upc.giftservice.entities.ShippingMethod;
import pe.edu.upc.giftservice.servicesinterfaces.IShippingMethodService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodeentrega")
public class ShippingMethodController {
    @Autowired
    private IShippingMethodService smS;

    @PostMapping
    public void insertar(@RequestBody ShippingMethodDTO shippingMethodDTO) {
        ModelMapper m = new ModelMapper();
        ShippingMethod sm=m.map(shippingMethodDTO, ShippingMethod.class);
        smS.insert(sm);
    }

    @GetMapping
    public List<ShippingMethodDTO> listar() {
        return smS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ShippingMethodDTO.class);
        }).collect(Collectors.toList());
    }
}
