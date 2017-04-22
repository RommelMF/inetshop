package shop.models.impl;

import org.hibernate.validator.constraints.Length;
import shop.models.Product;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by Home on 22.04.2017.
 */
@Entity
@Table(name = "stones")
@SequenceGenerator(sequenceName = "stone_seq", name = "stoneSequence" )
public class Stone implements Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stoneSequence")
    @Column(name = "id")
    private long id;

    @Length(min = 3, max = 50)
    @Column(name = "name")
    private String name;

    @Length(min = 5, max = 300)
    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private double cost;

    @Column(name = "quantity")
    private long quantity;

    @OneToMany(mappedBy = "stones", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Map<String, String> mapCharacters;

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public long getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity() {
        this.quantity = quantity;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Map<String, String> getMapCharacters() {
        return mapCharacters;
    }

    @Override
    public void setMapCharacters(Map<String, String> map) {
        this.mapCharacters = map;
    }
}
