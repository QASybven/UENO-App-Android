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

Mobile.startApplication(GlobalVariable.URL, true)

Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

OlvidastetuContrasena = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.TextView - Olvidaste tu contrasena Pantalla de inicio'), 
    0)

Mobile.verifyEqual(OlvidastetuContrasena, '¿Olvidaste tu contraseña?')

Mobile.tap(findTestObject('Login/android.widget.Button - Olvidaste tu contrasea'), 0)

Titulo = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.TextView - Olvidaste tu contrasea (pantalla Olvido)'), 
    0)

Mobile.verifyEqual(Titulo, '¿Olvidaste tu contraseña?')

NumeroCedula = Mobile.getText(findTestObject('Olvido Contrasena/android.widget.TextView - CI nmero'), 0)

Mobile.verifyEqual(NumeroCedula, 'CI número:')

TextoAyuda = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.EditText - Ejemplo 1234567'), 
    0)

Mobile.verifyEqual(TextoAyuda, 'Ejemplo: 1234567')

Nrodecelularconelqueteregistraste = Mobile.getText(findTestObject('Olvido Contrasena/android.widget.TextView - Nro. de celular con el que te registraste'), 
    0)

Mobile.verifyEqual(Nrodecelularconelqueteregistraste, 'Nro. de celular con el que te registraste:')

TextoAyuda1 = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.EditText - Ejemplo 0981123456'), 
    0)

Mobile.verifyEqual(TextoAyuda1, 'Ejemplo: 0981123456')

Correoelectronicoconelqueteregistraste = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.TextView - Correo electrnico con el que te registraste'), 
    0)

Mobile.verifyEqual(Correoelectronicoconelqueteregistraste, 'Correo electrónico con el que te registraste:')

Ejemplo = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.EditText - Ejemplo ejemplogmail.com'), 
    0)

Mobile.verifyEqual(Ejemplo, 'Ejemplo: ejemplo@gmail.com')

Continuar = Mobile.getText(findTestObject('Object Repository/Olvido Contrasena/android.widget.Button - Continuar'), 0)

Mobile.verifyEqual(Continuar, 'Continuar')

Mobile.tap(findTestObject('Object Repository/Olvido Contrasena/android.widget.ImageView Boton Back superior'), 0)

Mobile.tap(findTestObject('Olvido Contrasena/android.widget.TextView - Olvidaste tu contrasena Pantalla de inicio'), 0)

Mobile.tap(findTestObject('Object Repository/Olvido Contrasena/android.widget.ImageView (boton x)'), 0)

