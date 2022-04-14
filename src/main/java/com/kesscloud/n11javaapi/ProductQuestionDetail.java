
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductQuestionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQuestionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="questionSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="questionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="answeredDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sellerExpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buyerExpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="images" type="{http://www.n11.com/ws/schemas}ImageList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductQuestionDetail", propOrder = {
    "productId",
    "productTitle",
    "questionSubject",
    "question",
    "answer",
    "fullName",
    "email",
    "productStatus",
    "status",
    "questionDate",
    "answeredDate",
    "sellerExpose",
    "buyerExpose",
    "images"
})
public class ProductQuestionDetail {

    protected long productId;
    @XmlElement(required = true)
    protected String productTitle;
    @XmlElement(required = true)
    protected String questionSubject;
    @XmlElement(required = true)
    protected String question;
    @XmlElement(required = true)
    protected String answer;
    @XmlElement(required = true)
    protected String fullName;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String productStatus;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar questionDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar answeredDate;
    @XmlElement(required = true)
    protected String sellerExpose;
    @XmlElement(required = true)
    protected String buyerExpose;
    @XmlElement(required = true)
    protected ImageList images;

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
     * Gets the value of the questionSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionSubject() {
        return questionSubject;
    }

    /**
     * Sets the value of the questionSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionSubject(String value) {
        this.questionSubject = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestion(String value) {
        this.question = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the productStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * Sets the value of the productStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatus(String value) {
        this.productStatus = value;
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
     * Gets the value of the questionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuestionDate() {
        return questionDate;
    }

    /**
     * Sets the value of the questionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuestionDate(XMLGregorianCalendar value) {
        this.questionDate = value;
    }

    /**
     * Gets the value of the answeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnsweredDate() {
        return answeredDate;
    }

    /**
     * Sets the value of the answeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnsweredDate(XMLGregorianCalendar value) {
        this.answeredDate = value;
    }

    /**
     * Gets the value of the sellerExpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerExpose() {
        return sellerExpose;
    }

    /**
     * Sets the value of the sellerExpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerExpose(String value) {
        this.sellerExpose = value;
    }

    /**
     * Gets the value of the buyerExpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerExpose() {
        return buyerExpose;
    }

    /**
     * Sets the value of the buyerExpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerExpose(String value) {
        this.buyerExpose = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ImageList }
     *     
     */
    public ImageList getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageList }
     *     
     */
    public void setImages(ImageList value) {
        this.images = value;
    }

}
