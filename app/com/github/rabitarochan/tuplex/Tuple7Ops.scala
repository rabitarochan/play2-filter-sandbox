package com.github.rabitarochan.tuplex

class Tuple7Ops[T1, T2, T3, T4, T5, T6, T7](val value: Tuple7[T1, T2, T3, T4, T5, T6, T7]) extends AnyVal {

  def ::[A](a: A): Tuple8[A, T1, T2, T3, T4, T5, T6, T7] =
  (a, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def +:[A](a: A): Tuple8[A, T1, T2, T3, T4, T5, T6, T7] = ::(a)

  def :+[A](a: A): Tuple8[T1, T2, T3, T4, T5, T6, T7, A] =
(value._1, value._2, value._3, value._4, value._5, value._6, value._7, a)


  def :::[T8](
    t: Tuple1[T8]
  ): Tuple8[T8, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9](
    t: Tuple2[T8, T9]
  ): Tuple9[T8, T9, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10](
    t: Tuple3[T8, T9, T10]
  ): Tuple10[T8, T9, T10, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11](
    t: Tuple4[T8, T9, T10, T11]
  ): Tuple11[T8, T9, T10, T11, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12](
    t: Tuple5[T8, T9, T10, T11, T12]
  ): Tuple12[T8, T9, T10, T11, T12, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13](
    t: Tuple6[T8, T9, T10, T11, T12, T13]
  ): Tuple13[T8, T9, T10, T11, T12, T13, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14](
    t: Tuple7[T8, T9, T10, T11, T12, T13, T14]
  ): Tuple14[T8, T9, T10, T11, T12, T13, T14, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15](
    t: Tuple8[T8, T9, T10, T11, T12, T13, T14, T15]
  ): Tuple15[T8, T9, T10, T11, T12, T13, T14, T15, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t: Tuple9[T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ): Tuple16[T8, T9, T10, T11, T12, T13, T14, T15, T16, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t: Tuple10[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple11[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple12[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple13[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple14[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, value._1, value._2, value._3, value._4, value._5, value._6, value._7)

  def :::[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple15[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T1, T2, T3, T4, T5, T6, T7] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, value._1, value._2, value._3, value._4, value._5, value._6, value._7)


  def ++[T8](
    t: Tuple1[T8]
  ): Tuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1)

  def ++[T8, T9](
    t: Tuple2[T8, T9]
  ): Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2)

  def ++[T8, T9, T10](
    t: Tuple3[T8, T9, T10]
  ): Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3)

  def ++[T8, T9, T10, T11](
    t: Tuple4[T8, T9, T10, T11]
  ): Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4)

  def ++[T8, T9, T10, T11, T12](
    t: Tuple5[T8, T9, T10, T11, T12]
  ): Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5)

  def ++[T8, T9, T10, T11, T12, T13](
    t: Tuple6[T8, T9, T10, T11, T12, T13]
  ): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6)

  def ++[T8, T9, T10, T11, T12, T13, T14](
    t: Tuple7[T8, T9, T10, T11, T12, T13, T14]
  ): Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15](
    t: Tuple8[T8, T9, T10, T11, T12, T13, T14, T15]
  ): Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t: Tuple9[T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ): Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t: Tuple10[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple11[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple12[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple13[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple14[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14)

  def ++[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple15[T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15)


  def size: Int = 7

  def head: T1 = value._1

  def last: T7 = value._7

  def tail: Tuple6[T2, T3, T4, T5, T6, T7] =
  (value._2, value._3, value._4, value._5, value._6, value._7)

  def init: Tuple6[T1, T2, T3, T4, T5, T6] =
  (value._1, value._2, value._3, value._4, value._5, value._6)

  def map[A](f: Tuple7[T1, T2, T3, T4, T5, T6, T7] => A): A = f(value)

}
