
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentApiModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentApiModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="installmentInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchangeInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shippingInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="specialDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="deliveryFeeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="combinedShipmentAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="shipmentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="warehouseAddress" type="{http://www.n11.com/ws/schemas}ShipmentSaveAddress"/&gt;
 *         &lt;element name="exchangeAddress" type="{http://www.n11.com/ws/schemas}ShipmentSaveAddress"/&gt;
 *         &lt;element name="shipmentCompanies" type="{http://www.n11.com/ws/schemas}ShipmentCompanyApiModelList"/&gt;
 *         &lt;element name="deliverableCities" type="{http://www.n11.com/ws/schemas}CityApiModelList"/&gt;
 *         &lt;element name="claimShipmentCompany" type="{http://www.n11.com/ws/schemas}ShipmentCompanyApiModel"/&gt;
 *         &lt;element name="cargoAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="useDmallCargo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentApiModel", propOrder = {
    "templateName",
    "installmentInfo",
    "exchangeInfo",
    "shippingInfo",
    "specialDelivery",
    "deliveryFeeType",
    "combinedShipmentAllowed",
    "shipmentMethod",
    "warehouseAddress",
    "exchangeAddress",
    "shipmentCompanies",
    "deliverableCities",
    "claimShipmentCompany",
    "cargoAccountNo",
    "useDmallCargo"
})
public class ShipmentApiModel {

    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected String installmentInfo;
    @XmlElement(required = true)
    protected String exchangeInfo;
    @XmlElement(required = true)
    protected String shippingInfo;
    protected boolean specialDelivery;
    @XmlElement(required = true)
    protected String deliveryFeeType;
    protected boolean combinedShipmentAllowed;
    @XmlElement(required = true)
    protected String shipmentMethod;
    @XmlElement(required = true)
    protected ShipmentSaveAddress warehouseAddress;
    @XmlElement(required = true)
    protected ShipmentSaveAddress exchangeAddress;
    @XmlElement(required = true)
    protected ShipmentCompanyApiModelList shipmentCompanies;
    @XmlElement(required = true, nillable = true)
    protected CityApiModelList deliverableCities;
    @XmlElement(required = true)
    protected ShipmentCompanyApiModel claimShipmentCompany;
    @XmlElement(required = true, nillable = true)
    protected String cargoAccountNo;
    protected boolean useDmallCargo;

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the installmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentInfo() {
        return installmentInfo;
    }

    /**
     * Sets the value of the installmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentInfo(String value) {
        this.installmentInfo = value;
    }

    /**
     * Gets the value of the exchangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeInfo() {
        return exchangeInfo;
    }

    /**
     * Sets the value of the exchangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeInfo(String value) {
        this.exchangeInfo = value;
    }

    /**
     * Gets the value of the shippingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingInfo() {
        return shippingInfo;
    }

    /**
     * Sets the value of the shippingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingInfo(String value) {
        this.shippingInfo = value;
    }

    /**
     * Gets the value of the specialDelivery property.
     * 
     */
    public boolean isSpecialDelivery() {
        return specialDelivery;
    }

    /**
     * Sets the value of the specialDelivery property.
     * 
     */
    public void setSpecialDelivery(boolean value) {
        this.specialDelivery = value;
    }

    /**
     * Gets the value of the deliveryFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryFeeType() {
        return deliveryFeeType;
    }

    /**
     * Sets the value of the deliveryFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryFeeType(String value) {
        this.deliveryFeeType = value;
    }

    /**
     * Gets the value of the combinedShipmentAllowed property.
     * 
     */
    public boolean isCombinedShipmentAllowed() {
        return combinedShipmentAllowed;
    }

    /**
     * Sets the value of the combinedShipmentAllowed property.
     * 
     */
    public void setCombinedShipmentAllowed(boolean value) {
        this.combinedShipmentAllowed = value;
    }

    /**
     * Gets the value of the shipmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentMethod() {
        return shipmentMethod;
    }

    /**
     * Sets the value of the shipmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentMethod(String value) {
        this.shipmentMethod = value;
    }

    /**
     * Gets the value of the warehouseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentSaveAddress }
     *     
     */
    public ShipmentSaveAddress getWarehouseAddress() {
        return warehouseAddress;
    }

    /**
     * Sets the value of the warehouseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentSaveAddress }
     *     
     */
    public void setWarehouseAddress(ShipmentSaveAddress value) {
        this.warehouseAddress = value;
    }

    /**
     * Gets the value of the exchangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentSaveAddress }
     *     
     */
    public ShipmentSaveAddress getExchangeAddress() {
        return exchangeAddress;
    }

    /**
     * Sets the value of the exchangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentSaveAddress }
     *     
     */
    public void setExchangeAddress(ShipmentSaveAddress value) {
        this.exchangeAddress = value;
    }

    /**
     * Gets the value of the shipmentCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompanyApiModelList }
     *     
     */
    public ShipmentCompanyApiModelList getShipmentCompanies() {
        return shipmentCompanies;
    }

    /**
     * Sets the value of the shipmentCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompanyApiModelList }
     *     
     */
    public void setShipmentCompanies(ShipmentCompanyApiModelList value) {
        this.shipmentCompanies = value;
    }

    /**
     * Gets the value of the deliverableCities property.
     * 
     * @return
     *     possible object is
     *     {@link CityApiModelList }
     *     
     */
    public CityApiModelList getDeliverableCities() {
        return deliverableCities;
    }

    /**
     * Sets the value of the deliverableCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityApiModelList }
     *     
     */
    public void setDeliverableCities(CityApiModelList value) {
        this.deliverableCities = value;
    }

    /**
     * Gets the value of the claimShipmentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentCompanyApiModel }
     *     
     */
    public ShipmentCompanyApiModel getClaimShipmentCompany() {
        return claimShipmentCompany;
    }

    /**
     * Sets the value of the claimShipmentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentCompanyApiModel }
     *     
     */
    public void setClaimShipmentCompany(ShipmentCompanyApiModel value) {
        this.claimShipmentCompany = value;
    }

    /**
     * Gets the value of the cargoAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoAccountNo() {
        return cargoAccountNo;
    }

    /**
     * Sets the value of the cargoAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoAccountNo(String value) {
        this.cargoAccountNo = value;
    }

    /**
     * Gets the value of the useDmallCargo property.
     * 
     */
    public boolean isUseDmallCargo() {
        return useDmallCargo;
    }

    /**
     * Sets the value of the useDmallCargo property.
     * 
     */
    public void setUseDmallCargo(boolean value) {
        this.useDmallCargo = value;
    }

}
