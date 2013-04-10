package com.github.rabitarochan.tuplex

class Tuple20Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](val value: Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]) extends AnyVal {

  def ::[A](a: A): Tuple21[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
  (a, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20)

  def +:[A](a: A): Tuple21[A, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = ::(a)

  def :+[A](a: A): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, A] =
(value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20, a)


  def :::[T21](
    t: Tuple1[T21]
  ): Tuple21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (t._1, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20)

  def :::[T21, T22](
    t: Tuple2[T21, T22]
  ): Tuple22[T21, T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    (t._1, t._2, value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20)


  def ++[T21](
    t: Tuple1[T21]
  ): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20, t._1)

  def ++[T21, T22](
    t: Tuple2[T21, T22]
  ): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20, t._1, t._2)


  def size: Int = 20

  def head: T1 = value._1

  def last: T20 = value._20

  def tail: Tuple19[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
  (value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19, value._20)

  def init: Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
  (value._1, value._2, value._3, value._4, value._5, value._6, value._7, value._8, value._9, value._10, value._11, value._12, value._13, value._14, value._15, value._16, value._17, value._18, value._19)

  def map[A](f: Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] => A): A = f(value)

}
