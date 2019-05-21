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

WebUI.click(findTestObject('RequestTest_OR/a_Solicitar prueba'))

WebUI.click(findTestObject('RequestTest_OR/a_01'))

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 860)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('RequestTest_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('RequestTest_OR/input_Nombres _name'), 'Prueba')

WebUI.setText(findTestObject('RequestTest_OR/input_Apellidos _lastname'), 'Uno')

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.setText(findTestObject('RequestTest_OR/input_Nmero de identificacin _identificationnumber'), '123654')

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 860)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('RequestTest_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('RequestTest_OR/label_No'))

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 830)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('RequestTest_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('RequestTest_OR/a_02'))

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('RequestTest_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('RequestTest_OR/a_03'))

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToPosition(0, 400)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.scrollToElement(findTestObject('RequestTest_OR/p_2019 VERyx'), 0)

WebUI.takeScreenshot(('Screenshots/RequestTest/1600x900/RequestTest-' + n) + '.png')

n++

WebUI.closeBrowser()

