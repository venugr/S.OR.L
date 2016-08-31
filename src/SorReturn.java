/*
   SorReturn
*/

package org.sor.utils ;

public class SorReturn {

   public int errNum ;
   public String errType ;
   public String errMessage ;
   public Object returnObj ;

   public SorReturn() {
      errNum = 0 ;
      errType = "Ok" ;
      errMessage = "" ;
      returnObj  = null ;
   }

   public SorReturn( Object ro ) {
      errNum = 0 ;
      errType = "Ok" ;
      errMessage = "" ;
      returnObj  = ro ;
   }

   public SorReturn( int errNum ) {
      this.errNum = errNum ;
      errType = "Ok" ;
      errMessage = "" ;
      returnObj  = null ;
      
      if ( errNum == -1 ) { errType = "Error" ; }
      if ( errNum ==  1 ) { errType = "Warn " ; }
   }

   public SorReturn ( int errNum, String errMessage ) {
      this ( errNum ) ;
      this.errMessage = errMessage ;
   }

   public void setErrNum       ( int errNum )        { this.errNum = errNum ;         }
   public void setErrType      ( String errType )    { this.errType = errType ;       }
   public void setErrMessage   ( String errMessage ) { this.errMessage = errMessage ; }
   public void setReturnObject ( Object returnObj )  { this.returnObj = returnObj ;   }
   
   public int    getErrNum       ( ) { return errNum ;     }
   public String getErrType      ( ) { return errType ;    }
   public String getErrMessage   ( ) { return errMessage ; }
   public Object getReturnObject ( ) { return returnObj ;  }

}
