// Coded by Jared Smith
// Code from page 42 
// Class name Body

// Additional code from book typed in by BLC 11 Feb 2015

class Body {
	public long idNum;
	public String name;
	public Body orbits;
	
	public static long nextID = 0;
	public final double PI = 3.1416;
/*------------------------------------------------------------------------*/
	Body() { 
 	 idNum = nextID++;
	 }
	
	Body(String bodyName, Body orbitsAround) {
	 this();
	 name = bodyName;
	 orbits = orbitsAround;
}
	Body(String bodyName) {
	 this();
	 orbits = null;
	 name = bodyName;
	 }
}
