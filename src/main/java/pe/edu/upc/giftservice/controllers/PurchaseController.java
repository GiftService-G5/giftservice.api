package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.PurchaseDTO;
import pe.edu.upc.giftservice.dtos.QuantityByTypeDeliveryDTO;
import pe.edu.upc.giftservice.dtos.RankingPaymentTypesUsedDTO;
import pe.edu.upc.giftservice.entities.Purchase;
import pe.edu.upc.giftservice.servicesinterfaces.IPurchaseService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Purchase")
@PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDIMIENTO', 'ADMIN')")
public class PurchaseController {
    @Autowired
    private IPurchaseService pS;
    @PostMapping
    @PreAuthorize("hasAnyAuthority('USUARIO')")
    public void insert(@RequestBody PurchaseDTO paymentTypeDTO){
        ModelMapper m=new ModelMapper();
        Purchase p=m.map(paymentTypeDTO,Purchase.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PurchaseDTO> list(){
        return  pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, PurchaseDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USUARIO')")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
    @PutMapping
    @PreAuthorize("hasAnyAuthority('EMPRENDIMIENTO', 'ADMIN')")
    public void update(@RequestBody PurchaseDTO purchaseDTO) {
        ModelMapper m = new ModelMapper();
        Purchase e = m.map(purchaseDTO, Purchase.class);
        pS.update(e);
    }
    @GetMapping("CantidadDeTipoDeDeliveryDelTotalDeCompras")
    @PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDIMIENTO', 'ADMIN')")
    public List<QuantityByTypeDeliveryDTO> cantidadPorTipoDeEntrega(){
        List<String[]> filaLista= pS.QuantityByTypeDelivery();
        List<QuantityByTypeDeliveryDTO> dtoLista=new ArrayList<>();
        for(String [] columna:filaLista){
            QuantityByTypeDeliveryDTO dto=new QuantityByTypeDeliveryDTO();
            dto.setTotalpurchase(Integer.parseInt(columna[0]));
            dto.setNameTypeDelivery(columna[1]);
            dto.setQuantityTypeDelivery(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/Ranking_payment_type_used")
    public List<RankingPaymentTypesUsedDTO> RankingPaymentTypesUsed(@RequestParam Long id){
        List<String[]> filaLista= pS.RankingPaymentTypesUsed(id);
        List<RankingPaymentTypesUsedDTO> dtoLista=new ArrayList<>();
        for(String [] columna:filaLista){
            RankingPaymentTypesUsedDTO dto=new RankingPaymentTypesUsedDTO();
            dto.setNamePaymentType(columna[0]);
            dto.setTotal(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
