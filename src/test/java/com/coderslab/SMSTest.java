/**
 * 
 */
package com.coderslab;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.onnorokomsms.api.SendSms;
import com.onnorokomsms.api.SendSmsSoap;

/**
 * @author Zubayer Ahamed
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SMSTest {

	private static final String API_KEY = "92134";
	private static final String USERNAME = "01515634889";
	private static final String PASSWORD = "142536142536Z%a";
	private static final String MOBILE_NUMBER = "01748562164";
	private static final String SMS_TEXT = "Hi. This is my first message using Onnorokom Bulk SMS Service API";
	private static final String MASK_NAME = "";
	private static final String CAMPAING_NAME = "";
	private static final String SMS_TYPE = "TEXT";
	private List<String> numbersList;

	@Before
	public void initNumbersList() {
		numbersList = new ArrayList<>();
		numbersList.add("01758444444");
	}

	@Test
	public void sendSMSOneToOne() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.oneToOne(USERNAME, PASSWORD, MOBILE_NUMBER, SMS_TEXT, SMS_TYPE, MASK_NAME,
					CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(returnValue);
	}

	@Test
	public void sendSMSOneToMany() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.oneToMany(USERNAME, PASSWORD, SMS_TEXT, numbersList.toString(), SMS_TYPE, MASK_NAME,
					CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(returnValue);
	}

	@Test
	public void sendNumberSMS() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.numberSms(API_KEY, MOBILE_NUMBER, SMS_TEXT, SMS_TYPE, MASK_NAME, CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(returnValue);
	}

	@Test
	public void checkBalance() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;
		try {
			returnValue = port.getCurrentBalance(API_KEY);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(returnValue);
	}
}
