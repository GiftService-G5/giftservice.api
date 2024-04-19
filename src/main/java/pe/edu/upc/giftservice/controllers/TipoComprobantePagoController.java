package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.TipoComprobantePagoDTO;
import pe.edu.upc.giftservice.entities.TipoComprobantePago;
import pe.edu.upc.giftservice.serviceinterfaces.ITipoComprobantePagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoComprobantePago")
public class TipoComprobantePagoController {
    @Autowired
    private ITipoComprobantePagoService iTCP;

    @PostMapping
    public void insertar(@RequestBody TipoComprobantePagoDTO tipoDTO){
        ModelMapper m = new ModelMapper();
        TipoComprobantePago r = m.map(tipoDTO, TipoComprobantePago.class);
        iTCP.insert(r);
    }
    @GetMapping
    public List<TipoComprobantePagoDTO> listar(){
        return iTCP.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,TipoComprobantePagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iTCP.delete(id);
    }

    @GetMapping("/{id}")
    public TipoComprobantePagoDTO listarID(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TipoComprobantePagoDTO dto = m.map(iTCP.listID(id), TipoComprobantePagoDTO.class);
        return dto;
    }
}
