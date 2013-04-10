package com.github.rabitarochan.tuplex

class Tuple17Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](val value: Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]) extends AnyVal {

  def ::[A](a: A): Tuple18[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
  (a, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)

  def +:[A](a: A): Tuple18[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = ::(a)

  def :+[A](a: A): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, A] =
(value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, a)


  def :::[T18](
    t: Tuple1[T18]
  ): Tuple18[T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (t._1, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)

  def :::[T18, T19](
    t: Tuple2[T18, T19]
  ): Tuple19[T18, T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)

  def :::[T18, T19, T20](
    t: Tuple3[T18, T19, T20]
  ): Tuple20[T18, T19, T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (t._1, t._2, t._3, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)

  def :::[T18, T19, T20, T21](
    t: Tuple4[T18, T19, T20, T21]
  ): Tuple21[T18, T19, T20, T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (t._1, t._2, t._3, t._4, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)

  def :::[T18, T19, T20, T21, T22](
    t: Tuple5[T18, T19, T20, T21, T22]
  ): Tuple22[T18, T19, T20, T21, T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    (t._1, t._2, t._3, t._4, t._5, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)


  def ++[T18](
    t: Tuple1[T18]
  ): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, t._1)

  def ++[T18, T19](
    t: Tuple2[T18, T19]
  ): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, t._1, t._2)

  def ++[T18, T19, T20](
    t: Tuple3[T18, T19, T20]
  ): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, t._1, t._2, t._3)

  def ++[T18, T19, T20, T21](
    t: Tuple4[T18, T19, T20, T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, t._1, t._2, t._3, t._4)

  def ++[T18, T19, T20, T21, T22](
    t: Tuple5[T18, T19, T20, T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, t._1, t._2, t._3, t._4, t._5)


  def size: Int = 17

  def head: T1 = value._1

  def last: T17 = value._17

  def tail: Tuple16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
  (value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17)

  def init: Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
  (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16)

  def map[A](f: Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] => A): A = f(value)

}
