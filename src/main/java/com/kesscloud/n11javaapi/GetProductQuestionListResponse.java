
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productQuestions" type="{http://www.n11.com/ws/schemas}ProductQuestionList"/&gt;
 *         &lt;element name="pagingData" type="{http://www.n11.com/ws/schemas}PagingData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productQuestions",
    "pagingData"
})
@XmlRootElement(name = "GetProductQuestionListResponse")
public class GetProductQuestionListResponse {

    @XmlElement(required = true)
    protected ProductQuestionList productQuestions;
    @XmlElement(required = true)
    protected PagingData pagingData;

    /**
     * Gets the value of the productQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuestionList }
     *     
     */
    public ProductQuestionList getProductQuestions() {
        return productQuestions;
    }

    /**
     * Sets the value of the productQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuestionList }
     *     
     */
    public void setProductQuestions(ProductQuestionList value) {
        this.productQuestions = value;
    }

    /**
     * Gets the value of the pagingData property.
     * 
     * @return
     *     possible object is
     *     {@link PagingData }
     *     
     */
    public PagingData getPagingData() {
        return pagingData;
    }

    /**
     * Sets the value of the pagingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingData }
     *     
     */
    public void setPagingData(PagingData value) {
        this.pagingData = value;
    }

}
