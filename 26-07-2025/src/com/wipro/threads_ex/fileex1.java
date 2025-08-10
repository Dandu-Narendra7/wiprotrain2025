package com.wipro.threads_ex;

import java.io.IOException;
import java.util.io.FileInputStream;

public class fileex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFileName="d://java_logo.jpg";
		String outputFileName="d://javalogo_new.jpg";
		try {
		FileInputstream If= new FileInputStream(inputFileName);
		FileOutputStream Of=new FileoutputStream(outputFileName);
		byte[] buffer= new byte[1024]；
		int byteRead=0;
		try {
			while(byteRead=If.read(buffer))!=-1)
            {
	          Of.write(buffer,0,byteRead);
             }catch (IOException e) {
            	 e.printStackTrace();
             }
            
		}
		

	

