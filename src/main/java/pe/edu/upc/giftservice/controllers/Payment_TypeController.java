package pe.edu.upc.giftservice.controllers;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.Payment_TypeDTO;
import pe.edu.upc.giftservice.entities.Payment_Type;
import pe.edu.upc.giftservice.servicesinterfaces.IPayment_TypeService;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_pago")
public class Payment_TypeController {
    @Autowired
    private IPayment_TypeService iP;

    @PostMapping
    public void insert(@RequestBody Payment_TypeDTO paymentTypeDTO){
        ModelMapper m=new ModelMapper();
        Payment_Type p=m.map(paymentTypeDTO,Payment_Type.class);
        iP.insert(p);
    }

    @GetMapping
    public List<Payment_TypeDTO> list(){
        return  iP.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, Payment_TypeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iP.delete(id);
    }
    @GetMapping("/buscar")
    public Payment_TypeDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        Payment_TypeDTO dto = m.map(iP.listId(id), Payment_TypeDTO.class);
        return dto;
    }
}
