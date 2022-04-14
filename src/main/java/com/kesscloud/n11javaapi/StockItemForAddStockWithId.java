
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemForAddStockWithId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockItemForAddStockWithId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "StockItemForAddStockWithId", propOrder = {
    "id",
    "quantityToIncrease",
    "version"
})
public class StockItemForAddStockWithId {

    protected long id;
    @XmlElement(required = true)
    protected BigInteger quantityToIncrease;
    protected long version;

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
