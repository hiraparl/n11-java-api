
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentTemplateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentTemplateList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipmentTemplate" type="{http://www.n11.com/ws/schemas}ShipmentApiModel" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentTemplateList", propOrder = {
    "shipmentTemplate"
})
public class ShipmentTemplateList {

    @XmlElement(required = true)
    protected List<ShipmentApiModel> shipmentTemplate;

    /**
     * Gets the value of the shipmentTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentApiModel }
     * 
     * 
     */
    public List<ShipmentApiModel> getShipmentTemplate() {
        if (shipmentTemplate == null) {
            shipmentTemplate = new ArrayList<ShipmentApiModel>();
        }
        return this.shipmentTemplate;
    }

}
