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

WebUI.openBrowser('http://veryx-client-dev.azurewebsites.net/#/')

WebUI.setViewPortSize(1440, 900)

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('StartPage_OR/input_Correo Electrnico _email'), 'alejos@mail.com')

WebUI.setEncryptedText(findTestObject('StartPage_OR/input_Contrasea _password'), 'n3FO92K+dHdem137Wy3cYA==')

WebUI.takeScreenshot(('Screenshots/StartPage/1440x900/Start-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('StartPage_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/StartPage/1440x900/Start-' + n) + '.png')

n++

WebUI.closeBrowser()

