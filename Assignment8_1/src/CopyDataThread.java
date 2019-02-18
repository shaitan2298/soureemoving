
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyDataThread implements Runnable{

	private String sourceFileLoc, targetFileLoc;
	public CopyDataThread(String sourceFileLoc, String targetFileLoc) {
		this.sourceFileLoc = sourceFileLoc;
		this.targetFileLoc = targetFileLoc;
	}
	@Override
	public void run() {
		try(BufferedReader src = new BufferedReader(new FileReader(this.sourceFileLoc))) {
			try(BufferedWriter dest = new BufferedWriter(new FileWriter(this.targetFileLoc))) {
				int data, i = 0;
				while((data = src.read()) != -1) {
					++i;
					if(i%10 == 0) {
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}
					dest.write((char)data);
				}
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			} 
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		System.out.println("File transfer to " + this.targetFileLoc);
	}

}