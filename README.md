# S.OR.L
Solution ORchestration Language

History:
   - Started working on OneBld tool (Using TACL) for NonStop Builds at HP Bangalore in 2003
   - Developed OneBld tool using Perl on Windows to perform completely Automated build using Telnet in 2005
   - Designed OneBld to be as a Orchestration Driver using instruction files in 2007
   - Enhanced the design to be more robust and secure using Linux SSH ( Removed Telnet ) in 2011, names SmartInstaller
   - Completely Revamped and Disgn and Developed using Java in Ellucian to support Banner Upgrade process.
   
Objective:
This is to design and develop S.OR.L (now on SORL) using Java/Groovy or Go-lang as a solution to drive the ORchecstration and automate any-to-any. Tools which are similar are Chef, Ansible and other automation tools.

The only, the mostly, advantage is you don't have to learn any new language, Markup or databases/sql. This is all about Digitization of an Engineer working at a computer. Thought SORL ends with Language, but this is something you have already using in your day-in-day-out, i.e, all OS commands.
<p>
Example:

  .Wait #
  sudo yum install httpd -y
  service httpd start
  #
  .Wait $
  su - user
  #
  (.Wait $) {
      sudo yum install httpd -y
      service httpd start
  }
  # 
  (.Wait SQL>) {
      sftp -o IdentityFile=your.pem user@ipaddress
      cd /tmp
      put your.zip
      exit(.Wait $)
  }
  #
  .Include your.sorl
  #
  .task1
  #
  .If <Condition> {
     (.Wait $) {
        scp file google.drive.com:/dirve/image
        echo $?
        ls -ltr
     }
  }
  #
  
</p>
