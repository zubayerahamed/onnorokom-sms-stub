
package com.onnorokomsms.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MessageHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarskText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", propOrder = { "userName", "userPassword", "marskText", "campingName" })
public class MessageHeader {

	@XmlElement(name = "UserName")
	protected String userName;
	@XmlElement(name = "UserPassword")
	protected String userPassword;
	@XmlElement(name = "MarskText")
	protected String marskText;
	@XmlElement(name = "CampingName")
	protected String campingName;

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
	 * Gets the value of the marskText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarskText() {
		return marskText;
	}

	/**
	 * Sets the value of the marskText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarskText(String value) {
		this.marskText = value;
	}

	/**
	 * Gets the value of the campingName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCampingName() {
		return campingName;
	}

	/**
	 * Sets the value of the campingName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCampingName(String value) {
		this.campingName = value;
	}

}
