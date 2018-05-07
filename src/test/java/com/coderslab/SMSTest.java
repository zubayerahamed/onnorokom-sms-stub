/**
 * 
 */
package com.coderslab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.onnorokomsms.api.OneToOne;
import com.onnorokomsms.api.SendSms;
import com.onnorokomsms.api.SendSmsSoap;

/**
 * @author Zubayer Ahamed
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SMSTest {

	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private static final String MOBILE_NUMBER = "";
	private static final String SMS_TEXT = "";
	private static final String MASK_NAME = "";
	private static final String CAMPAING_NAME = "";
	private static final String SMS_TYPE = "";

	@Test
	public void sendSMSOneToOne() {
		SendSms sms = new SendSms();
		SendSmsSoap port = sms.getSendSmsSoap();
		String returnValue = null;

		try {
			returnValue = port.oneToOne(USERNAME, PASSWORD, MOBILE_NUMBER, SMS_TEXT, SMS_TYPE, MASK_NAME, CAMPAING_NAME);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(returnValue);
	}

}
