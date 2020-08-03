package scalapb

import com.github.phisgr.gatling.grpc.Predef._
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.grpc.ManagedChannelBuilder
import io.grpc.health.v1.health.{HealthCheckRequest, HealthGrpc}

/**
 * Created by docker on 7/31/20.
 */
class TestGRPC extends Simulation{

  val grpcConf = grpc(ManagedChannelBuilder.forAddress("photoslibrary.googleapis.com",443))



  private val scenario1 = scenario("Computer Database")
  .exec(
    grpc("request_1")
      .rpc(HealthGrpc.METHOD_CHECK)
      .payload(HealthCheckRequest.defaultInstance)
  )
  //4.Simulation definition
  setUp(
    scenario1.inject(
      atOnceUsers(1)
      // rampUsers(5) during (5 seconds)
    )
    // users.inject(rampUsers(10) during (10 seconds)
  ).protocols(grpcConf)


}
