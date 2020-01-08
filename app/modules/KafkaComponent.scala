package modules

import com.typesafe.config.Config
import javax.inject.Inject
import play.api.Environment
import play.api.inject.ApplicationLifecycle

trait KafkaComponent {

}


class KafkaComponentImpl @Inject()(lifecycle: ApplicationLifecycle,
                                   config: Config,
                                   environment: Environment) extends KafkaComponent {

}
