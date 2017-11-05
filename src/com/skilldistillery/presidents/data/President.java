package com.skilldistillery.presidents.data;

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
	  private String imageLocation;
	  
	  // Can use this constructor if we add the image location to the file
	  public President(int termNumber, String firstName, String middleName, String lastName, String termStart,
			String termEnd, int electionsWon, String whyLeftOffice, String party, String funFact,
			String imageLocation) {
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
		this.imageLocation = imageLocation;
	}

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

	  public int getElectionsWon() {
	    return electionsWon;
	  }

	  public void setElectionsWon(int electionsWon) {
	    this.electionsWon = electionsWon;
	  }

	  public String getWhyLeftOffice() {
	    return whyLeftOffice;
	  }

	  public void setWhyLeftOffice(String reasonLeftOffice) {
	    this.whyLeftOffice = reasonLeftOffice;
	  }

	  public String getParty() {
	    return party;
	  }

	  public void setParty(String party) {
	    this.party = party;
	  }

	public String getTermStart() {
	    return termStart;
	}

	public void setTermStart(String termStart) {
	    this.termStart = termStart;
	}

	public String getTermEnd() {
	    return termEnd;
	}

	public void setTermEnd(String termEnd) {
	    this.termEnd = termEnd;
	}

	public String getFunFact() {
		return funFact;
	}

	public void setFunFact(String funFact) {
		this.funFact = funFact;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
}

