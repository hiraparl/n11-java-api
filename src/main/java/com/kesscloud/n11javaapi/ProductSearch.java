
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saleDate" type="{http://www.n11.com/ws/schemas}DateRange"/&gt;
 *         &lt;element name="approvalStatus" type="{http://www.n11.com/ws/schemas}ProductStatus"/&gt;
 *         &lt;element name="bundle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mpn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gtin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="oem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSearch", propOrder = {
    "name",
    "saleDate",
    "approvalStatus",
    "bundle",
    "mpn",
    "gtin",
    "oem"
})
public class ProductSearch {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected DateRange saleDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductStatus approvalStatus;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean bundle;
    @XmlElement(required = true, nillable = true)
    protected String mpn;
    @XmlElement(required = true, nillable = true)
    protected String gtin;
    @XmlElement(required = true, nillable = true)
    protected String oem;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the saleDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getSaleDate() {
        return saleDate;
    }

    /**
     * Sets the value of the saleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setSaleDate(DateRange value) {
        this.saleDate = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setApprovalStatus(ProductStatus value) {
        this.approvalStatus = value;
    }

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

}
