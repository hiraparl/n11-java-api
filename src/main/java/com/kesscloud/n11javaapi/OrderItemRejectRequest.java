
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://www.n11.com/ws/schemas}Authentication"/&gt;
 *         &lt;element name="orderItemList" type="{http://www.n11.com/ws/schemas}OrderItemDataRequestForRejection"/&gt;
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rejectReasonType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "auth",
    "orderItemList",
    "rejectReason",
    "rejectReasonType"
})
@XmlRootElement(name = "OrderItemRejectRequest")
public class OrderItemRejectRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    @XmlElement(required = true)
    protected OrderItemDataRequestForRejection orderItemList;
    @XmlElement(required = true)
    protected String rejectReason;
    @XmlElement(required = true, nillable = true)
    protected String rejectReasonType;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuth(Authentication value) {
        this.auth = value;
    }

    /**
     * Gets the value of the orderItemList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDataRequestForRejection }
     *     
     */
    public OrderItemDataRequestForRejection getOrderItemList() {
        return orderItemList;
    }

    /**
     * Sets the value of the orderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDataRequestForRejection }
     *     
     */
    public void setOrderItemList(OrderItemDataRequestForRejection value) {
        this.orderItemList = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the rejectReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReasonType() {
        return rejectReasonType;
    }

    /**
     * Sets the value of the rejectReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReasonType(String value) {
        this.rejectReasonType = value;
    }

}
