package com.bloomberg.test;

import com.bloomberg.mktdata.samples.EasyMKT;
import com.bloomberg.mktdata.samples.FieldChange;
import com.bloomberg.mktdata.samples.Log;
import com.bloomberg.mktdata.samples.Notification;
import com.bloomberg.mktdata.samples.NotificationHandler;
import com.bloomberg.mktdata.samples.Security;

public class EasyMKTSample implements NotificationHandler {

	EasyMKT emkt;
	
    public static void main(String[] args) throws java.lang.Exception
    {
        System.out.println("Bloomberg - EasyMKT Example - EasyMKTAPISample");

        EasyMKTSample example = new EasyMKTSample();
        example.run(args);
        
        System.out.println("Press Enter to terminate...");
        System.in.read();    
        System.out.println("Terminating.");
        System.exit(0);
    }

	private void run(String[] args) throws Exception {
	
		Log.logLevel = Log.LogLevels.NONE;

		System.out.println("Initializing EasyMKT ");

		// Uncomment the appropriate constructor call
		emkt = new EasyMKT();
		//emkt = new EasyMKT("1.2.3.4",8194);

		System.out.println("EasyMKT initialized OK");
		
		// Add required fields...
		emkt.addField("BID");
		emkt.addField("ASK");
		emkt.addField("MID");
		emkt.addField("LAST_PRICE");

		// Add required securities...
		emkt.addSecurity("HSBA LN Equity");
		emkt.addSecurity("BATS LN Equity");
		emkt.addSecurity("RDSA LN Equity");
		emkt.addSecurity("BP/ LN Equity");
		emkt.addSecurity("RDSB LN Equity");
		emkt.addSecurity("GSK LN Equity");
		emkt.addSecurity("DGE LN Equity");
		emkt.addSecurity("VOD LN Equity");
		emkt.addSecurity("AZN LN Equity");
		emkt.addSecurity("ULVR LN Equity");
		emkt.addSecurity("PRU LN Equity");
		emkt.addSecurity("LLOY LN Equity");
		emkt.addSecurity("RIO LN Equity");
		emkt.addSecurity("RB/ LN Equity");
		emkt.addSecurity("GLEN LN Equity");
		emkt.addSecurity("SHP LN Equity");
		emkt.addSecurity("NG/ LN Equity");
		emkt.addSecurity("BARC LN Equity");
		emkt.addSecurity("BLT LN Equity");
		emkt.addSecurity("IMB LN Equity");
		emkt.addSecurity("CPG LN Equity");
		emkt.addSecurity("BT/A LN Equity");
		emkt.addSecurity("CRH LN Equity");
		emkt.addSecurity("AV/ LN Equity");
		emkt.addSecurity("STAN LN Equity");
		emkt.addSecurity("BA/ LN Equity");
		emkt.addSecurity("REL LN Equity");
		emkt.addSecurity("WPP LN Equity");
		emkt.addSecurity("AAL LN Equity");
		emkt.addSecurity("LGEN LN Equity");
		emkt.addSecurity("TSCO LN Equity");
		emkt.addSecurity("RR/ LN Equity");
		emkt.addSecurity("SSE LN Equity");
		emkt.addSecurity("EXPN LN Equity");
		emkt.addSecurity("LSE LN Equity");
		emkt.addSecurity("SN/ LN Equity");
		emkt.addSecurity("FERG LN Equity");
		emkt.addSecurity("SLA LN Equity");
		emkt.addSecurity("ABF LN Equity");
		emkt.addSecurity("CNA LN Equity");
		emkt.addSecurity("IAG LN Equity");
		emkt.addSecurity("SKY LN Equity");
		emkt.addSecurity("OML LN Equity");
		emkt.addSecurity("CCL LN Equity");
		emkt.addSecurity("III LN Equity");
		emkt.addSecurity("AHT LN Equity");
		emkt.addSecurity("ITRK LN Equity");
		emkt.addSecurity("PSN LN Equity");
		emkt.addSecurity("RBS LN Equity");
		emkt.addSecurity("BRBY LN Equity");
		emkt.addSecurity("WPG LN Equity");
		emkt.addSecurity("MNDI LN Equity");
		emkt.addSecurity("BNZL LN Equity");
		emkt.addSecurity("LAND LN Equity");
		emkt.addSecurity("SGE LN Equity");
		emkt.addSecurity("RRS LN Equity");
		emkt.addSecurity("IHG LN Equity");
		emkt.addSecurity("WTB LN Equity");
		emkt.addSecurity("RSA LN Equity");
		emkt.addSecurity("KGF LN Equity");
		emkt.addSecurity("DCC LN Equity");
		emkt.addSecurity("TW/ LN Equity");
		emkt.addSecurity("BLND LN Equity");
		emkt.addSecurity("BDEV LN Equity");
		emkt.addSecurity("UU/ LN Equity");
		emkt.addSecurity("SMIN LN Equity");
		emkt.addSecurity("STJ LN Equity");
		emkt.addSecurity("NXT LN Equity");
		emkt.addSecurity("SMT LN Equity");
		emkt.addSecurity("ITV LN Equity");
		emkt.addSecurity("PPB LN Equity");
		emkt.addSecurity("TUI LN Equity");
		emkt.addSecurity("INF LN Equity");
		emkt.addSecurity("SKG LN Equity");
		emkt.addSecurity("RTO LN Equity");
		emkt.addSecurity("GKN LN Equity");
		emkt.addSecurity("SGRO LN Equity");
		emkt.addSecurity("JMAT LN Equity");
		emkt.addSecurity("SVT LN Equity");
		emkt.addSecurity("MRW LN Equity");
		emkt.addSecurity("MKS LN Equity");
		emkt.addSecurity("DLG LN Equity");
		emkt.addSecurity("CCH LN Equity");
		emkt.addSecurity("PSON LN Equity");
		emkt.addSecurity("CRDA LN Equity");
		emkt.addSecurity("MCRO LN Equity");
		emkt.addSecurity("HMSO LN Equity");
		emkt.addSecurity("GFS LN Equity");
		emkt.addSecurity("BAB LN Equity");
		emkt.addSecurity("ADM LN Equity");
		emkt.addSecurity("SBRY LN Equity");
		emkt.addSecurity("SDR LN Equity");
		emkt.addSecurity("CTEC LN Equity");
		emkt.addSecurity("ANTO LN Equity");
		emkt.addSecurity("RMG LN Equity");
		emkt.addSecurity("HL/ LN Equity");
		emkt.addSecurity("MERL LN Equity");
		emkt.addSecurity("FRES LN Equity");
		emkt.addSecurity("MDC LN Equity");
		emkt.addSecurity("EZJ LN Equity");
		emkt.addSecurity("PFG LN Equity");

		// Notify me if anything changes for any security
		//emkt.securities.addNotificationHandler(this);
		
		// Notify me if anything changes for a specific security
		//emkt.securities.get("HSBA LN Equity").addNotificationHandler(this);

		// Notify me if anything changes for specific field on specific security.
		//emkt.securities.get("HSBA LN Equity").field("ASK").addNotificationHandler(this);
		//emkt.securities.get("HSBA LN Equity").field("BID").addNotificationHandler(this);

		// Add specific field handlers for every loaded security
		for(Security s: emkt.securities) {
			s.field("ASK").addNotificationHandler(this);
			s.field("BID").addNotificationHandler(this);
		}
		
		emkt.start();
		
	}

	@Override
	public void processNotification(Notification notification) {
		System.out.println("Notification: Type=" + notification.type.name() + " Security=" + notification.getSecurity().getName());
		for(FieldChange fc: notification.getFieldChanges()) {
			System.out.println("\tField change: name = " + fc.field.name() + "\told=" + fc.oldValue + "\tnew=" + fc.newValue);
		}
		notification.consume=true;
	}

}
