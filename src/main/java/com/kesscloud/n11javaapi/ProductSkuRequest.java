
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSkuRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSkuRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bundle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="n11CatalogId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="oem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sellerStockCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributes" type="{http://www.n11.com/ws/schemas}ProductAttributeRequestList"/&gt;
 *         &lt;element name="optionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSkuRequest", propOrder = {
    "bundle",
    "mpn",
    "gtin",
    "n11CatalogId",
    "oem",
    "quantity",
    "sellerStockCode",
    "attributes",
    "optionPrice"
})
public class ProductSkuRequest {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bundle;
    @XmlElement(required = true, nillable = true)
    protected String mpn;
    @XmlElement(required = true, nillable = true)
    protected String gtin;
    protected long n11CatalogId;
    @XmlElement(required = true, nillable = true)
    protected String oem;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected String sellerStockCode;
    @XmlElement(required = true)
    protected ProductAttributeRequestList attributes;
    @XmlElement(required = true)
    protected BigDecimal optionPrice;

    /**
     * Gets the value of the bundle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundle() {
        return bundle;
    }

    /**
     * Sets the value of the bundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundle(Boolean value) {
        this.bundle = value;
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
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeRequestList }
     *     
     */
    public ProductAttributeRequestList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeRequestList }
     *     
     */
    public void setAttributes(ProductAttributeRequestList value) {
        this.attributes = value;
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

}
