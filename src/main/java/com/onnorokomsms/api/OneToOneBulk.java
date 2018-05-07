
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
 *         &lt;element name="messageHeader" type="{http://api.onnorokomsms.com/}MessageHeader" minOccurs="0"/>
 *         &lt;element name="wsSmses" type="{http://api.onnorokomsms.com/}ArrayOfWsSms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "messageHeader", "wsSmses" })
@XmlRootElement(name = "OneToOneBulk")
public class OneToOneBulk {

	protected MessageHeader messageHeader;
	protected ArrayOfWsSms wsSmses;

	/**
	 * Gets the value of the messageHeader property.
	 * 
	 * @return possible object is {@link MessageHeader }
	 * 
	 */
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	/**
	 * Sets the value of the messageHeader property.
	 * 
	 * @param value
	 *            allowed object is {@link MessageHeader }
	 * 
	 */
	public void setMessageHeader(MessageHeader value) {
		this.messageHeader = value;
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

}
