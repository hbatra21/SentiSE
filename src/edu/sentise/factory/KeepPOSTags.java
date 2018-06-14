package edu.sentise.factory;

import java.util.HashMap;
import java.util.Hashtable;

import edu.sentise.preprocessing.MyStopWordsHandler;

public class KeepPOSTags extends BasePOSUtility{

	public KeepPOSTags(MyStopWordsHandler handler) {
		super(handler);
		
	}

	@Override
	public void shouldInclude(String label,String word, String tag, String context, Hashtable<String, String> myMap) {
		if(!this.isStopWord(word))
		     myMap.put(label,tag+"_"+word);
		
	}
}