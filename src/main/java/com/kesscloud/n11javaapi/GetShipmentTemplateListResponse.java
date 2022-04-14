
package com.kesscloud.n11javaapi;

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
 *         &lt;element name="shipmentTemplates" type="{http://www.n11.com/ws/schemas}ShipmentTemplateList"/&gt;
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
    "shipmentTemplates"
})
@XmlRootElement(name = "GetShipmentTemplateListResponse")
public class GetShipmentTemplateListResponse {

    @XmlElement(required = true)
    protected ResultInfo result;
    @XmlElement(required = true)
    protected ShipmentTemplateList shipmentTemplates;

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
     * Gets the value of the shipmentTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTemplateList }
     *     
     */
    public ShipmentTemplateList getShipmentTemplates() {
        return shipmentTemplates;
    }

    /**
     * Sets the value of the shipmentTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTemplateList }
     *     
     */
    public void setShipmentTemplates(ShipmentTemplateList value) {
        this.shipmentTemplates = value;
    }

}