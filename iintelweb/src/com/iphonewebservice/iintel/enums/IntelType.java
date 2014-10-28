/**
 * 
 */
package com.iphonewebservice.iintel.enums;

/**
 * @author ARSHIRSHAN
 * 
 */
public enum IntelType {
	PHRASE("phrase"), JOKE("joke"), WORD("word"), RECIPE("recipe"), PHOTOSTAND(
			"photostand"), VIDEOTUBE("videotube"), IINTELNEWS("iintelnews");
	private String type;

	private IntelType(String aType) {
		type = aType;
	}

	public String getType() {
		return type;
	}

}
