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

Mobile.tap(findTestObject('Object Repository/Sprint 1/Soporte/android.widget.Button - Soporte'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Soporte/android.widget.TextView - Preguntas frecuentes (1)'), 0)

Mobile.tap(findTestObject('Sprint 1/Soporte/android.widget.ImageView Back Preguntas Frecuentes'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Soporte/android.widget.TextView - Bases y condiciones (1)'), 0)

Mobile.tap(findTestObject('Sprint 1/Soporte/android.widget.ImageView Back Bases y Condiciones'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Soporte/android.widget.TextView - Seguridad'), 0)

Mobile.tap(findTestObject('Sprint 1/Soporte/android.widget.ImageView Back Seguridad'), 0)

Mobile.closeApplication()
