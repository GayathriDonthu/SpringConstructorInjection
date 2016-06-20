package com.constructorInjection;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker, int s, String se){
		System.out.println("Text Editor Constructor");
		this.spellChecker = spellChecker;
	}
	
	public void call(){
		spellChecker.checkSpelling();
	}
	
}
