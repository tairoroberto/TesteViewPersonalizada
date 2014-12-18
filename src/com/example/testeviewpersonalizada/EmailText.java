package com.example.testeviewpersonalizada;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class EmailText extends EditText {

	public EmailText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public EmailText(Context context, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(context, attrs);
	}
	
	public boolean isEmail() {
		String expressaoregular = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String email = getText().toString();
		return(email.matches(expressaoregular));
	}

}
