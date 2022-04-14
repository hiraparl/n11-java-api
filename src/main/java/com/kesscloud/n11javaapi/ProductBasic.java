
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="displayPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="isDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="saleStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="stockItems" type="{http://www.n11.com/ws/schemas}ProductSkuList"/&gt;
 *         &lt;element name="oldPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currencyType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="productStatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductBasic", propOrder = {
    "id",
    "productSellerCode",
    "title",
    "subtitle",
    "price",
    "displayPrice",
    "isDomestic",
    "saleStatus",
    "approvalStatus",
    "stockItems",
    "oldPrice",
    "currencyAmount",
    "currencyType",
    "productStatusDetail"
})
public class ProductBasic {

    protected long id;
    @XmlElement(required = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String subtitle;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigDecimal displayPrice;
    protected boolean isDomestic;
    @XmlElement(required = true)
    protected BigInteger saleStatus;
    @XmlElement(required = true, nillable = true)
    protected BigInteger approvalStatus;
    @XmlElement(required = true)
    protected ProductSkuList stockItems;
    @XmlElement(required = true)
    protected BigDecimal oldPrice;
    @XmlElement(required = true)
    protected BigDecimal currencyAmount;
    @XmlElement(required = true)
    protected BigInteger currencyType;
    @XmlElement(required = true)
    protected String productStatusDetail;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
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
     * Gets the value of the isDomestic property.
     * 
     */
    public boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     */
    public void setIsDomestic(boolean value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the saleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSaleStatus() {
        return saleStatus;
    }

    /**
     * Sets the value of the saleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSaleStatus(BigInteger value) {
        this.saleStatus = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovalStatus(BigInteger value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the stockItems property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSkuList }
     *     
     */
    public ProductSkuList getStockItems() {
        return stockItems;
    }

    /**
     * Sets the value of the stockItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSkuList }
     *     
     */
    public void setStockItems(ProductSkuList value) {
        this.stockItems = value;
    }

    /**
     * Gets the value of the oldPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    /**
     * Sets the value of the oldPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldPrice(BigDecimal value) {
        this.oldPrice = value;
    }

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
     * Gets the value of the productStatusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatusDetail() {
        return productStatusDetail;
    }

    /**
     * Sets the value of the productStatusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatusDetail(String value) {
        this.productStatusDetail = value;
    }

}
