package com.skilldistillery.presidents.data;

import java.util.List;


public interface PresidentDAO {

List<PresidentDAO> getAllPresidents();

	Presidents getPresByTerm(int term);
	
}
