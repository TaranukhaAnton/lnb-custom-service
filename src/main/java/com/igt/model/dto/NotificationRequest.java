
package com.igt.model.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",  propOrder = {
    "templateInformation",
    "promotion",
    "transactional",
    "extensions",
    "players"
})
@XmlRootElement
public class NotificationRequest {

    @XmlElement(required = true)
    private TemplateInformation templateInformation;
    private Promotion promotion;
    private Transactional transactional;
    private Map extensions;
    private List<Player> players;

    /**
     * Gets the value of the templateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateInformation }
     *     
     */
    public TemplateInformation getTemplateInformation() {
        return templateInformation;
    }

    /**
     * Sets the value of the templateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateInformation }
     *     
     */
    public void setTemplateInformation(TemplateInformation value) {
        this.templateInformation = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the transactional property.
     * 
     * @return
     *     possible object is
     *     {@link Transactional }
     *     
     */
    public Transactional getTransactional() {
        return transactional;
    }

    /**
     * Sets the value of the transactional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transactional }
     *     
     */
    public void setTransactional(Transactional value) {
        this.transactional = value;
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

    /**
     * Gets the value of the players property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the players property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Player }
     * 
     * 
     */
    public List<Player> getPlayers() {
        if (players == null) {
            players = new ArrayList<Player>();
        }
        return this.players;
    }

}
