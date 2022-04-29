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

Mobile.startApplication(GlobalVariable.APKjose, false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.Button - Soporte'), 0)

Mobile.getText(findTestObject('Soporte/android.widget.TextView - Soporte encabezado'), 0)

Mobile.verifyEqual(SoporteTitulo, 'Soporte')

Mobile.getText(findTestObject('Soporte/android.widget.TextView - Preguntas frecuentes'), 0)

Mobile.verifyEqual(PreguntasFrecuentes, 'Preguntas frecuentes')

WebUI.getText(findTestObject('Soporte/android.widget.TextView - Bases y condiciones (1)'))

Mobile.verifyEqual(Basesycondiciones, 'Bases y condiciones')

Mobile.getText(findTestObject('Soporte/android.widget.TextView - Seguridad'), 0)

Mobile.verifyEqual(Seguridad, 'Seguridad')

Mobile.getText(findTestObject('Soporte/android.widget.TextView - Versin de la aplicacin 21.04.00Sistema OperativoAndroid 9DispositivoHuawei MRD-LX3'), 
    0)

Mobile.verifyEqual(Textoinformativo, 'Versin de la aplicacin 21.04.00Sistema OperativoAndroid 9DispositivoHuawei MRD-LX3')

Mobile.tap(findTestObject('Soporte/android.widget.ImageView Boton Back'), 0)

Mobile.tap(findTestObject('Soporte/android.widget.Button - Soporte pantalla de inicio'), 0)

Mobile.tap(findTestObject('Soporte/android.widget.ImageView boton compartir'), 0)

Mobile.getText(findTestObject('Soporte/android.widget.TextView - Se copi la informacin de esta versin en tu dispositivo'), 
    0)

Mobile.verifyEqual(Textocompartir, 'Se copió la información de esta versión en tu dispositivo')

