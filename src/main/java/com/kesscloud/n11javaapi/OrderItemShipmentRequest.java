
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemShipmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemShipmentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shipmentInfo" type="{http://www.n11.com/ws/schemas}MakeShipmentInfoRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemShipmentRequest", propOrder = {
    "id",
    "shipmentInfo"
})
public class OrderItemShipmentRequest {

    protected long id;
    @XmlElement(required = true)
    protected MakeShipmentInfoRequest shipmentInfo;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the shipmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MakeShipmentInfoRequest }
     *     
     */
    public MakeShipmentInfoRequest getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * Sets the value of the shipmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeShipmentInfoRequest }
     *     
     */
    public void setShipmentInfo(MakeShipmentInfoRequest value) {
        this.shipmentInfo = value;
    }

}
