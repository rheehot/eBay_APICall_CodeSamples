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
 * <p>Java class for ItemFormatSortFilterCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFormatSortFilterCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ShowAnyItems"/>
 *     &lt;enumeration value="ShowItemsWithBINFirst"/>
 *     &lt;enumeration value="ShowOnlyItemsWithBIN"/>
 *     &lt;enumeration value="ShowOnlyStoreItems"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFormatSortFilterCodeType")
@XmlEnum
public enum ItemFormatSortFilterCodeType {


    /**
     * 
     * 					Show any items, in no particular order.
     * 					
     * 
     */
    @XmlEnumValue("ShowAnyItems")
    SHOW_ANY_ITEMS("ShowAnyItems"),

    /**
     * 
     * 					Show items with a Buy It Now price first.
     * 					
     * 
     */
    @XmlEnumValue("ShowItemsWithBINFirst")
    SHOW_ITEMS_WITH_BIN_FIRST("ShowItemsWithBINFirst"),

    /**
     * 
     * 					Show only items with a Buy It Now price.
     * 					
     * 
     */
    @XmlEnumValue("ShowOnlyItemsWithBIN")
    SHOW_ONLY_ITEMS_WITH_BIN("ShowOnlyItemsWithBIN"),

    /**
     * 
     * 					Show only store inventory items.
     * 					
     * 
     */
    @XmlEnumValue("ShowOnlyStoreItems")
    SHOW_ONLY_STORE_ITEMS("ShowOnlyStoreItems"),

    /**
     * 
     * 					Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ItemFormatSortFilterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFormatSortFilterCodeType fromValue(String v) {
        for (ItemFormatSortFilterCodeType c: ItemFormatSortFilterCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
