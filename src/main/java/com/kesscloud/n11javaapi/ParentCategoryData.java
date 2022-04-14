
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentCategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentCategoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentCategory" type="{http://www.n11.com/ws/schemas}ParentCategory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentCategoryData", propOrder = {
    "id",
    "name",
    "parentCategory"
})
public class ParentCategoryData {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ParentCategory parentCategory;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ParentCategory }
     *     
     */
    public ParentCategory getParentCategory() {
        return parentCategory;
    }

    /**
     * Sets the value of the parentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentCategory }
     *     
     */
    public void setParentCategory(ParentCategory value) {
        this.parentCategory = value;
    }

}
