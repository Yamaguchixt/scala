

def maxListUpBound[T <: Ordered[T]](elements: List[T]): T =
  elements match {
    case List() => throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: xs =>
      val tmpMax = maxListUpBound(xs)
      if (x > tmpMax) x
      else tmpMax
  }
  
// この定義だと、List[Int]を引数にとれない。IntはOrder[Int]のサブ型ではないから。
// そこで T => Ordered[T]の関数をimplicitで配置する。

def maxListImplicit[T](elements: List[T])(implicit orderer: T => Ordered[T]): T =
  elements match {
    case List() => throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: xs =>
      val tmpMax = maxListImplicit(xs)(orderer)  //2回使うからbindしとく
      if ( orderer(x) > tmpMax) x
      else tmpMax
}

//さらにこう書き直せる。
x > が orderer(x) > に
maxListImplicit(xs)にパラメータリスト(orderer)が追加される。

def maxListImplicit[T](elements: List[T])(implicit orderer: T => Ordered[T]): T =
  elements match {
    case List() => throw new IllegalArgumentException("empty list!")
    case List(x) => x
    case x :: xs =>
      val tmpMax = maxListImplicit(xs)  //2回使うからbindしとく
      if ( x > tmpMax) x
      else tmpMax
}
