
package org.sor.test ;
import org.sor.utils.SorReturn ;
import static org.junit.Assert.*;
import org.junit.Test ;


public class TestSorReturn {

   @Test 
   public void test1() {

      SorReturn sr = new SorReturn() ;
      assertEquals( 0 , sr.errNum ) ;
      assertEquals( "Ok", sr.errType ) ;
      assertEquals( "", sr.errMessage ) ;
      assertEquals( null, sr.returnObj ) ;
   }

   @Test
   public void test2() {

      Object ro = new Object() ;
      
      SorReturn sr = new SorReturn(ro)  ;
      assertEquals( 0,sr.errNum ) ;
      assertEquals( "Ok",sr.errType ) ;
      assertEquals( "",sr.errMessage) ;
      assertEquals( ro,sr.returnObj ) ;
   }  

   @Test
   public void test3() {

      SorReturn sr = new SorReturn( 2 ) ;
      assertEquals( 2 ,sr.errNum ) ;
      assertEquals( "Ok",sr.errType ) ;
      assertEquals( "",sr.errMessage) ;
      assertEquals( null,sr.returnObj ) ;
   }

   @Test
   public void test4() {

      SorReturn sr = new SorReturn( 3, "ErrorMessage" ) ;
      assertEquals( 3 ,sr.errNum ) ;
      assertEquals( "ErrorMessage", sr.errMessage ) ;
   }

   @Test
   public void test5() {
      SorReturn sr = new SorReturn(-1) ;
      assertEquals( "Error", sr.errType ) ; 
   }

   @Test 
   public void test6() {
      SorReturn sr = new SorReturn(1) ;
      assertEquals("Warn " , sr.errType) ; 
   }



}


