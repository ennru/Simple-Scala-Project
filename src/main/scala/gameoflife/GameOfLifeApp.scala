package gameoflife

import swing._
import event._
import scala.util.Random

/**
 * @see http://blog.james-carr.org/2010/09/29/friday-scala-kata-conways-game-of-life/
 * @author James Carr
 */
object GameOfLifeApp extends SimpleSwingApplication {

  import event.Key._
  import java.awt.{Dimension, Graphics2D, Graphics, Image, Rectangle}
  import java.awt.{Color => AWTColor}
  import java.awt.event.{ActionEvent}
  import javax.swing.{Timer => SwingTimer, AbstractAction}

  val BOARD_SIZE = (50,25)  
  val random = new Random()
  
  var game = new Game(BOARD_SIZE._2, BOARD_SIZE._1, Set.empty)
  
  override def top = frame
  val frame = new MainFrame {
    title = "Conway's Game of Life"
    contents = new FlowPanel{
      background = AWTColor.white
      preferredSize = new Dimension(1200, 700)
      val randomize = new Button("Randomize")
      val start = new Button("Start")
      val stop = new Button("Stop")
      val tick = new Button("Tick")
      
      contents.append(mainPanel, randomize, start, stop, tick)
      listenTo(randomize, start, stop, tick)
      reactions += {
        case ButtonClicked(`randomize`) => randomFill
        case ButtonClicked(`start`) => timer.start
        case ButtonClicked(`stop`) => timer.stop
        case ButtonClicked(`tick`) => tickIt
      }
    }
    lazy val mainPanel = new Panel() {
      focusable = true
      background = AWTColor.white
      preferredSize = new Dimension(1200, 600)

      override def paint(g: Graphics2D) {
        g.setColor(AWTColor.white)
        g.fillRect(0, 0, size.width, size.height)
        onPaint(g)
      }
    } // new Panel()
  def onPaint(g: Graphics2D) {
    val CELL_SIZE: Int = 20
    val CELL_MARGIN: Int = 1
    val darkRed = new AWTColor(200, 100, 100)

    def buildRect(p: (Int,Int), board: Board): Rectangle =
      new Rectangle(p._1 * (CELL_SIZE + CELL_MARGIN) + board.pos._1,
        (board.size._2 - p._2 - 1) * (CELL_SIZE + CELL_MARGIN) + board.pos._2,
        CELL_SIZE,
        CELL_SIZE)

    def drawBoard(board: Board) {
      g.setColor(AWTColor.gray)

      board.coordinates.
        foreach(p => g draw buildRect(p, board))

      board.cells.foreach(g fill buildRect(_, board))
    }

    drawBoard(board)
  }
  def randomFill {
    board = board.randomFill(BOARD_SIZE._1*5)
    game = new Game(BOARD_SIZE._2, BOARD_SIZE._1, board.cells)
    repaint()
  }
  def tickIt {
	game.tick
    board = new Board(BOARD_SIZE, BOARD_SIZE, game.getLivingCells)
    repaint()
  }
  var board = new Board(BOARD_SIZE, BOARD_SIZE)
  val timer = new SwingTimer(100, new AbstractAction() {
      override def actionPerformed(e: ActionEvent) {
        tickIt
      }
    })
  } // def top new MainFrame
} // object App

class Board(
  val size: (Int,Int),
  val pos: (Int,Int),
  val cells: Set[(Int,Int)]
) {
  def this(size: (Int,Int),pos: (Int,Int)) = {
    this(size, pos, Set.empty)
  }
  def coordinates =
    for (y <- 0 until size._2; x <- 0 until size._1)
      yield(x, y)
  
  def +(cell:Tuple2[Int,Int]) = new Board(size, pos, cells+cell)

  def randomFill(n:Int) = {
    val random = new Random
    var cells:Set[Tuple2[Int,Int]] = Set.empty
    for(x <- 0 until n)
      cells += ((random.nextInt(size._1), random.nextInt(size._2)))
    new Board(size, pos, cells)
  }
  def clear() =
    new Board(size, pos)
}
