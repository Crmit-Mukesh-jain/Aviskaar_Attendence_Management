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

WebUI.setText(findTestObject('Page_Login/input_Refresh_2050'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Page_Login/input_Username_2180'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_Login/span_Log in'))

WebUI.delay(1)

WebUI.click(findTestObject('Manager All Leave Object'))

WebUI.click(findTestObject('Page_Employee Leave/svg_My Applied Leave_slds-icon slds-icon-te_a4c030'))

WebUI.click(findTestObject('Pending Approval Object'))

WebUI.click(findTestObject('Page_Employee Leave/a_SortEmployee Leave Name'))

WebUI.click(findTestObject('Get_Manager_First_Row_Id'))

WebUI.click(findTestObject('Object Repository/Page_Employee Leave EL-4320/button_Reject'))

WebUI.setText(findTestObject('Reject Text Message'), 'No Leaves Only Work')

WebUI.click(findTestObject('Object Repository/Page_Employee Leave EL-4320/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Manager All Leave Object'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Employee Leave/svg_My Applied Leave_slds-icon slds-icon-te_a4c030'))

WebUI.click(findTestObject('All Rejected List View'))

WebUI.click(findTestObject('Page_Employee Leave/a_SortEmployee Leave Name'))

WebUI.click(findTestObject('Get_Manager_First_Row_Id'))

WebUI.verifyElementText(findTestObject('Status Rejected'), 'Rejected')

WebUI.delay(1)

WebUI.click(findTestObject('Logout Object'))

WebUI.click(findTestObject('Logout button'))

WebUI.delay(1)

WebUI.closeBrowser()

