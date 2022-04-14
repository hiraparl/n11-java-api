
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sellerDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="mallDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryFeeType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="dueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="shipmentInfo" type="{http://www.n11.com/ws/schemas}OrderItemShipmentInfo"/&gt;
 *         &lt;element name="attributes" type="{http://www.n11.com/ws/schemas}SkuAttributeList"/&gt;
 *         &lt;element name="customTextOptionValues" type="{http://www.n11.com/ws/schemas}CustomTextOptionsDataList"/&gt;
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cargoCompanyWarning" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemData", propOrder = {
    "id",
    "stockKeepingUnitId",
    "productSellerCode",
    "price",
    "sellerDiscount",
    "mallDiscount",
    "commission",
    "status",
    "quantity",
    "productName",
    "deliveryFeeType",
    "dueAmount",
    "shipmentInfo",
    "attributes",
    "customTextOptionValues",
    "updatedDate",
    "cargoCompanyWarning"
})
public class OrderItemData {

    protected long id;
    protected long stockKeepingUnitId;
    @XmlElement(required = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigDecimal sellerDiscount;
    @XmlElement(required = true)
    protected BigDecimal mallDiscount;
    @XmlElement(required = true)
    protected BigDecimal commission;
    @XmlElement(required = true)
    protected BigInteger status;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected BigInteger deliveryFeeType;
    @XmlElement(required = true)
    protected BigDecimal dueAmount;
    @XmlElement(required = true)
    protected OrderItemShipmentInfo shipmentInfo;
    @XmlElement(required = true)
    protected SkuAttributeList attributes;
    @XmlElement(required = true)
    protected CustomTextOptionsDataList customTextOptionValues;
    @XmlElement(required = true)
    protected String updatedDate;
    @XmlElement(required = true)
    protected String cargoCompanyWarning;

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
     * Gets the value of the stockKeepingUnitId property.
     * 
     */
    public long getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Sets the value of the stockKeepingUnitId property.
     * 
     */
    public void setStockKeepingUnitId(long value) {
        this.stockKeepingUnitId = value;
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
     * Gets the value of the sellerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellerDiscount() {
        return sellerDiscount;
    }

    /**
     * Sets the value of the sellerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellerDiscount(BigDecimal value) {
        this.sellerDiscount = value;
    }

    /**
     * Gets the value of the mallDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMallDiscount() {
        return mallDiscount;
    }

    /**
     * Sets the value of the mallDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMallDiscount(BigDecimal value) {
        this.mallDiscount = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommission(BigDecimal value) {
        this.commission = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the deliveryFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryFeeType() {
        return deliveryFeeType;
    }

    /**
     * Sets the value of the deliveryFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryFeeType(BigInteger value) {
        this.deliveryFeeType = value;
    }

    /**
     * Gets the value of the dueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    /**
     * Sets the value of the dueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDueAmount(BigDecimal value) {
        this.dueAmount = value;
    }

    /**
     * Gets the value of the shipmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemShipmentInfo }
     *     
     */
    public OrderItemShipmentInfo getShipmentInfo() {
        return shipmentInfo;
    }

    /**
     * Sets the value of the shipmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemShipmentInfo }
     *     
     */
    public void setShipmentInfo(OrderItemShipmentInfo value) {
        this.shipmentInfo = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link SkuAttributeList }
     *     
     */
    public SkuAttributeList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkuAttributeList }
     *     
     */
    public void setAttributes(SkuAttributeList value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the customTextOptionValues property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTextOptionsDataList }
     *     
     */
    public CustomTextOptionsDataList getCustomTextOptionValues() {
        return customTextOptionValues;
    }

    /**
     * Sets the value of the customTextOptionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTextOptionsDataList }
     *     
     */
    public void setCustomTextOptionValues(CustomTextOptionsDataList value) {
        this.customTextOptionValues = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedDate(String value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the cargoCompanyWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoCompanyWarning() {
        return cargoCompanyWarning;
    }

    /**
     * Sets the value of the cargoCompanyWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoCompanyWarning(String value) {
        this.cargoCompanyWarning = value;
    }

}
