
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
 *         &lt;element name="auth" type="{http://www.n11.com/ws/schemas}Authentication"/&gt;
 *         &lt;element name="productQuestionSearch" type="{http://www.n11.com/ws/schemas}ProductQuestionSearch"/&gt;
 *         &lt;element name="pagingData" type="{http://www.n11.com/ws/schemas}RequestPagingData"/&gt;
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
    "auth",
    "productQuestionSearch",
    "pagingData"
})
@XmlRootElement(name = "GetProductQuestionListRequest")
public class GetProductQuestionListRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    @XmlElement(required = true)
    protected ProductQuestionSearch productQuestionSearch;
    @XmlElement(required = true)
    protected RequestPagingData pagingData;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuth(Authentication value) {
        this.auth = value;
    }

    /**
     * Gets the value of the productQuestionSearch property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuestionSearch }
     *     
     */
    public ProductQuestionSearch getProductQuestionSearch() {
        return productQuestionSearch;
    }

    /**
     * Sets the value of the productQuestionSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuestionSearch }
     *     
     */
    public void setProductQuestionSearch(ProductQuestionSearch value) {
        this.productQuestionSearch = value;
    }

    /**
     * Gets the value of the pagingData property.
     * 
     * @return
     *     possible object is
     *     {@link RequestPagingData }
     *     
     */
    public RequestPagingData getPagingData() {
        return pagingData;
    }

    /**
     * Sets the value of the pagingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestPagingData }
     *     
     */
    public void setPagingData(RequestPagingData value) {
        this.pagingData = value;
    }

}
