package Framework.ExcelDataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//create an object to access the method present in dataDriven class
		
		dataDriven d= new dataDriven();
		// pass the TCname Parameter and assign the data to the result variable of type Array list
		ArrayList<String> data =  d.getData("Purchase");
		
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
		
	}

}
