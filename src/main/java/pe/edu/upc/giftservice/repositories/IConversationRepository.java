package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Conversation;

import java.util.List;

@Repository
public interface IConversationRepository extends JpaRepository<Conversation,Integer> {
    @Query(value = "SELECT date_conversation,text_conversation,entrepreneurship_id,user_id FROM public.conversation \n" +
            "WHERE  entrepreneurship_id = 1 AND user_id = 1 \n" +
            "ORDER BY date_conversation ASC",nativeQuery = true)
    public List<Conversation> findAllByUserEntrepre(int id_user,int id_entre);


}
