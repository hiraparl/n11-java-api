
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerWithTaxFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerWithTaxFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxOffice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerWithTaxFields", propOrder = {
    "id",
    "fullName",
    "taxId",
    "taxOffice",
    "email",
    "tcId"
})
public class BuyerWithTaxFields {

    protected long id;
    @XmlElement(required = true)
    protected String fullName;
    @XmlElement(required = true, nillable = true)
    protected String taxId;
    @XmlElement(required = true, nillable = true)
    protected String taxOffice;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true)
    protected String tcId;

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
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the taxOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOffice() {
        return taxOffice;
    }

    /**
     * Sets the value of the taxOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOffice(String value) {
        this.taxOffice = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the tcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcId() {
        return tcId;
    }

    /**
     * Sets the value of the tcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcId(String value) {
        this.tcId = value;
    }

}
