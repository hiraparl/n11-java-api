
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedOrderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedOrderData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="citizenshipId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderItemList" type="{http://www.n11.com/ws/schemas}DetailedOrderItemDataList"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedOrderData", propOrder = {
    "id",
    "invoiceType",
    "status",
    "orderNumber",
    "totalAmount",
    "paymentType",
    "citizenshipId",
    "orderItemList",
    "createDate"
})
public class DetailedOrderData {

    protected long id;
    @XmlElement(required = true)
    protected String invoiceType;
    @XmlElement(required = true)
    protected BigInteger status;
    @XmlElement(required = true)
    protected String orderNumber;
    @XmlElement(required = true)
    protected BigDecimal totalAmount;
    @XmlElement(required = true)
    protected BigInteger paymentType;
    @XmlElement(required = true)
    protected String citizenshipId;
    @XmlElement(required = true)
    protected DetailedOrderItemDataList orderItemList;
    @XmlElement(required = true)
    protected String createDate;

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
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
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
     * Gets the value of the orderItemList property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedOrderItemDataList }
     *     
     */
    public DetailedOrderItemDataList getOrderItemList() {
        return orderItemList;
    }

    /**
     * Sets the value of the orderItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedOrderItemDataList }
     *     
     */
    public void setOrderItemList(DetailedOrderItemDataList value) {
        this.orderItemList = value;
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

}
