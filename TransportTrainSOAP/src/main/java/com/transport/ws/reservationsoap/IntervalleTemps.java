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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour IntervalleTemps complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IntervalleTemps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateArrivee" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tempsDepart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tempsArrivee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalleTemps", propOrder = {
    "id",
    "dateDepart",
    "dateArrivee",
    "tempsDepart",
    "tempsArrivee"
})
public class IntervalleTemps {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDepart;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateArrivee;
    @XmlElement(required = true)
    protected String tempsDepart;
    @XmlElement(required = true)
    protected String tempsArrivee;

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
     * Obtient la valeur de la propriété dateDepart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDepart() {
        return dateDepart;
    }

    /**
     * Définit la valeur de la propriété dateDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDepart(XMLGregorianCalendar value) {
        this.dateDepart = value;
    }

    /**
     * Obtient la valeur de la propriété dateArrivee.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateArrivee() {
        return dateArrivee;
    }

    /**
     * Définit la valeur de la propriété dateArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateArrivee(XMLGregorianCalendar value) {
        this.dateArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété tempsDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempsDepart() {
        return tempsDepart;
    }

    /**
     * Définit la valeur de la propriété tempsDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempsDepart(String value) {
        this.tempsDepart = value;
    }

    /**
     * Obtient la valeur de la propriété tempsArrivee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempsArrivee() {
        return tempsArrivee;
    }

    /**
     * Définit la valeur de la propriété tempsArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempsArrivee(String value) {
        this.tempsArrivee = value;
    }

}
