package ru.chagay.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Advertisement> ads;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
        ads = new ArrayList<Advertisement>();
    }

    public void addAd(Advertisement ad) {
        ad.setCategory(this);
        ads.add(ad);
    }

    public void removeAuto(Advertisement ad) {
        ads.remove(ad);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Advertisement> getAds() {
        return ads;
    }

    public void setAds(List<Advertisement> ads) {
        this.ads = ads;
    }
}