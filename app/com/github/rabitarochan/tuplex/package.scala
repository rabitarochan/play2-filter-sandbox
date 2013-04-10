package com.github.rabitarochan

import com.github.rabitarochan.tuplex._
import scala.language.implicitConversions

package object tuplex {

  implicit def tuple1Ops[T1](value: Tuple1[T1]) =
    new Tuple1Ops(value)

  implicit def tuple2Ops[T1, T2](value: Tuple2[T1, T2]) =
    new Tuple2Ops(value)

  implicit def tuple3Ops[T1, T2, T3](value: Tuple3[T1, T2, T3]) =
    new Tuple3Ops(value)

  implicit def tuple4Ops[T1, T2, T3, T4](value: Tuple4[T1, T2, T3, T4]) =
    new Tuple4Ops(value)

  implicit def tuple5Ops[T1, T2, T3, T4, T5](value: Tuple5[T1, T2, T3, T4, T5]) =
    new Tuple5Ops(value)

  implicit def tuple6Ops[T1, T2, T3, T4, T5, T6](value: Tuple6[T1, T2, T3, T4, T5, T6]) =
    new Tuple6Ops(value)

  implicit def tuple7Ops[T1, T2, T3, T4, T5, T6, T7](value: Tuple7[T1, T2, T3, T4, T5, T6, T7]) =
    new Tuple7Ops(value)

  implicit def tuple8Ops[T1, T2, T3, T4, T5, T6, T7, T8](value: Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]) =
    new Tuple8Ops(value)

  implicit def tuple9Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9](value: Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]) =
    new Tuple9Ops(value)

  implicit def tuple10Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](value: Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]) =
    new Tuple10Ops(value)

  implicit def tuple11Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](value: Tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]) =
    new Tuple11Ops(value)

  implicit def tuple12Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](value: Tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]) =
    new Tuple12Ops(value)

  implicit def tuple13Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](value: Tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]) =
    new Tuple13Ops(value)

  implicit def tuple14Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](value: Tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]) =
    new Tuple14Ops(value)

  implicit def tuple15Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](value: Tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]) =
    new Tuple15Ops(value)

  implicit def tuple16Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](value: Tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]) =
    new Tuple16Ops(value)

  implicit def tuple17Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](value: Tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]) =
    new Tuple17Ops(value)

  implicit def tuple18Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](value: Tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]) =
    new Tuple18Ops(value)

  implicit def tuple19Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](value: Tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]) =
    new Tuple19Ops(value)

  implicit def tuple20Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](value: Tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]) =
    new Tuple20Ops(value)

  implicit def tuple21Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](value: Tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]) =
    new Tuple21Ops(value)

  implicit def tuple22Ops[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](value: Tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]) =
    new Tuple22Ops(value)


}
