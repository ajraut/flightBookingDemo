package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() {
		try {

			File src = new File("./src/com/utility/resources/Config.property");
			FileInputStream fs = new FileInputStream(src);

			prop = new Properties();
			prop.load(fs);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// BrowserInitialisation
	public String getBrowserNameIE() {
		return prop.getProperty("browser_name_IE");
	}
	public String getDriverPathIE() {
		return prop.getProperty("driver_path_IE");
	}
	public String getDriverValueIE() {
		return prop.getProperty("driver_value_IE");
	}
	public String getBrowserNameChrome() {
		return prop.getProperty("browser_name_chrome");
	}
	public String getDriverPathChrome() {
		return prop.getProperty("driver_path_chrome");
	}
	public String getDriverValueChrome() {
		return prop.getProperty("driver_value_chrome");
	}
	// loginTest
	public String getApplicationURL() {
		return prop.getProperty("url");
	}
	public String getUserName() {
		return prop.getProperty("username");
	}
	public String getPassword() {
		return prop.getProperty("password");
	}
	public String getElementUserName() {
		return prop.getProperty("login_username");
	}
	public String getElementPassword() {
		return prop.getProperty("login_password");
	}
	public String getElementSubmitButton() {
		return prop.getProperty("login_signIn");
	}
	//excel sheet
	public String getTestDataExcelPath(){
		return prop.getProperty("testDataPath");
	}
	public String getSheetHorizontalMenu(){
		return prop.getProperty("horizontalMenuSheet");
	}
	public String getSheetBookmark(){
		return prop.getProperty("bookMarkSheet");
	}
	public String getSheetOnlineHelp(){
		return prop.getProperty("helpOptionSheet");
	}
	//access site
	public String getElementHome(){
		return prop.getProperty("home");
	}
	public String getWelcomeMsg(){
		return prop.getProperty("welcomeMsg");
	}
	public String getHorizontalMenu(){
		return prop.getProperty("horizontalMenu");
	}
	public String getElementMinMaxRibin(){
		return prop.getProperty("minmaxRibin");
	}
	public String getElementGRC(){
		return prop.getProperty("grc");
	}
	public String getSignedInUserName(){
		return prop.getProperty("signedInUser");
	}
	public String getElementTopRightIcon1(){
		return prop.getProperty("topRightIcon1");
	}
	public String getElementLoggedInUserName(){
		return prop.getProperty("userName");
	}
	public String getElementTopRightIcon2(){
		return prop.getProperty("topRightIcon2");
	}
	public String getElementBookMarkValues(){
		return prop.getProperty("bookMarkValue");
	}
	public String getElementTopRightIcon3(){
		return prop.getProperty("topRightIcon3");
	}
	public String getElementHelpMenuValues(){
		return prop.getProperty("helpMenu");
	}
	public String getElementLogOff(){
		return prop.getProperty("logOffButton");
	}
	//My Favorites
	public String getElementFavAndActionItem(){
		return prop.getProperty("favoritesAndActionItems");
	}
	public String getElementFavoriteOption(){
		return prop.getProperty("favoriteOptions");
	}
	public String getElementOrganization(){
		return prop.getProperty("organization");
	}
	public String getElementOrgOption(){
		return prop.getProperty("orgOptions");
	}
	public String getElementDataTransfer(){
		return prop.getProperty("dataTransfer");
	}
	public String getElementModelPageColumn(){
		return prop.getProperty("modelPageColumn");
	}
	public String getElementAddToMyFav(){
		return prop.getProperty("addToMyFav");
	}
	//myFavPage
	public String getElementNameOfFav(){
		return prop.getProperty("nameOfFav");
	}
	public String getElementEnterFavName(){
		return prop.getProperty("enterFavName");
	}
	public String getElementChooseFolder(){
		return prop.getProperty("chooseFolder");
	}
	public String getElementFavSubmitButton(){
		return prop.getProperty("submitButton");
	}
	public String getElementFavCancelButton(){
		return prop.getProperty("cancelButton");
	}
	public String getElementFavCopyButton(){
		return prop.getProperty("copyButton");
	}
	public String getElementShowUrlButton(){
		return prop.getProperty("showUrlButton");
	} //end
	public String getElementAddNewFolder(){
		return prop.getProperty("addNewFolder");
	}
	public String getElementEditOption(){
		return prop.getProperty("editOptions");
	}
	
	
	
}
