package com.skilldistillery.presidents.data;

import java.util.List;


public interface PresidentDAO {

List<President> getAllPresidents();
	President getPresByTerm(int term);
}
