import javax.management.relation.Relation
class Rational(x: Int, y: Int) {
  assert(y > 0, "denominator should be positive")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def this(x:Int) = this(x, 1)
  val numer = x / gcd(x, y)
  val demon = y / gcd(x, y)

  override def toString(): String = numer + "/" + demon
  def neg = new Rational(-this.numer, this.demon)
  def +(r: Rational) =
    new Rational(numer * r.demon + r.numer * demon, demon * r.demon)
  def -(r: Rational) = this + r.neg
  def *(r: Rational) = new Rational(numer * r.numer, demon * r.demon)

  def less(that: Rational) = numer * that.demon < that.numer * demon
  def max(that: Rational) = if (this.less(that)) that else this

}

object practical10 {
  def main(args: Array[String]) = {
    val r1 = new Rational(5, 20)
    println(r1)
    println(r1.neg)
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    println(x * z)
    println(x + y - z)
    println(new Rational(3))
  }
}
