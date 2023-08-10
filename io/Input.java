package input.output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input ff = new Input();
		//ff.method();
		//ff.method1();
		//ff.method2();
		//ff.method3();
		//ff.method4();
		ff.method5();

	}

	private void method5() {
		// TODO Auto-generated method stub
		File fd = new File("/home/poovarasan/Desktop/poovarasan.txt");
		try
		{
		 FileReader reader = new FileReader(fd);
		 BufferedReader bufReader = new BufferedReader(reader);
		  String line = bufReader.readLine();
		  while(line!=null) {
		  System.out.println(line);
		  line = bufReader.readLine();
		  }
		  bufReader.close();
		
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

		
	

	private void method4() {
		// TODO Auto-generated method stub
		File fd = new File("/home/poovarasan/Desktop/poovarasan.txt");
		try
		{
		 FileReader reader = new FileReader(fd);
		  int count = 0;
		  int space_count = 1; 
		  int r = reader.read();
		  while(r!=-1) 
		  {
		    count++; 
		    char ch = (char)r;
		    if(ch==' ')
		      space_count++;
		    r = reader.read();
		  }
		  System.out.println(count);
		  System.out.println("No. of words: "+space_count);
		
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

	private void method3() {
		// TODO Auto-generated method stub
		File fd = new File("/home/poovarasan/Desktop/poovarasan.txt");
		try {
			FileReader reader = new FileReader(fd);
			int r=reader.read();
			while(r!=-1)
			{
			System.out.println((char)r);
			r=reader.read();
		}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void method2() {
		// TODO Auto-generated method stub
		File fd = new File("/home/poovarasan/Desktop");
		String[] files_folders = fd.list();
		for(String abcd : files_folders) // for_each loop
		{
			System.out.println(abcd);
		}
	
		
	}

	private void method1() {
		// TODO Auto-generated method stub
		File fd = new File("/home/poovarasan/Desktop");
		File[] files_folders = fd.listFiles();
		for(int i=0; i<files_folders.length;i++)
		{
			File file_folder = files_folders[i];
			if(file_folder.isDirectory())
			{
				System.out.println(file_folder);
				//System.out.println(file_folder.getAbsolutePath());
				//System.out.println(file_folder.getAbsoluteFile());
				System.out.println(file_folder.getName());
			}
		}
		
	}

	private void method() {
		// TODO Auto-generated method stub
		File fd = new File("/home/poovarasan/Desktop");
		String[] files_folders = fd.list();
		for(int i=0; i<files_folders.length;i++)
		{
			String st =files_folders[i];
			if(st.endsWith(".pdf") && st.contains("certificate"))
			{
				System.out.println(st);
			}
		}
		
	}

}
