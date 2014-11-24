/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.myoffers.ws.wsoffer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author fil
 */
@Entity
@Table(name="ABOUT")
@XmlRootElement(name = "about")
@XmlType(propOrder={"id","value"})

public class About {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="FIELD")
    private int id;
    @Column(name="VALUE")
    private String value;
    
@XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@XmlElement
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    

    
}
