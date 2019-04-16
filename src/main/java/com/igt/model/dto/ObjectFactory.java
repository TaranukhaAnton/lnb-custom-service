
package com.igt.model.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.igt.model.dto package. 
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

    private final static QName _NotificationRequest_QNAME = new QName("http://schemas.lonalo.local/BizTalk/2015/services/notification/", "notificationRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.igt.model.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationRequest }
     * 
     */
    public NotificationRequest createNotificationRequest() {
        return new NotificationRequest();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link TemplateInformation }
     * 
     */
    public TemplateInformation createTemplateInformation() {
        return new TemplateInformation();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link Audit }
     * 
     */
    public Audit createAudit() {
        return new Audit();
    }

    /**
     * Create an instance of {@link Pos }
     * 
     */
    public Pos createPos() {
        return new Pos();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link Transactional }
     * 
     */
    public Transactional createTransactional() {
        return new Transactional();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl( name = "notificationRequest")
    public JAXBElement<NotificationRequest> createNotificationRequest(NotificationRequest value) {
        return new JAXBElement<NotificationRequest>(_NotificationRequest_QNAME, NotificationRequest.class, null, value);
    }

}
