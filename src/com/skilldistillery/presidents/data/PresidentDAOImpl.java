package com.skilldistillery.presidents.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;


public class PresidentDAOImpl implements PresidentDAO{
	private static final String filename = "WEB-INF/presidents.csv";
	private ServletContext servletContext;
	private List<President> presidents;
	
	
	@Override
	public List<President> getAllPresidents() {
		return null;
	}
	
	public PresidentDAOImpl(ServletContext context) {
		servletContext = context;
		presidents = new ArrayList<>();
		getPresidentsList();
	}

	public List<President> getPresidentsList(){
        InputStream is = servletContext.getResourceAsStream(filename);
        //open a file
        FileReader f;
        BufferedReader r = null;
        try {
            r = new BufferedReader(new InputStreamReader(is));
            String line;
            while( (line = r.readLine())  !=  null ) {
                String[] presidentData = line.split(",");
                String termNum = presidentData[0].trim();
                String firstName = presidentData[1].trim();
                String middleName = presidentData[2].trim();
                String lastName = presidentData[3].trim();
                String yearsRange = presidentData[4].trim();
                String party = presidentData[5].trim();
                
                //make termNum an int
                int termNumAsInt = Integer.parseInt(termNum);
                //yearsRange is 1789-1797
//                String[] yearsSplit = yearsRange.split("-");
//                int yearStart = Integer.parseInt(yearsSplit[0]);
//                int yearEnd = Integer.parseInt(yearsSplit[1]);
                President p = new President(termNumAsInt, yearStart, yearEnd, firstName, middleName, lastName, party);
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
        
        return presidents;
    }

	@Override
	public President getPresByTerm(int term) {
		// return president by term entered
		return null;
	}

}
