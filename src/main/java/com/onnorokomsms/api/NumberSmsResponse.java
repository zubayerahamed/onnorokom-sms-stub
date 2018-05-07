
package com.onnorokomsms.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="NumberSmsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "numberSmsResult" })
@XmlRootElement(name = "NumberSmsResponse")
public class NumberSmsResponse {

	@XmlElement(name = "NumberSmsResult")
	protected String numberSmsResult;

	/**
	 * Gets the value of the numberSmsResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumberSmsResult() {
		return numberSmsResult;
	}

	/**
	 * Sets the value of the numberSmsResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumberSmsResult(String value) {
		this.numberSmsResult = value;
	}

}
