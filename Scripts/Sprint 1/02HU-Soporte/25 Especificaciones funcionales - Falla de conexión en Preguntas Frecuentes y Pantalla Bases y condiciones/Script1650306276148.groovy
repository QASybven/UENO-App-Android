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

Mobile.startApplication(GlobalVariable.URL, false)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Sprint 1/Soporte/android.widget.Button - Soporte pantalla de inicio'), 0)

Mobile.toggleAirplaneMode('yes', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Sprint 1/Soporte/android.widget.TextView - Preguntas frecuentes'), 0)

Falladeconexion = Mobile.getText(findTestObject('Sprint 1/Soporte/android.widget.TextView - Ups Hubo una falla en la conexin. Por favor, verific y prob de nuevo'), 
    0)

Mobile.verifyEqual(Falladeconexion, 'Ups! Hubo una falla en la conexión. Por favor, verificá y probá de nuevo.')

Mobile.tap(findTestObject('Sprint 1/Soporte/android.widget.Button - ACEPTAR falla de conexion'), 0)

Mobile.toggleAirplaneMode('no', FailureHandling.CONTINUE_ON_FAILURE)

