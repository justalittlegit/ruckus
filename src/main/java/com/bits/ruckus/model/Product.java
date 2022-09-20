package com.bits.ruckus.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "FAMILY")
    private String family;
    @Column(name = "SUB_FAMILY")
    private String subFamily;
    @Column(name = "EXTRA")
    private String extra;
    @Column(name = "REF")
    private String ref;
    @Column(name = "STOCK_QUANTITY")
    private int stockQuantity;
    @Column(name = "PROD_SITE_QUANTITY")
    private int prodSiteQuantity;
    @Column(name = "EXTERNAL_QUANTITY")
    private int externalQuantity;
    @Column(name = "SIZE")
    private float size;
    @Column(name = "METRIC")
    private String metric;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSubFamily() {
        return subFamily;
    }

    public void setSubFamily(String subFamily) {
        this.subFamily = subFamily;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getProdSiteQuantity() {
        return prodSiteQuantity;
    }

    public void setProdSiteQuantity(int prodSideQuantity) {
        this.prodSiteQuantity = prodSideQuantity;
    }

    public int getExternalQuantity() {
        return externalQuantity;
    }

    public void setExternalQuantity(int externalQuantity) {
        this.externalQuantity = externalQuantity;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

}
