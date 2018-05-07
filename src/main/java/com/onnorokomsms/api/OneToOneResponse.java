
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
 *         &lt;element name="OneToOneResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "oneToOneResult" })
@XmlRootElement(name = "OneToOneResponse")
public class OneToOneResponse {

	@XmlElement(name = "OneToOneResult")
	protected String oneToOneResult;

	/**
	 * Gets the value of the oneToOneResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOneToOneResult() {
		return oneToOneResult;
	}

	/**
	 * Sets the value of the oneToOneResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOneToOneResult(String value) {
		this.oneToOneResult = value;
	}

}
