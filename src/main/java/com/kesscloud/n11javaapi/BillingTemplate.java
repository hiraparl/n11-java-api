
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalSellerDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalServiceItemOriginalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="installmentChargeWithVat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sellerInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalMallDiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="dueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingTemplate", propOrder = {
    "originalPrice",
    "totalSellerDiscount",
    "totalServiceItemOriginalPrice",
    "installmentChargeWithVat",
    "sellerInvoiceAmount",
    "totalMallDiscountPrice",
    "dueAmount"
})
public class BillingTemplate {

    @XmlElement(required = true)
    protected BigDecimal originalPrice;
    @XmlElement(required = true)
    protected BigDecimal totalSellerDiscount;
    @XmlElement(required = true)
    protected BigDecimal totalServiceItemOriginalPrice;
    @XmlElement(required = true)
    protected BigDecimal installmentChargeWithVat;
    @XmlElement(required = true)
    protected BigDecimal sellerInvoiceAmount;
    @XmlElement(required = true)
    protected BigDecimal totalMallDiscountPrice;
    @XmlElement(required = true)
    protected BigDecimal dueAmount;

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalPrice(BigDecimal value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the totalSellerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSellerDiscount() {
        return totalSellerDiscount;
    }

    /**
     * Sets the value of the totalSellerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSellerDiscount(BigDecimal value) {
        this.totalSellerDiscount = value;
    }

    /**
     * Gets the value of the totalServiceItemOriginalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalServiceItemOriginalPrice() {
        return totalServiceItemOriginalPrice;
    }

    /**
     * Sets the value of the totalServiceItemOriginalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalServiceItemOriginalPrice(BigDecimal value) {
        this.totalServiceItemOriginalPrice = value;
    }

    /**
     * Gets the value of the installmentChargeWithVat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentChargeWithVat() {
        return installmentChargeWithVat;
    }

    /**
     * Sets the value of the installmentChargeWithVat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentChargeWithVat(BigDecimal value) {
        this.installmentChargeWithVat = value;
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
     * Gets the value of the totalMallDiscountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMallDiscountPrice() {
        return totalMallDiscountPrice;
    }

    /**
     * Sets the value of the totalMallDiscountPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMallDiscountPrice(BigDecimal value) {
        this.totalMallDiscountPrice = value;
    }

    /**
     * Gets the value of the dueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    /**
     * Sets the value of the dueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDueAmount(BigDecimal value) {
        this.dueAmount = value;
    }

}
