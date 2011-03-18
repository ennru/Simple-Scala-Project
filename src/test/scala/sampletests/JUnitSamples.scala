package sampletests

import org.junit.Test
import org.junit.Assert._
import org.hamcrest.CoreMatchers._

// http://junit.sourceforge.net/doc/cookbook/cookbook.htm
class JUnitSamples {
  @Test def simpleAdd() {
    val m12CHF = new Money(12, "CHF")
    val m14CHF = new Money(14, "CHF")
    val expected = new Money(26, "CHF")
    val result = m12CHF.add(m14CHF)
    assertThat(result, is(expected))
  }
}
