package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.PurchaseDetailDTO;
import pe.edu.upc.giftservice.entities.PurchaseDetail;
import pe.edu.upc.giftservice.servicesinterfaces.IPurchaseDetailService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PurchaseDetails")
public class PurchaseDetailController {
    @Autowired
    private IPurchaseDetailService pdS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('USUARIO')")
    public void insertar(@RequestBody PurchaseDetailDTO PurchaseDetailDTO) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = m.map(PurchaseDetailDTO, PurchaseDetail.class);
        pdS.insert(e);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDEDOR','ADMIN')")
    public List<PurchaseDetailDTO> list() {
        return pdS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, PurchaseDetailDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDEDOR')")
    public void delete(@PathVariable("id") int id) {
        pdS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void update(@RequestBody PurchaseDetailDTO PurchaseDetailDTO) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = m.map(PurchaseDetailDTO, PurchaseDetail.class);
        pdS.update(e);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public PurchaseDetailDTO listById(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = pdS.getById(id);
        return m.map(e, PurchaseDetailDTO.class);
    }
}
