package com.p3ps0n.santagrinchs.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Items")
public class Item {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String desc;
    private BigDecimal price;

    public Item(String name, String desc, BigDecimal price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Item() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
