
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="subTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="producedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saleEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saleStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="maxPurchaseQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductData", propOrder = {
    "version",
    "subTitle",
    "producedDate",
    "expireDate",
    "saleEndDate",
    "saleStartDate",
    "description",
    "price",
    "maxPurchaseQuantity"
})
public class ProductData {

    protected long version;
    @XmlElement(required = true)
    protected String subTitle;
    @XmlElement(required = true)
    protected String producedDate;
    @XmlElement(required = true)
    protected String expireDate;
    @XmlElement(required = true)
    protected String saleEndDate;
    @XmlElement(required = true)
    protected String saleStartDate;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigInteger maxPurchaseQuantity;

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the subTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * Sets the value of the subTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitle(String value) {
        this.subTitle = value;
    }

    /**
     * Gets the value of the producedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducedDate() {
        return producedDate;
    }

    /**
     * Sets the value of the producedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducedDate(String value) {
        this.producedDate = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the saleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleEndDate() {
        return saleEndDate;
    }

    /**
     * Sets the value of the saleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleEndDate(String value) {
        this.saleEndDate = value;
    }

    /**
     * Gets the value of the saleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStartDate() {
        return saleStartDate;
    }

    /**
     * Sets the value of the saleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStartDate(String value) {
        this.saleStartDate = value;
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
     * Gets the value of the maxPurchaseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPurchaseQuantity() {
        return maxPurchaseQuantity;
    }

    /**
     * Sets the value of the maxPurchaseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPurchaseQuantity(BigInteger value) {
        this.maxPurchaseQuantity = value;
    }

}
