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

Mobile.callTestCase(findTestCase('01HU-Login-Cierre de Sesión/11 Especificaciones Funcionales - Login exitoso del usuario'), 
    [('NumeroCelular') : findTestData('Usuarios').getValue(1, 1), ('Contrasena') : findTestData('Usuarios').getValue(2, 1)], 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/cierre de sesion/android.widget.ImageView Menu hamburguesa Inferior'), 0)

Mobile.tap(findTestObject('Object Repository/cierre de sesion/android.widget.ImageView Icono salir superior'), 0)

Mobile.tap(findTestObject('Inicio primera vez y cierre de sesion/android.widget.Button - Si (1)'), 0)

