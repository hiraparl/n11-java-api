
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
 *         &lt;element name="result" type="{http://www.n11.com/ws/schemas}ResultInfo"/&gt;
 *         &lt;element name="categoryProductAttributeValueList" type="{http://www.n11.com/ws/schemas}CategoryProductAttributeValueList"/&gt;
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
    "result",
    "categoryProductAttributeValueList",
    "pagingData"
})
@XmlRootElement(name = "GetCategoryAttributeValueResponse")
public class GetCategoryAttributeValueResponse {

    @XmlElement(required = true)
    protected ResultInfo result;
    @XmlElement(required = true)
    protected CategoryProductAttributeValueList categoryProductAttributeValueList;
    @XmlElement(required = true)
    protected PagingData pagingData;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setResult(ResultInfo value) {
        this.result = value;
    }

    /**
     * Gets the value of the categoryProductAttributeValueList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryProductAttributeValueList }
     *     
     */
    public CategoryProductAttributeValueList getCategoryProductAttributeValueList() {
        return categoryProductAttributeValueList;
    }

    /**
     * Sets the value of the categoryProductAttributeValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryProductAttributeValueList }
     *     
     */
    public void setCategoryProductAttributeValueList(CategoryProductAttributeValueList value) {
        this.categoryProductAttributeValueList = value;
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
