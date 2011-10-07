package codebreaker

import scala.util.Random
import cuke4duke.{EN, ScalaDsl}
import org.scalatest.matchers.ShouldMatchers

class CodeBreakerSteps extends ScalaDsl with EN with ShouldMatchers {
  
  var marker: CodeBreaker = _
  
  Given("""^the secret "(.*)"$""") { secret: String =>
    marker = new CodeBreaker(secret)
  }
  
  When("""^I guess "(.*)"$""") { guess: String =>

  }

  Then ("""^I should get "(.*)"$""") { mark: String =>

  }

}

