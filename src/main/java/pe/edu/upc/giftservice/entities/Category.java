package pe.edu.upc.giftservice.entities;

import jakarta.persistence.*;

@Table(name = "categories")
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nameCategory", nullable = false)
    private String nameCategory;
    @Column(name = "typeCategory", nullable = false)
    private String typeCategory;

    public Category() {
    }

    public Category(Long id, String nameCategory, String typeCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
        this.typeCategory = typeCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }
}
