package com.company;

public class Main {

    public static void main(String[] args) {
	//Enums - constants (not variables, do not change values)
        TaskMenu newFile = TaskMenu.FILE;
        TaskMenu newEdit = TaskMenu.EDIT;
        TaskMenu newView = TaskMenu.VIEW;
        System.out.println("First item of " + newFile + " is " + newFile.getFirstItem());
        System.out.println("First item of " + newEdit + " is " + newEdit.getFirstItem());
        System.out.println("First item of " + newView + " is " + newView);

    }
}
