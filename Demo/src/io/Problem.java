package io;

import java.io.*;
import java.util.ArrayList;

public class Problem {

	public static void main(String[] args) throws IOException {
		BufferedReader r1 = null;
		BufferedReader r2 = null;
		BufferedWriter w = null;
		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();
		try {
			r1 = new BufferedReader(new FileReader("JohnTerm1.txt"));
			r2 = new BufferedReader(new FileReader("JohnTerm2.txt"));
			w = new BufferedWriter(new FileWriter("JohnTotal.txt"));
			String i = r2.readLine();
			String j = r1.readLine();
			while(i != null && j != null) {
				a1.add(i);
				a2.add(j);
				j = r1.readLine();
				i = r2.readLine();
			}
			//System.out.println(a1);
			//System.out.println(a2);
			for (int x = 0;x<a1.size();x++) {
				String[] temp1 = a1.get(x).split(":");
				String[] temp2 = a1.get(x).split(":");
				w.write(temp1[0]+":"+(Integer.parseInt(temp1[1])+Integer.parseInt(temp2[1])));
				w.newLine();
				System.out.println(temp1[0]+":"+(Integer.parseInt(temp1[1])+Integer.parseInt(temp2[1])));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(r1 != null)r1.close();
			if(r2 != null)r2.close();
			if(w != null)w.close();
		}

	}

}
