
package org.sor.test ;

import org.sor.utils.* ;
import org.sor.inventory.* ;
import static org.junit.Assert.*;
import org.junit.Test ;


public class TestSorInventory {

   @Test 
   public void test1() {
      SorInventory si = new SorInventory() ;
      assertEquals ( true, si.load() ) ;
   }

   @Test 
   public void testFileContent() {
      SorInventory si = new SorInventory() ;
      assertEquals ( true, si.load() ) ;
      assertEquals ( true, si.getLine(0).contains( "Dheeru" ) ) ;
   }

   @Test 
   public void test2() {
      SorInventory si = new SorInventory() ;
      assertEquals ( true, si.load() ) ;
      assertEquals ("Hello Dheeru", si.getLine(0) ) ;
   }

   @Test 
   public void test3() {
      SorInventory si = new SorInventory("/tmp/test.inv") ;
      assertEquals ( true, si.load() ) ;
   }

   @Test 
   public void test4() {
      SorInventory si = new SorInventory("/tmp/test.inv") ;
      assertEquals ( true, si.load() ) ;
      assertEquals ("check for 333", si.getLine(3) ) ;
   }

   @Test 
   public void test5() {
      SorInventory si = new SorInventory("/tmp/test.inv") ;
      assertEquals ( true, si.load() ) ;
      assertEquals ( null, si.getLine(33) ) ;
   }

   @Test 
   public void test6() {
      SorInventory si = new SorInventory("/tmp/test.inv") ;
      assertEquals ( null, si.getLine(0) ) ;
   }

   @Test 
   public void test7() {
      SorInventory si = new SorInventory("/tmp/test.inv") ;
      assertNotEquals ( "", si.getLine(0) ) ;
   }

}
