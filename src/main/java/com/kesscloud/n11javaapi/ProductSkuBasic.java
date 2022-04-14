
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSkuBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSkuBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.n11.com/ws/schemas}ProductSkuBasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="displayPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="oldOptionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="n11CatalogId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bundle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSkuBasic", propOrder = {
    "currencyAmount",
    "displayPrice",
    "oldOptionPrice",
    "gtin",
    "n11CatalogId",
    "mpn",
    "oem",
    "bundle"
})
@XmlSeeAlso({
    ProductSku.class
})
public class ProductSkuBasic
    extends ProductSkuBasicRequest
{

    @XmlElement(required = true)
    protected BigDecimal currencyAmount;
    @XmlElement(required = true)
    protected BigDecimal displayPrice;
    @XmlElement(required = true)
    protected BigDecimal oldOptionPrice;
    @XmlElement(required = true)
    protected String gtin;
    protected long n11CatalogId;
    @XmlElement(required = true)
    protected String mpn;
    @XmlElement(required = true)
    protected String oem;
    protected boolean bundle;

    /**
     * Gets the value of the currencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyAmount() {
        return currencyAmount;
    }

    /**
     * Sets the value of the currencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyAmount(BigDecimal value) {
        this.currencyAmount = value;
    }

    /**
     * Gets the value of the displayPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplayPrice() {
        return displayPrice;
    }

    /**
     * Sets the value of the displayPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplayPrice(BigDecimal value) {
        this.displayPrice = value;
    }

    /**
     * Gets the value of the oldOptionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldOptionPrice() {
        return oldOptionPrice;
    }

    /**
     * Sets the value of the oldOptionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldOptionPrice(BigDecimal value) {
        this.oldOptionPrice = value;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the n11CatalogId property.
     * 
     */
    public long getN11CatalogId() {
        return n11CatalogId;
    }

    /**
     * Sets the value of the n11CatalogId property.
     * 
     */
    public void setN11CatalogId(long value) {
        this.n11CatalogId = value;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpn() {
        return mpn;
    }

    /**
     * Sets the value of the mpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpn(String value) {
        this.mpn = value;
    }

    /**
     * Gets the value of the oem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOem() {
        return oem;
    }

    /**
     * Sets the value of the oem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOem(String value) {
        this.oem = value;
    }

    /**
     * Gets the value of the bundle property.
     * 
     */
    public boolean isBundle() {
        return bundle;
    }

    /**
     * Sets the value of the bundle property.
     * 
     */
    public void setBundle(boolean value) {
        this.bundle = value;
    }

}
