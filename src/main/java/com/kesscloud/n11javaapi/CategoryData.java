
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parentCategory" type="{http://www.n11.com/ws/schemas}CategoryData"/&gt;
 *         &lt;element name="subCategoryList" type="{http://www.n11.com/ws/schemas}SubCategoryList"/&gt;
 *         &lt;element name="attributeList" type="{http://www.n11.com/ws/schemas}CategoryAttributeList"/&gt;
 *         &lt;element name="metadata" type="{http://www.n11.com/ws/schemas}PagingData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryData", propOrder = {
    "id",
    "name",
    "parentCategory",
    "subCategoryList",
    "attributeList",
    "metadata"
})
public class CategoryData {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected CategoryData parentCategory;
    @XmlElement(required = true)
    protected SubCategoryList subCategoryList;
    @XmlElement(required = true)
    protected CategoryAttributeList attributeList;
    @XmlElement(required = true)
    protected PagingData metadata;

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
     *     {@link CategoryData }
     *     
     */
    public CategoryData getParentCategory() {
        return parentCategory;
    }

    /**
     * Sets the value of the parentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryData }
     *     
     */
    public void setParentCategory(CategoryData value) {
        this.parentCategory = value;
    }

    /**
     * Gets the value of the subCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link SubCategoryList }
     *     
     */
    public SubCategoryList getSubCategoryList() {
        return subCategoryList;
    }

    /**
     * Sets the value of the subCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCategoryList }
     *     
     */
    public void setSubCategoryList(SubCategoryList value) {
        this.subCategoryList = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryAttributeList }
     *     
     */
    public CategoryAttributeList getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryAttributeList }
     *     
     */
    public void setAttributeList(CategoryAttributeList value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link PagingData }
     *     
     */
    public PagingData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingData }
     *     
     */
    public void setMetadata(PagingData value) {
        this.metadata = value;
    }

}
