
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSkuBasicRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSkuBasicRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sellerStockCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="optionPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSkuBasicRequest", propOrder = {
    "sellerStockCode",
    "optionPrice"
})
@XmlSeeAlso({
    ProductSkuBasic.class
})
public class ProductSkuBasicRequest {

    @XmlElement(required = true)
    protected String sellerStockCode;
    @XmlElement(required = true)
    protected BigDecimal optionPrice;

    /**
     * Gets the value of the sellerStockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerStockCode() {
        return sellerStockCode;
    }

    /**
     * Sets the value of the sellerStockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerStockCode(String value) {
        this.sellerStockCode = value;
    }

    /**
     * Gets the value of the optionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptionPrice() {
        return optionPrice;
    }

    /**
     * Sets the value of the optionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptionPrice(BigDecimal value) {
        this.optionPrice = value;
    }

}
