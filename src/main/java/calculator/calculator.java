package calculator;

public class calculator {
	
	/**************M�thode pour faire l'addition de deux chiffres************/
	public static int sum(int a, int b)
	    {
		 	int c= a+b;
	        return c;
	    }
	
	/**************M�thode pour faire la soustraction de deux chiffres************/
	public static int minus(int a, int b)
	    {
		 	int c= a-b;
	        return c;
	    }
	
	/**************M�thode pour faire la division de deux chiffres************/
	public static int divid(int a, int b)
	    {
		 	int c= a/b;
	        return c;
	    }
	
	/**************M�thode pour faire la multiplication de deux chiffres************/
	public static int multiply(int a, int b)
	    {
		 	int c= a*b;
	        return c;
	    }
	
	/**************M�thode pour connaitre la somme de deux chiffres************/

	public int min(int a, int b){
		
        return Math.min(a,b);
    }
	
	/**************M�thode pour faire le minimum de deux chiffres************/

    public int max(int a, int b){
    	
        return Math.max(a,b);
    }
    
    /**************M�thode qui retourne le plus petit �l�ment d�une liste************/
    public int minElement(int array[]){
    	int k =array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<k){
                k=array[i];
            }
        }
        return k;
  
    }
    
    /**************M�thode  qui retourne le plus grand �l�ment d�une liste************/
    public int maxElement(int array[]){
    	int k =array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] >k){
                k=array[i];
            }
        }
        return k;
    }


}
