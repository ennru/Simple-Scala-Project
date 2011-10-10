package minesweeper

import org.specs2.mutable._

// http://etorreborre.github.com/specs2/guide/org.specs2.guide.Matchers.html#Matchers+guide
class MinesweeperSpec extends Specification {
  
  // sample specs2 specification
  "empty mine field" should {
	  "have 0 mines close" in {
		  new MineField("").reveal must be equalTo("")
	  }
  }
  
  
  
  
  

  // acceptance tests
  "4x4 field should show 2 mines" in {
	  new MineField("""*...
....
.*..
....""").reveal must be equalTo("""*100
2210
1*10
1110""")
  }.pendingUntilFixed("when you implemented MineSweeper")
  
  
  "3x5 field should show 2 mines" in {
	  new MineField("""**...
.....
.*...""").reveal must be equalTo("""**100
33200
1*100""")
  }.pendingUntilFixed("when you implemented MineSweeper")

}