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
    false)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('Sprint 1/Login/android.widget.EditText - Campo numero de celular en Blanco'), 0)

Mobile.setText(findTestObject('Sprint 1/Login/android.widget.EditText - Campo numero de celular en Blanco'), '0972875200', 0)

Mobile.setText(findTestObject('Sprint 1/Login/android.widget.EditText - Numero de celular login'), 'Kony!12345', 0)

Mobile.getText(findTestObject('Sprint 1/Caja de ahorros/android.widget.TextView - Caja de Ahorro'), 0)

Mobile.verifyEqual(Cajadeahorros, 'Caja de ahorros')

Mobile.getText(findTestObject('Sprint 1/dasboard/android.widget.TextView - 96912750 numero de cuenta'), 0)

Mobile.verifyEqual(N, 'N??')

Mobile.getText(findTestObject('Sprint 1/Caja de ahorros/android.widget.TextView - Gs. 0'), 0)

Mobile.verifyEqual(GS, 'GS.')

Mobile.getText(findTestObject('Sprint 1/dasboard/android.widget.TextView - Saldo disponible Etiqueta bajo saldo'), 0)

Mobile.verifyEqual(Saldodisponible, 'Saldo Disponible')

