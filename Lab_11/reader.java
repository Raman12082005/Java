import java.io.*;
public class reader{
	public static void main(String args[])
	throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter text: ");
		String str = br.readLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt", true));
		bw.write(str);
		bw.newLine();
		
		bw.close();
		br.close();
		isr.close();
	}
}
