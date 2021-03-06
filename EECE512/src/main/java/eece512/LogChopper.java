package eece512;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class LogChopper {
	public static void main(String[] args) throws Exception {
		String src = args[0];
		String des = args[0].replaceAll(".txt", "") + "_chop.txt";
		System.out.println("Converting " + src + " to " + des);
		BufferedReader br = new BufferedReader(new FileReader(src));
		PrintWriter writer = new PrintWriter(des);
        String readLine;
        boolean foundLeak = false;
        while ((readLine = br.readLine()) != null) {
        	// For leakage
        	if (readLine.contains("Maximum memory consumption")) {
        		foundLeak = false;
        	}
        	if (foundLeak) {
        		writer.println(readLine);
        	}
        	if (readLine.contains("Created a SourceSinkManager")) {
        		foundLeak = true;
        	}
        	// For [IMPORTANT] logs
        	if (readLine.contains("[IMPORTANT]")) {
        		foundLeak = false;
        		if (readLine.contains("Decoding APK")) {
        			writer.println("---");
        		}
        		writer.println(readLine);
        	}
        }
        br.close();
        writer.close();
        System.out.println("Done");
	}
}
