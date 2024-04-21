package pe.edu.upc.giftservice.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.ProductDTO;
import pe.edu.upc.giftservice.entities.Product;
import pe.edu.upc.giftservice.servicesinterfaces.IProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ProductController")
public class ProductController {
    @Autowired
    private IProductService ipS;

    @PostMapping
    public void insertar(@RequestBody ProductDTO productDTO){
        ModelMapper m=new ModelMapper();
        Product e=m.map(productDTO, Product.class);
        ipS.insert(e);
    }

    @GetMapping
    public List<ProductDTO> list(){
        return ipS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        ipS.delete(id);
    }


    @GetMapping("/{id}")
    public ProductDTO listById(@PathVariable("id") int id){
        ModelMapper m=new ModelMapper();
        Product e=ipS.listID(id);
        return m.map(e, ProductDTO.class);
    }

    @GetMapping("/buscarPorCategoria")
    public List<ProductDTO> productosPorCategoria(@RequestParam String nombreC){
        return ipS.productByNameCategory(nombreC).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/buscarPorEmprendimiento")
    public List<ProductDTO> productosPorEmprendimiento(@RequestParam String nombreE){
        return ipS.productByNameEntrepreneurship(nombreE).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/buscarPorNombreProducto")
    public List<ProductDTO> productosPorNombre(@RequestParam String nombreP){
        return ipS.productByName(nombreP).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductDTO.class);
        }).collect(Collectors.toList());
    }
}
