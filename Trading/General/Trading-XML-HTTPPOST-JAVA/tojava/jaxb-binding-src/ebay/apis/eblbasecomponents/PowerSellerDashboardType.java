//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Provides information about your PowerSeller status.
 * 			
 * 
 * <p>Java class for PowerSellerDashboardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerSellerDashboardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Level" type="{urn:ebay:apis:eBLBaseComponents}SellerLevelCodeType" minOccurs="0"/>
 *         &lt;element name="Alert" type="{urn:ebay:apis:eBLBaseComponents}SellerDashboardAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerSellerDashboardType", propOrder = {
    "level",
    "alert"
})
public class PowerSellerDashboardType {

    @XmlElement(name = "Level")
    protected SellerLevelCodeType level;
    @XmlElement(name = "Alert")
    protected List<SellerDashboardAlertType> alert;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public SellerLevelCodeType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public void setLevel(SellerLevelCodeType value) {
        this.level = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellerDashboardAlertType }
     * 
     * 
     */
    public List<SellerDashboardAlertType> getAlert() {
        if (alert == null) {
            alert = new ArrayList<SellerDashboardAlertType>();
        }
        return this.alert;
    }

}