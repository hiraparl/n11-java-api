
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductUpdateSkuBasicRequestItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUpdateSkuBasicRequestItemList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stockItem" type="{http://www.n11.com/ws/schemas}ProductUpdateSkuBasicRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUpdateSkuBasicRequestItemList", propOrder = {
    "stockItem"
})
public class ProductUpdateSkuBasicRequestItemList {

    @XmlElement(required = true)
    protected List<ProductUpdateSkuBasicRequest> stockItem;

    /**
     * Gets the value of the stockItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductUpdateSkuBasicRequest }
     * 
     * 
     */
    public List<ProductUpdateSkuBasicRequest> getStockItem() {
        if (stockItem == null) {
            stockItem = new ArrayList<ProductUpdateSkuBasicRequest>();
        }
        return this.stockItem;
    }

}
