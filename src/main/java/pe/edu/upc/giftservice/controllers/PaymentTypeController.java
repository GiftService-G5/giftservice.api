package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.PaymentTypeDTO;
import pe.edu.upc.giftservice.entities.PaymentType;
import pe.edu.upc.giftservice.servicesinterfaces.IPaymentTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_pago")
@PreAuthorize("hasAnyAuthority('ADMIN')")
public class PaymentTypeController {
    @Autowired
    private IPaymentTypeService iP;

    @PostMapping
    public void insert(@RequestBody PaymentTypeDTO paymentTypeDTO){
        ModelMapper m=new ModelMapper();
        PaymentType p=m.map(paymentTypeDTO, PaymentType.class);
        iP.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('USUARIO', 'ADMIN')")
    public List<PaymentTypeDTO> list(){
        return  iP.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PaymentTypeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iP.delete(id);
    }

    @PutMapping
    public void update(@RequestBody PaymentTypeDTO dto) {
        ModelMapper m = new ModelMapper();
        PaymentType u = m.map(dto, PaymentType.class);
        iP.insert(u);
    }
}


