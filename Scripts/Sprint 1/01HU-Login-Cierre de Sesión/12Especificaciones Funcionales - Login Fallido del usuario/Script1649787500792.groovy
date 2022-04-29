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

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('Sprint 1/Login/android.widget.EditText - Numero de celular login - test10'), 0)

Mobile.setText(findTestObject('Sprint 1/Login/android.widget.EditText - Ejemplo 0981123456'), GlobalVariable.Numerocelular, 0)

'Login Fallido'
Mobile.setText(findTestObject('Sprint 1/Login/android.widget.EditText - tipear contrasea'), GlobalVariable.Contrasena, 0)

Mobile.tap(findTestObject('Sprint 1/Login/android.widget.Button - Ingresar'), 0)

numerocontrasenaincorrecto = Mobile.getText(findTestObject('Sprint 1/inicio fallido/android.widget.TextView - mensaje contrasena incorrecta'), 
    0)

Mobile.verifyEqual(Datoincorrecto, '"El número de celular y/o la contraseña ingresados son incorrectos.”.')

Mobile.verifyEqual(numerocontrasenaincorrecto, 'El número de celular y/o la contraseña ingresados son incorrectos.')

Mobile.tap(findTestObject('Sprint 1/Login/android.widget.Button - Ingresar'), 0)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Sprint 1/Login/android.widget.Button - Ingresar'), 0)

UsuarioBloqueado = Mobile.getText(findTestObject('Sprint 1/inicio fallido/android.widget.TextView - Ups Se bloque tu contrasea. Para poder reingresar pods restaurarla'), 
    0)

Mobile.verifyEqual(UsuarioBloqueado, 'Ups! Se bloqueó tu contraseña. Para poder reingresar podés restaurarla.')

