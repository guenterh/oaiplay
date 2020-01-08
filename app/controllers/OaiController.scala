package controllers

import javax.inject.Inject
import modules.{KafkaComponent, SolrComponent}
import play.api.Configuration
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Rendering}

class OaiController @Inject()(cc: ControllerComponents,
                              config: Configuration,
                              kafka:KafkaComponent
                              ) extends AbstractController(cc) with Rendering {


  def listRecords(): Action[AnyContent] = Action { implicit request =>


    val test = " "
    Ok("hello oai listRecords")

  }


}
