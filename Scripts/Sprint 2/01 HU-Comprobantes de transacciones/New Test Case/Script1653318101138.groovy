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

Mobile.tap(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - VC1234'), 
    0)

Mobile.tap(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.ImageView'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Tipo de cuenta'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - CAJA DE AHORRO'), 
    0)

Mobile.tap(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.ImageView (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - T. recibida de FFFF 8212863 FFFF FFFF FFFF'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Detalle del movimiento'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Recibida'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Tipo de operacin'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Transferencias'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Nro. de transaccin'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - 110609'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Descripcin'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - T. recibida de FFFF 8212863 FFFF FFFF FFFF (1)'), 
    0)

Mobile.getText(findTestObject('Object Repository/Sprint 2/Detalle de Movimientos/flujo detalle de movimientos/android.widget.TextView - Fecha y hora transaccin'), 
    0)

Mobile.closeApplication()

