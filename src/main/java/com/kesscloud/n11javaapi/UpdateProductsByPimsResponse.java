
package com.kesscloud.n11javaapi;

import java.math.BigInteger;
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
 *         &lt;element name="successProductCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="failedProductCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "successProductCount",
    "failedProductCount"
})
@XmlRootElement(name = "UpdateProductsByPimsResponse")
public class UpdateProductsByPimsResponse {

    @XmlElement(required = true)
    protected ResultInfo result;
    @XmlElement(required = true)
    protected BigInteger successProductCount;
    @XmlElement(required = true)
    protected BigInteger failedProductCount;

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
     * Gets the value of the successProductCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuccessProductCount() {
        return successProductCount;
    }

    /**
     * Sets the value of the successProductCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuccessProductCount(BigInteger value) {
        this.successProductCount = value;
    }

    /**
     * Gets the value of the failedProductCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailedProductCount() {
        return failedProductCount;
    }

    /**
     * Sets the value of the failedProductCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailedProductCount(BigInteger value) {
        this.failedProductCount = value;
    }

}
