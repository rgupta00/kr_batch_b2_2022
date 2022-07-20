package com.cal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoCode {
	private static Logger logger=LoggerFactory.getLogger(DemoCode.class);
	
	public static void main(String[] args) {
		
		//System.out.println("code is working till line 19");
		logger.info("some sample log");
		try {
			String data="1A";
			Integer val=Integer.parseInt(data);
		}catch(Exception e) {
			logger.error("some error "+ e);
		}
		
	}

}
