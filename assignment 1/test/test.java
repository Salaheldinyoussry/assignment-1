import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
    calculator test = new calculator();
     int a ;
     a= test.add(2, 3);
     assertEquals(5,a);
    
     a= test.add(100, 3);
     assertEquals(103,a);
    
     a= test.add(69999, 3900028);
     assertEquals(3970027,a);
    
     a= test.add(-2, 100);
     assertEquals(98,a);
    
     a= test.add(-822,-4444673);
     assertEquals(-4445495,a);
    

    
    
	}

	
 
 	@Test
 	void test2() {
     calculator test = new calculator();
      float a ;
 	 a=test.divide(4, 8);
      assertEquals(0.5,a);
      
      a=test.divide(8000, 400);
      assertEquals(20,a);
 	
      a=test.divide(160, -8);
      assertEquals(-20,a);
 	
		assertThrows(RuntimeException.class,()->test.divide(0,0));
		assertThrows(RuntimeException.class,()->test.divide(-9,0));
		assertThrows(RuntimeException.class,()->test.divide(6,0));

 	}
 
	
}
