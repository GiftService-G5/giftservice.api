package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.LowScoreOneToThree;
import pe.edu.upc.giftservice.dtos.ReviewsDTO;
import pe.edu.upc.giftservice.entities.Reviews;
import pe.edu.upc.giftservice.servicesinterfaces.IReviewsService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ReviewsController")
@PreAuthorize("hasAnyAuthority('USUARIO','EMPRENDIMIENTO','ADMIN')")
public class ReviewsController {

    @Autowired
    private IReviewsService rS;
    @PostMapping
    @PreAuthorize("hasAnyAuthority('USUARIO')")
    public void insertar(@RequestBody ReviewsDTO reviewsDTO){
        ModelMapper m=new ModelMapper();
        Reviews e=m.map(reviewsDTO, Reviews.class);
        rS.insert(e);
    }

    @GetMapping
    public List<ReviewsDTO> list(){
        return rS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ReviewsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('USUARIO')")
    public void delete(@PathVariable("id") int id){
        rS.delete(id);
    }


    @GetMapping("/TotalPuntoPorProdductoyEmprendimiento")
    public int TotalPuntosPorProductoYEmprendimiento(@RequestParam int product_id, int entrepreneurship_id){
        return rS.TotalScoreByProduct(product_id,entrepreneurship_id);
    }
    @GetMapping("/ProductosConCalificaionBajaUnoATres")
    public List<LowScoreOneToThree> ProductosConBajaCalificacion(){
        List<String[]> filaLista= rS.LowScoreProduct();
        List<LowScoreOneToThree> dtoLista=new ArrayList<>();
        for(String [] columna:filaLista){
            LowScoreOneToThree dto=new LowScoreOneToThree();
            dto.setIdProducto(Integer.parseInt(columna[0]));
            dto.setNameProduct(columna[1]);
            dto.setDescriptionProduct(columna[2]);
            dto.setLowScore(Double.parseDouble(columna[3]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
