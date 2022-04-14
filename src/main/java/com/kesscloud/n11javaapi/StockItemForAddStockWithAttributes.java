
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemForAddStockWithAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockItemForAddStockWithAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributes" type="{http://www.n11.com/ws/schemas}StockAttributeList"/&gt;
 *         &lt;element name="quantityToIncrease" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockItemForAddStockWithAttributes", propOrder = {
    "attributes",
    "quantityToIncrease",
    "version"
})
public class StockItemForAddStockWithAttributes {

    @XmlElement(required = true)
    protected StockAttributeList attributes;
    @XmlElement(required = true)
    protected BigInteger quantityToIncrease;
    protected long version;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link StockAttributeList }
     *     
     */
    public StockAttributeList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockAttributeList }
     *     
     */
    public void setAttributes(StockAttributeList value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the quantityToIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityToIncrease() {
        return quantityToIncrease;
    }

    /**
     * Sets the value of the quantityToIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityToIncrease(BigInteger value) {
        this.quantityToIncrease = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

}
