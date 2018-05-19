/**
 * 
 */
package com.coderslab;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.onnorokomsms.api.SendSms;
import com.onnorokomsms.api.SendSmsSoap;

/**
 * @author Zubayer Ahamed
 *
 */
public class SMSTest {

	private static final Logger logger = Logger.getLogger(SMSTest.class);

	private static final String API_KEY = "";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private static final String MOBILE_NUMBER = "";
	private static final String SMS_TEXT = "";
	private static final String MASK_NAME = "";
	private static final String CAMPAING_NAME = "";
	private static final String SMS_TYPE = "TEXT";
	private List<String> numbersList;

	@Test
	public void sliceReturnValueResponse() {
		String returnedValue = "01748562164||500||3001";
		// System.out.println(returnedValue.lastIndexOf("\\|\\|"));
		System.out.println(returnedValue.substring(returnedValue.lastIndexOf("\\|\\|"), returnedValue.length() - 1));

		String val[] = returnedValue.split("\\|\\|");
		for (String s : val) {
			System.out.println(s);
		}
	}

	@Before
	public void initNumbersList() {
		numbersList = new ArrayList<>();
		numbersList.add("01919408812");
		numbersList.add("01521107685");
	}

	// This method only to see header
	@BeforeClass
	public static void beforeClass() throws Exception {
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
	}

	@Test
	public void testSendSMSOneToOne() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.oneToOne(USERNAME, PASSWORD, MOBILE_NUMBER, SMS_TEXT, SMS_TYPE, MASK_NAME,
					CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(returnValue);
	}

	@Test
	public void testSendSMSOneToMany() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.oneToMany(USERNAME, PASSWORD, SMS_TEXT, numbersList.toString(), SMS_TYPE, MASK_NAME,
					CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 1900||01919408812||79810050/1900||01521107685||79810051/
		logger.info(returnValue);
	}

	@Test
	public void testSendNumberSMS() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.numberSms(API_KEY, MOBILE_NUMBER, SMS_TEXT, SMS_TYPE, MASK_NAME, CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info(returnValue);
	}

	@Test
	public void testCheckBalance() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;
		try {
			returnValue = port.getCurrentBalance(API_KEY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info(returnValue);
	}

	@Test
	public void testDeliveryStatus() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;
		try {
			returnValue = port.deliveryStatus(USERNAME, PASSWORD, "79810051");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		logger.info(returnValue);
	}
}
