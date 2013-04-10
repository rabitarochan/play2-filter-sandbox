package com.github.rabitarochan.tuplex

class Tuple10Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](val value: Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) extends AnyVal {

  def ::[A](a: A): Tuple11[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
  (a, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def +:[A](a: A): Tuple11[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = ::(a)

  def :+[A](a: A): Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, A] =
(value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, a)


  def :::[T11](
    t: Tuple1[T11]
  ): Tuple11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12](
    t: Tuple2[T11, T12]
  ): Tuple12[T11, T12, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13](
    t: Tuple3[T11, T12, T13]
  ): Tuple13[T11, T12, T13, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14](
    t: Tuple4[T11, T12, T13, T14]
  ): Tuple14[T11, T12, T13, T14, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15](
    t: Tuple5[T11, T12, T13, T14, T15]
  ): Tuple15[T11, T12, T13, T14, T15, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16](
    t: Tuple6[T11, T12, T13, T14, T15, T16]
  ): Tuple16[T11, T12, T13, T14, T15, T16, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16, T17](
    t: Tuple7[T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T11, T12, T13, T14, T15, T16, T17, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple8[T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T11, T12, T13, T14, T15, T16, T17, T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple9[T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T11, T12, T13, T14, T15, T16, T17, T18, T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple10[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple11[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def :::[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple12[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)


  def ++[T11](
    t: Tuple1[T11]
  ): Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1)

  def ++[T11, T12](
    t: Tuple2[T11, T12]
  ): Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2)

  def ++[T11, T12, T13](
    t: Tuple3[T11, T12, T13]
  ): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3)

  def ++[T11, T12, T13, T14](
    t: Tuple4[T11, T12, T13, T14]
  ): Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4)

  def ++[T11, T12, T13, T14, T15](
    t: Tuple5[T11, T12, T13, T14, T15]
  ): Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5)

  def ++[T11, T12, T13, T14, T15, T16](
    t: Tuple6[T11, T12, T13, T14, T15, T16]
  ): Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6)

  def ++[T11, T12, T13, T14, T15, T16, T17](
    t: Tuple7[T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6, t._7)

  def ++[T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple8[T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8)

  def ++[T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple9[T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9)

  def ++[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple10[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10)

  def ++[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple11[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11)

  def ++[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple12[T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12)


  def size: Int = 10

  def head: T1 = value._1

  def last: T10 = value._10

  def tail: Tuple9[T2, T3, T4, T5, T6, T7, T8, T9, T10] =
  (value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10)

  def init: Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
  (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def map[A](f: Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] => A): A = f(value)

}
