package com.github.rabitarochan.tuplex

class Tuple5Ops[T1, T2, T3, T4, T5](val value: Tuple5[T1, T2, T3, T4, T5]) extends AnyVal {

  def ::[A](a: A): Tuple6[A, T1, T2, T3, T4, T5] =
  (a, value._1, value._2, value._3, value._4, value._5)

  def +:[A](a: A): Tuple6[A, T1, T2, T3, T4, T5] = ::(a)

  def :+[A](a: A): Tuple6[T1, T2, T3, T4, T5, A] =
(value._1, value._2, value._3, value._4, value._5, a)


  def :::[T6](
    t: Tuple1[T6]
  ): Tuple6[T6, T1, T2, T3, T4, T5] =
    (t._1, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7](
    t: Tuple2[T6, T7]
  ): Tuple7[T6, T7, T1, T2, T3, T4, T5] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8](
    t: Tuple3[T6, T7, T8]
  ): Tuple8[T6, T7, T8, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9](
    t: Tuple4[T6, T7, T8, T9]
  ): Tuple9[T6, T7, T8, T9, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10](
    t: Tuple5[T6, T7, T8, T9, T10]
  ): Tuple10[T6, T7, T8, T9, T10, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11](
    t: Tuple6[T6, T7, T8, T9, T10, T11]
  ): Tuple11[T6, T7, T8, T9, T10, T11, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12](
    t: Tuple7[T6, T7, T8, T9, T10, T11, T12]
  ): Tuple12[T6, T7, T8, T9, T10, T11, T12, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13](
    t: Tuple8[T6, T7, T8, T9, T10, T11, T12, T13]
  ): Tuple13[T6, T7, T8, T9, T10, T11, T12, T13, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t: Tuple9[T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ): Tuple14[T6, T7, T8, T9, T10, T11, T12, T13, T14, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t: Tuple10[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  ): Tuple15[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t: Tuple11[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ): Tuple16[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t: Tuple12[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple13[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple14[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple15[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple16[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, value._1, value._2, value._3, value._4, value._5)

  def :::[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple17[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T1, T2, T3, T4, T5] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, value._1, value._2, value._3, value._4, value._5)


  def ++[T6](
    t: Tuple1[T6]
  ): Tuple6[T1, T2, T3, T4, T5, T6] =
    (value._1, value._2, value._3, value._4, value._5, t._1)

  def ++[T6, T7](
    t: Tuple2[T6, T7]
  ): Tuple7[T1, T2, T3, T4, T5, T6, T7] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2)

  def ++[T6, T7, T8](
    t: Tuple3[T6, T7, T8]
  ): Tuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3)

  def ++[T6, T7, T8, T9](
    t: Tuple4[T6, T7, T8, T9]
  ): Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4)

  def ++[T6, T7, T8, T9, T10](
    t: Tuple5[T6, T7, T8, T9, T10]
  ): Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5)

  def ++[T6, T7, T8, T9, T10, T11](
    t: Tuple6[T6, T7, T8, T9, T10, T11]
  ): Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6)

  def ++[T6, T7, T8, T9, T10, T11, T12](
    t: Tuple7[T6, T7, T8, T9, T10, T11, T12]
  ): Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13](
    t: Tuple8[T6, T7, T8, T9, T10, T11, T12, T13]
  ): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t: Tuple9[T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ): Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t: Tuple10[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  ): Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t: Tuple11[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  ): Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t: Tuple12[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ): Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t: Tuple13[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t: Tuple14[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple15[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple16[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16)

  def ++[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple17[T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17)


  def size: Int = 5

  def head: T1 = value._1

  def last: T5 = value._5

  def tail: Tuple4[T2, T3, T4, T5] =
  (value._2, value._3, value._4, value._5)

  def init: Tuple4[T1, T2, T3, T4] =
  (value._1, value._2, value._3, value._4)

  def map[A](f: Tuple5[T1, T2, T3, T4, T5] => A): A = f(value)

}
