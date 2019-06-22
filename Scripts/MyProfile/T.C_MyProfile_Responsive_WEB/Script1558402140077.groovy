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

WebUI.setViewPortSize(411, 823)

WebUI.setText(findTestObject('MyProfile_OR/input_Correo electrnico _email - Copy'), 'alejostests@gmail.com')

WebUI.setEncryptedText(findTestObject('MyProfile_OR/input_Contrasea _password - Copy'), 'n3FO92K+dHdem137Wy3cYA==')

WebUI.click(findTestObject('MyProfile_OR/button_INICIAR SESIN'))

WebUI.waitForElementNotVisible(findTestObject('MyProfile_OR/p_2019 VERyx'), 2)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.click(findTestObject('MyProfile_OR/span_VERyx_navbar-toggler-icon'))

WebUI.waitForElementNotVisible(findTestObject('MyProfile_OR/p_2019 VERyx'), 2)

WebUI.click(findTestObject('MyProfile_OR/a_Perfil'))

WebUI.waitForElementNotVisible(findTestObject('MyProfile_OR/p_2019 VERyx'), 2)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.click(findTestObject('MyProfile_OR/button_Editar Perfil'))

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.waitForElementNotVisible(findTestObject('MyProfile_OR/p_2019 VERyx'), 2)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.setText(findTestObject('MyProfile_OR/input_Nombres _name'), 'Prueba')

WebUI.setText(findTestObject('MyProfile_OR/input_Apellidos _lastname'), 'Dos')

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.setText(findTestObject('MyProfile_OR/input_Correo Electrnico _email'), 'test@test.com')

WebUI.scrollToPosition(0, 530)

WebUI.click(findTestObject('MyProfile_OR/span_Cdula de Ciudadana'))

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.click(findTestObject('Object Repository/MyProfile_OR/li_Registro Civil'))

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.click(findTestObject('MyProfile_OR/span_ABEJORRAL'))

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.click(findTestObject('Object Repository/MyProfile_OR/li_CALDAS'))

WebUI.setText(findTestObject('MyProfile_OR/input_Nmero de identificacin _document'), '46541984865465489')

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.click(findTestObject('MyProfile_OR/span_MEDICINA INTERNA'))

WebUI.click(findTestObject('Object Repository/MyProfile_OR/li_REUMATOLOGA'))

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.click(findTestObject('MyProfile_OR/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('MyProfile_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 5)

WebUI.takeScreenshot(('Screenshots/MyProfile/Responsive/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/div_VERyx_header-line'), 5)

WebUI.closeBrowser()

