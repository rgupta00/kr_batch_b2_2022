package com.facerecsystem.controller;

import com.facerecsystem.db.Face;

public class Main {
	
	public static void main(String[] args) {
		Face face=new  Face();
		face.saveFacePixelToDb();
		
		com.facerecsystem.ui.Face face2=new com.facerecsystem.ui.Face();
		face2.printFacePixelOnUi();
		
	}

}
