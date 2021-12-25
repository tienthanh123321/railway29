import java.sql.Date;

public class Group {
int id;
String name;
Account creator;
Date createDate;
Account[] accouns;
public Group(int id, String name, Date createDate) {
	super();
	this.id = id;
	this.name = name;
	this.createDate = createDate;
}

	
}



