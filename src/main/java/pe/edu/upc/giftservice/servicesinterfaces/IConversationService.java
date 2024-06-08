package pe.edu.upc.giftservice.servicesinterfaces;

import pe.edu.upc.giftservice.entities.Conversation;

import java.util.List;

public interface IConversationService {
    public void insert(Conversation conversation);
    public void delete(int id);
    public List<Conversation> list();
    public List<Conversation> findAllByUserEntrepre(int id_entre, int id_user);
}
