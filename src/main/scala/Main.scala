/**
  * Created by Administrator on 2016/6/2.
  */
import swing._
object Main extends SimpleSwingApplication{
    def top = new MainFrame{
      title = "ScalaSheet"
      contents = new Spreadsheet(100, 26)
    }
}
