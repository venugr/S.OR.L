/*

   SorHost: 

*/

package org.sor.main ;

import org.sor.utils.* ;

public class SorHost {


   private String sorName = "" ;
   private String hostName = "" ;
   private String hostIp   = "" ;
   private String hostUser = "" ;

   private String hostSshPort = "22" ;

   private String hostUserPassword = "NA" ;
   private String hostSshKeyFile = "NA" ;
  
     
   private String[] hostGroup = null;

   public SorHost() { }
 
   public SorHost ( String sorName, String hostName, String hostIp, String hostUser ) {

      this.sorName  = sorName  ;
      this.hostName = hostName ;
      this.hostIp   = hostIp   ;
      this.hostUser = hostUser ;

   }

   public SorHost ( String sorName, String hostName, String hostIp, String[] hostGroup ) {
      this(sorName, hostName, hostIp, "root", hostGroup ) ;
   }

   public SorHost ( String sorName, String hostName, String hostIp, String hostUser, String[] hostGroup ) {
      this(sorName, hostName, hostIp, hostUser ) ;
      this.hostGroup = hostGroup ;
   }

   public void setPassword   ( String password   ) { hostUserPassword = password   ; }
   public void setSshPort    ( String sshport    ) { hostSshPort      = sshport    ; }
   public void setSshKeyFile ( String sshkeyfile ) { hostSshKeyFile   = sshkeyfile ; }

}
