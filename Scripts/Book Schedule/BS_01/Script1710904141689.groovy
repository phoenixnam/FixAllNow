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

//Mobile.startApplication('C:\\Users\\Phuong\\Katalon Studio\\FixAllNow\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.widget.Button - Apr'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.widget.Button - OK (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Book schedule Object/android.widget.EditText -  ia chi (1)'), 'Mỹ Khê 3 Sơn Trà Đà Nẵng', 
    0)

Mobile.setText(findTestObject('Object Repository/Book schedule Object/android.widget.EditText -  M ta vn  h hong thit bi (1)'), 
    'Ô tô bị lủng lốp do giậm trúng đinh, có thể vá lại ', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Book schedule Object/android.view.ViewGroup (9)'), 0)



