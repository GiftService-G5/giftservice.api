package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserWeb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    @Column(name = "password", nullable = false, length = 18)
    private String password;
    @Column(name = "realname", nullable = false, length = 50)
    private String realname;
    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;
    @Column(name = "mail", nullable = false, length = 50)
    private String mail;
    @Column(name = "contact", nullable = false)
    private int contact;
    @Column(name = "address", nullable = false, length = 30)
    private String address;

    @ManyToOne
    @JoinColumn(name = "cityId")
    private City ciTy;

    public User() {
    }

    public User(int idUser, String username, String password, String realname, String lastName, String mail, int contact, String address, City ciTy) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.lastName = lastName;
        this.mail = mail;
        this.contact = contact;
        this.address = address;
        this.ciTy = ciTy;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCiTy() {
        return ciTy;
    }

    public void setCiTy(City ciTy) {
        this.ciTy = ciTy;
    }
}


