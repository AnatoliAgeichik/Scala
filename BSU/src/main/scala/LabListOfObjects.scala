//class Employee(firstName: String, secondName: String, var _salary: Float){
//  var salary: Float = _salary
//  val fullName: String = firstName + " " + secondName
//  override def toString: String = fullName
//
//}

case class Employee(firstName: String, secondName: String, var salary: Float)


object ClassExample extends App{

  def printEmployee(employee: Employee): Unit ={
    println(s"${employee.firstName} ${employee.secondName} earns ${employee.salary} a week")
  }


  val employees = List(
    Employee("Vasya", "Pupkin", 1000),
    Employee("Vasya", "Pupkin2", 1200),
    Employee("Vasya", "Pupkin3", 1100),
  )
  val sortedBySalary = employees.sortBy(_.salary)
  println(sortedBySalary)
  val filterBySalary = employees.filter(_.salary > 1000)
  println(filterBySalary)
  val result = employees.find(x => {x.salary > 1000})
  println(result)
  employees.map(x => printEmployee(x))

  val numberList = List(12, 32, 42, 11, 9, 38)
  val div = numberList.reduce((x, y) => x  - y)
  println(div)

}
