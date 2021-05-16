package com.ojasdemo;

public class FileWordOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> wordcount=new HashMap<String,Integer>();
		try {
			File file=new File("D:\\file.text");
			BufferReader br=new BufferReader(new FileReader(file));
			String[]words=null;
			String line=null;
			while((line=br.readline())!=null) {
				words=line.split("");
			}
			for(String:words) {
				if(wordCount.count)
			}
		}

	}

}
