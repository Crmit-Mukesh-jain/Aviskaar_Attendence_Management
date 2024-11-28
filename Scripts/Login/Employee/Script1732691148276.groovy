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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Refresh_2050'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Username_2180'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Login/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My Settings/a_My Leave'))

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/input__Start Date'))

WebUI.setText(findTestObject('Page_ApplyLeave/input__Start Date'), Start_Date)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/input__End Date'))

WebUI.setText(findTestObject('Page_ApplyLeave/input__End Date'), End_Date)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/button_None'))

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/span_PrivilegeAnnual Leave'))

WebUI.setText(findTestObject('Object Repository/Page_ApplyLeave/input_Reason_Reason'), Reason)

WebUI.setText(findTestObject('Object Repository/Page_ApplyLeave/input_Inform_input-105'), Inform)

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_ApplyLeave/button_Confirm'))

WebUI.click(findTestObject('Employee All Leave Object'))

WebUI.click(findTestObject('Object Repository/Page_Employee Leave/a_SortEmployee Leave Name'))

WebUI.click(findTestObject('Object Repository/Get_Web_First_Row_ID'))

WebUI.delay(2)

WebUI.click(findTestObject('Employee Logout'))

WebUI.click(findTestObject('Logout button'))

WebUI.delay(1)

WebUI.closeBrowser()

