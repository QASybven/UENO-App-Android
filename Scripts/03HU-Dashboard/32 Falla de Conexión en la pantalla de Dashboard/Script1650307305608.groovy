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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Jose_Arrieta\\Desktop\\JA\\Proyectos\\Automatizacion de pruebas\\APK para inicio\\crtopyinfinitymobilebanking-release (8).apk', 
    true)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.sendKeys(findTestObject('Object Repository/falla de conexion dashboard/android.widget.EditText - 0982159800'), '0982159800')

Mobile.setText(findTestObject('Object Repository/falla de conexion dashboard/android.widget.EditText (1)'), 'Kony!12345', 
    0)

Mobile.tap(findTestObject('Object Repository/falla de conexion dashboard/android.widget.Button - Ingresar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/falla de conexion dashboard/android.view.ViewGroup'), 0)

Mobile.getText(findTestObject('Object Repository/falla de conexion dashboard/android.widget.TextView - Mensaje'), 0)

Mobile.getText(findTestObject('Object Repository/falla de conexion dashboard/android.widget.TextView - Ups Hubo una falla en la conexin. Por favor, verific y prob de nuevo'), 
    0)

Mobile.getText(findTestObject('Object Repository/falla de conexion dashboard/android.widget.Button - ACEPTAR'), 0)

Mobile.verifyEqual(Falla de conexion, findTestObject('falla de conexion dashboard/android.widget.TextView - Ups Hubo una falla en la conexin. Por favor, verific y prob de nuevo'))

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

