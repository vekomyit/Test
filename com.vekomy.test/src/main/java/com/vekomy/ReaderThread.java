/**
 * 
 */
package com.vekomy;

import java.io.*;
import java.util.concurrent.BlockingQueue;

/**
 * @author thirupal
 *
 */
public class ReaderThread implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	protected BlockingQueue<String> blockingQueue = null;

	  public  ReaderThread(BlockingQueue<String> blockingQueue){
	    this.blockingQueue = blockingQueue;     
	  }

	 // @Override
	  public void run() {
	    BufferedReader br = null;
	     try {
	            br = new BufferedReader(new FileReader(new File("/home/thirupal/vekomy/Thirupal/application.properties")));
	            String buffer =null;
	            while((buffer=br.readLine())!=null){
	                blockingQueue.put(buffer);
	                System.out.println("data ====  "+blockingQueue);
	            }
	            blockingQueue.put("EOF");  //When end of file has been reached

	        } catch (FileNotFoundException e) {

	            e.printStackTrace();
	        } catch (IOException e) {

	            e.printStackTrace();
	        } catch(InterruptedException e){

	        }finally{
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }


	  }


}
