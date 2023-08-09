package input.output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileDemo fd = new FileDemo();
		fd.learn_file();

	}

	private void learn_file() {
		// TODO Auto-generated method stub
		File ff = new File("//home//poovarasan//Desktop//poovarasan.txt");
		
		try {
			
			ff.canRead();
			ff.canExecute();
			ff.canRead();
			System.out.println(ff.getAbsolutePath());
			
			FileWriter writer = new FileWriter(ff,true); 
			BufferedWriter bufwriter = new BufferedWriter(writer);
			bufwriter.append("suriya");
			bufwriter.append("suriya");
			bufwriter.newLine();
			bufwriter.append("suriya");
			bufwriter.newLine();
			bufwriter.append("suriya");
			bufwriter.flush();
			bufwriter.close();
//			writer.append("\nr\n");
//			writer.append("poovarasan\n");
//			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ff.mkdir();
		//ff.mkdirs();
		//System.out.println(ff.exists());
		
		
		
//		
//		try {
//			ff.createNewFile();
//			//System.out.println(ff.delete());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
