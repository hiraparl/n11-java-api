
package com.kesscloud.n11javaapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductQuestionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQuestionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productQuestion" type="{http://www.n11.com/ws/schemas}ProductQuestion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductQuestionList", propOrder = {
    "productQuestion"
})
public class ProductQuestionList {

    @XmlElement(required = true)
    protected List<ProductQuestion> productQuestion;

    /**
     * Gets the value of the productQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductQuestion }
     * 
     * 
     */
    public List<ProductQuestion> getProductQuestion() {
        if (productQuestion == null) {
            productQuestion = new ArrayList<ProductQuestion>();
        }
        return this.productQuestion;
    }

}
