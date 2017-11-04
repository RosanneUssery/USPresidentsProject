package com.skilldistillery.presidents.data;

import java.time.LocalDate;
import java.time.Period;

public class President {
	  private int termNumber;
	  private String firstName;
	  private String middleName;
	  private String lastName;
	  private String termStart;
	  private String termEnd;
	  private int electionsWon;
	  private String whyLeftOffice;
	  private String party;
	  private String funFact;
//	  private String imageLocation;
	  
	  
	  // Can use this constructor if we add the image location to the file
//	  public President(int termNumber, String firstName, String middleName, String lastName, LocalDate termStart,
//			LocalDate termEnd, int electionsWon, String whyLeftOffice, String party, String funFact,
//			String imageLocation) {
//		super();
//		this.termNumber = termNumber;
//		this.firstName = firstName;
//		this.middleName = middleName;
//		this.lastName = lastName;
//		this.termStart = termStart;
//		this.termEnd = termEnd;
//		this.electionsWon = electionsWon;
//		this.whyLeftOffice = whyLeftOffice;
//		this.party = party;
//		this.funFact = funFact;
//		this.imageLocation = imageLocation;
//	}



	public President(int termNumber, String firstName, String middleName, String lastName, String termStart,
			String termEnd, int electionsWon, String whyLeftOffice, String party, String funFact) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.termStart = termStart;
		this.termEnd = termEnd;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = whyLeftOffice;
		this.party = party;
		this.funFact = funFact;
	}


	  public int getTermNumber() {
	    return termNumber;
	  }

	  public void setTermNumber(int termNumber) {
	    this.termNumber = termNumber;
	  }

	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getMiddleName() {
	    return middleName;
	  }

	  public void setMiddleName(String middleName) {
	    this.middleName = middleName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	public President(int termNumber, String firstName, String middleName, String lastName) {
		super();
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

//	  public int getElectionsWon() {
//	    return electionsWon;
//	  }
//
//	  public void setElectionsWon(int electionsWon) {
//	    this.electionsWon = electionsWon;
//	  }
//
//	  public String getWhyLeftOffice() {
//	    return whyLeftOffice;
//	  }
//
//	  public void setWhyLeftOffice(String reasonLeftOffice) {
//	    this.whyLeftOffice = reasonLeftOffice;
//	  }
//
//	  public String getParty() {
//	    return party;
//	  }
//
//	  public void setParty(String party) {
//	    this.party = party;
//	  }

//	  @Override
//	  public String toString() {
//	    StringBuilder builder = new StringBuilder();
//	    builder.append(termNumber + ": ");
//	    builder.append(firstName + " ");
//	    if (middleName.length() > 0) {
//	      builder.append(middleName + " ");
//	    }
//	    builder.append(lastName);
//	    builder.append(" (" + party + ")");
//	    builder.append(", ");
//	    builder.append(termStart);
//	    builder.append("-");
//	    builder.append(termEnd);
//	    builder.append(" (term length: ");
//	    builder.append(this.getTermLength());
//	    builder.append(" ");
//	    builder.append(this.getTermLength().getYears());
//	    builder.append(" yrs,");
//	    builder.append(this.getTermLength().getMonths());
//	    builder.append(" mos,");
//	    builder.append(this.getTermLength().getDays());
//	    builder.append(" days)");
//	    builder.append(", electionsWon=");
//	    builder.append(electionsWon);
//	    builder.append(", whyLeftOffice=");
//	    builder.append(whyLeftOffice);
//	    return builder.toString();
//	  }
//
//	public LocalDate getTermStart() {
//	    return termStart;
//	}
//
//	public void setTermStart(LocalDate termStart) {
//	    this.termStart = termStart;
//	}
//
//	public LocalDate getTermEnd() {
//	    return termEnd;
//	}
//
//	public void setTermEnd(LocalDate termEnd) {
//	    this.termEnd = termEnd;
//	}
//
//
//
//	public String getFunFact() {
//		return funFact;
//	}
//
//
//	public void setFunFact(String funFact) {
//		this.funFact = funFact;
//	}

}

