/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.myoffers.ws.wsoffrer.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author fil
 */
@XmlRootElement(name = "offer")
@XmlType(propOrder={"id","descr","axia"})
public class Offer {
    private int id;
    private String descr;
    private double axia;
@XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@XmlElement
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
@XmlElement
    public double getAxia() {
        return axia;
    }

    public void setAxia(double axia) {
        this.axia = axia;
    }
    
}
