import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

int n = 0

WebUI.openBrowser('')

WebUI.setViewPortSize(1600, 900)

WebUI.navigateToUrl('http://veryx-client-dev.azurewebsites.net/#/home/')

WebUI.click(findTestObject('Object Repository/TermsConditions/a_Trminos y condiciones'))

WebUI.takeScreenshot(('Screenshots/TermsConditions/1600x900/Terms-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/TermsConditions/1600x900/Terms-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyRequests_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/TermsConditions/1600x900/Terms-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/TermsConditions/button_Trminos y condiciones'))

WebUI.takeScreenshot(('Screenshots/TermsConditions/1600x900/Terms-' + n) + '.png')

n++

WebUI.click(findTestObject('Object Repository/TermsConditions/button_Politica para manejo de datos'))

WebUI.takeScreenshot(('Screenshots/TermsConditions/1600x900/Terms-' + n) + '.png')

n++

WebUI.closeBrowser()

