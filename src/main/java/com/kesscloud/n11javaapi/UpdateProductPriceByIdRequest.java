
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currencyType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="stockItems" type="{http://www.n11.com/ws/schemas}ProductSkuBasicRequestItemList"/&gt;
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
    "productId",
    "price",
    "currencyType",
    "stockItems"
})
@XmlRootElement(name = "UpdateProductPriceByIdRequest")
public class UpdateProductPriceByIdRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    protected long productId;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigInteger currencyType;
    @XmlElement(required = true)
    protected ProductSkuBasicRequestItemList stockItems;

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
     * Gets the value of the productId property.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
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
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyType(BigInteger value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the stockItems property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSkuBasicRequestItemList }
     *     
     */
    public ProductSkuBasicRequestItemList getStockItems() {
        return stockItems;
    }

    /**
     * Sets the value of the stockItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSkuBasicRequestItemList }
     *     
     */
    public void setStockItems(ProductSkuBasicRequestItemList value) {
        this.stockItems = value;
    }

}
