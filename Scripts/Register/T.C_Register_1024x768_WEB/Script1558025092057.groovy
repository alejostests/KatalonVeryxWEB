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

WebUI.setViewPortSize(1024, 768)

WebUI.click(findTestObject('Object Repository/Register_OR/a_Crear Cuenta'))

WebUI.waitForElementNotVisible(findTestObject('Register_OR/p_2019 VERyx'), 2)

WebUI.scrollToElement(findTestObject('Register_OR/div_VERyx_header-line'), 5)

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('Register_OR/div_VERyx_header-line'), 5)

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Correo Electrnico _email'), 'alejostests@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Nombres _name'), 'Prueba')

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Apellidos _lastname'), 'Uno')

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.setEncryptedText(findTestObject('Object Repository/Register_OR/input_Contrasea _password'), 'n3FO92K+dHdem137Wy3cYA==')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Register_OR/input_Tipo de identificacin _vs__search'))

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/li_Tarjeta de identidad'))

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 5)

WebUI.setText(findTestObject('Register_OR/input_Nmero de identificacin _document'), '1024687920')

WebUI.setText(findTestObject('Object Repository/Register_OR/input_Numero de celular _phone'), '1234567890')

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/button_Siguiente'))

WebUI.scrollToElement(findTestObject('Register_OR/div_VERyx_header-line'), 5)

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('Register_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

WebUI.scrollToElement(findTestObject('Register_OR/div_VERyx_header-line'), 5)

n++

WebUI.setText(findTestObject('Register_OR/input_Registro mdico  _registry'), '9876543210000')

WebUI.scrollToPosition(0, 100)

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/input_Tipo de identificacin Paso2'))

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/li_Tarjeta de identidad_paso2'))

WebUI.selectOptionByValue(findTestObject('Register_OR/select_Patologies'), '12', true)

WebUI.click(findTestObject('Register_OR/span_Firma  _icon i-pencil-edit firm-icon'))

WebUI.click(findTestObject('Register_OR/canvas2'))

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/button_Siguiente_Firma'))

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.click(findTestObject('Register_OR/label_Acepto  poltica para manejo de datos'))

WebUI.click(findTestObject('Register_OR/label_Acepto  trminos y condiciones'))

WebUI.takeScreenshot(('Screenshots/Register/1024X768/Register-' + n) + '.png')

n++

WebUI.waitForElementNotVisible(findTestObject('Register_OR/p_2019 VERyx'), 2)

WebUI.closeBrowser()

