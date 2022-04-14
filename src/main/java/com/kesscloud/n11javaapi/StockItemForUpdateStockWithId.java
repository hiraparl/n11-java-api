
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockItemForUpdateStockWithId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockItemForUpdateStockWithId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="delist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockItemForUpdateStockWithId", propOrder = {
    "id",
    "quantity",
    "version",
    "delist"
})
public class StockItemForUpdateStockWithId {

    protected long id;
    @XmlElement(required = true)
    protected BigInteger quantity;
    protected long version;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean delist;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
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

    /**
     * Gets the value of the delist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelist() {
        return delist;
    }

    /**
     * Sets the value of the delist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelist(Boolean value) {
        this.delist = value;
    }

}
