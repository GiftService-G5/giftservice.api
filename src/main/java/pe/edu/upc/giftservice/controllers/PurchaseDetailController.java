package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insertar(@RequestBody PurchaseDetailDTO PurchaseDetailDTO) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = m.map(PurchaseDetailDTO, PurchaseDetail.class);
        pdS.insert(e);
    }

    @GetMapping
    public List<PurchaseDetailDTO> list() {
        return pdS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, PurchaseDetailDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        pdS.delete(id);
    }

    @PutMapping
    public void update(@RequestBody PurchaseDetailDTO PurchaseDetailDTO) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = m.map(PurchaseDetailDTO, PurchaseDetail.class);
        pdS.update(e);
    }

    @GetMapping("/{id}")
    public PurchaseDetailDTO listById(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        PurchaseDetail e = pdS.getById(id);
        return m.map(e, PurchaseDetailDTO.class);
    }
}
