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

WebUI.delay(10)

'a. Será de tipo numérico.'
Mobile.sendKeys(findTestObject('Login/android.widget.EditText - Numero de celular login'), 'abcdefghij')

'b. Longitud máxima de 10 caracteres.'
Mobile.sendKeys(findTestObject('Login/android.widget.EditText - Numero de celular login'), '0982824191111')

'c. Longitud mínima de 10 caracteres.'
Mobile.sendKeys(findTestObject('Login/android.widget.EditText - Numero de celular login'), '098')

'd. No debe permitir ningún carácter especial ni espacios en blanco.'
Mobile.sendKeys(findTestObject('Login/android.widget.EditText - Numero de celular login'), '0555//*2551')

'e. Los primeros dos (02) dígitos ingresados deben ser “09”.'
Mobile.sendKeys(findTestObject('Login/android.widget.EditText - Numero de celular login'), '0882824191')

'f. El tercer dígito ingresado debe ser seis (6), siete (7), ocho (8) o nueve (9)'
Mobile.sendKeys(findTestObject('Login/android.widget.EditText - Numero de celular login'), '09475899555')

