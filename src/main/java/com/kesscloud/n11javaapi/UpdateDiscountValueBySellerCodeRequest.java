
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
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productDiscount" type="{http://www.n11.com/ws/schemas}SellerProductDiscount"/&gt;
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
    "productSellerCode",
    "productDiscount"
})
@XmlRootElement(name = "UpdateDiscountValueBySellerCodeRequest")
public class UpdateDiscountValueBySellerCodeRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    @XmlElement(required = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected SellerProductDiscount productDiscount;

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
     * Gets the value of the productSellerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSellerCode() {
        return productSellerCode;
    }

    /**
     * Sets the value of the productSellerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSellerCode(String value) {
        this.productSellerCode = value;
    }

    /**
     * Gets the value of the productDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SellerProductDiscount }
     *     
     */
    public SellerProductDiscount getProductDiscount() {
        return productDiscount;
    }

    /**
     * Sets the value of the productDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerProductDiscount }
     *     
     */
    public void setProductDiscount(SellerProductDiscount value) {
        this.productDiscount = value;
    }

}
