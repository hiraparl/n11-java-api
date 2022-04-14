
package com.kesscloud.n11javaapi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kesscloud.n11javaapi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BaseResponseStatus_QNAME = new QName("", "status");
    private final static QName _BaseResponseErrorCode_QNAME = new QName("", "errorCode");
    private final static QName _BaseResponseErrorMessage_QNAME = new QName("", "errorMessage");
    private final static QName _BaseResponseErrorCategory_QNAME = new QName("", "errorCategory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kesscloud.n11javaapi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateOrUpdateShipmentTemplateRequest }
     * 
     */
    public CreateOrUpdateShipmentTemplateRequest createCreateOrUpdateShipmentTemplateRequest() {
        return new CreateOrUpdateShipmentTemplateRequest();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link ShipmentApiModel }
     * 
     */
    public ShipmentApiModel createShipmentApiModel() {
        return new ShipmentApiModel();
    }

    /**
     * Create an instance of {@link CreateOrUpdateShipmentTemplateResponse }
     * 
     */
    public CreateOrUpdateShipmentTemplateResponse createCreateOrUpdateShipmentTemplateResponse() {
        return new CreateOrUpdateShipmentTemplateResponse();
    }

    /**
     * Create an instance of {@link ResultInfo }
     * 
     */
    public ResultInfo createResultInfo() {
        return new ResultInfo();
    }

    /**
     * Create an instance of {@link GetShipmentTemplateRequest }
     * 
     */
    public GetShipmentTemplateRequest createGetShipmentTemplateRequest() {
        return new GetShipmentTemplateRequest();
    }

    /**
     * Create an instance of {@link GetShipmentTemplateResponse }
     * 
     */
    public GetShipmentTemplateResponse createGetShipmentTemplateResponse() {
        return new GetShipmentTemplateResponse();
    }

    /**
     * Create an instance of {@link GetShipmentTemplateListRequest }
     * 
     */
    public GetShipmentTemplateListRequest createGetShipmentTemplateListRequest() {
        return new GetShipmentTemplateListRequest();
    }

    /**
     * Create an instance of {@link GetShipmentTemplateListResponse }
     * 
     */
    public GetShipmentTemplateListResponse createGetShipmentTemplateListResponse() {
        return new GetShipmentTemplateListResponse();
    }

    /**
     * Create an instance of {@link ShipmentTemplateList }
     * 
     */
    public ShipmentTemplateList createShipmentTemplateList() {
        return new ShipmentTemplateList();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ShipmentSaveAddress }
     * 
     */
    public ShipmentSaveAddress createShipmentSaveAddress() {
        return new ShipmentSaveAddress();
    }

    /**
     * Create an instance of {@link DistrictApiModel }
     * 
     */
    public DistrictApiModel createDistrictApiModel() {
        return new DistrictApiModel();
    }

    /**
     * Create an instance of {@link CityApiModel }
     * 
     */
    public CityApiModel createCityApiModel() {
        return new CityApiModel();
    }

    /**
     * Create an instance of {@link ShipmentCompanyApiModel }
     * 
     */
    public ShipmentCompanyApiModel createShipmentCompanyApiModel() {
        return new ShipmentCompanyApiModel();
    }

    /**
     * Create an instance of {@link ShipmentCompanyApiModelList }
     * 
     */
    public ShipmentCompanyApiModelList createShipmentCompanyApiModelList() {
        return new ShipmentCompanyApiModelList();
    }

    /**
     * Create an instance of {@link CityApiModelList }
     * 
     */
    public CityApiModelList createCityApiModelList() {
        return new CityApiModelList();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "status", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseStatus(String value) {
        return new JAXBElement<String>(_BaseResponseStatus_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorCode", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseErrorCode(String value) {
        return new JAXBElement<String>(_BaseResponseErrorCode_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorMessage", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseErrorMessage(String value) {
        return new JAXBElement<String>(_BaseResponseErrorMessage_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorCategory", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseErrorCategory(String value) {
        return new JAXBElement<String>(_BaseResponseErrorCategory_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "status", scope = ResultInfo.class)
    public JAXBElement<String> createResultInfoStatus(String value) {
        return new JAXBElement<String>(_BaseResponseStatus_QNAME, String.class, ResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorCode", scope = ResultInfo.class)
    public JAXBElement<String> createResultInfoErrorCode(String value) {
        return new JAXBElement<String>(_BaseResponseErrorCode_QNAME, String.class, ResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorMessage", scope = ResultInfo.class)
    public JAXBElement<String> createResultInfoErrorMessage(String value) {
        return new JAXBElement<String>(_BaseResponseErrorMessage_QNAME, String.class, ResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "errorCategory", scope = ResultInfo.class)
    public JAXBElement<String> createResultInfoErrorCategory(String value) {
        return new JAXBElement<String>(_BaseResponseErrorCategory_QNAME, String.class, ResultInfo.class, value);
    }

}
