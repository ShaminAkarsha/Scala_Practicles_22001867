import scala.io.StdIn.readLine

object studentManage{

    def getStudentInfo() = {
        val name = readLine("Student's name: ").strip()
        val marks = readLine("Mark: ").toInt
        val totPMarks = readLine("Total possible mark: ").toInt
        var stuRecord = (name, marks, totPMarks)
        stuRecord = getStudentInfoWithRetry(stuRecord)
        val presentage = (marks/totPMarks.toDouble) * 100
        var gread = 'C'
        presentage match {
            case presentage if presentage >= 90 => gread = 'A'
            case presentage if presentage >= 70 => gread = 'B'
            case presentage if presentage >= 50 => gread = 'C'
            case _ => gread = 'D'
        }
        (name, marks, presentage, gread)
    }

    def getStudentInfoWithRetry( sRecord :(String, Int, Int)) = {
        var stuRecord = sRecord
        var validility = validateInput(stuRecord)
        while(!validility._1){
            println(validility._2)
            if(!validility._1){
                val name = readLine("Student's name: ").strip()
                val marks = readLine("Mark: ").toInt
                val totPMarks = readLine("Total possible mark: ").toInt
                stuRecord = (name, marks, totPMarks)
            }
            validility = validateInput(stuRecord)
        }
        println(validility._2)
        stuRecord
    }

    def validateInput(stuRecord :(String, Int, Int)) = {
        var valdility:(Boolean, String) = (false, "Validation incomplete")
        if(stuRecord._1 == ""){
            valdility = (false, "Empty Name!")
        }else if(stuRecord._2 < 0 || stuRecord._2 > stuRecord._3){
            valdility = (false, "Invalid marks")
        }else{
            valdility = (true, "Validation completed")
        }
        valdility
    }

    def printStudentRecord(studentList: List[(String, Int, Double, Char)]): Unit = {
        for(student <- studentList){
            println(s"Name      : ${student._1}")
            println(s"Marks     : ${student._2}")
            println(s"Presentage: ${student._3}")
            println(s"Grade     : ${student._4}\n")
        }
    }

    def main(args: Array[String]) = {
        var input = true
        var studentList: List[(String, Int, Double, Char)] = List()
        while(input){
            studentList = studentList :+  getStudentInfo()
            if(readLine("Continue (1)? ") != "1"){
                input = false
            }
        }
        printStudentRecord(studentList)

    }
}