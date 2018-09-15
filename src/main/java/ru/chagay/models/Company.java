package ru.chagay.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Lob
    @Column(name="descript", columnDefinition="blob")
    private byte[] descript;

    @Lob
    @Column(name="address", columnDefinition="blob")
    private byte[] address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Advertisement> ads;

    public Company() {
    }

    public Company(String name, byte[] descript, byte[] address) {
        this.name = name;
        this.descript = descript;
        this.address = address;
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

    public byte[] getDescript() {
        return descript;
    }

    public void setDescript(byte[] descript) {
        this.descript = descript;
    }

    public byte[] getAddress() {
        return address;
    }

    public void setAddress(byte[] address) {
        this.address = address;
    }
}