
package com.onnorokomsms.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for WsSms complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="WsSms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsSms", propOrder = { "mobileNumber", "smsText", "type" })
public class WsSms {

	@XmlElement(name = "MobileNumber")
	protected String mobileNumber;
	@XmlElement(name = "SmsText")
	protected String smsText;
	@XmlElement(name = "Type")
	protected String type;

	/**
	 * Gets the value of the mobileNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * Sets the value of the mobileNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMobileNumber(String value) {
		this.mobileNumber = value;
	}

	/**
	 * Gets the value of the smsText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSmsText() {
		return smsText;
	}

	/**
	 * Sets the value of the smsText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSmsText(String value) {
		this.smsText = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

}
