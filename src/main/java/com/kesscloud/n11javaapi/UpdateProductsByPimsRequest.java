
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateProductsByPimsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProductsByPimsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productIdList" type="{http://www.n11.com/ws/schemas}ProductIdList" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProductsByPimsRequest", propOrder = {
    "productIdList"
})
public class UpdateProductsByPimsRequest {

    @XmlElement(required = true)
    protected List<ProductIdList> productIdList;

    /**
     * Gets the value of the productIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdList }
     * 
     * 
     */
    public List<ProductIdList> getProductIdList() {
        if (productIdList == null) {
            productIdList = new ArrayList<ProductIdList>();
        }
        return this.productIdList;
    }

}
