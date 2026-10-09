package tv;

import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import tg.f0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x0179  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0121  */
    /* JADX WARN: Code duplicated, block: B:96:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    public static final void a(r rVar, int i11, Alignment alignment, Fit fit, boolean z11, fz.c cVar, n nVar, int i12, int i13) {
        int i14;
        boolean z12;
        int i15;
        int i16;
        boolean z13;
        Alignment alignment2;
        Fit fit2;
        fz.c cVar2;
        boolean z14;
        x1 x1VarT;
        Alignment alignment3;
        Fit fit3;
        l1.g gVar;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        int i21;
        boolean z18;
        int i22;
        boolean z19;
        int i23;
        boolean z20;
        boolean z21;
        Object eVar;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objQ;
        Object objQ2;
        s sVar = (s) nVar;
        sVar.f0(-567202295);
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar.f(rVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.d(i11) ? 32 : 16;
        }
        int i24 = i14 | 28032;
        int i25 = i13 & 32;
        if (i25 == 0) {
            if ((i12 & 196608) == 0) {
                z12 = z11;
                i24 |= sVar.g(z12) ? 131072 : 65536;
            }
            i15 = i13 & 64;
            if (i15 != 0) {
                if ((i12 & 1572864) == 0) {
                    if (sVar.h(cVar)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i24 |= i16;
                }
                if ((599187 & i24) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i24 & 1, z13)) {
                    alignment3 = Alignment.CENTER;
                    fit3 = Fit.CONTAIN;
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    gVar = m.f39353a;
                    if (i15 != 0) {
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new st.a(23);
                            sVar.o0(objQ2);
                        }
                        cVar2 = (fz.c) objQ2;
                    } else {
                        cVar2 = cVar;
                    }
                    i17 = i24 & 458752;
                    if (i17 == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i18 = i24 & 112;
                    if (i18 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z29 = z15 | z16;
                    i19 = i24 & 896;
                    if (i19 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z30 = z29 | z17;
                    i21 = i24 & 57344;
                    if (i21 == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z31 = z30 | z18;
                    i22 = i24 & 7168;
                    if (i22 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z32 = z31 | z19;
                    i23 = i24 & 3670016;
                    if (i23 == 1048576) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    z21 = z32 | z20;
                    Object objQ3 = sVar.Q();
                    if (!z21 || objQ3 == gVar) {
                        eVar = new e(z14, i11, fit3, alignment3, cVar2);
                        sVar.o0(eVar);
                    } else {
                        eVar = objQ3;
                    }
                    fz.c cVar3 = (fz.c) eVar;
                    if (i18 == 32) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (i19 == 256) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    boolean z33 = z22 | z23;
                    if (i21 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z34 = z33 | z24;
                    if (i22 == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z35 = z34 | z25;
                    if (i17 == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z36 = z35 | z26;
                    if (i23 == 1048576) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z36 | z27;
                    objQ = sVar.Q();
                    if (z28 || objQ == gVar) {
                        objQ = new e(i11, fit3, alignment3, z14, cVar2);
                        sVar.o0(objQ);
                    }
                    y3.h.b(cVar3, rVar, (fz.c) objQ, sVar, (i24 << 3) & 112, 0);
                    fit2 = fit3;
                    alignment2 = alignment3;
                } else {
                    sVar.W();
                    alignment2 = alignment;
                    fit2 = fit;
                    cVar2 = cVar;
                    z14 = z12;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new f0(rVar, i11, alignment2, fit2, z14, cVar2, i12, i13);
                }
            }
            i24 |= 1572864;
            if ((599187 & i24) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i24 & 1, z13)) {
                alignment3 = Alignment.CENTER;
                fit3 = Fit.CONTAIN;
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                gVar = m.f39353a;
                if (i15 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new st.a(23);
                        sVar.o0(objQ2);
                    }
                    cVar2 = (fz.c) objQ2;
                } else {
                    cVar2 = cVar;
                }
                i17 = i24 & 458752;
                if (i17 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i18 = i24 & 112;
                if (i18 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z210 = z15 | z16;
                i19 = i24 & 896;
                if (i19 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z37 = z210 | z17;
                i21 = i24 & 57344;
                if (i21 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z38 = z37 | z18;
                i22 = i24 & 7168;
                if (i22 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z39 = z38 | z19;
                i23 = i24 & 3670016;
                if (i23 == 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = z39 | z20;
                Object objQ4 = sVar.Q();
                if (z21) {
                    eVar = new e(z14, i11, fit3, alignment3, cVar2);
                    sVar.o0(eVar);
                } else {
                    eVar = new e(z14, i11, fit3, alignment3, cVar2);
                    sVar.o0(eVar);
                }
                fz.c cVar4 = (fz.c) eVar;
                if (i18 == 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (i19 == 256) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z310 = z22 | z23;
                if (i21 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z311 = z310 | z24;
                if (i22 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z312 = z311 | z25;
                if (i17 == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z313 = z312 | z26;
                if (i23 == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z313 | z27;
                objQ = sVar.Q();
                if (z28) {
                    objQ = new e(i11, fit3, alignment3, z14, cVar2);
                    sVar.o0(objQ);
                } else {
                    objQ = new e(i11, fit3, alignment3, z14, cVar2);
                    sVar.o0(objQ);
                }
                y3.h.b(cVar4, rVar, (fz.c) objQ, sVar, (i24 << 3) & 112, 0);
                fit2 = fit3;
                alignment2 = alignment3;
            } else {
                sVar.W();
                alignment2 = alignment;
                fit2 = fit;
                cVar2 = cVar;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(rVar, i11, alignment2, fit2, z14, cVar2, i12, i13);
            }
        }
        i24 = 224640 | i14;
        z12 = z11;
        i15 = i13 & 64;
        if (i15 != 0) {
            if ((i12 & 1572864) == 0) {
                if (sVar.h(cVar)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i24 |= i16;
            }
            if ((599187 & i24) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i24 & 1, z13)) {
                alignment3 = Alignment.CENTER;
                fit3 = Fit.CONTAIN;
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                gVar = m.f39353a;
                if (i15 != 0) {
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new st.a(23);
                        sVar.o0(objQ2);
                    }
                    cVar2 = (fz.c) objQ2;
                } else {
                    cVar2 = cVar;
                }
                i17 = i24 & 458752;
                if (i17 == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i18 = i24 & 112;
                if (i18 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211 = z15 | z16;
                i19 = i24 & 896;
                if (i19 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z314 = z211 | z17;
                i21 = i24 & 57344;
                if (i21 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z315 = z314 | z18;
                i22 = i24 & 7168;
                if (i22 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z316 = z315 | z19;
                i23 = i24 & 3670016;
                if (i23 == 1048576) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z21 = z316 | z20;
                Object objQ5 = sVar.Q();
                if (z21) {
                    eVar = new e(z14, i11, fit3, alignment3, cVar2);
                    sVar.o0(eVar);
                } else {
                    eVar = new e(z14, i11, fit3, alignment3, cVar2);
                    sVar.o0(eVar);
                }
                fz.c cVar5 = (fz.c) eVar;
                if (i18 == 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (i19 == 256) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                boolean z317 = z22 | z23;
                if (i21 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z318 = z317 | z24;
                if (i22 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z319 = z318 | z25;
                if (i17 == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z3110 = z319 | z26;
                if (i23 == 1048576) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z3110 | z27;
                objQ = sVar.Q();
                if (z28) {
                    objQ = new e(i11, fit3, alignment3, z14, cVar2);
                    sVar.o0(objQ);
                } else {
                    objQ = new e(i11, fit3, alignment3, z14, cVar2);
                    sVar.o0(objQ);
                }
                y3.h.b(cVar5, rVar, (fz.c) objQ, sVar, (i24 << 3) & 112, 0);
                fit2 = fit3;
                alignment2 = alignment3;
            } else {
                sVar.W();
                alignment2 = alignment;
                fit2 = fit;
                cVar2 = cVar;
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f0(rVar, i11, alignment2, fit2, z14, cVar2, i12, i13);
            }
        }
        i24 |= 1572864;
        if ((599187 & i24) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar.T(i24 & 1, z13)) {
            alignment3 = Alignment.CENTER;
            fit3 = Fit.CONTAIN;
            if (i25 != 0) {
                z14 = true;
            } else {
                z14 = z12;
            }
            gVar = m.f39353a;
            if (i15 != 0) {
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new st.a(23);
                    sVar.o0(objQ2);
                }
                cVar2 = (fz.c) objQ2;
            } else {
                cVar2 = cVar;
            }
            i17 = i24 & 458752;
            if (i17 == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            i18 = i24 & 112;
            if (i18 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z212 = z15 | z16;
            i19 = i24 & 896;
            if (i19 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z3111 = z212 | z17;
            i21 = i24 & 57344;
            if (i21 == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z3112 = z3111 | z18;
            i22 = i24 & 7168;
            if (i22 == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z3113 = z3112 | z19;
            i23 = i24 & 3670016;
            if (i23 == 1048576) {
                z20 = true;
            } else {
                z20 = false;
            }
            z21 = z3113 | z20;
            Object objQ6 = sVar.Q();
            if (z21) {
                eVar = new e(z14, i11, fit3, alignment3, cVar2);
                sVar.o0(eVar);
            } else {
                eVar = new e(z14, i11, fit3, alignment3, cVar2);
                sVar.o0(eVar);
            }
            fz.c cVar6 = (fz.c) eVar;
            if (i18 == 32) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (i19 == 256) {
                z23 = true;
            } else {
                z23 = false;
            }
            boolean z3114 = z22 | z23;
            if (i21 == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z3115 = z3114 | z24;
            if (i22 == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z3116 = z3115 | z25;
            if (i17 == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z3117 = z3116 | z26;
            if (i23 == 1048576) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = z3117 | z27;
            objQ = sVar.Q();
            if (z28) {
                objQ = new e(i11, fit3, alignment3, z14, cVar2);
                sVar.o0(objQ);
            } else {
                objQ = new e(i11, fit3, alignment3, z14, cVar2);
                sVar.o0(objQ);
            }
            y3.h.b(cVar6, rVar, (fz.c) objQ, sVar, (i24 << 3) & 112, 0);
            fit2 = fit3;
            alignment2 = alignment3;
        } else {
            sVar.W();
            alignment2 = alignment;
            fit2 = fit;
            cVar2 = cVar;
            z14 = z12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(rVar, i11, alignment2, fit2, z14, cVar2, i12, i13);
        }
    }
}
