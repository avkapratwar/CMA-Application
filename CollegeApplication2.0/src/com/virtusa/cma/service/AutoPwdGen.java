package com.virtusa.cma.service;
import java.util.Random;

public class AutoPwdGen {

		private AutoPwdGen() {
			
		}
		static Random  rndmMethod;
	    static String geekPassword(int len) 
	    { 
	        
	        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	        String smallChars = "abcdefghijklmnopqrstuvwxyz"; 
	        String numbers = "0123456789"; 
	              
	  
	        String values = capitalChars + smallChars + 
	                        numbers ; 
	  
	    
	        rndmMethod= new Random(); 
	  
	        char[] password = new char[len]; 
	  
	        for (int i = 0; i < len; i++) 
	        { 
	            
	            password[i] = 
	              values.charAt(rndmMethod.nextInt(values.length())); 
	  
	        } 
	         
	        return  new String(password);
	    } 
	} 
