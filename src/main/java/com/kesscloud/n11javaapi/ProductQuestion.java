
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQuestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="questionSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="question" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ProductQuestion", propOrder = {
    "id",
    "productId",
    "productTitle",
    "questionSubject",
    "question",
    "answer",
    "images"
})
public class ProductQuestion {

    protected long id;
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
    protected ImageList images;

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
