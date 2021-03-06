/*
 * Copyright 2013 Mario Arias
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.funktionale.currying

public fun<P1, P2, R> Function2<P1, P2, R>.curried(): (P1) -> (P2) -> R {
    return {(p1: P1) -> {(p2: P2)  -> this(p1, p2) } }
}


public fun<P1, P2, P3, R> Function3<P1, P2, P3, R>.curried(): (P1) -> (P2) -> (P3) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3)  -> this(p1, p2, p3) } } }
}


public fun<P1, P2, P3, P4, R> Function4<P1, P2, P3, P4, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4)  -> this(p1, p2, p3, p4) } } } }
}


public fun<P1, P2, P3, P4, P5, R> Function5<P1, P2, P3, P4, P5, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5)  -> this(p1, p2, p3, p4, p5) } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, R> Function6<P1, P2, P3, P4, P5, P6, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6)  -> this(p1, p2, p3, p4, p5, p6) } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, R> Function7<P1, P2, P3, P4, P5, P6, P7, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7)  -> this(p1, p2, p3, p4, p5, p6, p7) } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, R> Function8<P1, P2, P3, P4, P5, P6, P7, P8, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8)  -> this(p1, p2, p3, p4, p5, p6, p7, p8) } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, R> Function9<P1, P2, P3, P4, P5, P6, P7, P8, P9, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> Function10<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) } } } } } } } } } }
}


/*public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R> Function11<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R> Function12<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R> Function13<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R> Function14<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R> Function15<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R> Function16<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) } } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R> Function17<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16) -> {(p17: P17)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) } } } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R> Function18<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16) -> {(p17: P17) -> {(p18: P18)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) } } } } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R> Function19<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16) -> {(p17: P17) -> {(p18: P18) -> {(p19: P19)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) } } } } } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R> Function20<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16) -> {(p17: P17) -> {(p18: P18) -> {(p19: P19) -> {(p20: P20)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) } } } } } } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R> Function21<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> (P21) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16) -> {(p17: P17) -> {(p18: P18) -> {(p19: P19) -> {(p20: P20) -> {(p21: P21)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) } } } } } } } } } } } } } } } } } } } } }
}


public fun<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R> Function22<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>.curried(): (P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> (P21) -> (P22) -> R {
    return {(p1: P1) -> {(p2: P2) -> {(p3: P3) -> {(p4: P4) -> {(p5: P5) -> {(p6: P6) -> {(p7: P7) -> {(p8: P8) -> {(p9: P9) -> {(p10: P10) -> {(p11: P11) -> {(p12: P12) -> {(p13: P13) -> {(p14: P14) -> {(p15: P15) -> {(p16: P16) -> {(p17: P17) -> {(p18: P18) -> {(p19: P19) -> {(p20: P20) -> {(p21: P21) -> {(p22: P22)  -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) } } } } } } } } } } } } } } } } } } } } } }
}*/
