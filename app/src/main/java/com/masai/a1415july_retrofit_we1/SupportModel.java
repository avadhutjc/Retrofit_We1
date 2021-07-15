package com.masai.a1415july_retrofit_we1;



import java.io.Serializable;

public class SupportModel implements Serializable {
	private String url;
	private String text;

	public String getUrl(){
		return url;
	}

	public String getText(){
		return text;
	}


	@Override
 	public String toString(){
		return 
			"SupportModel{" + 
			"url = '" + url + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}