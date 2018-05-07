
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
 *         &lt;element name="messageText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "userName", "userPassword", "messageText", "numberList", "smsType", "maskName",
		"campaignName" })
@XmlRootElement(name = "OneToMany")
public class OneToMany {

	protected String userName;
	protected String userPassword;
	protected String messageText;
	protected String numberList;
	protected String smsType;
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
	 * Gets the value of the messageText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * Sets the value of the messageText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessageText(String value) {
		this.messageText = value;
	}

	/**
	 * Gets the value of the numberList property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumberList() {
		return numberList;
	}

	/**
	 * Sets the value of the numberList property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumberList(String value) {
		this.numberList = value;
	}

	/**
	 * Gets the value of the smsType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSmsType() {
		return smsType;
	}

	/**
	 * Sets the value of the smsType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSmsType(String value) {
		this.smsType = value;
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
