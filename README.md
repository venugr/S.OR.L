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
Example:<br><br>

  .Wait #<br>
  sudo yum install httpd -y<br>
  service httpd start<br>
  #<br>
  .Wait $<br>
  su - user<br>
  #<br>
  (.Wait $) {<br>
      sudo yum install httpd -y<br>
      service httpd start<br>
  }<br>
  # <br>
  (.Wait SQL>) {<br>
      sftp -o IdentityFile=your.pem user@ipaddress<br>
      cd /tmp<br>
      put your.zip<br>
      exit(.Wait $)<br>
  }<br>
  #<br>
  .Include your.sorl<br>
  #<br>
  .task1<br>
  #<br>
  .If <Condition> {<br>
     (.Wait $) {<br>
        scp file google.drive.com:/dirve/image<br>
        echo $?<br>
        ls -ltr<br>
     }<br>
  }<br>
  #<br>
  <br>
</p><br>
<br>
