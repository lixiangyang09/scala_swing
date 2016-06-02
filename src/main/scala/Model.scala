/**
  * Created by Administrator on 2016/6/2.
  */
class Model(val height:Int, val width:Int) {
  case class Cell(row:Int, column:Int)

  val cells = Array.ofDim[Cell](height,width)//new Array[Array[Cell]](height, width)

  for (i <- 0 until height; j <- 0 until width)
    cells(i)(j) = new Cell(i,j)
}
