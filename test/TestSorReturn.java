
package org.sor.test ;
import org.sor.utils.SorReturn ;
import static org.junit.Assert.*;
import org.junit.Test ;


public class TestSorReturn {

   @Test 
   public void test1() {

      SorReturn sr = new SorReturn() ;
      assertEquals( 0 , sr.errNum ) ;
   }



}


