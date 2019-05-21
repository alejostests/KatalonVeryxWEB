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

WebUI.setViewPortSize(1440, 900)

WebUI.navigateToUrl('http://veryx-client-dev.azurewebsites.net/#/home/')

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/MyProfile_OR/a_Perfil'))

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('MyProfile_OR/button_Editar Perfil'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/MyProfile_OR/a_Perfil'))

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('Object Repository/MyProfile_OR/input_Nombres _name'), 'Prueba')

WebUI.setText(findTestObject('Object Repository/MyProfile_OR/input_Apellidos _lastname'), 'Dos')

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.setText(findTestObject('Object Repository/MyProfile_OR/input_Correo Electrnico _email'), 'test@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/MyProfile_OR/input_Contrasea _password'), 'n3FO92K+dHdem137Wy3cYA==')

WebUI.scrollToPosition(0, 530)

WebUI.click(findTestObject('MyProfile_OR/select_Cdula de ciudadaniaTI'))

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.selectOptionByValue(findTestObject('Object Repository/MyProfile_OR/select_Cdula de ciudadaniaTI'), 'TI', true)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 0)

WebUI.setText(findTestObject('Object Repository/MyProfile_OR/input_Nmero de identificacin _identificationnumber'), '46541984865465489')

WebUI.click(findTestObject('MyProfile_OR/select_Cdula de ciudadaniaTI_1'))

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.selectOptionByValue(findTestObject('Object Repository/MyProfile_OR/select_Cdula de ciudadaniaTI_1'), 'CC', true)

WebUI.setText(findTestObject('Object Repository/MyProfile_OR/input_Firma _medicalreg'), '1345645645')

WebUI.scrollToElement(findTestObject('MyProfile_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('MyProfile_OR/button_Editar Perfil'))

WebUI.takeScreenshot(('Screenshots/MyProfile/1440x900/MyProfile-' + n) + '.png')

n++

WebUI.closeBrowser()

