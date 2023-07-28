import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


def email = new String[3]
email[0]='a@gmail.com'
email[1]='b@gmail.com'
email[2]='c@gmail.com'

def customer = [
	customer_1: [
		firt_name: "a",
		last_name: "1",
		email: email[0],
		pw:'RigbBhfdqODKcAsiUrg+1Q=='		
		],
	customer_2: [
		firt_name: "b",
		last_name: "2",
		email: email[1],
		pw:'HeCM15nHKBI='
		],
	customer_3: [
		firt_name: "c",
		last_name: "3",
		email: email[2],
		pw:'HeCM15nHKBI='
		],
	]


WebUI.openBrowser('https://auto2023.myshopify.com/account/register')
WebUI.maximizeWindow()
//WebUI.setText(findTestObject('Object Repository/RegisterAccount/input_firtname'),customer.customer_1.firt_name)
//
//WebUI.setText(findTestObject('Object Repository/RegisterAccount/input_lastname'),customer.customer_1.last_name)

//for(def emaillist:email) {
//	WebUI.setText(findTestObject('Object Repository/RegisterAccount/input_email'),emaillist)
//}

information(customer.customer_1.firt_name,customer.customer_1.last_name)
input_email(email[0])

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterAccount/input_passw'),customer.customer_1.pw)
WebUI.click(findTestObject('Object Repository/RegisterAccount/button_create'))




def input_email(def em1)
{
	WebUI.setText(findTestObject('Object Repository/RegisterAccount/input_email'),em1)
}

def information(def fn, def ln) {
	WebUI.setText(findTestObject('Object Repository/RegisterAccount/input_firtname'),fn)	
	WebUI.setText(findTestObject('Object Repository/RegisterAccount/input_lastname'),ln)
}





	
	