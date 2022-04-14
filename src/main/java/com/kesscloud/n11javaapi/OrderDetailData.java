
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyer" type="{http://www.n11.com/ws/schemas}BuyerWithTaxFields"/&gt;
 *         &lt;element name="citizenshipId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemList" type="{http://www.n11.com/ws/schemas}OrderItemDataList"/&gt;
 *         &lt;element name="serviceItemList" type="{http://www.n11.com/ws/schemas}ServiceOrderItemDataList"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="billingTemplate" type="{http://www.n11.com/ws/schemas}BillingTemplate"/&gt;
 *         &lt;element name="shippingAddress" type="{http://www.n11.com/ws/schemas}AddressModel"/&gt;
 *         &lt;element name="billingAddress" type="{http://www.n11.com/ws/schemas}AddressModel"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderItemShipmentList" type="{http://www.n11.com/ws/schemas}OrderItemShipmentDataList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetailData", propOrder = {
    "id",
    "orderNumber",
    "buyer",
    "citizenshipId",
    "invoiceType",
    "itemList",
    "serviceItemList",
    "status",
    "paymentType",
    "billingTemplate",
    "shippingAddress",
    "billingAddress",
    "createDate",
    "orderItemShipmentList"
})
public class OrderDetailData {

    protected long id;
    @XmlElement(required = true)
    protected String orderNumber;
    @XmlElement(required = true)
    protected BuyerWithTaxFields buyer;
    @XmlElement(required = true)
    protected String citizenshipId;
    @XmlElement(required = true)
    protected String invoiceType;
    @XmlElement(required = true)
    protected OrderItemDataList itemList;
    @XmlElement(required = true)
    protected ServiceOrderItemDataList serviceItemList;
    @XmlElement(required = true)
    protected BigInteger status;
    @XmlElement(required = true)
    protected BigInteger paymentType;
    @XmlElement(required = true)
    protected BillingTemplate billingTemplate;
    @XmlElement(required = true)
    protected AddressModel shippingAddress;
    @XmlElement(required = true)
    protected AddressModel billingAddress;
    @XmlElement(required = true)
    protected String createDate;
    @XmlElement(required = true)
    protected OrderItemShipmentDataList orderItemShipmentList;

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
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the buyer property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerWithTaxFields }
     *     
     */
    public BuyerWithTaxFields getBuyer() {
        return buyer;
    }

    /**
     * Sets the value of the buyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerWithTaxFields }
     *     
     */
    public void setBuyer(BuyerWithTaxFields value) {
        this.buyer = value;
    }

    /**
     * Gets the value of the citizenshipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipId() {
        return citizenshipId;
    }

    /**
     * Sets the value of the citizenshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipId(String value) {
        this.citizenshipId = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDataList }
     *     
     */
    public OrderItemDataList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDataList }
     *     
     */
    public void setItemList(OrderItemDataList value) {
        this.itemList = value;
    }

    /**
     * Gets the value of the serviceItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOrderItemDataList }
     *     
     */
    public ServiceOrderItemDataList getServiceItemList() {
        return serviceItemList;
    }

    /**
     * Sets the value of the serviceItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOrderItemDataList }
     *     
     */
    public void setServiceItemList(ServiceOrderItemDataList value) {
        this.serviceItemList = value;
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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentType(BigInteger value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the billingTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link BillingTemplate }
     *     
     */
    public BillingTemplate getBillingTemplate() {
        return billingTemplate;
    }

    /**
     * Sets the value of the billingTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingTemplate }
     *     
     */
    public void setBillingTemplate(BillingTemplate value) {
        this.billingTemplate = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModel }
     *     
     */
    public AddressModel getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModel }
     *     
     */
    public void setShippingAddress(AddressModel value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressModel }
     *     
     */
    public AddressModel getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressModel }
     *     
     */
    public void setBillingAddress(AddressModel value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the orderItemShipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemShipmentDataList }
     *     
     */
    public OrderItemShipmentDataList getOrderItemShipmentList() {
        return orderItemShipmentList;
    }

    /**
     * Sets the value of the orderItemShipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemShipmentDataList }
     *     
     */
    public void setOrderItemShipmentList(OrderItemShipmentDataList value) {
        this.orderItemShipmentList = value;
    }

}
