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

WebUI.openBrowser('http://veryx-client-dev.azurewebsites.net/#')

WebUI.setViewPortSize(1440, 900)

WebUI.setText(findTestObject('Object Repository/Contact_OR/input_Correo electrnico _email'), 'alejostests@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Contact_OR/input_Contrasea _password'), 'n3FO92K+dHdem137Wy3cYA==')

WebUI.click(findTestObject('Object Repository/Contact_OR/button_INICIAR SESIN'))

WebUI.click(findTestObject('Contact_OR/a_Contact'))

WebUI.takeScreenshot(('Screenshots/Contact/1440x900/Contact-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('null'), 5)

WebUI.takeScreenshot(('Screenshots/Contact/1440x900/Contact-' + n) + '.png')

n++

WebUI.closeBrowser()

