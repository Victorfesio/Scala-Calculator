import scala.io.StdIn.readLine

def add(el1: Double, el2: Double): Double = {
  el1 + el2
}

def subtrac(d: Double, d1: Double): Double = {
  d - d1
}

def multiply(d: Double, d1: Double): Double = {
  d * d1
}

def divide(d: Double, d1: Double): Double = {
  if(d1 == 0) 0
  else if (d == 0) 0
  else d/d1
}


@main def iniciar(): Unit = {
  println("The calculator")
  var stop = false
  while(!stop) {
    val operation = readLine("Introduce the type of operation you want or exit to exit the operations: ") //readLine te pide poner texto por teclado desde la terminal como un cin en c++ y guardara de base un string
    if(operation.toLowerCase != "exit") {
      val firstn = readLine("Introduce the first number: ").toDouble // Si pones un .toDouble convertira el numero de string a double o si lo quieres poner en int le cascas un .toInt
      val secondn = readLine("Introduce the second number: ").toDouble

      val calculate = operation match { //Match hace lo mismo que un switch pero se ve mas bonito
        case "+" => add(firstn, secondn)
        case "-" => subtrac(firstn, secondn)
        case "*" => multiply(firstn, secondn)
        case "/" => divide(firstn, secondn)
        case _ => "Invalid type of operation."
      }

      println("The result of the operation is: " + calculate)
    }else{
      stop = true
    }
  }
}

