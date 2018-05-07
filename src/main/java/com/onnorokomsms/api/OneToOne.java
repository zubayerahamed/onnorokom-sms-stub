
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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "userName", "userPassword", "mobileNumber", "smsText", "type", "maskName",
		"campaignName" })
@XmlRootElement(name = "OneToOne")
public class OneToOne {

	protected String userName;
	protected String userPassword;
	protected String mobileNumber;
	protected String smsText;
	protected String type;
	protected String maskName;
	protected String campaignName;

	/**
	 * Gets the value of the userName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the value of the userName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserName(String value) {
		this.userName = value;
	}

	/**
	 * Gets the value of the userPassword property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * Sets the value of the userPassword property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUserPassword(String value) {
		this.userPassword = value;
	}

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
