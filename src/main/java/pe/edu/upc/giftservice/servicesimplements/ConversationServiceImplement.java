package pe.edu.upc.giftservice.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.giftservice.entities.Conversation;
import pe.edu.upc.giftservice.repositories.IConversationRepository;
import pe.edu.upc.giftservice.servicesinterfaces.IConversationService;

import java.util.List;

@Service
public class ConversationServiceImplement implements IConversationService {
    @Autowired
    private IConversationRepository cR;
    @Override
    public void insert(Conversation conversation) {
        cR.save(conversation);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<Conversation> list() {
        return cR.findAll();
    }

    @Override
    public List<Conversation> findAllByUserEntrepre(int id_entre, int id_user) {
        return cR.findAllByUserEntrepre(id_entre, id_user);
    }


}
