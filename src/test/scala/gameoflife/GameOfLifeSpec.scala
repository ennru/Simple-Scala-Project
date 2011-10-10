package gameoflife

import org.specs2.mutable._

class GameOfLifeSpec extends Specification {

  "Dead cell with three neighbors" should {
    val game = new Game(3, 3, Set( (0,0), (0,2), (2,2)))
    
    game.tick
    
    "come to life" in {
      game.getLivingCells must contain( (1,1) )
    }.pendingUntilFixed("when you implemented Game Of Life")
  }  
}