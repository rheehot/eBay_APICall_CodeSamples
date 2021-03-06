//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopRatedProgramCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TopRatedProgramCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="Global"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TopRatedProgramCodeType")
@XmlEnum
public enum TopRatedProgramCodeType {


    /**
     * 
     * 						Specifies the US Top-Rated Seller Program.
     * 					
     * 
     */
    US("US"),

    /**
     * 
     * 						Specifies the UK Top-Rated Seller Program.
     * 					
     * 
     */
    UK("UK"),

    /**
     * 
     * 						Specifies the German Top-Rated Seller Program.
     * 					
     * 
     */
    DE("DE"),

    /**
     * 
     * 						Specifies the Global Top-Rated Seller Program.
     * 					
     * 
     */
    @XmlEnumValue("Global")
    GLOBAL("Global"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    TopRatedProgramCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TopRatedProgramCodeType fromValue(String v) {
        for (TopRatedProgramCodeType c: TopRatedProgramCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
