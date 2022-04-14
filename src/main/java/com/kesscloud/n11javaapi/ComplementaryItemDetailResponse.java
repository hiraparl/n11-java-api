
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
 *         &lt;element name="itemWithCompInfoList" type="{http://www.n11.com/ws/schemas}ItemWithComplementaryList"/&gt;
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
    "itemWithCompInfoList"
})
@XmlRootElement(name = "ComplementaryItemDetailResponse")
public class ComplementaryItemDetailResponse {

    @XmlElement(required = true)
    protected ResultInfo result;
    @XmlElement(required = true)
    protected ItemWithComplementaryList itemWithCompInfoList;

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
     * Gets the value of the itemWithCompInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemWithComplementaryList }
     *     
     */
    public ItemWithComplementaryList getItemWithCompInfoList() {
        return itemWithCompInfoList;
    }

    /**
     * Sets the value of the itemWithCompInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemWithComplementaryList }
     *     
     */
    public void setItemWithCompInfoList(ItemWithComplementaryList value) {
        this.itemWithCompInfoList = value;
    }

}
