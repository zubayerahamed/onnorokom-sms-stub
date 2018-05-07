
package com.onnorokomsms.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "apiKey", "responseId" })
@XmlRootElement(name = "SMSDeliveryStatus")
public class SMSDeliveryStatus {

	protected String apiKey;
	protected String responseId;

	/**
	 * Gets the value of the apiKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * Sets the value of the apiKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApiKey(String value) {
		this.apiKey = value;
	}

	/**
	 * Gets the value of the responseId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseId() {
		return responseId;
	}

	/**
	 * Sets the value of the responseId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseId(String value) {
		this.responseId = value;
	}

}
