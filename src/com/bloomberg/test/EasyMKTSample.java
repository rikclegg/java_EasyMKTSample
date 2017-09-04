package com.bloomberg.test;

import com.bloomberg.mktdata.samples.EasyMKT;
import com.bloomberg.mktdata.samples.Log;
import com.bloomberg.mktdata.samples.Notification;
import com.bloomberg.mktdata.samples.NotificationHandler;

public class EasyMKTSample implements NotificationHandler {

	EasyMKT emkt;
	
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println("Bloomberg - EasyMKT Example - EasyMKTAPISample");

        EasyMKTSample example = new EasyMKTSample();
        example.run(args);
        
        System.in.read();    

    }

	private void run(String[] args) throws Exception {
	
		Log.logLevel = Log.LogLevels.NONE;

		System.out.println("Initializing EMSXAPI ");

		// Uncomment the appropriate constructor call
		emkt = new EasyMKT();
		//emkt = new EasyMKT("1.2.3.4",8194);

		System.out.println("EasyMKT initialized OK");
		
	}

	@Override
	public void processNotification(Notification notification) {

	}

}
