/*

   SorLogger:

*/

package org.sorl.sor.utils ;

//import org.apache.log4j.Level ;
//import org.apache.log4j.Logger ;

public class SorLogger {

   public static StringBuilder cmdLog = new StringBuilder() ;
   public static StringBuilder blkLog = new StringBuilder() ;
   public static StringBuilder clrLog = new StringBuilder() ;
   public static StringBuilder glbLog = new StringBuilder() ;

   public static void print( String message ) {

      cmdLog.append( message ) ;
      blkLog.append( message ) ;
      clrLog.append( message ) ;
      glbLog.append( message ) ;

      System.out.println ( message ) ;

   }
 
}
