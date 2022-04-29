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

WebUI.callTestCase(findTestCase('Sprint 1/01HU-Login-Cierre de Sesión/11 Especificaciones Funcionales - Login exitoso del usuario'), 
    [('NumeroCelular') : findTestData('Usuarios').getValue(1, 1), ('Contrasena') : findTestData('Usuarios').getValue(2, 1)], 
    FailureHandling.CONTINUE_ON_FAILURE)

Misproductos = Mobile.getText(findTestObject('Sprint 1/dasboard/android.widget.TextView - Mis productos titulo pantalla'), 0)

Mobile.verifyEqual(Misproductos, 'Mis productos')

Todosmisproductos = Mobile.getText(findTestObject('Sprint 1/dasboard/android.widget.TextView - Todos mis productos'), 0)

Mobile.verifyEqual(Todosmisproductos, 'Todos mis productos')

Mobile.tap(findTestObject('Sprint 1/dasboard/android.widget.ImageView flecha hacia abajo resumen de productos'), 0)

Mobile.tap(findTestObject('Sprint 1/dasboard/android.view.ViewGroup flecha hacia arriba'), 0)

