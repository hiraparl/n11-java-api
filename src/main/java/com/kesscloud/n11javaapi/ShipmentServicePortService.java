
package com.kesscloud.n11javaapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ShipmentServicePortService", targetNamespace = "http://www.n11.com/ws/schemas", wsdlLocation = "https://api.n11.com/ws/ShipmentService.wsdl")
public class ShipmentServicePortService
    extends Service
{

    private final static URL SHIPMENTSERVICEPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHIPMENTSERVICEPORTSERVICE_EXCEPTION;
    private final static QName SHIPMENTSERVICEPORTSERVICE_QNAME = new QName("http://www.n11.com/ws/schemas", "ShipmentServicePortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://api.n11.com/ws/ShipmentService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHIPMENTSERVICEPORTSERVICE_WSDL_LOCATION = url;
        SHIPMENTSERVICEPORTSERVICE_EXCEPTION = e;
    }

    public ShipmentServicePortService() {
        super(__getWsdlLocation(), SHIPMENTSERVICEPORTSERVICE_QNAME);
    }

    public ShipmentServicePortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHIPMENTSERVICEPORTSERVICE_QNAME, features);
    }

    public ShipmentServicePortService(URL wsdlLocation) {
        super(wsdlLocation, SHIPMENTSERVICEPORTSERVICE_QNAME);
    }

    public ShipmentServicePortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHIPMENTSERVICEPORTSERVICE_QNAME, features);
    }

    public ShipmentServicePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShipmentServicePortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShipmentServicePort
     */
    @WebEndpoint(name = "ShipmentServicePortSoap11")
    public ShipmentServicePort getShipmentServicePortSoap11() {
        return super.getPort(new QName("http://www.n11.com/ws/schemas", "ShipmentServicePortSoap11"), ShipmentServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShipmentServicePort
     */
    @WebEndpoint(name = "ShipmentServicePortSoap11")
    public ShipmentServicePort getShipmentServicePortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.n11.com/ws/schemas", "ShipmentServicePortSoap11"), ShipmentServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHIPMENTSERVICEPORTSERVICE_EXCEPTION!= null) {
            throw SHIPMENTSERVICEPORTSERVICE_EXCEPTION;
        }
        return SHIPMENTSERVICEPORTSERVICE_WSDL_LOCATION;
    }

}
