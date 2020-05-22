//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.05.22 à 11:13:41 PM WAT 
//


package com.transport.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="train" type="{http://www.transport.com/ws/reservationsoap}Train"/&gt;
 *         &lt;element name="client" type="{http://www.transport.com/ws/reservationsoap}Client"/&gt;
 *         &lt;element name="dateReservation" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tempsReservation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isReserve" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "train",
    "client",
    "dateReservation",
    "tempsReservation",
    "isReserve"
})
@XmlRootElement(name = "ReservationReponse")
public class ReservationReponse {

    @XmlElement(required = true)
    protected Train train;
    @XmlElement(required = true)
    protected Client client;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReservation;
    @XmlElement(required = true)
    protected String tempsReservation;
    protected boolean isReserve;

    /**
     * Obtient la valeur de la propriété train.
     * 
     * @return
     *     possible object is
     *     {@link Train }
     *     
     */
    public Train getTrain() {
        return train;
    }

    /**
     * Définit la valeur de la propriété train.
     * 
     * @param value
     *     allowed object is
     *     {@link Train }
     *     
     */
    public void setTrain(Train value) {
        this.train = value;
    }

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété dateReservation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReservation() {
        return dateReservation;
    }

    /**
     * Définit la valeur de la propriété dateReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReservation(XMLGregorianCalendar value) {
        this.dateReservation = value;
    }

    /**
     * Obtient la valeur de la propriété tempsReservation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempsReservation() {
        return tempsReservation;
    }

    /**
     * Définit la valeur de la propriété tempsReservation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempsReservation(String value) {
        this.tempsReservation = value;
    }

    /**
     * Obtient la valeur de la propriété isReserve.
     * 
     */
    public boolean isIsReserve() {
        return isReserve;
    }

    /**
     * Définit la valeur de la propriété isReserve.
     * 
     */
    public void setIsReserve(boolean value) {
        this.isReserve = value;
    }

}
