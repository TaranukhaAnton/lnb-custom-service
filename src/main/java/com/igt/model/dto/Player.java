
package com.igt.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Player identifies a LoNaLo player (eLotto,
 * 				LotteryClub, Subscription)
 * 
 * <p>Java class for Player complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Player">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ids" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}identifier"/>
 *         &lt;element name="gender" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}Gender" minOccurs="0"/>
 *         &lt;element name="greeting" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}Greeting" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}Address" minOccurs="0"/>
 *         &lt;element name="balances" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}map" minOccurs="0"/>
 *         &lt;element name="preferredPos" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}Pos" minOccurs="0"/>
 *         &lt;element name="preferences" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}Preference"/>
 *         &lt;element name="audit" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}Audit"/>
 *         &lt;element name="extensions" type="{http://schemas.lonalo.local/BizTalk/2015/services/notification/}map" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Player",  propOrder = {
    "ids",
    "gender",
    "greeting",
    "firstName",
    "lastName",
    "email",
    "address",
    "balances",
    "preferredPos",
    "preferences",
    "audit",
    "extensions"
})
public class Player {

    @XmlElement(required = true)
    private Identifier ids;
    @XmlSchemaType(name = "string")
    private Gender gender;
    private String greeting;
    @XmlElement(required = true)
    private String firstName;
    @XmlElement(required = true)
    private String lastName;
    @XmlElement(required = true)
    private String email;
    private Address address;
    private Map balances;
    private Pos preferredPos;
    @XmlElement(required = true)
    private Preference preferences;
    @XmlElement(required = true)
    private Audit audit;
    private Map extensions;

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIds(Identifier value) {
        this.ids = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGreeting(String value) {
        this.greeting = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setBalances(Map value) {
        this.balances = value;
    }

    /**
     * Gets the value of the preferredPos property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getPreferredPos() {
        return preferredPos;
    }

    /**
     * Sets the value of the preferredPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setPreferredPos(Pos value) {
        this.preferredPos = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preference }
     *     
     */
    public Preference getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preference }
     *     
     */
    public void setPreferences(Preference value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setExtensions(Map value) {
        this.extensions = value;
    }

}
