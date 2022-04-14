
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSkuList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSkuList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stockItem" type="{http://www.n11.com/ws/schemas}ProductSku" maxOccurs="unbounded"/&gt;
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSkuList", propOrder = {
    "id",
    "stockItem",
    "productSellerCode"
})
public class ProductSkuList {

    protected long id;
    @XmlElement(required = true)
    protected List<ProductSku> stockItem;
    @XmlElement(required = true)
    protected String productSellerCode;

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
     * {@link ProductSku }
     * 
     * 
     */
    public List<ProductSku> getStockItem() {
        if (stockItem == null) {
            stockItem = new ArrayList<ProductSku>();
        }
        return this.stockItem;
    }

    /**
     * Gets the value of the productSellerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSellerCode() {
        return productSellerCode;
    }

    /**
     * Sets the value of the productSellerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSellerCode(String value) {
        this.productSellerCode = value;
    }

}
