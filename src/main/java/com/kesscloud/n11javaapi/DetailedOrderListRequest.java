
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
 *         &lt;element name="searchData" type="{http://www.n11.com/ws/schemas}OrderDataListRequest"/&gt;
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
    "auth",
    "searchData",
    "pagingData"
})
@XmlRootElement(name = "DetailedOrderListRequest")
public class DetailedOrderListRequest {

    @XmlElement(required = true)
    protected Authentication auth;
    @XmlElement(required = true, nillable = true)
    protected OrderDataListRequest searchData;
    @XmlElement(required = true, nillable = true)
    protected PagingData pagingData;

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
     * Gets the value of the searchData property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDataListRequest }
     *     
     */
    public OrderDataListRequest getSearchData() {
        return searchData;
    }

    /**
     * Sets the value of the searchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDataListRequest }
     *     
     */
    public void setSearchData(OrderDataListRequest value) {
        this.searchData = value;
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
