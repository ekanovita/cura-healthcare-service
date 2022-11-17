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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.waitForElementPresent(findTestObject('Home Page/lbl_CURAHealthcareService'), 2)

WebUI.verifyElementPresent(findTestObject('Home Page/lbl_CURAHealthcareService'), 0)

WebUI.verifyElementPresent(findTestObject('Home Page/btn_MakeAppointment'), 0)

WebUI.waitForElementPresent(findTestObject('Menu Toggle/menu_CURAHealthcare'), 2)

WebUI.click(findTestObject('Menu Toggle/menu_CURAHealthcare'))

WebUI.verifyElementPresent(findTestObject('Menu Toggle/lbl_CURAHealthcare'), 0)

WebUI.verifyElementPresent(findTestObject('Menu Toggle/btn_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Menu Toggle/btn_Home'), 0)

WebUI.click(findTestObject('Menu Toggle/btn_Login'))

WebUI.waitForElementPresent(findTestObject('Login Form/form_Login'), 2)

WebUI.verifyElementPresent(findTestObject('Login Form/form_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Login Form/lbl_PleaseLogintoMakeAppointment'), 0)

WebUI.verifyElementPresent(findTestObject('Login Form/lbl_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Login Form/txt_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Login Form/lbl_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Login Form/txt_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Login Form/btn_Login'), 0)

WebUI.setText(findTestObject('Login Form/txt_Username'), 'John Doe')

WebUI.setText(findTestObject('Login Form/txt_Password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Login Form/btn_Login'))

WebUI.waitForElementPresent(findTestObject('Make Appointment Form/form_MakeAppointment'), 2)

WebUI.delay(1)

WebUI.closeBrowser()

