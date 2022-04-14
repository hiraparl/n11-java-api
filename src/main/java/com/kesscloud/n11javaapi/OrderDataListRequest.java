
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDataListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDataListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sameDayDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="period" type="{http://www.n11.com/ws/schemas}OrderSearchPeriod"/&gt;
 *         &lt;element name="sortForUpdateDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDataListRequest", propOrder = {
    "productId",
    "status",
    "buyerName",
    "orderNumber",
    "productSellerCode",
    "recipient",
    "sameDayDelivery",
    "period",
    "sortForUpdateDate"
})
public class OrderDataListRequest {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long productId;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true)
    protected String buyerName;
    @XmlElement(required = true)
    protected String orderNumber;
    @XmlElement(required = true, nillable = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected String recipient;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean sameDayDelivery;
    @XmlElement(required = true)
    protected OrderSearchPeriod period;
    protected boolean sortForUpdateDate;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
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
     * Gets the value of the buyerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * Sets the value of the buyerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerName(String value) {
        this.buyerName = value;
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
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the sameDayDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameDayDelivery() {
        return sameDayDelivery;
    }

    /**
     * Sets the value of the sameDayDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameDayDelivery(Boolean value) {
        this.sameDayDelivery = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSearchPeriod }
     *     
     */
    public OrderSearchPeriod getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSearchPeriod }
     *     
     */
    public void setPeriod(OrderSearchPeriod value) {
        this.period = value;
    }

    /**
     * Gets the value of the sortForUpdateDate property.
     * 
     */
    public boolean isSortForUpdateDate() {
        return sortForUpdateDate;
    }

    /**
     * Sets the value of the sortForUpdateDate property.
     * 
     */
    public void setSortForUpdateDate(boolean value) {
        this.sortForUpdateDate = value;
    }

}
