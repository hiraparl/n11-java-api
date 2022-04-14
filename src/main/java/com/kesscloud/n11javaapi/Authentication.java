
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authentication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authentication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="appSecret" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authentication", propOrder = {
    "appKey",
    "appSecret"
})
public class Authentication {

    @XmlElement(required = true)
    protected String appKey;
    @XmlElement(required = true)
    protected String appSecret;

    /**
     * Gets the value of the appKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Sets the value of the appKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

    /**
     * Gets the value of the appSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * Sets the value of the appSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppSecret(String value) {
        this.appSecret = value;
    }

}
