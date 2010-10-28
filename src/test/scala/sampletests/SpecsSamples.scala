package sampletests

import org.specs._

// http://code.google.com/p/specs/wiki/QuickStart
class SpecsSamples extends Specification {
  "hello world" should {
    "have 11 characters" in {
      "hello world".size must be equalTo(11)
    }
    "match 'h.* w.*'" in {
      "hello world" must be matching("h.* w.*")
    }
  }
}

