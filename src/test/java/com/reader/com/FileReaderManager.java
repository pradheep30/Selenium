 package com.reader.com;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
		
		
	}
	
	public static FileReaderManager getInstancFR() {
		
		FileReaderManager fr = new FileReaderManager();
		return fr;
		
		
	}
	
	public Configreader getInstanceCR() throws IOException {
		
		Configreader cr = new Configreader();
		return cr;
		
	}

		
		

	}


