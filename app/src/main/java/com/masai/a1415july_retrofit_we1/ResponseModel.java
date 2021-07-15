package com.masai.a1415july_retrofit_we1;

import java.io.Serializable;

public class ResponseModel implements Serializable {
	private DataModel data;
	private SupportModel support;

	public DataModel getData(){
		return data;
	}

	public SupportModel getSupport(){
		return support;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"data = '" + data + '\'' + 
			",support = '" + support + '\'' + 
			"}";
		}
}