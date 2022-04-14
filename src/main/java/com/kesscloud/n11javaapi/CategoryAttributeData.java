
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryAttributeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryAttributeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="multipleSelect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="valueList" type="{http://www.n11.com/ws/schemas}CategoryAttributeValueList"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryAttributeData", propOrder = {
    "id",
    "name",
    "mandatory",
    "multipleSelect",
    "valueList",
    "priority"
})
public class CategoryAttributeData {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected boolean mandatory;
    protected boolean multipleSelect;
    @XmlElement(required = true)
    protected CategoryAttributeValueList valueList;
    protected double priority;

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
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the multipleSelect property.
     * 
     */
    public boolean isMultipleSelect() {
        return multipleSelect;
    }

    /**
     * Sets the value of the multipleSelect property.
     * 
     */
    public void setMultipleSelect(boolean value) {
        this.multipleSelect = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryAttributeValueList }
     *     
     */
    public CategoryAttributeValueList getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryAttributeValueList }
     *     
     */
    public void setValueList(CategoryAttributeValueList value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public double getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(double value) {
        this.priority = value;
    }

}
