
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSku"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.n11.com/ws/schemas}ProductSkuBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="attributes" type="{http://www.n11.com/ws/schemas}ProductAttributeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSku", propOrder = {
    "id",
    "version",
    "quantity",
    "attributes"
})
public class ProductSku
    extends ProductSkuBasic
{

    protected long id;
    protected long version;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected ProductAttributeList attributes;

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
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeList }
     *     
     */
    public ProductAttributeList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeList }
     *     
     */
    public void setAttributes(ProductAttributeList value) {
        this.attributes = value;
    }

}
