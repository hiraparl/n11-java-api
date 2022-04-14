
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MakeOrderItemShipmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MakeOrderItemShipmentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipmentCompany" type="{http://www.n11.com/ws/schemas}ShipmentCompanyData"/&gt;
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trackingNumberStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="campaignNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeOrderItemShipmentInfo", propOrder = {
    "shipmentCompany",
    "trackingNumber",
    "trackingNumberStatus",
    "campaignNumber",
    "shipmentMethod"
})
public class MakeOrderItemShipmentInfo {

    @XmlElement(required = true, nillable = true)
    protected ShipmentCompanyData shipmentCompany;
    @XmlElement(required = true)
    protected String trackingNumber;
    @XmlElement(required = true)
    protected String trackingNumberStatus;
    @XmlElement(required = true)
    protected String campaignNumber;
    @XmlElement(required = true)
    protected String shipmentMethod;

    /**
     * Gets the value of the shipmentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompanyData }
     *     
     */
    public ShipmentCompanyData getShipmentCompany() {
        return shipmentCompany;
    }

    /**
     * Sets the value of the shipmentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompanyData }
     *     
     */
    public void setShipmentCompany(ShipmentCompanyData value) {
        this.shipmentCompany = value;
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
     * Gets the value of the trackingNumberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberStatus() {
        return trackingNumberStatus;
    }

    /**
     * Sets the value of the trackingNumberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberStatus(String value) {
        this.trackingNumberStatus = value;
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
     * Gets the value of the shipmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMethod() {
        return shipmentMethod;
    }

    /**
     * Sets the value of the shipmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMethod(String value) {
        this.shipmentMethod = value;
    }

}
