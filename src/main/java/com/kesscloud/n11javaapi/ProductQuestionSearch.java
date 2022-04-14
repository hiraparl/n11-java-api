
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductQuestionSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQuestionSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="buyerEmail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.n11.com/ws/schemas}ProductQuestionStatus"/&gt;
 *         &lt;element name="questionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductQuestionSearch", propOrder = {
    "productId",
    "buyerEmail",
    "subject",
    "status",
    "questionDate",
    "startDate",
    "endDate"
})
public class ProductQuestionSearch {

    protected long productId;
    @XmlElement(required = true)
    protected String buyerEmail;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductQuestionStatus status;
    @XmlElement(required = true)
    protected String questionDate;
    @XmlElement(required = true)
    protected String startDate;
    @XmlElement(required = true)
    protected String endDate;

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
     * Gets the value of the buyerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Sets the value of the buyerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerEmail(String value) {
        this.buyerEmail = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuestionStatus }
     *     
     */
    public ProductQuestionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuestionStatus }
     *     
     */
    public void setStatus(ProductQuestionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the questionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionDate() {
        return questionDate;
    }

    /**
     * Sets the value of the questionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionDate(String value) {
        this.questionDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

}
