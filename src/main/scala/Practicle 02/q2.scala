/* 
2. Use the following declaration and initialization to convert them to
acceptable Scala statements.
int a = 2, b = 3, c = 4, d = 5;
float k = 4.3f;

and evaluate the following expressions
a) println( - -b * a + c *d - -);
b) println(a++);
c) println (–2 * ( g – k ) +c);
d) println (c=c++);
e) println (c=++c*a++);
 */

object q22 extends App {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var g = 0 // assumption since there are no variable named g
    var k = 4.3f

    // Evaluation
    b-=1
    val exprA = b*a+c*d
    d-=1
    val exprB = a
    a+=1
    val exprC = -2 * (g-k) + c 
    val exprD = c
    c+=1
    c+=1
    val exprE = c*a
    a+=1

    println( s"--b * a + c *d-- = $exprA ")
    println(s"++a = $exprB");
    println (s"-2 * ( g - k ) +c = $exprC")
    println (s"c++ = $exprD")
    println (s"++c*a++ = $exprE")
    



}