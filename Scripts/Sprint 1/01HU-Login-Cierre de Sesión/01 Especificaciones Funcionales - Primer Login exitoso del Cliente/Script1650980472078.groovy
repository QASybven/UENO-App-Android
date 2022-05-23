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

Mobile.startApplication(GlobalVariable.APKjose, true)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Hola = Mobile.getText(findTestObject('Object Repository/Sprint 1/Inicio primera vez y cierre de sesion/android.widget.TextView - Hola Primer Login'), 
    0)

Mobile.verifyEqual(Hola, '¡Hola!')

Mobile.setText(findTestObject('Object Repository/Sprint 1/Inicio primera vez y cierre de sesion/android.widget.EditText - Ejemplo 0981123456 (1)'), 
    GlobalVariable.Numerocelular, 0)

Mobile.setText(findTestObject('Object Repository/Sprint 1/Inicio primera vez y cierre de sesion/android.widget.EditText (2)'), 
    GlobalVariable.Contrasena, 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Inicio primera vez y cierre de sesion/android.widget.Button - Ingresar (2)'), 
    0)

not_run: Mobile.tap(findTestObject('Sprint 1/Inicio primera vez y cierre de sesion/android.widget.Button - NO (1)'), 0)

Mobile.tap(findTestObject('Sprint 1/Inicio primera vez y cierre de sesion/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Sprint 1/cierre de sesion/android.widget.ImageView Icono salir superior'), 0)

Mobile.tap(findTestObject('Sprint 1/Inicio primera vez y cierre de sesion/android.widget.Button - Si (1)'), 0)

NombredeUsuario = Mobile.getText(findTestObject('Sprint 1/Inicio primera vez y cierre de sesion/android.widget.TextView -  NombreUsuario'), 
    0)

Mobile.verifyEqual(NombredeUsuario, NombredeUsuarioEsperado)

Mobile.checkElement(findTestObject(null), 0)

