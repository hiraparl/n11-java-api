
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
 *         &lt;element name="orderItemList" type="{http://www.n11.com/ws/schemas}OrderItemDataListRequest"/&gt;
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
    "orderItemList"
})
@XmlRootElement(name = "ComplementaryItemDetailRequest")
public class ComplementaryItemDetailRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    @XmlElement(required = true)
    protected OrderItemDataListRequest orderItemList;

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
     *     {@link OrderItemDataListRequest }
     *     
     */
    public OrderItemDataListRequest getOrderItemList() {
        return orderItemList;
    }

    /**
     * Sets the value of the orderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDataListRequest }
     *     
     */
    public void setOrderItemList(OrderItemDataListRequest value) {
        this.orderItemList = value;
    }

}
