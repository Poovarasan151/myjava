package input.output;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo rd =new  RecursionDemo();
		rd.display(1);
		int result = rd.fact(4);
		System.out.println(result);

	}

	private int fact(int no) {
		// TODO Auto-generated method stub
      if(no==1)
    	  return 1;
      return no*fact(no-1);
      
 
	}

	private void display(int no) {
		// TODO Auto-generated method stub
		System.out.println("hi"+ no);
		no++;
		if(no<=5)
		{
			display(no);
		}
		
	}

}
