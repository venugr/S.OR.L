/*

   SorInventory: Read Inventory file and generates all the gropus, subgropus and hosts list.

*/

package org.sor.inventory ;

import java.io.BufferedReader ;
import java.io.FileReader ;
import java.util.ArrayList ;
import java.io.File ;
import java.io.FileNotFoundException ;
import java.io.IOException ;

import org.sor.utils.* ;

public class SorInventory {

   private String defInventory = "sorl.inventory" ;
   private String inventory    = null ;
   private ArrayList<String> inventoryFileInfo = null ;

   public SorInventory() {
      inventory = defInventory ;
   } 

   public SorInventory( String inventory ) { 

      this.inventory = inventory ;

   }

   public boolean load() {

      SorReturn sr = ReadTextFile ( inventory ) ;

      if ( sr.getErrNum() == -1 ) { 
         System.out.println ( "Error: " + sr.getErrMessage() ) ; 
         return false ;
      }

      inventoryFileInfo = ( ArrayList<String> )sr.getReturnObject() ;

      return true ;

   }

   public String getLine ( int lineNum ) {

      if ( inventoryFileInfo == null ) { return null ; } 
      if ( inventoryFileInfo.size() <= 0 ) { return null ; }
      if ( lineNum > inventoryFileInfo.size() ) { return null ; }

      return inventoryFileInfo.get ( lineNum ) ;

   }

   public SorReturn  ReadTextFile ( String fileName ) {

      ArrayList<String> al = null ;
      BufferedReader    br = null ;
      String          line = null ;

      File f = new File ( fileName ) ;

      if ( ! f.exists() ) { return new SorReturn( -1, "file '" + fileName + "' not found!" ) ;  }

      al = new ArrayList<String>() ;
      
      try {
         br = new BufferedReader ( new FileReader ( fileName ) );
         while ( ( line = br.readLine() ) != null ) { al.add ( line ) ; }
         br.close() ;
         br = null ;
      } catch ( FileNotFoundException fnfe ) {
         return new SorReturn ( -1, fnfe.getMessage() ) ;
      } catch ( IOException ioe ) {
         return new SorReturn ( -1, ioe.getMessage() ) ;
      } finally {
         try { if ( br != null ) { br.close() ; } } catch ( Exception e ) { }
      }

      return new SorReturn ( al ) ;

   } 

}
