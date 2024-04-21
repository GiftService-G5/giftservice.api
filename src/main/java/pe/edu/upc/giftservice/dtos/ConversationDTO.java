package pe.edu.upc.giftservice.dtos;

import pe.edu.upc.giftservice.entities.Entrepreneurship;
import pe.edu.upc.giftservice.entities.Users;

import java.time.LocalDate;

public class ConversationDTO {
    private int idConversation;
    private LocalDate DateConversation;
    private String TextConversation;
    private Entrepreneurship entrepreneurship;
    private Users users;

    public int getIdConversation() {
        return idConversation;
    }
    public void setIdConversation(int idConversation) {
        this.idConversation = idConversation;
    }
    public LocalDate getDateConversation() {
        return DateConversation;
    }
    public void setDateConversation(LocalDate dateConversation) {
        DateConversation = dateConversation;
    }

    public String getTextConversation() {
        return TextConversation;
    }

    public void setTextConversation(String textConversation) {
        TextConversation = textConversation;
    }

    public Entrepreneurship getEntrepreneurship() {
        return entrepreneurship;
    }

    public void setEntrepreneurship(Entrepreneurship entrepreneurship) {
        this.entrepreneurship = entrepreneurship;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }
}
