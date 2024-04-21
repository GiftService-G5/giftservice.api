package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.ReceiptTypeDTO;
import pe.edu.upc.giftservice.entities.ReceiptType;
import pe.edu.upc.giftservice.servicesinterfaces.IReceiptTypeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipo_comprobante_pago")
@PreAuthorize("hasAnyAuthority('USUARIO')")
public class ReceiptTypeController {
    @Autowired
    private IReceiptTypeService iR;

    @PostMapping
    public void insert(@RequestBody ReceiptTypeDTO ReceiptTypeDTO){
        ModelMapper m=new ModelMapper();
        ReceiptType p=m.map(ReceiptTypeDTO, ReceiptType.class);
        iR.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('USUARIO','ADMIN')")
    public List<ReceiptTypeDTO> list(){
        return  iR.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ReceiptTypeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iR.delete(id);
    }

}
