//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.05.22 à 09:11:33 PM WAT 
//


package com.transport.ws.reservationsoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Train complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Train">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="villeDepart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="villeArrivee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intervalleTemps" type="{http://www.transport.com/ws/reservationsoap}IntervalleTemps"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train", propOrder = {
    "id",
    "villeDepart",
    "villeArrivee",
    "intervalleTemps"
})
public class Train {

    protected long id;
    @XmlElement(required = true)
    protected String villeDepart;
    @XmlElement(required = true)
    protected String villeArrivee;
    @XmlElement(required = true)
    protected IntervalleTemps intervalleTemps;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété villeDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleDepart() {
        return villeDepart;
    }

    /**
     * Définit la valeur de la propriété villeDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleDepart(String value) {
        this.villeDepart = value;
    }

    /**
     * Obtient la valeur de la propriété villeArrivee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleArrivee() {
        return villeArrivee;
    }

    /**
     * Définit la valeur de la propriété villeArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleArrivee(String value) {
        this.villeArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété intervalleTemps.
     * 
     * @return
     *     possible object is
     *     {@link IntervalleTemps }
     *     
     */
    public IntervalleTemps getIntervalleTemps() {
        return intervalleTemps;
    }

    /**
     * Définit la valeur de la propriété intervalleTemps.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalleTemps }
     *     
     */
    public void setIntervalleTemps(IntervalleTemps value) {
        this.intervalleTemps = value;
    }

}
