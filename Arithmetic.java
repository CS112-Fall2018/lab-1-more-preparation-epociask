class Arithmetic{
  public static void main(String[] args) {

    float[] storage = new float[4];

     int a = 1;
		 int b = 2;
		float x = 3;
    float y = 4;
     storage[0] = a;
     storage[1] = b;
     storage[2] = x;
    storage[3] = y;
		
    System.out.println("ADDITION: \n");
  
    for(int i = 0; i<=3; i++){
      for(int l=1; l<=3; l++){
      if(storage[i] == storage[l]){;}

      else{
      System.out.print(storage[i]);
      System.out.print(" + ");
      System.out.print(storage[l]);
      System.out.print(" = ");
      System.out.println(storage[i] + storage[l] );
      }
    
      }
    }

    System.out.println();
    System.out.println("DIVISION: \n");

     for(int i = 0; i<=3; i++){
      for(int l=0; l<=3; l++){
      if(storage[i] == storage[l]){;}

      else{
      System.out.print(storage[i]);
      System.out.print(" / ");
      System.out.print(storage[l]);
      System.out.print(" = ");
      System.out.println(storage[i] / storage[l] );}
      }
		 }

         for(int i = 0; i<=3; i++){
      for(int l=0; l<=3; l++){
      if(storage[i] == storage[l]){;}

      else{
      System.out.print(storage[l]);
      System.out.print(" / ");
      System.out.print(storage[i]);
      System.out.print(" = ");
      System.out.println(storage[l] / storage[i] );}



    }
		
     }
}
}

	
