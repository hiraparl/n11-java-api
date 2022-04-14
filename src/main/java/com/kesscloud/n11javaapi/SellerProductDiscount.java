
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerProductDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerProductDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="discountValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerProductDiscount", propOrder = {
    "discountType",
    "discountValue",
    "discountStartDate",
    "discountEndDate"
})
public class SellerProductDiscount {

    @XmlElement(required = true)
    protected BigInteger discountType;
    protected double discountValue;
    @XmlElement(required = true)
    protected String discountStartDate;
    @XmlElement(required = true)
    protected String discountEndDate;

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiscountType(BigInteger value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discountValue property.
     * 
     */
    public double getDiscountValue() {
        return discountValue;
    }

    /**
     * Sets the value of the discountValue property.
     * 
     */
    public void setDiscountValue(double value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the discountStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountStartDate() {
        return discountStartDate;
    }

    /**
     * Sets the value of the discountStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountStartDate(String value) {
        this.discountStartDate = value;
    }

    /**
     * Gets the value of the discountEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountEndDate() {
        return discountEndDate;
    }

    /**
     * Sets the value of the discountEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountEndDate(String value) {
        this.discountEndDate = value;
    }

}
