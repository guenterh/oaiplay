package modules

import java.util
import java.util.Map

import com.typesafe.config.{Config, ConfigObject, ConfigValue}
import javax.inject.Inject
import org.apache.solr.client.solrj.impl.HttpSolrClient
import org.apache.solr.client.solrj.{SolrClient, SolrRequest, SolrResponse}
import org.apache.solr.common.util.NamedList
import play.api.Environment
import play.api.inject.ApplicationLifecycle

import scala.collection.mutable

//import collection.JavaConverters._
import scala.jdk.CollectionConverters._

trait SolrComponent {
  def execute(): SolrResponse
}



class SolrComponentImpl @Inject()(lifecycle: ApplicationLifecycle,
                                  config: Config,
                                  environment: Environment) extends SolrComponent {

  //https://stackoverflow.com/questions/53730828/retrieving-list-of-objects-from-application-conf


  private val l =  config.getConfigList("solr").asScala.map(f => {
    val p = f.entrySet().asScala
    val source = p.map(s => s.getKey -> s.getValue)
    val s = source.toSeq

    val s1 = config.getConfigList("solr").asScala.toSeq
    //s1.map(c => c.getValue())
    val h = s1.head.getValue("server").unwrapped()
    //source.

    println("blaaaaa")
    f
  }

  )

  config.getConfigList("solr").forEach(


    (o : Config) => {
       //(key -> new HttpSolrClient.Builder(value.asInstanceOf[Config].getString("server")))
      o.entrySet().iterator().forEachRemaining(

        c => {
          println(c.getKey)
          println(c.getValue.unwrapped())
        }

      )

      //val s: util.Map.Entry[String, ConfigValue] = o.entrySet().iterator().next();
      //val key = s.getKey
      //val value = s.getValue

      //println(s)
    }
  )
  //println(solrConfig)


  override def execute(): SolrResponse = ???

}
