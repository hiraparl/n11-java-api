
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
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
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="productDiscount" type="{http://www.n11.com/ws/schemas}SellerProductDiscount"/&gt;
 *         &lt;element name="stockItems" type="{http://www.n11.com/ws/schemas}ProductUpdateSkuBasicRequestItemList"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="images" type="{http://www.n11.com/ws/schemas}ProductImageList"/&gt;
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
    "productSellerCode",
    "price",
    "productDiscount",
    "stockItems",
    "description",
    "images"
})
@XmlRootElement(name = "UpdateProductBasicRequest")
public class UpdateProductBasicRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    protected long productId;
    @XmlElement(required = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected SellerProductDiscount productDiscount;
    @XmlElement(required = true)
    protected ProductUpdateSkuBasicRequestItemList stockItems;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected ProductImageList images;

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

    /**
     * Gets the value of the stockItems property.
     * 
     * @return
     *     possible object is
     *     {@link ProductUpdateSkuBasicRequestItemList }
     *     
     */
    public ProductUpdateSkuBasicRequestItemList getStockItems() {
        return stockItems;
    }

    /**
     * Sets the value of the stockItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductUpdateSkuBasicRequestItemList }
     *     
     */
    public void setStockItems(ProductUpdateSkuBasicRequestItemList value) {
        this.stockItems = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ProductImageList }
     *     
     */
    public ProductImageList getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductImageList }
     *     
     */
    public void setImages(ProductImageList value) {
        this.images = value;
    }

}
