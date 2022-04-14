
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductUnitInfoModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUnitInfoModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="unitWeight" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUnitInfoModel", propOrder = {
    "unitType",
    "unitWeight"
})
public class ProductUnitInfoModel {

    @XmlElement(required = true)
    protected BigInteger unitType;
    @XmlElement(required = true)
    protected BigInteger unitWeight;

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitType(BigInteger value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitWeight() {
        return unitWeight;
    }

    /**
     * Sets the value of the unitWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitWeight(BigInteger value) {
        this.unitWeight = value;
    }

}
