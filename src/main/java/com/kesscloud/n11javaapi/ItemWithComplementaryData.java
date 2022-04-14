
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemWithComplementaryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemWithComplementaryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="paidDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acceptedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="certificateNo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="compItemId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="compAcceptedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyerAddress" type="{http://www.n11.com/ws/schemas}BuyerAddressData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemWithComplementaryData", propOrder = {
    "sellerCode",
    "productTitle",
    "category",
    "price",
    "paidDate",
    "acceptedDate",
    "status",
    "certificateNo",
    "compItemId",
    "compAcceptedDate",
    "buyerAddress"
})
public class ItemWithComplementaryData {

    @XmlElement(required = true)
    protected String sellerCode;
    @XmlElement(required = true)
    protected String productTitle;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected String paidDate;
    @XmlElement(required = true)
    protected String acceptedDate;
    @XmlElement(required = true)
    protected BigInteger status;
    @XmlElement(required = true)
    protected List<String> certificateNo;
    protected long compItemId;
    @XmlElement(required = true)
    protected String compAcceptedDate;
    @XmlElement(required = true)
    protected BuyerAddressData buyerAddress;

    /**
     * Gets the value of the sellerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCode() {
        return sellerCode;
    }

    /**
     * Sets the value of the sellerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCode(String value) {
        this.sellerCode = value;
    }

    /**
     * Gets the value of the productTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * Sets the value of the productTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTitle(String value) {
        this.productTitle = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDate(String value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptedDate(String value) {
        this.acceptedDate = value;
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
     * Gets the value of the certificateNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCertificateNo() {
        if (certificateNo == null) {
            certificateNo = new ArrayList<String>();
        }
        return this.certificateNo;
    }

    /**
     * Gets the value of the compItemId property.
     * 
     */
    public long getCompItemId() {
        return compItemId;
    }

    /**
     * Sets the value of the compItemId property.
     * 
     */
    public void setCompItemId(long value) {
        this.compItemId = value;
    }

    /**
     * Gets the value of the compAcceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompAcceptedDate() {
        return compAcceptedDate;
    }

    /**
     * Sets the value of the compAcceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompAcceptedDate(String value) {
        this.compAcceptedDate = value;
    }

    /**
     * Gets the value of the buyerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerAddressData }
     *     
     */
    public BuyerAddressData getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * Sets the value of the buyerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerAddressData }
     *     
     */
    public void setBuyerAddress(BuyerAddressData value) {
        this.buyerAddress = value;
    }

}
