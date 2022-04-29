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
    [('NumeroCelular') : findTestData('Usuarios').getValue(1, 1), ('Contrasena') : findTestData('Usuarios').getValue(2, 
            1)], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Resumen de productos/android.widget.TextView - Saldo disponible'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Resumen de productos/android.widget.ImageView icono I superior'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Resumen de productos/android.widget.ImageView lapiz editar'), 0)

Mobile.getText(findTestObject('Object Repository/Sprint 1/Resumen de productos/android.widget.TextView - Personalizar cuenta titulo'), 
    0)

Mobile.setText(findTestObject('Object Repository/Sprint 1/Resumen de productos/android.widget.EditText - Ejemplo Mi cuenta salario'), 
    'prueba', 0)

Mobile.tap(findTestObject('Object Repository/Sprint 1/Resumen de productos/android.widget.Button - Guardar'), 0)

Mobile.closeApplication()
