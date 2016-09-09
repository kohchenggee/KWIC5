package CS3213;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;




public class RequireWords {
	private static ArrayList<String> requireWords;
	
	public RequireWords() {
        
		RequireWords.requireWords = new ArrayList<String>();
        
    }
	public void addWordToList(String word) {
        assert(word != null);
        RequireWords.requireWords.add(word);
    }
	public ArrayList<String> CheckRequireWords(String[] result){
		ArrayList<String> rList=RequireWords.requireWords;
		Collections.sort(rList);
		
		
		ArrayList<String>output=new ArrayList<String>();
		int count=0;
		
		for(int i=0;i<rList.size();i++){
        	String check=rList.get(i);
        	int length=check.length();
        	for(int j=0;j<result.length;j++){
        		if(result[j].length()>=length){
        		if(check.equalsIgnoreCase(result[j].substring(0, length))){
        			output.add(result[j]);
        		}
        		}
        	}
        }
		RequireWords.requireWords=output;
		return output;
	}
	public int getSize(){
		return RequireWords.requireWords.size();
		
	}
}
