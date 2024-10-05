package com.futuretrainings.jg;

public class VariableParameterliste {

	public static void main(String[] args) {
		MethodeA(5, 6, 8, 9, 2);
		
	    byte    a = 10;
	    char    b = 'A';
	    boolean c = true;
	    String  d = "Hallo PLHQ!";
	    double  e = 2.56;
	 
	    bestimmeDatentyp(a, b, c, d, e);

	}

	public static void MethodeA(int... params) {
		System.out.println(params.length);
		for (int i : params) {
			System.out.println(i);
		}
	}
	
	  public static void bestimmeDatentyp(Object... params) 
	  {
	    String klassenName, text;
	    int i = 0;
	 
	    for (Object obj : params)
	    {      
	      i++;
	      klassenName = obj.getClass().getSimpleName();
	 
	      switch (klassenName)
	      {
	        case "Boolean":
	          text = "Das " + i + ". Argument ist ein logischer Datentyp";
	          break;
	        case "Byte":
	          text = "Das " + i + ". Argument ist ein integraler Datentyp";
	          break;
	        case "Character":
	          text = "Das " + i + ". Argument ist ein Zeichen-Datentyp";
	          break;
	        case "String":
	          text = "Das " + i + ". Argument ist ein Referenz-Datentyp";
	          break;
	        default:
	          text = "Der Datentyp des " + i + ". Arguments ist unbekannt";
	      }
	 
	      System.out.println("\n" + text + " (" + klassenName + ")."); 
	    }    
	  }

}
