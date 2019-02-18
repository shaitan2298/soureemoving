
public class FileProgram {
	public static void main(String[] args) throws InterruptedException {
		
		String sourceFile = "D:\\Users\\ADM-IG-HWDLAB1D\\Desktop\\source.txt";
		String targetFile = "D:\\Users\\ADM-IG-HWDLAB1D\\Desktop\\target.txt";
		
		CopyDataThread copyThread = new CopyDataThread(sourceFile, targetFile);
		
		Thread copy = new Thread(copyThread);
		copy.start();
		copy.join();
	}
}