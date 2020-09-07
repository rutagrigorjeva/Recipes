import java.io.FileWriter

object Recipes extends App {

  val srcName = "C:\\Users\\rutag\\IdeaProjects\\Recipes\\src\\main\\scala\\RecipesFull.txt"
  val dstName = "C:\\Users\\rutag\\IdeaProjects\\Recipes\\src\\main\\scala\\RecipesCut.txt"
  def openSource(fName:String) = {
    //actually get a real sequence of strings
    val filePointer = scala.io.Source.fromFile(srcName)
    val myLines = filePointer.getLines.toSeq

    filePointer.close()
    myLines
  }

  def processSeq(mySeq:Seq[String])= {
    //TODO actually do the assignment
    mySeq.filter(_.startsWith("    ")).filter(_.exists(_.isDigit))

    }



  def saveSeq(destName:String, newSeq:Seq[String]) = {
    println(s"Saving my Sequence to file $destName")
    newSeq.foreach(println) //we are good up to here
    val fw = new FileWriter(destName)
    newSeq.map(_ + "\n").foreach(fw.write) // adding new line to each line before writing
    fw.close()
  }

  //the actual program runs here, little tiny pipeline like a factory
  val mySeq = openSource(srcName)
  val filteredSeq = processSeq(mySeq)
  saveSeq(dstName,filteredSeq)
}
