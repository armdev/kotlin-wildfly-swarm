package org.wildfly.swarm.examples.kotlin

import org.jboss.shrinkwrap.api.ShrinkWrap
import org.wildfly.swarm.container.Container
import org.wildfly.swarm.jaxrs.JAXRSArchive


fun main(args: Array<String>) {
    val container = Container()
    

//    mvn package && java -jar ./target/kotlin-wildfly-swarm.jar
 //  run 
  //  mvn wildfly-swarm:run


    
    val deployment = ShrinkWrap.create(JAXRSArchive::class.java, "kotlin-wildfly.war")
    deployment.addClass(KotlinResource::class.java)
    deployment.addAllDependencies()
    container.start().deploy(deployment)
}