package libs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import libs.WebElements;

import org.apache.log4j.Logger;

public class QuiteBrowser {
	
	    public static Logger log;

	    public static void main(String[] args) throws IOException {
	        log = Logger.getLogger(QuiteBrowser.class);
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String processName = br.readLine();
	        processName = processName.toLowerCase();
	        processName = processName.replaceAll("[\\W]", "");
	        if (processName.equals("ff") || processName.equals("firefox")) {
	            processName = "firefox";
	        } else if (processName.equals("safari") || processName.equals("sf")) {
	            processName = "Safari";
	        } else if (processName.equals("chrome") || processName.equals("googlechrome") || processName.equals("gh") || processName.equals("google") || processName.equals("ch")) {
	            processName = "Chrom";
	        } else
	            log.info("Unknown browser name");

	        String cmd = "pkill -9 " + processName;
	        Runtime.getRuntime().exec(cmd);
	        log.info(processName + " was closed");
	    }
	

}
