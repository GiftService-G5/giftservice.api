package pe.edu.upc.giftservice.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.giftservice.dtos.NotificationDTO;
import pe.edu.upc.giftservice.entities.Notification;
import pe.edu.upc.giftservice.servicesinterfaces.INotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private INotificationService iN;
    @PostMapping
    public void insertar(@RequestBody NotificationDTO notificationDTO){
        ModelMapper m=new ModelMapper();
        Notification n=m.map(notificationDTO, Notification.class);
        iN.insert(n);
    }

    @GetMapping
    public List<NotificationDTO> listar(){
        return iN.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, NotificationDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){ iN.delete(id);}
}
