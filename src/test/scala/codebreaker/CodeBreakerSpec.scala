package codebreaker

import org.specs2.mutable._
import org.specs2.specification._

class CodeBreakerSpec extends Specification {
  
  trait context extends Scope {
    val game = new CodeBreaker("r y g b")
  }

  "The Code Breaker" should {

    "do someting" in new context {
      // your tests here
    }

  }

}