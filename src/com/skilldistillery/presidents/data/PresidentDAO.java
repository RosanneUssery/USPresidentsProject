package com.skilldistillery.presidents.data;

import java.util.List;


public interface PresidentDAO {

List<President> getAllPresidents();
	String getPresByTerm(int term);
	
}
