package aode.lx.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Date;

/**
*@author: 黄柏樟
*@date: 2015/6/19
*@explain:
*/
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
@Entity
@Table(name="product")
public class Product {
    private String id;
    /*名称*/
    private String name;
    /*单价*/
    private double money;
    /*介绍*/
    private String introduction;
    /*时间*/
    private Date date;
    /** 图片*/
    private String picture;
    /*类型*/
    private ProductType productType = new ProductType();

    @Id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    public ProductType getProductType() {
        return productType;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    @Column(columnDefinition="text")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", introduction='" + introduction + '\'' +
                ", date=" + date +
                ", picture='" + picture + '\'' +
                ", productType=" + productType.getId() +
                '}';
    }
}
