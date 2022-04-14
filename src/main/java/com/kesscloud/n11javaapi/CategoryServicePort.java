
package com.kesscloud.n11javaapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CategoryServicePort", targetNamespace = "http://www.n11.com/ws/schemas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CategoryServicePort {


    /**
     * 
     * @param getCategoryAttributesIdRequest
     * @return
     *     returns com.kesscloud.n11javaapi.GetCategoryAttributesIdResponse
     */
    @WebMethod(operationName = "GetCategoryAttributesId")
    @WebResult(name = "GetCategoryAttributesIdResponse", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetCategoryAttributesIdResponse")
    public GetCategoryAttributesIdResponse getCategoryAttributesId(
        @WebParam(name = "GetCategoryAttributesIdRequest", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetCategoryAttributesIdRequest")
        GetCategoryAttributesIdRequest getCategoryAttributesIdRequest);

    /**
     * 
     * @param getCategoryAttributesRequest
     * @return
     *     returns com.kesscloud.n11javaapi.GetCategoryAttributesResponse
     */
    @WebMethod(operationName = "GetCategoryAttributes")
    @WebResult(name = "GetCategoryAttributesResponse", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetCategoryAttributesResponse")
    public GetCategoryAttributesResponse getCategoryAttributes(
        @WebParam(name = "GetCategoryAttributesRequest", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetCategoryAttributesRequest")
        GetCategoryAttributesRequest getCategoryAttributesRequest);

    /**
     * 
     * @param getCategoryAttributeValueRequest
     * @return
     *     returns com.kesscloud.n11javaapi.GetCategoryAttributeValueResponse
     */
    @WebMethod(operationName = "GetCategoryAttributeValue")
    @WebResult(name = "GetCategoryAttributeValueResponse", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetCategoryAttributeValueResponse")
    public GetCategoryAttributeValueResponse getCategoryAttributeValue(
        @WebParam(name = "GetCategoryAttributeValueRequest", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetCategoryAttributeValueRequest")
        GetCategoryAttributeValueRequest getCategoryAttributeValueRequest);

    /**
     * 
     * @param getParentCategoryRequest
     * @return
     *     returns com.kesscloud.n11javaapi.GetParentCategoryResponse
     */
    @WebMethod(operationName = "GetParentCategory")
    @WebResult(name = "GetParentCategoryResponse", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetParentCategoryResponse")
    public GetParentCategoryResponse getParentCategory(
        @WebParam(name = "GetParentCategoryRequest", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetParentCategoryRequest")
        GetParentCategoryRequest getParentCategoryRequest);

    /**
     * 
     * @param getTopLevelCategoriesRequest
     * @return
     *     returns com.kesscloud.n11javaapi.GetTopLevelCategoriesResponse
     */
    @WebMethod(operationName = "GetTopLevelCategories")
    @WebResult(name = "GetTopLevelCategoriesResponse", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetTopLevelCategoriesResponse")
    public GetTopLevelCategoriesResponse getTopLevelCategories(
        @WebParam(name = "GetTopLevelCategoriesRequest", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetTopLevelCategoriesRequest")
        GetTopLevelCategoriesRequest getTopLevelCategoriesRequest);

    /**
     * 
     * @param getSubCategoriesRequest
     * @return
     *     returns com.kesscloud.n11javaapi.GetSubCategoriesResponse
     */
    @WebMethod(operationName = "GetSubCategories")
    @WebResult(name = "GetSubCategoriesResponse", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetSubCategoriesResponse")
    public GetSubCategoriesResponse getSubCategories(
        @WebParam(name = "GetSubCategoriesRequest", targetNamespace = "http://www.n11.com/ws/schemas", partName = "GetSubCategoriesRequest")
        GetSubCategoriesRequest getSubCategoriesRequest);

}
