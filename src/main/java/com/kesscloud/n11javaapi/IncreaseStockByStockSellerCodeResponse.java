
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="stockItems" type="{http://www.n11.com/ws/schemas}StockItemList" maxOccurs="unbounded"/&gt;
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
    "stockItems"
})
@XmlRootElement(name = "IncreaseStockByStockSellerCodeResponse")
public class IncreaseStockByStockSellerCodeResponse {

    @XmlElement(required = true)
    protected ResultInfo result;
    @XmlElement(required = true)
    protected List<StockItemList> stockItems;

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
     * Gets the value of the stockItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockItemList }
     * 
     * 
     */
    public List<StockItemList> getStockItems() {
        if (stockItems == null) {
            stockItems = new ArrayList<StockItemList>();
        }
        return this.stockItems;
    }

}
