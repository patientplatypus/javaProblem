# Currently getting the following errors:

`patientplatypus:~/Documents/springPlay:12:53:39$./run.sh`
`[INFO] Scanning for projects...`
`[INFO] `
`[INFO] -----------------------< hdepot.com:springPlay >------------------------`
`[INFO] Building springPlay 0.0.1-SNAPSHOT`
`[INFO] --------------------------------[ jar ]---------------------------------`
`[INFO] `
`[INFO] --- maven-resources-plugin:3.0.1:resources (default-resources) @ `springPlay ---`
`[INFO] Using 'UTF-8' encoding to copy filtered resources.`
`[INFO] Copying 1 resource`
`[INFO] Copying 0 resource`
`[INFO] `
`[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ springPlay ---`
`[INFO] Changes detected - recompiling the module!`
`[INFO] Compiling 3 source files to /Users/patientplatypus/Documents/springPlay/target/classes`
`[INFO] -------------------------------------------------------------`
`[ERROR] COMPILATION ERROR : `
`[INFO] -------------------------------------------------------------`
`[ERROR] /Users/patientplatypus/Documents/springPlay/src/main/java/hdepot/com/springPlay/REST/SpringPlayREST.java:[22,39] cannot find symbol`
`  symbol:   method adder(int,int)`
`  location: class hdepot.com.springPlay.SpringPlayREST.SpringPlayServices`
`[INFO] 1 error`
`[INFO] -------------------------------------------------------------`
`[INFO] ------------------------------------------------------------------------`
`[INFO] BUILD FAILURE`
`[INFO] ------------------------------------------------------------------------`
`[INFO] Total time: 1.884 s`
`[INFO] Finished at: 2018-04-28T12:56:00-05:00`
`[INFO] ------------------------------------------------------------------------`
`[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.7.0:compile (default-compile) on project springPlay: Compilation failure`
`[ERROR] /Users/patientplatypus/Documents/springPlay/src/main/java/hdepot/com/springPlay/REST/SpringPlayREST.java:[22,39] cannot find symbol`
`[ERROR]   symbol:   method adder(int,int)`
`[ERROR]   location: class hdepot.com.springPlay.SpringPlayREST.SpringPlayServices`
`[ERROR] `
`[ERROR] -> [Help 1]`
`[ERROR] `
`[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.`
`[ERROR] Re-run Maven using the -X switch to enable full debug logging.`
`[ERROR] `
`[ERROR] For more information about the errors and possible solutions, please read the following articles:`
`[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException`
