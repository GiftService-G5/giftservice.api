package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Conversation")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConversation;
    @Column(name = "DateConversation", nullable = false)
    private LocalDate DateConversation;
    @Column(name = "TextConversation", nullable = false)
    private String TextConversation;

    @ManyToOne
    @JoinColumn(name = "Entrepreneurship_id")
    private Entrepreneurship entrepreneurship;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Users users;

    public Conversation() {
    }

    public Conversation(int idConversation, LocalDate dateConversation, String textConversation, Entrepreneurship entrepreneurship, Users users) {
        this.idConversation = idConversation;
        DateConversation = dateConversation;
        TextConversation = textConversation;
        this.entrepreneurship = entrepreneurship;
        this.users = users;
    }

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
