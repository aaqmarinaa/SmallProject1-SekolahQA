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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/a_BUY NOW'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/tr_Name'))

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/input'), 'Almas')

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/tr_Email'))

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/input_1'), 'almas@gmail.com')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/label_Set advanced rules'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/input_Pop Up_is_snap_pop_up'))

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Sample Store/Page_Sample Store/a_Start'))

WebUI.delay(3)

WebUI.closeBrowser()

