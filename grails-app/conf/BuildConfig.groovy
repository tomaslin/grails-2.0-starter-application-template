grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()

        // uncomment these to enable remote dependency resolution from public Maven repositories
        //mavenCentral()
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.16'
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.1"
        runtime ":resources:1.1.5"
		

		// Utility
		compile ":quartz:0.4.2"
		compile ":mail:1.0"
		compile ":codenarc:0.16.1"
        

		// Testing
		compile ":remote-control:1.2"
		compile ":functional-test-development:0.2"
		compile ":fixtures:1.1"
		compile ":geb:0.6.2"
		compile ":spock:0.6-SNAPSHOT"
		

		// Spring Security 
		compile ":spring-security-core:1.2.7.1"
		compile ":spring-security-appinfo:1.0"
		compile ":spring-security-ui:0.1.2"
		compile ":jquery-ui:1.8.2.3"
        compile ":famfamfam:1.0"

        build ":tomcat:$grailsVersion"
    }
}
