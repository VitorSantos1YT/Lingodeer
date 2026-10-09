package b0;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements n2 {
    public s H;
    public s K;
    public s L;
    public float[] M;
    public float[] N;
    public hd.b O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.w f3666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.x f3667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f3669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3670e = m2.f3610a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f3671f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f3672t;

    public r2(y.w wVar, y.x xVar, int i11, z zVar) {
        this.f3666a = wVar;
        this.f3667b = xVar;
        this.f3668c = i11;
        this.f3669d = zVar;
        float[] fArr = m2.f3611b;
        this.f3671f = fArr;
        this.M = fArr;
        this.N = fArr;
        this.O = m2.f3612c;
    }

    public final int a(int i11) {
        int i12;
        y.w wVar = this.f3666a;
        int i13 = wVar.f56783b;
        wVar.getClass();
        if (i13 <= 0 || i13 > wVar.f56783b) {
            z.a.d(BuildConfig.VERSION_NAME);
            throw null;
        }
        int i14 = i13 - 1;
        int i15 = 0;
        while (true) {
            if (i15 <= i14) {
                i12 = (i15 + i14) >>> 1;
                int i16 = wVar.f56782a[i12];
                if (i16 >= i11) {
                    if (i16 <= i11) {
                        break;
                    }
                    i14 = i12 - 1;
                } else {
                    i15 = i12 + 1;
                }
            } else {
                i12 = -(i15 + 1);
                break;
            }
        }
        return i12 < -1 ? -(i12 + 2) : i12;
    }

    public final float b(int i11, int i12, boolean z11) {
        z zVar;
        float f5;
        y.w wVar = this.f3666a;
        if (i11 >= wVar.f56783b - 1) {
            f5 = i12;
        } else {
            int iC = wVar.c(i11);
            int iC2 = wVar.c(i11 + 1);
            if (i12 == iC) {
                f5 = iC;
            } else {
                int i13 = iC2 - iC;
                q2 q2Var = (q2) this.f3667b.b(iC);
                if (q2Var == null || (zVar = q2Var.f3650b) == null) {
                    zVar = this.f3669d;
                }
                float f11 = i13;
                float fA = zVar.a((i12 - iC) / f11);
                if (z11) {
                    return fA;
                }
                f5 = (f11 * fA) + iC;
            }
        }
        return f5 / 1000;
    }

    public final void d(s sVar, s sVar2, s sVar3) {
        float[] fArr;
        boolean z11 = this.O != m2.f3612c;
        s sVar4 = this.f3672t;
        y.x xVar = this.f3667b;
        y.w wVar = this.f3666a;
        if (sVar4 == null) {
            this.f3672t = sVar.c();
            this.H = sVar3.c();
            int i11 = wVar.f56783b;
            float[] fArr2 = new float[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                fArr2[i12] = wVar.c(i12) / 1000;
            }
            this.f3671f = fArr2;
            int i13 = wVar.f56783b;
            int[] iArr = new int[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                iArr[i14] = 0;
            }
            this.f3670e = iArr;
        }
        if (z11) {
            if (this.O != m2.f3612c && kotlin.jvm.internal.m.a(this.K, sVar) && kotlin.jvm.internal.m.a(this.L, sVar2)) {
                return;
            }
            this.K = sVar;
            this.L = sVar2;
            int iB = sVar.b() + (sVar.b() % 2);
            this.M = new float[iB];
            this.N = new float[iB];
            int i15 = wVar.f56783b;
            float[][] fArr3 = new float[i15][];
            for (int i16 = 0; i16 < i15; i16++) {
                int iC = wVar.c(i16);
                q2 q2Var = (q2) xVar.b(iC);
                if (iC == 0 && q2Var == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = sVar.a(i17);
                    }
                } else if (iC == this.f3668c && q2Var == null) {
                    fArr = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr[i18] = sVar2.a(i18);
                    }
                } else {
                    kotlin.jvm.internal.m.c(q2Var);
                    s sVar5 = q2Var.f3649a;
                    float[] fArr4 = new float[iB];
                    for (int i19 = 0; i19 < iB; i19++) {
                        fArr4[i19] = sVar5.a(i19);
                    }
                    fArr = fArr4;
                }
                fArr3[i16] = fArr;
            }
            this.O = new hd.b(this.f3670e, this.f3671f, fArr3);
        }
    }

    @Override // b0.l2
    public final s i(long j11, s sVar, s sVar2, s sVar3) {
        s sVar4;
        s sVar5;
        float f5;
        s sVar6 = sVar;
        s sVar7 = sVar2;
        int[] iArr = m2.f3610a;
        int i11 = 0;
        long j12 = (j11 / 1000000) - ((long) 0);
        int i12 = this.f3668c;
        long j13 = i12;
        if (j12 < 0) {
            j12 = 0;
        }
        if (j12 <= j13) {
            j13 = j12;
        }
        int i13 = (int) j13;
        y.x xVar = this.f3667b;
        q2 q2Var = (q2) xVar.b(i13);
        if (q2Var != null) {
            return q2Var.f3649a;
        }
        if (i13 >= i12) {
            return sVar7;
        }
        if (i13 <= 0) {
            return sVar6;
        }
        d(sVar6, sVar7, sVar3);
        s sVar8 = this.f3672t;
        kotlin.jvm.internal.m.c(sVar8);
        boolean z11 = true;
        if (this.O != m2.f3612c) {
            float fB = b(a(i13), i13, false);
            float[] fArr = this.M;
            u[][] uVarArr = (u[][]) this.O.f32184b;
            int length = uVarArr.length - 1;
            float f11 = uVarArr[0][0].f3683a;
            float f12 = uVarArr[length][0].f3684b;
            int length2 = fArr.length;
            if (fB < f11 || fB > f12) {
                if (fB > f12) {
                    f11 = f12;
                } else {
                    length = 0;
                }
                float f13 = fB - f11;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length2 - 1) {
                    u uVar = uVarArr[length][i15];
                    boolean z12 = uVar.f3697p;
                    float f14 = uVar.f3699r;
                    float f15 = uVar.f3698q;
                    if (z12) {
                        float f16 = uVar.f3683a;
                        float f17 = uVar.f3693k;
                        f5 = f13;
                        float f18 = uVar.f3685c;
                        fArr[i14] = (f5 * f15) + hh.p0.a(uVar.f3687e, f18, (f11 - f16) * f17, f18);
                        float f19 = (f11 - f16) * f17;
                        float f21 = uVar.f3686d;
                        fArr[i14 + 1] = (f5 * f14) + hh.p0.a(uVar.f3688f, f21, f19, f21);
                    } else {
                        f5 = f13;
                        uVar.c(f11);
                        fArr[i14] = (uVar.a() * f5) + (uVar.f3695n * uVar.f3690h) + f15;
                        fArr[i14 + 1] = (uVar.b() * f5) + (uVar.f3696o * uVar.f3691i) + f14;
                    }
                    i14 += 2;
                    i15++;
                    f13 = f5;
                    uVarArr = uVarArr;
                }
            } else {
                int length3 = uVarArr.length;
                int i16 = 0;
                boolean z13 = false;
                while (i16 < length3) {
                    int i17 = i11;
                    int i18 = i17;
                    while (i17 < length2 - 1) {
                        u uVar2 = uVarArr[i16][i18];
                        if (fB <= uVar2.f3684b) {
                            if (uVar2.f3697p) {
                                float f22 = uVar2.f3683a;
                                float f23 = uVar2.f3693k;
                                float f24 = uVar2.f3685c;
                                fArr[i17] = hh.p0.a(uVar2.f3687e, f24, (fB - f22) * f23, f24);
                                float f25 = uVar2.f3686d;
                                fArr[i17 + 1] = hh.p0.a(uVar2.f3688f, f25, (fB - f22) * f23, f25);
                            } else {
                                uVar2.c(fB);
                                fArr[i17] = (uVar2.f3695n * uVar2.f3690h) + uVar2.f3698q;
                                fArr[i17 + 1] = (uVar2.f3696o * uVar2.f3691i) + uVar2.f3699r;
                            }
                            z13 = z11;
                        } else {
                            z11 = z11;
                        }
                        i17 += 2;
                        i18++;
                        z11 = z11;
                    }
                    boolean z14 = z11;
                    if (z13) {
                        break;
                    }
                    i16++;
                    z11 = z14;
                    i11 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i19 = 0; i19 < length4; i19++) {
                sVar8.e(i19, fArr[i19]);
            }
        } else {
            int iA = a(i13);
            float fB2 = b(iA, i13, true);
            y.w wVar = this.f3666a;
            q2 q2Var2 = (q2) xVar.b(wVar.c(iA));
            if (q2Var2 != null && (sVar5 = q2Var2.f3649a) != null) {
                sVar6 = sVar5;
            }
            q2 q2Var3 = (q2) xVar.b(wVar.c(iA + 1));
            if (q2Var3 != null && (sVar4 = q2Var3.f3649a) != null) {
                sVar7 = sVar4;
            }
            int iB = sVar8.b();
            for (int i21 = 0; i21 < iB; i21++) {
                sVar8.e(i21, (sVar7.a(i21) * fB2) + ((1 - fB2) * sVar6.a(i21)));
            }
        }
        return sVar8;
    }

    @Override // b0.l2
    public final s m(long j11, s sVar, s sVar2, s sVar3) {
        int[] iArr = m2.f3610a;
        int i11 = 0;
        long j12 = (j11 / 1000000) - ((long) 0);
        long j13 = this.f3668c;
        if (j12 < 0) {
            j12 = 0;
        }
        long j14 = j12 > j13 ? j13 : j12;
        if (j14 < 0) {
            return sVar3;
        }
        d(sVar, sVar2, sVar3);
        s sVar4 = this.H;
        kotlin.jvm.internal.m.c(sVar4);
        if (this.O != m2.f3612c) {
            int i12 = (int) j14;
            float fB = b(a(i12), i12, false);
            float[] fArr = this.N;
            u[][] uVarArr = (u[][]) this.O.f32184b;
            float f5 = uVarArr[0][0].f3683a;
            float f11 = uVarArr[uVarArr.length - 1][0].f3684b;
            if (fB < f5) {
                fB = f5;
            }
            if (fB <= f11) {
                f11 = fB;
            }
            int length = fArr.length;
            boolean z11 = false;
            for (u[] uVarArr2 : uVarArr) {
                int i13 = 0;
                int i14 = 0;
                while (i13 < length - 1) {
                    u uVar = uVarArr2[i14];
                    if (f11 <= uVar.f3684b) {
                        if (uVar.f3697p) {
                            fArr[i13] = uVar.f3698q;
                            fArr[i13 + 1] = uVar.f3699r;
                        } else {
                            uVar.c(f11);
                            fArr[i13] = uVar.a();
                            fArr[i13 + 1] = uVar.b();
                        }
                        z11 = true;
                    }
                    i13 += 2;
                    i14++;
                }
                if (z11) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i11 < length2) {
                sVar4.e(i11, fArr[i11]);
                i11++;
            }
        } else {
            s sVarI = i((j14 - 1) * 1000000, sVar, sVar2, sVar3);
            s sVarI2 = i(j14 * 1000000, sVar, sVar2, sVar3);
            int iB = sVarI.b();
            while (i11 < iB) {
                sVar4.e(i11, (sVarI.a(i11) - sVarI2.a(i11)) * 1000.0f);
                i11++;
            }
        }
        return sVar4;
    }

    @Override // b0.n2
    public final int n() {
        return 0;
    }

    @Override // b0.n2
    public final int r() {
        return this.f3668c;
    }
}
