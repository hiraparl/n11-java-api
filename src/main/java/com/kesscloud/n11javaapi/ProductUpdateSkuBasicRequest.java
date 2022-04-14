
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductUpdateSkuBasicRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUpdateSkuBasicRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sellerStockCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="optionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUpdateSkuBasicRequest", propOrder = {
    "sellerStockCode",
    "id",
    "optionPrice",
    "quantity"
})
public class ProductUpdateSkuBasicRequest {

    @XmlElement(required = true)
    protected String sellerStockCode;
    protected long id;
    @XmlElement(required = true)
    protected BigDecimal optionPrice;
    @XmlElement(required = true)
    protected BigInteger quantity;

    /**
     * Gets the value of the sellerStockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerStockCode() {
        return sellerStockCode;
    }

    /**
     * Sets the value of the sellerStockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerStockCode(String value) {
        this.sellerStockCode = value;
    }

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
     * Gets the value of the optionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptionPrice() {
        return optionPrice;
    }

    /**
     * Sets the value of the optionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptionPrice(BigDecimal value) {
        this.optionPrice = value;
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

}
