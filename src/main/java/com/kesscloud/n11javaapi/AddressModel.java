
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="neighborhood" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gsm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tcId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taxHouse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressModel", propOrder = {
    "address",
    "fullName",
    "city",
    "district",
    "neighborhood",
    "postalCode",
    "gsm",
    "tcId",
    "taxId",
    "taxHouse"
})
public class AddressModel {

    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String fullName;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String district;
    @XmlElement(required = true)
    protected String neighborhood;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String gsm;
    @XmlElement(required = true)
    protected String tcId;
    @XmlElement(required = true)
    protected String taxId;
    @XmlElement(required = true)
    protected String taxHouse;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the neighborhood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Sets the value of the neighborhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhood(String value) {
        this.neighborhood = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the gsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsm() {
        return gsm;
    }

    /**
     * Sets the value of the gsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsm(String value) {
        this.gsm = value;
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
     * Gets the value of the taxHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxHouse() {
        return taxHouse;
    }

    /**
     * Sets the value of the taxHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxHouse(String value) {
        this.taxHouse = value;
    }

}
