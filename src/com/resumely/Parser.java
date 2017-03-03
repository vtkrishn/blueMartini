package com.resumely;

public class Parser {
    public Parser() {
        super();
    }
    
    //Problem (Determine the Name of the person)
    //it can be anywhere in the document, but mostly it will be in the first few lines
    //(These may conflict with Address also)
        //will not be there in the dictionary,
        //not a verb
        //Mostly start in Capital, Camel case
        //Bold letter
        //sometimes will have the label as Name
        //Spaced with 2 or 3 continuous 
        //can be in the header
        //can have as a image also
        //mostly unique across the document
        //
     
     //Problem 2(Determine the Address of the  person)
    //Address 1, number followed by a Name
    //Can contain some of the special characters [.,/#,No, Apt, Suite]
    //street - Name and common [Common, way,street, boulevard, Suite etc]
    //Address 2 - 
    
    public static String[] slicer(String resumeRow){
        return null;
    }
}
