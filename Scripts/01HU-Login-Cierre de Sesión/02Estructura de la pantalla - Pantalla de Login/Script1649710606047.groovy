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

Mobile.startApplication('C:\\Users\\Jesus_Berbin\\Documents\\Cursos\\Sybven\\UENO\\crtopyinfinitymobilebanking-release.apk', 
    false)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Banner = Mobile.getAttribute(findTestObject('Login/android.widget.ImageView.Banner'), 'class', 0)

Mobile.verifyMatch(Banner, 'android.widget.ImageView', false)

Hola = Mobile.getText(findTestObject('Login/android.widget.TextView - Holanuevo'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyEqual(Hola, '¡Hola!')

NumerodeCelular = Mobile.getText(findTestObject('Login/android.widget.TextView - Nmero de celular'), 0)

Mobile.verifyEqual(NumerodeCelular, 'Número de celular:')

Contrasena = Mobile.getText(findTestObject('Login/android.widget.TextView - Contrasea'), 0)

Mobile.verifyEqual(Contrasena, 'Contraseña:')

IconoContrasena = Mobile.getAttribute(findTestObject('Login/android.widget.ImageView.IconoMostrarContraseña'), 'class', 
    0)

Mobile.verifyMatch(IconoContrasena, 'android.widget.ImageView', false)

OlvidastetuContrasena = Mobile.getText(findTestObject('Login/android.widget.TextView - Olvidaste tu contrasea'), 0)

Mobile.verifyEqual(OlvidastetuContrasena, '¿Olvidaste tu contraseña?')

BotonIngresar = Mobile.getAttribute(findTestObject('Login/android.widget.Button - Ingresar'), 'text', 0)

Mobile.verifyEqual(BotonIngresar, 'Ingresar')

Registrarme = Mobile.getAttribute(findTestObject('Login/android.widget.Button - Registrarme'), 'text', 0)

Mobile.verifyEqual(Registrarme, 'Registrarme')

Soporte = Mobile.getAttribute(findTestObject('Login/android.widget.Button - Soporte'), 'text', 0)

Mobile.verifyEqual(Soporte, 'Soporte')

TextoAyuda = Mobile.getAttribute(findTestObject('Login/android.widget.EditText - Ejemplo 0981123456'), 'text', 0)

Mobile.verifyEqual(TextoAyuda, 'Ejemplo: 0981123456')

