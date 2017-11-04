package com.skilldistillery.presidents.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;


public class PresidentDAOImpl implements PresidentDAO{
	private static final String filename = "WEB-INF/presidentsshort.txt";
	private ServletContext servletContext;
	private List<President> presidents;
	
	
	@Override
	public List<President> getAllPresidents() {
		return presidents;
	}
	
	public PresidentDAOImpl(ServletContext context) {
		servletContext = context;
		presidents = new ArrayList<>();
		getPresidentsList();
	}

	public void getPresidentsList(){
        InputStream is = servletContext.getResourceAsStream(filename);
        BufferedReader r = null;
        try {
            r = new BufferedReader(new InputStreamReader(is));
            String line;
            while( (line = r.readLine())  !=  null ) {
                String[] presidentData = line.split("\t");
                String termNum = presidentData[0].trim();
                String firstName = presidentData[1].trim();
                String middleName = presidentData[2].trim();
                String lastName = presidentData[3].trim();
//                String start = presidentData[4].trim();
//                String end = presidentData[5].trim();
//                String won = presidentData[6].trim();
//                String left = presidentData[7].trim();
//                String party = presidentData[8].trim();
//                String funFact = presidentData[9].trim();
//                String imageLocation = presidentData[10].trim();
                
                //parse Strings above to correct type
                int termNumAsInt = Integer.parseInt(termNum);
//                LocalDate inagurated = LocalDate.parse(start);
//                LocalDate leftOffice = LocalDate.parse(end);
//                int electionsWon = Integer.parseInt(won);
                
                President p = new President(termNumAsInt, firstName, middleName, lastName);
                presidents.add(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("File was not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IOException - something broke");
        }
        finally {
            if(r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    System.err.println("Closing failed, somehow");
                    e.printStackTrace();
                }
            }
        }
    }

	@Override
	public President getPresByTerm(int term) {
		return presidents.get(term-1);
	}

}
