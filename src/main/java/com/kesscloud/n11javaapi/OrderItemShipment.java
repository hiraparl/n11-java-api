
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemShipment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sellerDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="mallDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentInfo" type="{http://www.n11.com/ws/schemas}OrderItemShipmentInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemShipment", propOrder = {
    "id",
    "price",
    "sellerDiscount",
    "mallDiscount",
    "commission",
    "status",
    "quantity",
    "productName",
    "shipmentInfo"
})
public class OrderItemShipment {

    protected long id;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigDecimal sellerDiscount;
    @XmlElement(required = true)
    protected BigDecimal mallDiscount;
    @XmlElement(required = true)
    protected BigDecimal commission;
    @XmlElement(required = true)
    protected BigInteger status;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected OrderItemShipmentInfo shipmentInfo;

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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the sellerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellerDiscount() {
        return sellerDiscount;
    }

    /**
     * Sets the value of the sellerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellerDiscount(BigDecimal value) {
        this.sellerDiscount = value;
    }

    /**
     * Gets the value of the mallDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMallDiscount() {
        return mallDiscount;
    }

    /**
     * Sets the value of the mallDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMallDiscount(BigDecimal value) {
        this.mallDiscount = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the shipmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemShipmentInfo }
     *     
     */
    public OrderItemShipmentInfo getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * Sets the value of the shipmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemShipmentInfo }
     *     
     */
    public void setShipmentInfo(OrderItemShipmentInfo value) {
        this.shipmentInfo = value;
    }

}
