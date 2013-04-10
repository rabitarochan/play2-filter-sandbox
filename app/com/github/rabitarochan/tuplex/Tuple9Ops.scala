package com.github.rabitarochan.tuplex

class Tuple9Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9](val value: Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) extends AnyVal {

  def ::[A](a: A): Tuple10[A, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
  (a, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def +:[A](a: A): Tuple10[A, T1, T2, T3, T4, T5, T6, T7, T8, T9] = ::(a)

  def :+[A](a: A): Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, A] =
(value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, a)


  def :::[T10](
    t: Tuple1[T10]
  ): Tuple10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11](
    t: Tuple2[T10, T11]
  ): Tuple11[T10, T11, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12](
    t: Tuple3[T10, T11, T12]
  ): Tuple12[T10, T11, T12, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13](
    t: Tuple4[T10, T11, T12, T13]
  ): Tuple13[T10, T11, T12, T13, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14](
    t: Tuple5[T10, T11, T12, T13, T14]
  ): Tuple14[T10, T11, T12, T13, T14, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15](
    t: Tuple6[T10, T11, T12, T13, T14, T15]
  ): Tuple15[T10, T11, T12, T13, T14, T15, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16](
    t: Tuple7[T10, T11, T12, T13, T14, T15, T16]
  ): Tuple16[T10, T11, T12, T13, T14, T15, T16, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16, T17](
    t: Tuple8[T10, T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T10, T11, T12, T13, T14, T15, T16, T17, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple9[T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T10, T11, T12, T13, T14, T15, T16, T17, T18, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple10[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple11[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple12[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def :::[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple13[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)


  def ++[T10](
    t: Tuple1[T10]
  ): Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1)

  def ++[T10, T11](
    t: Tuple2[T10, T11]
  ): Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2)

  def ++[T10, T11, T12](
    t: Tuple3[T10, T11, T12]
  ): Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3)

  def ++[T10, T11, T12, T13](
    t: Tuple4[T10, T11, T12, T13]
  ): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4)

  def ++[T10, T11, T12, T13, T14](
    t: Tuple5[T10, T11, T12, T13, T14]
  ): Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5)

  def ++[T10, T11, T12, T13, T14, T15](
    t: Tuple6[T10, T11, T12, T13, T14, T15]
  ): Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6)

  def ++[T10, T11, T12, T13, T14, T15, T16](
    t: Tuple7[T10, T11, T12, T13, T14, T15, T16]
  ): Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7)

  def ++[T10, T11, T12, T13, T14, T15, T16, T17](
    t: Tuple8[T10, T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8)

  def ++[T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple9[T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9)

  def ++[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple10[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10)

  def ++[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple11[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11)

  def ++[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple12[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12)

  def ++[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple13[T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13)


  def size: Int = 9

  def head: T1 = value._1

  def last: T9 = value._9

  def tail: Tuple8[T2, T3, T4, T5, T6, T7, T8, T9] =
  (value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9)

  def init: Tuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
  (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8)

  def map[A](f: Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] => A): A = f(value)

}
