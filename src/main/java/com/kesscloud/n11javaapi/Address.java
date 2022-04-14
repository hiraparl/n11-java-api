
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="district" type="{http://www.n11.com/ws/schemas}DistrictApiModel"/&gt;
 *         &lt;element name="city" type="{http://www.n11.com/ws/schemas}CityApiModel"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="feeCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="feeConditionUnit" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="feeConditionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "title",
    "address",
    "district",
    "city",
    "postalCode",
    "feeCondition",
    "feeConditionUnit",
    "feeConditionPrice"
})
public class Address {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected DistrictApiModel district;
    @XmlElement(required = true)
    protected CityApiModel city;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String feeCondition;
    @XmlElement(required = true)
    protected BigInteger feeConditionUnit;
    @XmlElement(required = true)
    protected BigDecimal feeConditionPrice;

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
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link DistrictApiModel }
     *     
     */
    public DistrictApiModel getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictApiModel }
     *     
     */
    public void setDistrict(DistrictApiModel value) {
        this.district = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityApiModel }
     *     
     */
    public CityApiModel getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityApiModel }
     *     
     */
    public void setCity(CityApiModel value) {
        this.city = value;
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
     * Gets the value of the feeCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCondition() {
        return feeCondition;
    }

    /**
     * Sets the value of the feeCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCondition(String value) {
        this.feeCondition = value;
    }

    /**
     * Gets the value of the feeConditionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeeConditionUnit() {
        return feeConditionUnit;
    }

    /**
     * Sets the value of the feeConditionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeeConditionUnit(BigInteger value) {
        this.feeConditionUnit = value;
    }

    /**
     * Gets the value of the feeConditionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeConditionPrice() {
        return feeConditionPrice;
    }

    /**
     * Sets the value of the feeConditionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeConditionPrice(BigDecimal value) {
        this.feeConditionPrice = value;
    }

}
