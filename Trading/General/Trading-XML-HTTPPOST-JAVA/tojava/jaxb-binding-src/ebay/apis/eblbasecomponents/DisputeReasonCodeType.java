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
 * <p>Java class for DisputeReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BuyerHasNotPaid"/>
 *     &lt;enumeration value="TransactionMutuallyCanceled"/>
 *     &lt;enumeration value="ItemNotReceived"/>
 *     &lt;enumeration value="SignificantlyNotAsDescribed"/>
 *     &lt;enumeration value="NoRefund"/>
 *     &lt;enumeration value="ReturnPolicyUnpaidItem"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeReasonCodeType")
@XmlEnum
public enum DisputeReasonCodeType {


    /**
     * 
     * 						The buyer has not paid for the item. For Unpaid Item Process disputes.
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotPaid")
    BUYER_HAS_NOT_PAID("BuyerHasNotPaid"),

    /**
     * 
     * 						The seller claims that the buyer agrees to not complete
     * 						the transaction. This triggers a waiting period for buyer agreement,
     * 						disagreement or no buyer response.
     * 						For Unpaid Item Process disputes.
     * 					
     * 
     */
    @XmlEnumValue("TransactionMutuallyCanceled")
    TRANSACTION_MUTUALLY_CANCELED("TransactionMutuallyCanceled"),

    /**
     * 
     * 						The buyer did not receive the item. For Item Not Received disputes.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceived")
    ITEM_NOT_RECEIVED("ItemNotReceived"),

    /**
     * 
     * 						An option for Item Not Received disputes.
     * 					
     * 
     */
    @XmlEnumValue("SignificantlyNotAsDescribed")
    SIGNIFICANTLY_NOT_AS_DESCRIBED("SignificantlyNotAsDescribed"),

    /**
     * 
     * 						The item was returned but no refund was given.
     * 					
     * 
     */
    @XmlEnumValue("NoRefund")
    NO_REFUND("NoRefund"),

    /**
     * 
     * 						Item was returned and seller was not paid.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyUnpaidItem")
    RETURN_POLICY_UNPAID_ITEM("ReturnPolicyUnpaidItem"),

    /**
     * 
     * 					Reserved for future use.
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeReasonCodeType fromValue(String v) {
        for (DisputeReasonCodeType c: DisputeReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}