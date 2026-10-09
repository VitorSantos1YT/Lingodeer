package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.i2 f30251a;

    static {
        b0.v vVar = b0.b0.f3438a;
        b0.e.r(250, 0, vVar, 2);
        f30251a = b0.e.r(250, 0, vVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void a(int i11, z1.r rVar, long j11, long j12, fz.f fVar, fz.e eVar, t1.d dVar, l1.n nVar, int i12, int i13) {
        int i14;
        z1.r rVar2;
        long jD;
        long jD2;
        int i15;
        t1.d dVar2;
        fz.f fVarD;
        long j13;
        long j14;
        fz.e eVar2;
        z1.r rVar3;
        l1.s sVar;
        z1.r rVar4;
        long j15;
        long j16;
        fz.f fVar2;
        fz.e eVar3;
        l1.x1 x1VarT;
        int i16;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1199178586);
        if ((i12 & 6) == 0) {
            i14 = (sVar2.d(i11) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i17 = i13 & 2;
        if (i17 == 0) {
            if ((i12 & 48) == 0) {
                rVar2 = rVar;
                i14 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i12 & 384) == 0) {
                if ((i13 & 4) == 0) {
                    jD = j11;
                    int i18 = sVar2.e(jD) ? 256 : 128;
                    i14 |= i18;
                } else {
                    jD = j11;
                }
                i14 |= i18;
            } else {
                jD = j11;
            }
            if ((i12 & 3072) == 0) {
                if ((i13 & 8) == 0) {
                    jD2 = j12;
                    int i19 = sVar2.e(jD2) ? 2048 : 1024;
                    i14 |= i19;
                } else {
                    jD2 = j12;
                }
                i14 |= i19;
            } else {
                jD2 = j12;
            }
            i15 = i14 | 221184;
            if ((1572864 & i12) == 0) {
                dVar2 = dVar;
                if (sVar2.h(dVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i15 |= i16;
            } else {
                dVar2 = dVar;
            }
            if ((599187 & i15) == 599186 || !sVar2.F()) {
                sVar2.Y();
                if ((i12 & 1) != 0 || sVar2.C()) {
                    if (i17 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i13 & 4) != 0) {
                        jD = v1.d(k1.y.f37830c, sVar2);
                        i15 &= -897;
                    }
                    if ((i13 & 8) != 0) {
                        jD2 = v1.d(k1.y.f37832e, sVar2);
                        i15 &= -7169;
                    }
                    fVarD = t1.e.d(-2052073983, new ba(i11), sVar2);
                    j13 = jD;
                    j14 = jD2;
                    eVar2 = f2.f30230a;
                    rVar3 = rVar2;
                } else {
                    sVar2.W();
                    if ((i13 & 4) != 0) {
                        i15 &= -897;
                    }
                    if ((i13 & 8) != 0) {
                        i15 &= -7169;
                    }
                    fVarD = fVar;
                    eVar2 = eVar;
                    rVar3 = rVar2;
                    j13 = jD;
                    j14 = jD2;
                }
                sVar2.q();
                sVar = sVar2;
                b(rVar3, j13, j14, fVarD, eVar2, dVar2, sVar, (i15 >> 3) & 524286);
                rVar4 = rVar3;
                j15 = j13;
                j16 = j14;
                fVar2 = fVarD;
                eVar3 = eVar2;
            } else {
                sVar2.W();
                sVar = sVar2;
                rVar4 = rVar2;
                j15 = jD;
                j16 = jD2;
                fVar2 = fVar;
                eVar3 = eVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new ca(i11, rVar4, j15, j16, fVar2, eVar3, dVar, i12, i13);
            }
        }
        i14 |= 48;
        rVar2 = rVar;
        if ((i12 & 384) == 0) {
            if ((i13 & 4) == 0) {
                jD = j11;
                if (sVar2.e(jD)) {
                }
                i14 |= i18;
            } else {
                jD = j11;
            }
            i14 |= i18;
        } else {
            jD = j11;
        }
        if ((i12 & 3072) == 0) {
            if ((i13 & 8) == 0) {
                jD2 = j12;
                if (sVar2.e(jD2)) {
                }
                i14 |= i19;
            } else {
                jD2 = j12;
            }
            i14 |= i19;
        } else {
            jD2 = j12;
        }
        i15 = i14 | 221184;
        if ((1572864 & i12) == 0) {
            dVar2 = dVar;
            if (sVar2.h(dVar2)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i15 |= i16;
        } else {
            dVar2 = dVar;
        }
        if ((599187 & i15) == 599186) {
            sVar2.Y();
            if ((i12 & 1) != 0) {
                if (i17 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if ((i13 & 4) != 0) {
                    jD = v1.d(k1.y.f37830c, sVar2);
                    i15 &= -897;
                }
                if ((i13 & 8) != 0) {
                    jD2 = v1.d(k1.y.f37832e, sVar2);
                    i15 &= -7169;
                }
                fVarD = t1.e.d(-2052073983, new ba(i11), sVar2);
                j13 = jD;
                j14 = jD2;
                eVar2 = f2.f30230a;
                rVar3 = rVar2;
            } else {
                if (i17 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if ((i13 & 4) != 0) {
                    jD = v1.d(k1.y.f37830c, sVar2);
                    i15 &= -897;
                }
                if ((i13 & 8) != 0) {
                    jD2 = v1.d(k1.y.f37832e, sVar2);
                    i15 &= -7169;
                }
                fVarD = t1.e.d(-2052073983, new ba(i11), sVar2);
                j13 = jD;
                j14 = jD2;
                eVar2 = f2.f30230a;
                rVar3 = rVar2;
            }
            sVar2.q();
            sVar = sVar2;
            b(rVar3, j13, j14, fVarD, eVar2, dVar2, sVar, (i15 >> 3) & 524286);
            rVar4 = rVar3;
            j15 = j13;
            j16 = j14;
            fVar2 = fVarD;
            eVar3 = eVar2;
        } else {
            sVar2.Y();
            if ((i12 & 1) != 0) {
                if (i17 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if ((i13 & 4) != 0) {
                    jD = v1.d(k1.y.f37830c, sVar2);
                    i15 &= -897;
                }
                if ((i13 & 8) != 0) {
                    jD2 = v1.d(k1.y.f37832e, sVar2);
                    i15 &= -7169;
                }
                fVarD = t1.e.d(-2052073983, new ba(i11), sVar2);
                j13 = jD;
                j14 = jD2;
                eVar2 = f2.f30230a;
                rVar3 = rVar2;
            } else {
                if (i17 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if ((i13 & 4) != 0) {
                    jD = v1.d(k1.y.f37830c, sVar2);
                    i15 &= -897;
                }
                if ((i13 & 8) != 0) {
                    jD2 = v1.d(k1.y.f37832e, sVar2);
                    i15 &= -7169;
                }
                fVarD = t1.e.d(-2052073983, new ba(i11), sVar2);
                j13 = jD;
                j14 = jD2;
                eVar2 = f2.f30230a;
                rVar3 = rVar2;
            }
            sVar2.q();
            sVar = sVar2;
            b(rVar3, j13, j14, fVarD, eVar2, dVar2, sVar, (i15 >> 3) & 524286);
            rVar4 = rVar3;
            j15 = j13;
            j16 = j14;
            fVar2 = fVarD;
            eVar3 = eVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ca(i11, rVar4, j15, j16, fVar2, eVar3, dVar, i12, i13);
        }
    }

    public static final void b(z1.r rVar, long j11, long j12, fz.f fVar, fz.e eVar, t1.d dVar, l1.n nVar, int i11) {
        z1.r rVar2;
        int i12;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-160898917);
        if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i12 = (sVar2.f(rVar2) ? 4 : 2) | i11;
        } else {
            rVar2 = rVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.e(j12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(fVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(eVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(dVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((74899 & i12) == 74898 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            int i13 = i12 << 3;
            sVar = sVar2;
            i9.a(q0.c.c(rVar2), null, j11, j12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1617702432, new ea(dVar, eVar, fVar, 1), sVar2), sVar, (i13 & 896) | 12582912 | (i13 & 7168), 114);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z8(rVar2, j11, j12, fVar, eVar, dVar, i11);
        }
    }
}
