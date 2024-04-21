package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.DeliveryTypeDTO;
import pe.edu.upc.giftservice.entities.DeliveryType;
import pe.edu.upc.giftservice.servicesinterfaces.IDeliveryTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_de_entrega")
public class DeliveryTypeController {
    @Autowired
    private IDeliveryTypeService iD;

    @PostMapping
    public void insert(@RequestBody DeliveryTypeDTO DeliveryTypeDTO) {
        ModelMapper m = new ModelMapper();
        DeliveryType p = m.map(DeliveryTypeDTO, DeliveryType.class);
        iD.insert(p);
    }

    @GetMapping
    public List<DeliveryTypeDTO> list() {
        return iD.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, DeliveryTypeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iD.delete(id);
    }

}
