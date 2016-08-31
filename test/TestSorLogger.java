package org.sor.test ; 

import org.sor.utils.SorReturn ;
import static org.junit.Assert.*;
import org.junit.Test ;
import org.sorl.sor.utils.SorLogger ;


public class TestSorLogger {

   @Test
   public void test1() {

      SorLogger sl = new SorLogger() ;
      sl.cmdLog.append("Something") ; 
      assertEquals( "Something" , sl.cmdLog.toString() ) ;
   }

   @Test 
   public void test2() {

     SorLogger.blkLog.append("Block") ;
     assertEquals("Block",SorLogger.blkLog.toString() ) ; 
   }

   @Test
   public void test3() {

      SorLogger.glbLog.append("Global") ;
      assertEquals("Global",SorLogger.glbLog.toString() ) ;
   }

   @Test
   public void test4() {

      SorLogger.print("Append1") ;
      assertEquals("SomethingAppend1",SorLogger.cmdLog.toString() ) ;
   }

   @Test
   public void test5() {

      SorLogger.print("Append2") ;
      assertEquals("BlockAppend1Append2",SorLogger.blkLog.toString() ) ;
   }

   @Test
   public void test6() {

      SorLogger.print("Append3") ;
      assertEquals("GlobalAppend1Append2Append3",SorLogger.glbLog.toString() ) ;
   }
}










