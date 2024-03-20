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


Mobile.startApplication('C:\\Users\\Phuong\\Katalon Studio\\FixAllNow\\app-release.apk', true)

Mobile.switchToNative()

Mobile.setText(findTestObject('null'), 'zorumthiphuong@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('null'), 'Evr8jbf0RWSYIBSNY2RF3w==',
	0)

Mobile.hideKeyboard()



Mobile.setText(findTestObject('Object Repository/Search Object/android.widget.EditText - Tim kim dich vu'), 'Vệ sinh', 0)


Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (1)'), 2,4)

Mobile.scrollToText('30/4/2024')

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Object Repository/Book schedule Object/android.widget.EditText -  ia chi'), '101b Lê Hữu Trác Sơn Trà Đà Nẵng', 
    0)

Mobile.setText(findTestObject('Object Repository/Book schedule Object/android.widget.EditText -  M ta vn  h hong thit bi'), 
    'Vệ sinh lại máy điều hòa', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (2)'), 0)

Mobile.closeApplication()

