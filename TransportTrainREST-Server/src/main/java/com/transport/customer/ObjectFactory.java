//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.05.22 à 11:13:41 PM WAT 
//


package com.transport.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.transport.customer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IntervalleTemps_QNAME = new QName("http://www.transport.com/ws/reservationsoap", "intervalleTemps");
    private final static QName _Train_QNAME = new QName("http://www.transport.com/ws/reservationsoap", "train");
    private final static QName _Client_QNAME = new QName("http://www.transport.com/ws/reservationsoap", "client");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.transport.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntervalleTemps }
     * 
     */
    public IntervalleTemps createIntervalleTemps() {
        return new IntervalleTemps();
    }

    /**
     * Create an instance of {@link Train }
     * 
     */
    public Train createTrain() {
        return new Train();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link GetReservation }
     * 
     */
    public GetReservation createGetReservation() {
        return new GetReservation();
    }

    /**
     * Create an instance of {@link ReservationReponse }
     * 
     */
    public ReservationReponse createReservationReponse() {
        return new ReservationReponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntervalleTemps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.transport.com/ws/reservationsoap", name = "intervalleTemps")
    public JAXBElement<IntervalleTemps> createIntervalleTemps(IntervalleTemps value) {
        return new JAXBElement<IntervalleTemps>(_IntervalleTemps_QNAME, IntervalleTemps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Train }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.transport.com/ws/reservationsoap", name = "train")
    public JAXBElement<Train> createTrain(Train value) {
        return new JAXBElement<Train>(_Train_QNAME, Train.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.transport.com/ws/reservationsoap", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

}
