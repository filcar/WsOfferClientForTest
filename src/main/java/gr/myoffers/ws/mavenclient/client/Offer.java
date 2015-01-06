/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.myoffers.ws.mavenclient.client;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author fil
 */
public class Offer {
    private int id;
    private int offerId;
    private int compId;
    private int catId;
    private String offerName;
    private String descr;
    private double disc;
    private double price;
    private Date startdate;
    private Date enddate;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getDisc() {
        return disc;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    
}
