package scalapb

import java.nio.file.Paths

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine extends App {

  val rootPath = Paths.get(".", "target/classes/").toAbsolutePath.toString()


  val properties = new GatlingPropertiesBuilder()
    .binariesDirectory(rootPath)
    .resultsDirectory(rootPath + "/results")
  Gatling.fromMap(properties.build)

}
