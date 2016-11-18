package org.daisy.dotify.devtools.cli;

import org.daisy.dotify.devtools.converters.CodePointHelper;
import org.daisy.dotify.devtools.converters.UnicodeNames;

/**
 * Generates template entries for inserting in a translation table. Modify 
 * start and end variables below and run. The result is written to standard
 * out and can be copied into a translation table.
 * @author Joel Håkansson
 *
 */
public class GenerateTableEntries {
	// change these as desired
	public static final int start = 0x03b1; // first code point
	public static final int end = 0x03c9; // last code point
	public static final boolean comment = true; // write xml comment

	/**
	 * @param args the application arguments
	 */
	public static void main(String[] args) {
		char c;
		for (int i=start;i<=end;i++) {
			c = (char)i;
			System.out.println("<entry key=\"" + c + "\"></entry>" + (comment?"\t<!-- "+UnicodeNames.getName(i)+", U+"+CodePointHelper.toHexString(i, 4)+" -->":""));
		}

	}



}