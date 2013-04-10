package com.github.rabitarochan.tuplex

class Tuple12Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](val value: Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]) extends AnyVal {

  def ::[A](a: A): Tuple13[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
  (a, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def +:[A](a: A): Tuple13[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = ::(a)

  def :+[A](a: A): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, A] =
(value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, a)


  def :::[T13](
    t: Tuple1[T13]
  ): Tuple13[T13, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14](
    t: Tuple2[T13, T14]
  ): Tuple14[T13, T14, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15](
    t: Tuple3[T13, T14, T15]
  ): Tuple15[T13, T14, T15, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16](
    t: Tuple4[T13, T14, T15, T16]
  ): Tuple16[T13, T14, T15, T16, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16, T17](
    t: Tuple5[T13, T14, T15, T16, T17]
  ): Tuple17[T13, T14, T15, T16, T17, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, t._5, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16, T17, T18](
    t: Tuple6[T13, T14, T15, T16, T17, T18]
  ): Tuple18[T13, T14, T15, T16, T17, T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, t._5, t._6, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16, T17, T18, T19](
    t: Tuple7[T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T13, T14, T15, T16, T17, T18, T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple8[T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T13, T14, T15, T16, T17, T18, T19, T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple9[T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T13, T14, T15, T16, T17, T18, T19, T20, T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def :::[T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple10[T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)


  def ++[T13](
    t: Tuple1[T13]
  ): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1)

  def ++[T13, T14](
    t: Tuple2[T13, T14]
  ): Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2)

  def ++[T13, T14, T15](
    t: Tuple3[T13, T14, T15]
  ): Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3)

  def ++[T13, T14, T15, T16](
    t: Tuple4[T13, T14, T15, T16]
  ): Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4)

  def ++[T13, T14, T15, T16, T17](
    t: Tuple5[T13, T14, T15, T16, T17]
  ): Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4, t._5)

  def ++[T13, T14, T15, T16, T17, T18](
    t: Tuple6[T13, T14, T15, T16, T17, T18]
  ): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4, t._5, t._6)

  def ++[T13, T14, T15, T16, T17, T18, T19](
    t: Tuple7[T13, T14, T15, T16, T17, T18, T19]
  ): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4, t._5, t._6, t._7)

  def ++[T13, T14, T15, T16, T17, T18, T19, T20](
    t: Tuple8[T13, T14, T15, T16, T17, T18, T19, T20]
  ): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8)

  def ++[T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t: Tuple9[T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9)

  def ++[T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t: Tuple10[T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10)


  def size: Int = 12

  def head: T1 = value._1

  def last: T12 = value._12

  def tail: Tuple11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
  (value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12)

  def init: Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
  (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11)

  def map[A](f: Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] => A): A = f(value)

}
