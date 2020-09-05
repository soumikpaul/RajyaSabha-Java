package rajya;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class RajyaSabha {
	public static void main(String[] args){
		String path="/home/test4/eclipse-workspace/RajyaSabha/src/rajya/raj.csv";
		try {
		DisplayList(path);
		}
		catch(IOException e)
		{
			System.out.println("Error Occured "+e);
		}
//		String line;
//		HashMap<String, Integer> map = new HashMap<>();
//		int count=0;
//		try {
//        BufferedReader csvReader = new BufferedReader(new FileReader("/home/test4/eclipse-workspace/RajyaSabha/src/rajya/raj.csv"));
//        int skip=0;
//        while ((line = csvReader.readLine()) != null)
//        {
//        	if(skip==0)
//        	{
//        		skip++;
//        		continue;
//        	}
//            String[] tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
//            if(map.get(tokens[2].trim())!=null) {
//            	count=map.get(tokens[2].trim());
//            	count++;
//            	map.put(tokens[2].trim(), count);
//            }
//            else {
//            	map.put(tokens[2].trim(), 1);
//            }   
//      }        
//        csvReader.close();
//
//        System.out.println(map);
//        System.out.println(map.size());
//		}
//		catch(Exception e)
//		{
//			System.out.println("File not found "+e);
//		}
	}
	public static void DisplayList(String path)  throws IOException {
		String line;
		HashMap<String, Integer> map = new HashMap<>();
		int count=0;
        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        int skip=0;
        while ((line = csvReader.readLine()) != null)
        {
        	if(skip==0)
        	{
        		skip++;
        		continue;
        	}
            String[] tokens = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            if(map.get(tokens[2].trim())!=null) {
            	count=map.get(tokens[2].trim());
            	count++;
            	map.put(tokens[2].trim(), count);
            }
            else {
            	map.put(tokens[2].trim(), 1);
            }   
      }        
        csvReader.close();

        System.out.println(map);
        System.out.println(map.size());

	}

}
