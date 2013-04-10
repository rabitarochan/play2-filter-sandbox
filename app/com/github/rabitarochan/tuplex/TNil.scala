package com.github.rabitarochan.tuplex

case object TNil {

  def ::[A](a: A): Tuple1[A] = Tuple1[A](a)

  def :::[T1](t: Tuple1[T1]): Tuple1[T1] = t

  def :::[T1, T2](t: Tuple2[T1, T2]): Tuple2[T1, T2] = t

  def :::[T1, T2, T3](t: Tuple3[T1, T2, T3]): Tuple3[T1, T2, T3] = t

  def :::[T1, T2, T3, T4](t: Tuple4[T1, T2, T3, T4]): Tuple4[T1, T2, T3, T4] = t

  def :::[T1, T2, T3, T4, T5](t: Tuple5[T1, T2, T3, T4, T5]): Tuple5[T1, T2, T3, T4, T5] = t

  def :::[T1, T2, T3, T4, T5, T6](t: Tuple6[T1, T2, T3, T4, T5, T6]): Tuple6[T1, T2, T3, T4, T5, T6] = t

  def :::[T1, T2, T3, T4, T5, T6, T7](t: Tuple7[T1, T2, T3, T4, T5, T6, T7]): Tuple7[T1, T2, T3, T4, T5, T6, T7] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8](t: Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]): Tuple8[T1, T2, T3, T4, T5, T6, T7, T8] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9](t: Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]): Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](t: Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]): Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](t: Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]): Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](t: Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]): Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](t: Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]): Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](t: Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]): Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](t: Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]): Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](t: Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]): Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](t: Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]): Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](t: Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]): Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](t: Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]): Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](t: Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]): Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](t: Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]): Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = t

  def :::[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](t: Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]): Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] = t


}
