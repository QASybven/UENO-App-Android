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

WebUI.delay(10)

'a. Será de tipo numérico.'
Mobile.setText(findTestObject('Login/android.widget.EditText - Ejemplo 0981123456'), 'Test', 0)

'b. Longitud máxima de 10 caracteres.'
Mobile.setText(findTestObject('Login/android.widget.EditText - Ejemplo 0981123456'), '0982824191111', 0)

'c. Longitud mínima de 10 caracteres.'
Mobile.setText(findTestObject('Login/android.widget.EditText - Ejemplo 0981123456'), '098', 0)

'd. No debe permitir ningún carácter especial ni espacios en blanco.'
Mobile.setText(findTestObject('Login/android.widget.EditText - Numero de celular login'), '0555//*2551', 0)

'e. Los primeros dos (02) dígitos ingresados deben ser “09”.'
Mobile.setText(findTestObject('Login/android.widget.EditText - Numero de celular login'), '', 0)

'f. El tercer dígito ingresado debe ser seis (6), siete (7), ocho (8) o nueve (9)'
Mobile.setText(findTestObject('Login/android.widget.EditText - Numero de celular login'), '09475899555', 0)

