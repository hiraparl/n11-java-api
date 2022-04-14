
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *     &lt;enumeration value="Prohibited"/&gt;
 *     &lt;enumeration value="WaitingForApproval"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="UnapprovedUpdate"/&gt;
 *     &lt;enumeration value="Unlisted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductStatus")
@XmlEnum
public enum ProductStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended"),
    @XmlEnumValue("Prohibited")
    PROHIBITED("Prohibited"),
    @XmlEnumValue("WaitingForApproval")
    WAITING_FOR_APPROVAL("WaitingForApproval"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("UnapprovedUpdate")
    UNAPPROVED_UPDATE("UnapprovedUpdate"),
    @XmlEnumValue("Unlisted")
    UNLISTED("Unlisted");
    private final String value;

    ProductStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductStatus fromValue(String v) {
        for (ProductStatus c: ProductStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
