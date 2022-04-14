
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MakeShipmentInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakeShipmentInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipmentCompany" type="{http://www.n11.com/ws/schemas}ShipmentCompanyRequest"/&gt;
 *         &lt;element name="campaignNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentMethod" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeShipmentInfoRequest", propOrder = {
    "shipmentCompany",
    "campaignNumber",
    "trackingNumber",
    "shipmentMethod"
})
public class MakeShipmentInfoRequest {

    @XmlElement(required = true)
    protected ShipmentCompanyRequest shipmentCompany;
    @XmlElement(required = true)
    protected String campaignNumber;
    @XmlElement(required = true)
    protected String trackingNumber;
    @XmlElement(required = true)
    protected BigInteger shipmentMethod;

    /**
     * Gets the value of the shipmentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompanyRequest }
     *     
     */
    public ShipmentCompanyRequest getShipmentCompany() {
        return shipmentCompany;
    }

    /**
     * Sets the value of the shipmentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompanyRequest }
     *     
     */
    public void setShipmentCompany(ShipmentCompanyRequest value) {
        this.shipmentCompany = value;
    }

    /**
     * Gets the value of the campaignNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignNumber() {
        return campaignNumber;
    }

    /**
     * Sets the value of the campaignNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignNumber(String value) {
        this.campaignNumber = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the shipmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShipmentMethod() {
        return shipmentMethod;
    }

    /**
     * Sets the value of the shipmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShipmentMethod(BigInteger value) {
        this.shipmentMethod = value;
    }

}
