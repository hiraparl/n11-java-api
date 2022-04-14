
package com.kesscloud.n11javaapi;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productSellerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subtitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="domestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="category" type="{http://www.n11.com/ws/schemas}CategoryRequest"/&gt;
 *         &lt;element name="specialProductInfoList" type="{http://www.n11.com/ws/schemas}SpecialProductInfoList"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="currencyType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="images" type="{http://www.n11.com/ws/schemas}ProductImageList"/&gt;
 *         &lt;element name="approvalStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="groupAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="groupItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributes" type="{http://www.n11.com/ws/schemas}ProductAttributeRequestList"/&gt;
 *         &lt;element name="saleStartDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saleEndDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preparingDay" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="discount" type="{http://www.n11.com/ws/schemas}ProductDiscountRequest"/&gt;
 *         &lt;element name="shipmentTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stockItems" type="{http://www.n11.com/ws/schemas}ProductSkuRequestList"/&gt;
 *         &lt;element name="unitInfo" type="{http://www.n11.com/ws/schemas}ProductUnitInfoModel"/&gt;
 *         &lt;element name="maxPurchaseQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="sellerNote" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductRequest", propOrder = {
    "productSellerCode",
    "title",
    "subtitle",
    "description",
    "domestic",
    "category",
    "specialProductInfoList",
    "price",
    "currencyType",
    "images",
    "approvalStatus",
    "groupAttribute",
    "groupItemCode",
    "itemName",
    "attributes",
    "saleStartDate",
    "saleEndDate",
    "productionDate",
    "expirationDate",
    "productCondition",
    "preparingDay",
    "discount",
    "shipmentTemplate",
    "stockItems",
    "unitInfo",
    "maxPurchaseQuantity",
    "sellerNote"
})
public class ProductRequest {

    @XmlElement(required = true)
    protected String productSellerCode;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String subtitle;
    @XmlElement(required = true)
    protected String description;
    protected boolean domestic;
    @XmlElement(required = true)
    protected CategoryRequest category;
    @XmlElement(required = true, nillable = true)
    protected SpecialProductInfoList specialProductInfoList;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected BigInteger currencyType;
    @XmlElement(required = true)
    protected ProductImageList images;
    @XmlElement(required = true, nillable = true)
    protected BigInteger approvalStatus;
    @XmlElement(required = true)
    protected String groupAttribute;
    @XmlElement(required = true)
    protected String groupItemCode;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected ProductAttributeRequestList attributes;
    @XmlElement(required = true)
    protected String saleStartDate;
    @XmlElement(required = true)
    protected String saleEndDate;
    @XmlElement(required = true)
    protected String productionDate;
    @XmlElement(required = true)
    protected String expirationDate;
    @XmlElement(required = true)
    protected String productCondition;
    @XmlElement(required = true)
    protected BigInteger preparingDay;
    @XmlElement(required = true)
    protected ProductDiscountRequest discount;
    @XmlElement(required = true)
    protected String shipmentTemplate;
    @XmlElement(required = true)
    protected ProductSkuRequestList stockItems;
    @XmlElement(required = true)
    protected ProductUnitInfoModel unitInfo;
    @XmlElement(required = true)
    protected BigInteger maxPurchaseQuantity;
    @XmlElement(required = true)
    protected String sellerNote;

    /**
     * Gets the value of the productSellerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSellerCode() {
        return productSellerCode;
    }

    /**
     * Sets the value of the productSellerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSellerCode(String value) {
        this.productSellerCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the domestic property.
     * 
     */
    public boolean isDomestic() {
        return domestic;
    }

    /**
     * Sets the value of the domestic property.
     * 
     */
    public void setDomestic(boolean value) {
        this.domestic = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryRequest }
     *     
     */
    public CategoryRequest getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryRequest }
     *     
     */
    public void setCategory(CategoryRequest value) {
        this.category = value;
    }

    /**
     * Gets the value of the specialProductInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialProductInfoList }
     *     
     */
    public SpecialProductInfoList getSpecialProductInfoList() {
        return specialProductInfoList;
    }

    /**
     * Sets the value of the specialProductInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialProductInfoList }
     *     
     */
    public void setSpecialProductInfoList(SpecialProductInfoList value) {
        this.specialProductInfoList = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyType(BigInteger value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ProductImageList }
     *     
     */
    public ProductImageList getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductImageList }
     *     
     */
    public void setImages(ProductImageList value) {
        this.images = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovalStatus(BigInteger value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the groupAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupAttribute() {
        return groupAttribute;
    }

    /**
     * Sets the value of the groupAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupAttribute(String value) {
        this.groupAttribute = value;
    }

    /**
     * Gets the value of the groupItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupItemCode() {
        return groupItemCode;
    }

    /**
     * Sets the value of the groupItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupItemCode(String value) {
        this.groupItemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeRequestList }
     *     
     */
    public ProductAttributeRequestList getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeRequestList }
     *     
     */
    public void setAttributes(ProductAttributeRequestList value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the saleStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleStartDate() {
        return saleStartDate;
    }

    /**
     * Sets the value of the saleStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleStartDate(String value) {
        this.saleStartDate = value;
    }

    /**
     * Gets the value of the saleEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleEndDate() {
        return saleEndDate;
    }

    /**
     * Sets the value of the saleEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleEndDate(String value) {
        this.saleEndDate = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionDate(String value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the productCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCondition() {
        return productCondition;
    }

    /**
     * Sets the value of the productCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCondition(String value) {
        this.productCondition = value;
    }

    /**
     * Gets the value of the preparingDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreparingDay() {
        return preparingDay;
    }

    /**
     * Sets the value of the preparingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreparingDay(BigInteger value) {
        this.preparingDay = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDiscountRequest }
     *     
     */
    public ProductDiscountRequest getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDiscountRequest }
     *     
     */
    public void setDiscount(ProductDiscountRequest value) {
        this.discount = value;
    }

    /**
     * Gets the value of the shipmentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTemplate() {
        return shipmentTemplate;
    }

    /**
     * Sets the value of the shipmentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTemplate(String value) {
        this.shipmentTemplate = value;
    }

    /**
     * Gets the value of the stockItems property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSkuRequestList }
     *     
     */
    public ProductSkuRequestList getStockItems() {
        return stockItems;
    }

    /**
     * Sets the value of the stockItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSkuRequestList }
     *     
     */
    public void setStockItems(ProductSkuRequestList value) {
        this.stockItems = value;
    }

    /**
     * Gets the value of the unitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductUnitInfoModel }
     *     
     */
    public ProductUnitInfoModel getUnitInfo() {
        return unitInfo;
    }

    /**
     * Sets the value of the unitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductUnitInfoModel }
     *     
     */
    public void setUnitInfo(ProductUnitInfoModel value) {
        this.unitInfo = value;
    }

    /**
     * Gets the value of the maxPurchaseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPurchaseQuantity() {
        return maxPurchaseQuantity;
    }

    /**
     * Sets the value of the maxPurchaseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPurchaseQuantity(BigInteger value) {
        this.maxPurchaseQuantity = value;
    }

    /**
     * Gets the value of the sellerNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerNote() {
        return sellerNote;
    }

    /**
     * Sets the value of the sellerNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerNote(String value) {
        this.sellerNote = value;
    }

}
