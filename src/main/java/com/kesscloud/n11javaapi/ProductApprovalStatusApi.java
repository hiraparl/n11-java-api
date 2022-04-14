
package com.kesscloud.n11javaapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductApprovalStatusApi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductApprovalStatusApi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvedCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="unapprovedCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="waitingApprovalCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="waitingCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rejectedCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductApprovalStatusApi", propOrder = {
    "approvedCount",
    "unapprovedCount",
    "waitingApprovalCount",
    "waitingCount",
    "rejectedCount",
    "totalCount"
})
public class ProductApprovalStatusApi {

    protected long approvedCount;
    protected long unapprovedCount;
    protected long waitingApprovalCount;
    protected long waitingCount;
    protected long rejectedCount;
    protected long totalCount;

    /**
     * Gets the value of the approvedCount property.
     * 
     */
    public long getApprovedCount() {
        return approvedCount;
    }

    /**
     * Sets the value of the approvedCount property.
     * 
     */
    public void setApprovedCount(long value) {
        this.approvedCount = value;
    }

    /**
     * Gets the value of the unapprovedCount property.
     * 
     */
    public long getUnapprovedCount() {
        return unapprovedCount;
    }

    /**
     * Sets the value of the unapprovedCount property.
     * 
     */
    public void setUnapprovedCount(long value) {
        this.unapprovedCount = value;
    }

    /**
     * Gets the value of the waitingApprovalCount property.
     * 
     */
    public long getWaitingApprovalCount() {
        return waitingApprovalCount;
    }

    /**
     * Sets the value of the waitingApprovalCount property.
     * 
     */
    public void setWaitingApprovalCount(long value) {
        this.waitingApprovalCount = value;
    }

    /**
     * Gets the value of the waitingCount property.
     * 
     */
    public long getWaitingCount() {
        return waitingCount;
    }

    /**
     * Sets the value of the waitingCount property.
     * 
     */
    public void setWaitingCount(long value) {
        this.waitingCount = value;
    }

    /**
     * Gets the value of the rejectedCount property.
     * 
     */
    public long getRejectedCount() {
        return rejectedCount;
    }

    /**
     * Sets the value of the rejectedCount property.
     * 
     */
    public void setRejectedCount(long value) {
        this.rejectedCount = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(long value) {
        this.totalCount = value;
    }

}
