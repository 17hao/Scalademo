package helloscala.redis

import akka.actor.ActorSystem
import redis.RedisClient

import scala.concurrent.ExecutionContext.Implicits.global

object Client extends App {
  implicit val akkaSystem: ActorSystem = akka.actor.ActorSystem()
  val client = RedisClient()
  println("Ping sent!")
  client.ping().map(pong => println(s"Redis replied with $pong"))
}