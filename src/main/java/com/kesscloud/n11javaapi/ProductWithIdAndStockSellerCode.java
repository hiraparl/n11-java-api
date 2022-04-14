
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductWithIdAndStockSellerCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductWithIdAndStockSellerCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stockList" type="{http://www.n11.com/ws/schemas}StockItemForAddStockWithSellerStockCodeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductWithIdAndStockSellerCode", propOrder = {
    "id",
    "stockList"
})
public class ProductWithIdAndStockSellerCode {

    protected long id;
    @XmlElement(required = true)
    protected StockItemForAddStockWithSellerStockCodeList stockList;

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
     * Gets the value of the stockList property.
     * 
     * @return
     *     possible object is
     *     {@link StockItemForAddStockWithSellerStockCodeList }
     *     
     */
    public StockItemForAddStockWithSellerStockCodeList getStockList() {
        return stockList;
    }

    /**
     * Sets the value of the stockList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItemForAddStockWithSellerStockCodeList }
     *     
     */
    public void setStockList(StockItemForAddStockWithSellerStockCodeList value) {
        this.stockList = value;
    }

}
