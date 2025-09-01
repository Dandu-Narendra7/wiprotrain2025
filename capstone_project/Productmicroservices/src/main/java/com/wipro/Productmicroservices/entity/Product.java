package com.wipro.Productmicroservices.entity;


import jakarta.persistence.*; 
import java.time.LocalDate;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="prod_name",nullable = false, length = 120)
    private String prodName;

    @Column(name="prod_desc",length = 2000)
    private String prodDesc;

    @Column(name="prod_cat",length = 120)
    private String prodCat;

    @Column(length = 120)
    private String make;

    @Column(name="availabe_qty")
    private Integer availableQty;

    private Double price;

    @Column(length = 20)
    private String uom; // litre, kg, pc

    @Column(name="prod_rating")
    private Double prodRating;

    @Column(name="imageurl")
    private String imageurl;

    @Column(name="date_of_manufacture")
    private LocalDate dateOfManufacture;

    public Product() {}

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getProdName() { return prodName; }
    public void setProdName(String prodName) { this.prodName = prodName; }

    public String getProdDesc() { return prodDesc; }
    public void setProdDesc(String prodDesc) { this.prodDesc = prodDesc; }

    public String getProdCat() { return prodCat; }
    public void setProdCat(String prodCat) { this.prodCat = prodCat; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public Integer getAvailableQty() { return availableQty; }
    public void setAvailableQty(Integer availableQty) { this.availableQty = availableQty; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getUom() { return uom; }
    public void setUom(String uom) { this.uom = uom; }

    public Double getProdRating() { return prodRating; }
    public void setProdRating(Double prodRating) { this.prodRating = prodRating; }

    public String getImageURL() { return imageurl; }
    public void setImageURL(String imageurl) { this.imageurl = imageurl; }

    public LocalDate getDateOfManufacture() { return dateOfManufacture; }
    public void setDateOfManufacture(LocalDate dateOfManufacture) { this.dateOfManufacture = dateOfManufacture; }
}
