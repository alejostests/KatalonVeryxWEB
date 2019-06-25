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

WebUI.setViewPortSize(1600, 900)

WebUI.click(findTestObject('RecoverPassUsername_OR/a_Recuperar Usuario  contrasea'))

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.setText(findTestObject('RecoverPassUsername_OR/input_Recuperar Usuario_document'), '1072670003')

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.click(findTestObject('RecoverPassUsername_OR/button_Continuar_RecuperarUsuario'))

WebUI.waitForElementNotVisible(findTestObject('RecoverPassUsername_OR/button_Continuar_RecuperarUsuario'), 2)

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.click(findTestObject('RecoverPassUsername_OR/button_X'))

WebUI.setText(findTestObject('RecoverPassUsername_OR/input_Recuperar Usuario_document'), '')

WebUI.click(findTestObject('RecoverPassUsername_OR/select_CCTI'))

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.selectOptionByValue(findTestObject('RecoverPassUsername_OR/select_CCTI'), 'TI', true)

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.setText(findTestObject('RecoverPassUsername_OR/input_Recuperar Usuario_document'), '123')

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.setText(findTestObject('RecoverPassUsername_OR/input_Recuperar Usuario_document'), '')

WebUI.scrollToElement(findTestObject('RecoverPassUsername_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Pass-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('RecoverPassUsername_OR/div_VERyx_header-line'), 0)

WebUI.click(findTestObject('RecoverPassUsername_OR/a_Recuperar Contrasea'))

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Username-' + n) + '.png')

n++

WebUI.setText(findTestObject('RecoverPassUsername_OR/input_Correo Electrnico _email'), 'alejos@mail.com')

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Username-' + n) + '.png')

n++

WebUI.setText(findTestObject('RecoverPassUsername_OR/input_Correo Electrnico _email'), '')

WebUI.scrollToElement(findTestObject('RecoverPassUsername_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RecoverPassUsername/1600x900/Username-' + n) + '.png')

n++

WebUI.closeBrowser()

