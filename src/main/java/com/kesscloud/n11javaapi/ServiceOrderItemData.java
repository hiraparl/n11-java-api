
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOrderItemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOrderItemData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderItemType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="installmentChargeWithVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalDiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sellerInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="orderItemList" type="{http://www.n11.com/ws/schemas}ProductOrderItemList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOrderItemData", propOrder = {
    "orderItemType",
    "installmentChargeWithVAT",
    "price",
    "totalDiscountPrice",
    "quantity",
    "sellerInvoiceAmount",
    "orderItemList"
})
public class ServiceOrderItemData {

    protected int orderItemType;
    @XmlElement(required = true)
    protected BigDecimal installmentChargeWithVAT;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigDecimal totalDiscountPrice;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected BigDecimal sellerInvoiceAmount;
    @XmlElement(required = true)
    protected ProductOrderItemList orderItemList;

    /**
     * Gets the value of the orderItemType property.
     * 
     */
    public int getOrderItemType() {
        return orderItemType;
    }

    /**
     * Sets the value of the orderItemType property.
     * 
     */
    public void setOrderItemType(int value) {
        this.orderItemType = value;
    }

    /**
     * Gets the value of the installmentChargeWithVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentChargeWithVAT() {
        return installmentChargeWithVAT;
    }

    /**
     * Sets the value of the installmentChargeWithVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentChargeWithVAT(BigDecimal value) {
        this.installmentChargeWithVAT = value;
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
     * Gets the value of the totalDiscountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDiscountPrice() {
        return totalDiscountPrice;
    }

    /**
     * Sets the value of the totalDiscountPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDiscountPrice(BigDecimal value) {
        this.totalDiscountPrice = value;
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
     * Gets the value of the sellerInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellerInvoiceAmount() {
        return sellerInvoiceAmount;
    }

    /**
     * Sets the value of the sellerInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellerInvoiceAmount(BigDecimal value) {
        this.sellerInvoiceAmount = value;
    }

    /**
     * Gets the value of the orderItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderItemList }
     *     
     */
    public ProductOrderItemList getOrderItemList() {
        return orderItemList;
    }

    /**
     * Sets the value of the orderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderItemList }
     *     
     */
    public void setOrderItemList(ProductOrderItemList value) {
        this.orderItemList = value;
    }

}
