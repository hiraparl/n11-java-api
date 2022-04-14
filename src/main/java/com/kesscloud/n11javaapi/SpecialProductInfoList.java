
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialProductInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialProductInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specialProductInfo" type="{http://www.n11.com/ws/schemas}SpecialProductInfoApiModel" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialProductInfoList", propOrder = {
    "specialProductInfo"
})
public class SpecialProductInfoList {

    @XmlElement(required = true)
    protected List<SpecialProductInfoApiModel> specialProductInfo;

    /**
     * Gets the value of the specialProductInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialProductInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProductInfoApiModel }
     * 
     * 
     */
    public List<SpecialProductInfoApiModel> getSpecialProductInfo() {
        if (specialProductInfo == null) {
            specialProductInfo = new ArrayList<SpecialProductInfoApiModel>();
        }
        return this.specialProductInfo;
    }

}
