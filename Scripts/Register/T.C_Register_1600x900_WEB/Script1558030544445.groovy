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

WebUI.navigateToUrl('http://veryx-client-dev.azurewebsites.net/#/')

WebUI.click(findTestObject('Object Repository/Register_OR/a_Crear Cuenta'))

WebUI.scrollToPosition(0, 0)

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 450)

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Correo Electrnico _email'), 'alejostests@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Nombres _name'), 'Prueba')

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Apellidos _lastname'), 'Uno')

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.setEncryptedText(findTestObject('Object Repository/Register_OR/input_Contrasea _password'), 'n3FO92K+dHdem137Wy3cYA==')

WebUI.scrollToPosition(0, 450)

WebUI.click(findTestObject('Register_OR/select_Cdula de ciudadaniaTI'))

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.selectOptionByValue(findTestObject('Object Repository/Register_OR/select_Cdula de ciudadaniaTI'), 'TI', true)

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 0)

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Nmero de identificacin _identificationnumber'), '1024687920')

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Numero de celular _phone'), '1234567890')

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Register_OR/a_02'))

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 450)

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Registro Mdico _medicalreg'), '9876543210000')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Register_OR/select_Cdula de ciudadaniaTI_1'))

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.selectOptionByValue(findTestObject('Object Repository/Register_OR/select_Cdula de ciudadaniaTI_1'), 'CC', true)

WebUI.setText(findTestObject('Register_OR/input_Firma _firma'), '000123654')

WebUI.scrollToPosition(0, 450)

WebUI.click(findTestObject('Register_OR/canvas'))

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/Register/1600x900/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/button_Save'))

WebUI.closeBrowser()

