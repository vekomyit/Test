/**
 * 
 */
package com.vekomy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author thirupal
 *
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

	    ReaderThread reader = new ReaderThread(queue);

	    new Thread(reader).start();

	}

}
