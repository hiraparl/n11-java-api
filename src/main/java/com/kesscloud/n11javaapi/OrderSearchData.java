
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderSearchData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderSearchData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="deliveryFeeType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="approvedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="installmentChargeWithVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalMallDiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sellerCouponDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sellerStockCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="attributes" type="{http://www.n11.com/ws/schemas}SkuAttributeList"/&gt;
 *         &lt;element name="sellerDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="mallDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sellerInvoiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipmentInfo" type="{http://www.n11.com/ws/schemas}OrderItemShipmentInfo"/&gt;
 *         &lt;element name="shippingDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customTextOptionValues" type="{http://www.n11.com/ws/schemas}CustomTextOptionsDataList"/&gt;
 *         &lt;element name="shipmenCompanyCampaignNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderSearchData", propOrder = {
    "id",
    "productId",
    "deliveryFeeType",
    "productSellerCode",
    "status",
    "rejectReason",
    "approvedDate",
    "dueAmount",
    "installmentChargeWithVAT",
    "price",
    "totalMallDiscountPrice",
    "quantity",
    "sellerCouponDiscount",
    "sellerStockCode",
    "version",
    "attributes",
    "sellerDiscount",
    "mallDiscount",
    "commission",
    "sellerInvoiceAmount",
    "productName",
    "shipmentInfo",
    "shippingDate",
    "customTextOptionValues",
    "shipmenCompanyCampaignNumber"
})
public class OrderSearchData {

    protected long id;
    protected long productId;
    @XmlElement(required = true)
    protected BigInteger deliveryFeeType;
    @XmlElement(required = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String rejectReason;
    @XmlElement(required = true)
    protected String approvedDate;
    @XmlElement(required = true)
    protected BigDecimal dueAmount;
    @XmlElement(required = true)
    protected BigDecimal installmentChargeWithVAT;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigDecimal totalMallDiscountPrice;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected BigDecimal sellerCouponDiscount;
    @XmlElement(required = true)
    protected String sellerStockCode;
    protected long version;
    @XmlElement(required = true)
    protected SkuAttributeList attributes;
    @XmlElement(required = true)
    protected BigDecimal sellerDiscount;
    @XmlElement(required = true)
    protected BigDecimal mallDiscount;
    @XmlElement(required = true)
    protected BigDecimal commission;
    @XmlElement(required = true)
    protected BigDecimal sellerInvoiceAmount;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected OrderItemShipmentInfo shipmentInfo;
    @XmlElement(required = true)
    protected String shippingDate;
    @XmlElement(required = true)
    protected CustomTextOptionsDataList customTextOptionValues;
    @XmlElement(required = true)
    protected String shipmenCompanyCampaignNumber;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the approvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedDate() {
        return approvedDate;
    }

    /**
     * Sets the value of the approvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedDate(String value) {
        this.approvedDate = value;
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
     * Gets the value of the installmentChargeWithVAT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentChargeWithVAT() {
        return installmentChargeWithVAT;
    }

    /**
     * Sets the value of the installmentChargeWithVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentChargeWithVAT(BigDecimal value) {
        this.installmentChargeWithVAT = value;
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
     * Gets the value of the totalMallDiscountPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMallDiscountPrice() {
        return totalMallDiscountPrice;
    }

    /**
     * Sets the value of the totalMallDiscountPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMallDiscountPrice(BigDecimal value) {
        this.totalMallDiscountPrice = value;
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
     * Gets the value of the sellerCouponDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellerCouponDiscount() {
        return sellerCouponDiscount;
    }

    /**
     * Sets the value of the sellerCouponDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellerCouponDiscount(BigDecimal value) {
        this.sellerCouponDiscount = value;
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
     * Gets the value of the sellerInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellerInvoiceAmount() {
        return sellerInvoiceAmount;
    }

    /**
     * Sets the value of the sellerInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellerInvoiceAmount(BigDecimal value) {
        this.sellerInvoiceAmount = value;
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
     * Gets the value of the shippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDate() {
        return shippingDate;
    }

    /**
     * Sets the value of the shippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDate(String value) {
        this.shippingDate = value;
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
     * Gets the value of the shipmenCompanyCampaignNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmenCompanyCampaignNumber() {
        return shipmenCompanyCampaignNumber;
    }

    /**
     * Sets the value of the shipmenCompanyCampaignNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmenCompanyCampaignNumber(String value) {
        this.shipmenCompanyCampaignNumber = value;
    }

}
