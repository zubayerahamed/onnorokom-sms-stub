
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
 *         &lt;element name="GetCurrentBalanceResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getCurrentBalanceResult" })
@XmlRootElement(name = "GetCurrentBalanceResponse")
public class GetCurrentBalanceResponse {

	@XmlElement(name = "GetCurrentBalanceResult")
	protected String getCurrentBalanceResult;

	/**
	 * Gets the value of the getCurrentBalanceResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGetCurrentBalanceResult() {
		return getCurrentBalanceResult;
	}

	/**
	 * Sets the value of the getCurrentBalanceResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGetCurrentBalanceResult(String value) {
		this.getCurrentBalanceResult = value;
	}

}
