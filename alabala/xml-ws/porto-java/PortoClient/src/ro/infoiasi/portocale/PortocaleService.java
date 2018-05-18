
package ro.infoiasi.portocale;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PortocaleService", targetNamespace = "http://portocale.infoiasi.ro/", wsdlLocation = "http://localhost:8888/porto?wsdl")
public class PortocaleService
    extends Service
{

    private final static URL PORTOCALESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ro.infoiasi.portocale.PortocaleService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ro.infoiasi.portocale.PortocaleService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8888/porto?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8888/porto?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PORTOCALESERVICE_WSDL_LOCATION = url;
    }

    public PortocaleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PortocaleService() {
        super(PORTOCALESERVICE_WSDL_LOCATION, new QName("http://portocale.infoiasi.ro/", "PortocaleService"));
    }

    /**
     * 
     * @return
     *     returns Portocale
     */
    @WebEndpoint(name = "PortocalePort")
    public Portocale getPortocalePort() {
        return super.getPort(new QName("http://portocale.infoiasi.ro/", "PortocalePort"), Portocale.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Portocale
     */
    @WebEndpoint(name = "PortocalePort")
    public Portocale getPortocalePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://portocale.infoiasi.ro/", "PortocalePort"), Portocale.class, features);
    }

}
