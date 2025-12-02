## Resources

Java 25 Documentation - https://docs.oracle.com/en/java/javase/25/

API Documentation: Inbuilt classes & packages
- https://docs.oracle.com/en/java/javase/25/docs/api/index.html

To check for version specific documentation - https://docs.oracle.com/en/java/javase/index.html

### Java installation on windows
1) JDK 25 is the latest **Long-Term Support (LTS)** release of the Java SE Platform.
   **LTS (Long Term Support)**
   - A version that will receive updates for many years
   LTS versions get:
     - Security updates
     - Bug fixes
     - Stability patches
     - Performance improvements
   for a long duration, usually 5–8 years (depending on the vendor).

   **Why is LTS important?**
   LTS versions are:
   - Stable
   - Reliable
   - Used in production
   - Supported for a long time
   Companies choose LTS because they don’t have to upgrade Java every 6 months.

   **Example in Java**
   Oracle releases a new Java version every 6 months, but only some versions are LTS.
   Recent LTS timeline:
   | Version     | Type           | Support     |
   | ----------- | -------------- | ----------- |
   | **Java 11** | LTS            | Until 2026+ |
   | **Java 17** | LTS            | Until 2029+ |
   | **Java 21** | LTS            | Until 2031+ |
   | **Java 25** | **LATEST LTS** | Until 2033+ |
    So **Java 25** will be supported for many years, while Java 22, 23, 24 are non-LTS (short support).

2) **Installation instructions**
   - Go to Java Downloads
     - Navigate to JDK 25 -> OS -> x64 MSI Installer
     - Once downloaded, Install as per the instructions
     Can also refer to https://docs.oracle.com/en/java/javase/25/install/overview-jdk-installation.html for JDK installation guide, more specific for windows refer this guide  https://docs.oracle.com/en/java/javase/25/install/installation-jdk-microsoft-windows-platforms.html
     - Set JAVA_HOME properly
     - Update PATH correctly - %JAVA_HOME%\bin
     - Verify
       java --version
       javac --version
       where java
