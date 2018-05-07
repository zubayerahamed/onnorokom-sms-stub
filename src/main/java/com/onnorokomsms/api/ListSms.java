
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
 *         &lt;element name="wsSmses" type="{http://api.onnorokomsms.com/}ArrayOfWsSms" minOccurs="0"/>
 *         &lt;element name="maskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "apiKey", "wsSmses", "maskName", "campaignName" })
@XmlRootElement(name = "ListSms")
public class ListSms {

	protected String apiKey;
	protected ArrayOfWsSms wsSmses;
	protected String maskName;
	protected String campaignName;

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
	 * Gets the value of the wsSmses property.
	 * 
	 * @return possible object is {@link ArrayOfWsSms }
	 * 
	 */
	public ArrayOfWsSms getWsSmses() {
		return wsSmses;
	}

	/**
	 * Sets the value of the wsSmses property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfWsSms }
	 * 
	 */
	public void setWsSmses(ArrayOfWsSms value) {
		this.wsSmses = value;
	}

	/**
	 * Gets the value of the maskName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMaskName() {
		return maskName;
	}

	/**
	 * Sets the value of the maskName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMaskName(String value) {
		this.maskName = value;
	}

	/**
	 * Gets the value of the campaignName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCampaignName() {
		return campaignName;
	}

	/**
	 * Sets the value of the campaignName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCampaignName(String value) {
		this.campaignName = value;
	}

}
