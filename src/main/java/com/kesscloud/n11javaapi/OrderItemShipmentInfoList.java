
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemShipmentInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemShipmentInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingAddress" type="{http://www.n11.com/ws/schemas}AddressModel"/&gt;
 *         &lt;element name="deliveryPointMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderItemIds" type="{http://www.n11.com/ws/schemas}OrderItemIdList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemShipmentInfoList", propOrder = {
    "shippingAddress",
    "deliveryPointMessage",
    "orderItemIds"
})
public class OrderItemShipmentInfoList {

    @XmlElement(required = true)
    protected AddressModel shippingAddress;
    @XmlElement(required = true)
    protected String deliveryPointMessage;
    @XmlElement(required = true)
    protected OrderItemIdList orderItemIds;

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModel }
     *     
     */
    public AddressModel getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModel }
     *     
     */
    public void setShippingAddress(AddressModel value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the deliveryPointMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPointMessage() {
        return deliveryPointMessage;
    }

    /**
     * Sets the value of the deliveryPointMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPointMessage(String value) {
        this.deliveryPointMessage = value;
    }

    /**
     * Gets the value of the orderItemIds property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemIdList }
     *     
     */
    public OrderItemIdList getOrderItemIds() {
        return orderItemIds;
    }

    /**
     * Sets the value of the orderItemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemIdList }
     *     
     */
    public void setOrderItemIds(OrderItemIdList value) {
        this.orderItemIds = value;
    }

}
