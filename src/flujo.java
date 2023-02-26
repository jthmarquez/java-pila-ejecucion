
public class flujo {

		  public static void main(String[] args) {
		    System.out.println("Inicio main");
		    metodo1();
		    System.out.println("Fin de main");
		  }
		  public static void metodo1(){
		    System.out.println("Inicio metodo1");
		    metodo2();
		    System.out.println("Fin de metodo1");
		  }
		  public static void metodo2(){
		    System.out.println("Inicio metodo2");
		    for(int i = 1; i <= 5; i++){
		      System.out.println(i);
		      
		      try { // Intenta esto(para rastrear el bug)
		    	 if (i == 3) { 
		    		 int num = 0;
		      int resultado = i/num;
		      System.out.println(resultado);
		    	 }
		      //este metodo que sigue es otra manera de rastrear
		      // y eliminar el bug, se puede comentar el primer codigo("int num = 0;")
		      // dejando este que le sigue, son dos ejemplos para eliminar bugs
		      // o se dejan los dos para ejucutar un catch multiple
		    	 
		      String test = null;
		      System.out.println(test.toString());
		      
		      } catch(ArithmeticException | NullPointerException exception) {// atrapa el bug
		    	  System.out.println("Atrapo Exception");
		    	  System.out.println(exception.getMessage());
		    	  exception.printStackTrace();
		      }
		      
		    }
		    System.out.println("Fin de metodo2");
		  }
		}

