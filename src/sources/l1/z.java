package l1;

import android.os.Trace;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements v {
    public final y.j0 H;
    public final y.j0 K;
    public final y.i0 L;
    public final m1.a M;
    public final m1.a N;
    public final y.i0 O;
    public y.i0 P;
    public boolean Q;
    public se.n R;
    public n1 S;
    public z T;
    public int U;
    public final a0.b2 V;
    public final t1.j W;
    public final s X;
    public int Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f39516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f39518c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39519d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y.l0 f39520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2 f39521f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y.i0 f39522t;

    public z(w wVar, a aVar) {
        this.f39516a = wVar;
        this.f39517b = aVar;
        y.l0 l0Var = new y.l0(new y.j0());
        this.f39520e = l0Var;
        m2 m2Var = new m2();
        if (wVar.d()) {
            m2Var.M = new y.x();
        }
        if (wVar.f()) {
            m2Var.d();
        }
        this.f39521f = m2Var;
        this.f39522t = com.bumptech.glide.g.k();
        this.H = new y.j0();
        this.K = new y.j0();
        this.L = com.bumptech.glide.g.k();
        m1.a aVar2 = new m1.a();
        this.M = aVar2;
        m1.a aVar3 = new m1.a();
        this.N = aVar3;
        this.O = com.bumptech.glide.g.k();
        this.P = com.bumptech.glide.g.k();
        a0.b2 b2Var = new a0.b2(wVar, 28);
        this.V = b2Var;
        this.W = new t1.j();
        s sVar = new s(aVar, wVar, m2Var, l0Var, aVar2, aVar3, b2Var, this);
        wVar.p(sVar);
        this.X = sVar;
    }

    public final void A(fz.e eVar) {
        boolean zI = i();
        p();
        w wVar = this.f39516a;
        if (!zI) {
            wVar.a(this, eVar);
            return;
        }
        s sVar = this.X;
        sVar.f39458z = 100;
        sVar.f39457y = true;
        wVar.a(this, eVar);
        sVar.u();
    }

    public final void a() {
        this.f39518c.set(null);
        this.M.f40762d.G();
        this.N.f40762d.G();
        y.l0 l0Var = this.f39520e;
        if (l0Var.f56734a.g()) {
            return;
        }
        t1.j jVar = this.W;
        try {
            jVar.g(l0Var, this.X.D());
            jVar.b();
        } finally {
            jVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    public final void b(Object obj, boolean z11) {
        int i11;
        Object objG = this.f39522t.g(obj);
        if (objG == null) {
            return;
        }
        boolean z12 = objG instanceof y.j0;
        y.j0 j0Var = this.H;
        y.j0 j0Var2 = this.K;
        y.i0 i0Var = this.O;
        if (!z12) {
            x1 x1Var = (x1) objG;
            if (com.bumptech.glide.g.v(i0Var, obj, x1Var) || x1Var.c(obj) == r0.IGNORED) {
                return;
            }
            if (x1Var.f39505g == null || z11) {
                j0Var.a(x1Var);
                return;
            } else {
                j0Var2.a(x1Var);
                return;
            }
        }
        y.j0 j0Var3 = (y.j0) objG;
        Object[] objArr = j0Var3.f56721b;
        long[] jArr = j0Var3.f56720a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j11 = jArr[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j11) < 128) {
                        x1 x1Var2 = (x1) objArr[(i12 << 3) + i15];
                        if (com.bumptech.glide.g.v(i0Var, obj, x1Var2)) {
                            i11 = i13;
                        } else {
                            i11 = i13;
                            if (x1Var2.c(obj) != r0.IGNORED) {
                                if (x1Var2.f39505g == null || z11) {
                                    j0Var.a(x1Var2);
                                } else {
                                    j0Var2.a(x1Var2);
                                }
                            }
                        }
                    } else {
                        i11 = i13;
                    }
                    j11 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0237 A[LOOP:6: B:94:0x01e3->B:111:0x0237, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0244 A[EDGE_INSN: B:204:0x0244->B:113:0x0244 BREAK  A[LOOP:6: B:94:0x01e3->B:111:0x0237], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0122 A[EDGE_INSN: B:224:0x0122->B:219:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z11) {
        long j11;
        long j12;
        long j13;
        char c11;
        long[] jArr;
        long[] jArr2;
        long j14;
        boolean zC;
        long[] jArr3;
        long j15;
        long[] jArr4;
        long[] jArr5;
        int i11;
        long j16;
        boolean zG;
        int i12;
        long j17;
        long[] jArr6;
        long[] jArr7;
        char c12;
        long j18;
        int i13;
        int i14;
        boolean z12 = set instanceof n1.h;
        y.i0 i0Var = this.L;
        Object obj = null;
        int i15 = 8;
        if (z12) {
            y.j0 j0Var = ((n1.h) set).f43122a;
            Object[] objArr = j0Var.f56721b;
            long[] jArr8 = j0Var.f56720a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i16 = 0;
                j11 = 128;
                j12 = 255;
                while (true) {
                    long j19 = jArr8[i16];
                    char c13 = 7;
                    j13 = -9187201950435737472L;
                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j19 & 255) < 128) {
                                Object obj2 = objArr[(i16 << 3) + i18];
                                c12 = c13;
                                if (obj2 instanceof x1) {
                                    ((x1) obj2).c(obj);
                                } else {
                                    b(obj2, z11);
                                    Object objG = i0Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof y.j0) {
                                            y.j0 j0Var2 = (y.j0) objG;
                                            Object[] objArr2 = j0Var2.f56721b;
                                            long[] jArr9 = j0Var2.f56720a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i19 = i15;
                                                i13 = length;
                                                int i21 = 0;
                                                while (true) {
                                                    long j21 = jArr9[i21];
                                                    j18 = j19;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j21) << c12) & j21 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                        int i23 = 0;
                                                        while (i23 < i22) {
                                                            if ((j21 & 255) < 128) {
                                                                b((g0) objArr2[(i21 << 3) + i23], z11);
                                                            }
                                                            j21 >>= i19;
                                                            i23++;
                                                            jArr8 = jArr8;
                                                        }
                                                        jArr7 = jArr8;
                                                        if (i22 != i19) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (i21 == length2) {
                                                        break;
                                                    }
                                                    i21++;
                                                    jArr9 = jArr10;
                                                    j19 = j18;
                                                    jArr8 = jArr7;
                                                    i19 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j18 = j19;
                                            i13 = length;
                                            b((g0) objG, z11);
                                        }
                                    }
                                    i14 = 8;
                                }
                                jArr7 = jArr8;
                                j18 = j19;
                                i13 = length;
                                i14 = 8;
                            } else {
                                jArr7 = jArr8;
                                c12 = c13;
                                j18 = j19;
                                i13 = length;
                                i14 = i15;
                            }
                            j19 = j18 >> i14;
                            i18++;
                            length = i13;
                            i15 = i14;
                            c13 = c12;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c11 = c13;
                        int i24 = length;
                        if (i17 != i15) {
                            break;
                        } else {
                            length = i24;
                        }
                    } else {
                        jArr6 = jArr8;
                        c11 = 7;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    jArr8 = jArr6;
                    obj = null;
                    i15 = 8;
                }
            } else {
                j11 = 128;
                j12 = 255;
                j13 = -9187201950435737472L;
                c11 = 7;
            }
        } else {
            j11 = 128;
            j12 = 255;
            j13 = -9187201950435737472L;
            c11 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof x1) {
                    ((x1) obj3).c(null);
                } else {
                    b(obj3, z11);
                    Object objG2 = i0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof y.j0) {
                            y.j0 j0Var3 = (y.j0) objG2;
                            Object[] objArr3 = j0Var3.f56721b;
                            long[] jArr11 = j0Var3.f56720a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j22 = jArr11[i25];
                                    if ((((~j22) << 7) & j22 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i25 != length3) {
                                            break;
                                            break;
                                        }
                                        i25++;
                                    } else {
                                        int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            if ((j22 & 255) < 128) {
                                                b((g0) objArr3[(i25 << 3) + i27], z11);
                                            }
                                            j22 >>= 8;
                                        }
                                        if (i26 != 8) {
                                            break;
                                        } else if (i25 != length3) {
                                            break;
                                        } else {
                                            i25++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((g0) objG2, z11);
                        }
                    }
                }
            }
        }
        y.i0 i0Var2 = this.f39522t;
        y.j0 j0Var4 = this.H;
        if (z11) {
            y.j0 j0Var5 = this.K;
            if (j0Var5.h()) {
                long[] jArr12 = i0Var2.f56713a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i28 = 0;
                    while (true) {
                        long j23 = jArr12[i28];
                        if ((((~j23) << c11) & j23 & j13) != j13) {
                            int i29 = 8 - ((~(i28 - length4)) >>> 31);
                            int i30 = 0;
                            while (i30 < i29) {
                                if ((j23 & j12) < j11) {
                                    int i31 = (i28 << 3) + i30;
                                    Object obj4 = i0Var2.f56714b[i31];
                                    Object obj5 = i0Var2.f56715c[i31];
                                    if (obj5 instanceof y.j0) {
                                        y.j0 j0Var6 = (y.j0) obj5;
                                        Object[] objArr4 = j0Var6.f56721b;
                                        long[] jArr13 = j0Var6.f56720a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j16 = j23;
                                            int i32 = 0;
                                            while (true) {
                                                long j24 = jArr13[i32];
                                                jArr5 = jArr12;
                                                i11 = length4;
                                                if ((((~j24) << c11) & j24 & j13) != j13) {
                                                    int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                    for (int i34 = 0; i34 < i33; i34 = i12 + 1) {
                                                        if ((j24 & j12) < j11) {
                                                            i12 = i34;
                                                            int i35 = (i32 << 3) + i12;
                                                            j17 = j24;
                                                            x1 x1Var = (x1) objArr4[i35];
                                                            if (j0Var5.c(x1Var) || j0Var4.c(x1Var)) {
                                                                j0Var6.m(i35);
                                                            }
                                                        } else {
                                                            i12 = i34;
                                                            j17 = j24;
                                                        }
                                                        j24 = j17 >> 8;
                                                    }
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                    if (i32 != length5) {
                                                        break;
                                                    }
                                                    i32++;
                                                    length4 = i11;
                                                    jArr12 = jArr5;
                                                } else if (i32 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i32++;
                                                    length4 = i11;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i11 = length4;
                                            j16 = j23;
                                        }
                                        zG = j0Var6.g();
                                    } else {
                                        jArr5 = jArr12;
                                        i11 = length4;
                                        j16 = j23;
                                        kotlin.jvm.internal.m.d(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        x1 x1Var2 = (x1) obj5;
                                        zG = j0Var5.c(x1Var2) || j0Var4.c(x1Var2);
                                    }
                                    if (zG) {
                                        i0Var2.l(i31);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i11 = length4;
                                    j16 = j23;
                                }
                                j23 = j16 >> 8;
                                i30++;
                                length4 = i11;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i36 = length4;
                            if (i29 != 8) {
                                break;
                            } else {
                                length4 = i36;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i28 == length4) {
                            break;
                        }
                        i28++;
                        jArr12 = jArr4;
                    }
                }
                j0Var5.b();
                h();
                return;
            }
        }
        if (j0Var4.h()) {
            long[] jArr14 = i0Var2.f56713a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i37 = 0;
                while (true) {
                    long j25 = jArr14[i37];
                    if ((((~j25) << c11) & j25 & j13) != j13) {
                        int i38 = 8 - ((~(i37 - length6)) >>> 31);
                        int i39 = 0;
                        while (i39 < i38) {
                            if ((j25 & j12) < j11) {
                                int i40 = (i37 << 3) + i39;
                                Object obj6 = i0Var2.f56714b[i40];
                                Object obj7 = i0Var2.f56715c[i40];
                                if (obj7 instanceof y.j0) {
                                    y.j0 j0Var7 = (y.j0) obj7;
                                    Object[] objArr5 = j0Var7.f56721b;
                                    long[] jArr15 = j0Var7.f56720a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j14 = j25;
                                        int i41 = 0;
                                        while (true) {
                                            long j26 = jArr15[i41];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j26) << c11) & j26 & j13) != j13) {
                                                int i42 = 8 - ((~(i41 - length7)) >>> 31);
                                                int i43 = 0;
                                                while (i43 < i42) {
                                                    if ((j26 & j12) < j11) {
                                                        jArr3 = jArr14;
                                                        int i44 = (i41 << 3) + i43;
                                                        j15 = j26;
                                                        if (j0Var4.c((x1) objArr6[i44])) {
                                                            j0Var7.m(i44);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j15 = j26;
                                                    }
                                                    i43++;
                                                    jArr14 = jArr3;
                                                    j26 = j15 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i42 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i41 == length7) {
                                                break;
                                            }
                                            i41++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j14 = j25;
                                    }
                                    zC = j0Var7.g();
                                } else {
                                    jArr2 = jArr14;
                                    j14 = j25;
                                    kotlin.jvm.internal.m.d(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zC = j0Var4.c((x1) obj7);
                                }
                                if (zC) {
                                    i0Var2.l(i40);
                                }
                            } else {
                                jArr2 = jArr14;
                                j14 = j25;
                            }
                            i39++;
                            j25 = j14 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i38 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i37 == length6) {
                        break;
                    }
                    i37++;
                    jArr14 = jArr;
                }
            }
            h();
            j0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.f39519d) {
            try {
                e(this.M);
                n();
            } catch (Throwable th2) {
                try {
                    if (!this.f39520e.f56734a.g()) {
                        t1.j jVar = this.W;
                        try {
                            jVar.g(this.f39520e, this.X.D());
                            jVar.b();
                        } finally {
                            jVar.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    @Override // l1.v
    public final void dispose() {
        synchronized (this.f39519d) {
            try {
                if (this.X.F) {
                    r1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.Y != 3) {
                    this.Y = 3;
                    m1.a aVar = this.X.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z11 = this.f39521f.f39359b > 0;
                    if (z11 || !this.f39520e.f56734a.g()) {
                        t1.j jVar = this.W;
                        try {
                            jVar.g(this.f39520e, this.X.D());
                            if (z11) {
                                p2 p2VarF = this.f39521f.f();
                                try {
                                    p2VarF.n(p2VarF.f39414t, new ch.b0(this.W, 24));
                                    p2VarF.H();
                                    p2VarF.e(true);
                                    this.f39517b.c();
                                    this.f39517b.w();
                                    jVar.c();
                                } catch (Throwable th2) {
                                    p2VarF.e(false);
                                    throw th2;
                                }
                            }
                            jVar.b();
                            jVar.a();
                        } catch (Throwable th3) {
                            jVar.a();
                            throw th3;
                        }
                    }
                    s sVar = this.X;
                    sVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        sVar.f39435b.u(sVar);
                        sVar.E.clear();
                        sVar.f39451s.clear();
                        sVar.f39438e.f40762d.G();
                        sVar.f39454v = null;
                        sVar.f39434a.c();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f39516a.v(this);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0136 A[EDGE_INSN: B:164:0x0136->B:82:0x0136 BREAK  A[LOOP:2: B:151:0x00e9->B:80:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012c A[Catch: all -> 0x011c, LOOP:2: B:151:0x00e9->B:80:0x012c, LOOP_END, TryCatch #6 {all -> 0x011c, blocks: (B:64:0x00e9, B:66:0x00f8, B:68:0x0102, B:70:0x0108, B:72:0x0118, B:76:0x0121, B:82:0x0136, B:90:0x015a, B:93:0x016d, B:80:0x012c, B:85:0x0140, B:99:0x018b, B:101:0x0197), top: B:151:0x00e9 }] */
    public final void e(m1.a aVar) throws Throwable {
        d dVar;
        t1.j jVar;
        t1.j jVar2;
        long[] jArr;
        int i11;
        long[] jArr2;
        t1.j jVar3;
        long j11;
        char c11;
        long j12;
        int i12;
        boolean zG;
        long j13;
        m1.a aVar2 = this.N;
        s sVar = this.X;
        y1.d dVarD = sVar.D();
        t1.j jVar4 = this.W;
        jVar4.g(this.f39520e, dVarD);
        try {
            if (aVar.f40762d.I()) {
                try {
                    if (aVar2.f40762d.I() && this.S == null) {
                        jVar4.b();
                    }
                    return;
                } finally {
                    jVar4.a();
                }
            }
            n1 n1Var = this.S;
            if (n1Var == null || (dVar = n1Var.f39380l) == null) {
                dVar = this.f39517b;
            }
            try {
                Trace.beginSection(dVar.equals(n1Var != null ? n1Var.f39380l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    n1 n1Var2 = this.S;
                    if (n1Var2 == null || (jVar = n1Var2.f39379k) == null) {
                        jVar = jVar4;
                    }
                    p2 p2VarF = this.f39521f.f();
                    int i13 = 0;
                    try {
                        aVar.G(dVar, p2VarF, jVar, sVar.D());
                        p2VarF.e(true);
                        dVar.w();
                        Trace.endSection();
                        jVar4.c();
                        jVar4.d();
                        if (this.Q) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.Q = false;
                                y.i0 i0Var = this.f39522t;
                                long[] jArr3 = i0Var.f56713a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j14 = jArr3[i14];
                                        char c12 = 7;
                                        long j15 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            int i17 = i13;
                                            while (i17 < i16) {
                                                if ((j14 & 255) < 128) {
                                                    c11 = c12;
                                                    int i18 = (i14 << 3) + i17;
                                                    j12 = j15;
                                                    Object obj = i0Var.f56714b[i18];
                                                    Object obj2 = i0Var.f56715c[i18];
                                                    if (obj2 instanceof y.j0) {
                                                        y.j0 j0Var = (y.j0) obj2;
                                                        Object[] objArr = j0Var.f56721b;
                                                        long[] jArr4 = j0Var.f56720a;
                                                        int i19 = i15;
                                                        int length2 = jArr4.length - 2;
                                                        i11 = i17;
                                                        jArr2 = jArr3;
                                                        jVar3 = jVar4;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j16 = jArr4[i21];
                                                                    j11 = j14;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j16) << c11) & j16 & j12) == j12) {
                                                                        if (i21 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                        jArr4 = jArr5;
                                                                        j14 = j11;
                                                                        i19 = 8;
                                                                    } else {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j16 & 255) < 128) {
                                                                                j13 = j16;
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((x1) objArr[i24]).b()) {
                                                                                    j0Var.m(i24);
                                                                                }
                                                                            } else {
                                                                                j13 = j16;
                                                                            }
                                                                            j16 = j13 >> i19;
                                                                        }
                                                                        if (i22 != i19) {
                                                                            break;
                                                                        }
                                                                        if (i21 != length2) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                        jArr4 = jArr5;
                                                                        j14 = j11;
                                                                        i19 = 8;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j11 = j14;
                                                        }
                                                        zG = j0Var.g();
                                                    } else {
                                                        i11 = i17;
                                                        jArr2 = jArr3;
                                                        jVar3 = jVar4;
                                                        j11 = j14;
                                                        kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zG = !((x1) obj2).b();
                                                    }
                                                    if (zG) {
                                                        i0Var.l(i18);
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    i11 = i17;
                                                    jArr2 = jArr3;
                                                    jVar3 = jVar4;
                                                    j11 = j14;
                                                    c11 = c12;
                                                    j12 = j15;
                                                    i12 = i15;
                                                }
                                                j14 = j11 >> i12;
                                                i17 = i11 + 1;
                                                i15 = i12;
                                                c12 = c11;
                                                j15 = j12;
                                                jVar4 = jVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            jVar2 = jVar4;
                                            if (i16 != i15) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            jVar2 = jVar4;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        jVar4 = jVar2;
                                        jArr3 = jArr;
                                        i13 = 0;
                                    }
                                } else {
                                    jVar2 = jVar4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            jVar2 = jVar4;
                        }
                        try {
                            if (aVar2.f40762d.I() && this.S == null) {
                                jVar2.b();
                            }
                            return;
                        } finally {
                            jVar2.a();
                        }
                    } catch (Throwable th4) {
                        try {
                            p2VarF.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        try {
            if (aVar2.f40762d.I() && this.S == null) {
                jVar4.b();
            }
            throw th;
        } finally {
            jVar4.a();
        }
    }

    public final void f() {
        synchronized (this.f39519d) {
            try {
                if (this.N.f40762d.J()) {
                    e(this.N);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f39520e.f56734a.g()) {
                        t1.j jVar = this.W;
                        try {
                            jVar.g(this.f39520e, this.X.D());
                            jVar.b();
                        } finally {
                            jVar.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f39519d) {
            try {
                this.X.f39454v = null;
                if (!this.f39520e.f56734a.g()) {
                    t1.j jVar = this.W;
                    try {
                        jVar.g(this.f39520e, this.X.D());
                        jVar.b();
                        jVar.a();
                    } catch (Throwable th2) {
                        jVar.a();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f39520e.f56734a.g()) {
                        t1.j jVar2 = this.W;
                        try {
                            jVar2.g(this.f39520e, this.X.D());
                            jVar2.b();
                        } finally {
                            jVar2.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    public final void h() {
        char c11;
        long j11;
        long j12;
        long j13;
        long[] jArr;
        long[] jArr2;
        int i11;
        long j14;
        char c12;
        long j15;
        long j16;
        int i12;
        boolean zG;
        int i13;
        long j17;
        y.i0 i0Var = this.L;
        long[] jArr3 = i0Var.f56713a;
        int length = jArr3.length - 2;
        char c13 = 7;
        long j18 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j19 = 128;
            while (true) {
                long j21 = jArr3[i15];
                j12 = 255;
                if ((((~j21) << c13) & j21 & j18) != j18) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j21 & 255) < j19) {
                            c12 = c13;
                            int i18 = (i15 << 3) + i17;
                            j15 = j18;
                            Object obj = i0Var.f56714b[i18];
                            Object obj2 = i0Var.f56715c[i18];
                            boolean z11 = obj2 instanceof y.j0;
                            y.i0 i0Var2 = this.f39522t;
                            if (z11) {
                                y.j0 j0Var = (y.j0) obj2;
                                Object[] objArr = j0Var.f56721b;
                                long[] jArr4 = j0Var.f56720a;
                                j16 = j19;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j14 = j21;
                                    int i19 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j22 = jArr4[i21];
                                        jArr2 = jArr3;
                                        i11 = length;
                                        if ((((~j22) << c12) & j22 & j15) == j15) {
                                            if (i21 != length2) {
                                                break;
                                                break;
                                            }
                                            i21++;
                                            jArr3 = jArr2;
                                            length = i11;
                                            i19 = 8;
                                        } else {
                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j22 & 255) < j16) {
                                                    i13 = i23;
                                                    int i24 = (i21 << 3) + i13;
                                                    j17 = j22;
                                                    if (!i0Var2.c((g0) objArr[i24])) {
                                                        j0Var.m(i24);
                                                    }
                                                } else {
                                                    i13 = i23;
                                                    j17 = j22;
                                                }
                                                j22 = j17 >> i19;
                                                i23 = i13 + 1;
                                            }
                                            if (i22 != i19) {
                                                break;
                                            }
                                            if (i21 != length2) {
                                                break;
                                            }
                                            i21++;
                                            jArr3 = jArr2;
                                            length = i11;
                                            i19 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i11 = length;
                                    j14 = j21;
                                }
                                zG = j0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i11 = length;
                                j14 = j21;
                                j16 = j19;
                                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zG = !i0Var2.c((g0) obj2);
                            }
                            if (zG) {
                                i0Var.l(i18);
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = length;
                            j14 = j21;
                            c12 = c13;
                            j15 = j18;
                            j16 = j19;
                            i12 = i14;
                        }
                        j21 = j14 >> i12;
                        i17++;
                        i14 = i12;
                        c13 = c12;
                        j18 = j15;
                        j19 = j16;
                        jArr3 = jArr2;
                        length = i11;
                    }
                    jArr = jArr3;
                    int i25 = length;
                    c11 = c13;
                    j11 = j18;
                    j13 = j19;
                    if (i16 != i14) {
                        break;
                    } else {
                        length = i25;
                    }
                } else {
                    jArr = jArr3;
                    c11 = c13;
                    j11 = j18;
                    j13 = j19;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c13 = c11;
                j18 = j11;
                j19 = j13;
                jArr3 = jArr;
                i14 = 8;
            }
        } else {
            c11 = 7;
            j11 = -9187201950435737472L;
            j12 = 255;
            j13 = 128;
        }
        y.j0 j0Var2 = this.K;
        if (!j0Var2.h()) {
            return;
        }
        Object[] objArr2 = j0Var2.f56721b;
        long[] jArr5 = j0Var2.f56720a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            long j23 = jArr5[i26];
            if ((((~j23) << c11) & j23 & j11) != j11) {
                int i27 = 8 - ((~(i26 - length3)) >>> 31);
                for (int i28 = 0; i28 < i27; i28++) {
                    if ((j23 & j12) < j13) {
                        int i29 = (i26 << 3) + i28;
                        if (!(((x1) objArr2[i29]).f39505g != null)) {
                            j0Var2.m(i29);
                        }
                    }
                    j23 >>= 8;
                }
                if (i27 != 8) {
                    return;
                }
            }
            if (i26 == length3) {
                return;
            } else {
                i26++;
            }
        }
    }

    public final boolean i() {
        boolean z11;
        synchronized (this.f39519d) {
            z11 = true;
            if (this.Y != 1) {
                z11 = false;
            }
            if (z11) {
                this.Y = 0;
            }
        }
        return z11;
    }

    public final void j(fz.e eVar) {
        try {
            synchronized (this.f39519d) {
                m();
                y.i0 i0Var = this.P;
                this.P = com.bumptech.glide.g.k();
                try {
                    s sVar = this.X;
                    se.n nVar = this.R;
                    if (!sVar.f39438e.f40762d.I()) {
                        u.a("Expected applyChanges() to have been called");
                    }
                    sVar.P = nVar;
                    try {
                        sVar.n(i0Var, eVar);
                        sVar.P = null;
                    } catch (Throwable th2) {
                        sVar.P = null;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    this.P = i0Var;
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                if (!this.f39520e.f56734a.g()) {
                    t1.j jVar = this.W;
                    try {
                        jVar.g(this.f39520e, this.X.D());
                        jVar.b();
                    } finally {
                        jVar.a();
                    }
                }
                throw th4;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final n1 k(boolean z11, fz.e eVar) {
        if (this.S != null) {
            r1.b("A pausable composition is in progress");
        }
        n1 n1Var = new n1(this, this.f39516a, this.X, this.f39520e, eVar, z11, this.f39517b, this.f39519d);
        this.S = n1Var;
        return n1Var;
    }

    public final void l() {
        synchronized (this.f39519d) {
            try {
                if (this.S != null) {
                    r1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z11 = this.f39521f.f39359b > 0;
                if (z11 || !this.f39520e.f56734a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        t1.j jVar = this.W;
                        try {
                            jVar.g(this.f39520e, this.X.D());
                            if (z11) {
                                p2 p2VarF = this.f39521f.f();
                                try {
                                    p2VarF.n(p2VarF.f39414t, new k9.p(6, this.W, p2VarF));
                                    p2VarF.e(true);
                                    this.f39517b.w();
                                    jVar.c();
                                } catch (Throwable th2) {
                                    p2VarF.e(false);
                                    throw th2;
                                }
                            }
                            jVar.b();
                            jVar.a();
                            Trace.endSection();
                        } catch (Throwable th3) {
                            jVar.a();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                this.f39522t.a();
                this.L.a();
                this.P.a();
                this.M.f40762d.G();
                this.N.f40762d.G();
                s sVar = this.X;
                sVar.E.clear();
                sVar.f39451s.clear();
                sVar.f39438e.f40762d.G();
                sVar.f39454v = null;
                this.Y = 1;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final void m() {
        Object obj = t.f39463b;
        AtomicReference atomicReference = this.f39518c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                u.b("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                u.b("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f39518c;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.m.a(andSet, t.f39463b)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet != null) {
            u.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        if (this.S == null) {
            u.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void o() {
        ry.t tVar = ry.t.f50856a;
        AtomicReference atomicReference = this.f39518c;
        Object andSet = atomicReference.getAndSet(tVar);
        if (kotlin.jvm.internal.m.a(andSet, t.f39463b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            u.b("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        String str;
        int i11 = this.Y;
        if (i11 != 0) {
            if (i11 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i11 != 2) {
                str = i11 != 3 ? BuildConfig.VERSION_NAME : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            r1.b(str);
        }
        if (this.S == null) {
            return;
        }
        r1.b("A pausable composition is in progress");
    }

    public final void q(ArrayList arrayList) {
        y.l0 l0Var = this.f39520e;
        s sVar = this.X;
        if (arrayList.size() > 0) {
            ((z0) ((qy.l) arrayList.get(0)).f48495a).getClass();
            throw null;
        }
        try {
            sVar.getClass();
            try {
                sVar.G(arrayList);
                sVar.i();
            } catch (Throwable th2) {
                sVar.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!l0Var.f56734a.g()) {
                    t1.j jVar = this.W;
                    try {
                        jVar.g(l0Var, sVar.D());
                        jVar.b();
                    } finally {
                        jVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final r0 r(x1 x1Var, Object obj) {
        z zVar;
        int i11 = x1Var.f39500b;
        if ((i11 & 2) != 0) {
            x1Var.f39500b = i11 | 4;
        }
        b bVar = x1Var.f39501c;
        if (bVar == null || !bVar.a()) {
            return r0.IGNORED;
        }
        if (this.f39521f.g(bVar)) {
            if (x1Var.f39502d == null) {
                return r0.IGNORED;
            }
            r0 r0VarT = t(x1Var, bVar, obj);
            if (r0VarT != r0.IGNORED) {
                this.V.g();
            }
            return r0VarT;
        }
        synchronized (this.f39519d) {
            zVar = this.T;
        }
        if (zVar != null) {
            s sVar = zVar.X;
            if (sVar.F && sVar.j0(x1Var, obj)) {
                return r0.IMMINENT;
            }
        }
        return r0.IGNORED;
    }

    public final void s() {
        z zVar;
        synchronized (this.f39519d) {
            try {
                for (Object obj : this.f39521f.f39360c) {
                    x1 x1Var = obj instanceof x1 ? (x1) obj : null;
                    if (x1Var != null && (zVar = x1Var.f39499a) != null) {
                        zVar.r(x1Var, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd A[Catch: all -> 0x0042, LOOP:0: B:47:0x008c->B:61:0x00cd, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:65:0x00d5->B:66:0x00da BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5 A[SYNTHETIC] */
    public final r0 t(x1 x1Var, b bVar, Object obj) {
        synchronized (this.f39519d) {
            try {
                z zVar = this.T;
                z zVar2 = null;
                if (zVar != null) {
                    m2 m2Var = this.f39521f;
                    int i11 = this.U;
                    if (m2Var.f39364t) {
                        u.a("Writer is active");
                    }
                    if (i11 < 0 || i11 >= m2Var.f39359b) {
                        u.a("Invalid group index");
                    }
                    if (m2Var.g(bVar)) {
                        int i12 = m2Var.f39358a[(i11 * 5) + 3] + i11;
                        int i13 = bVar.f39235a;
                        if (i11 > i13 || i13 >= i12) {
                            zVar = null;
                        }
                    } else {
                        zVar = null;
                    }
                    zVar2 = zVar;
                }
                if (zVar2 == null) {
                    s sVar = this.X;
                    if (sVar.F && sVar.j0(x1Var, obj)) {
                        return r0.IMMINENT;
                    }
                    if (obj != null && (obj instanceof g0)) {
                        Object objG = this.P.g(x1Var);
                        if (objG != null) {
                            if (!(objG instanceof y.j0)) {
                                if (objG != g.f39302f) {
                                    com.bumptech.glide.g.d(this.P, x1Var, obj);
                                    break;
                                }
                            } else {
                                y.j0 j0Var = (y.j0) objG;
                                Object[] objArr = j0Var.f56721b;
                                long[] jArr = j0Var.f56720a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    com.bumptech.glide.g.d(this.P, x1Var, obj);
                                    break;
                                }
                                int i14 = 0;
                                loop0: while (true) {
                                    long j11 = jArr[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 == length) {
                                            com.bumptech.glide.g.d(this.P, x1Var, obj);
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8;
                                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j11 & 255) < 128 && objArr[(i14 << 3) + i17] == g.f39302f) {
                                                break loop0;
                                            }
                                            j11 >>= i15;
                                            i17++;
                                            i15 = i15;
                                        }
                                        if (i16 == i15) {
                                            if (i14 == length) {
                                                i14++;
                                            }
                                        }
                                        com.bumptech.glide.g.d(this.P, x1Var, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            com.bumptech.glide.g.d(this.P, x1Var, obj);
                            break;
                        }
                    } else {
                        this.P.m(x1Var, g.f39302f);
                    }
                }
                if (zVar2 != null) {
                    return zVar2.t(x1Var, bVar, obj);
                }
                this.f39516a.l(this);
                return this.X.F ? r0.DEFERRED : r0.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.f39522t.g(obj);
        if (objG == null) {
            return;
        }
        boolean z11 = objG instanceof y.j0;
        y.i0 i0Var = this.O;
        if (!z11) {
            x1 x1Var = (x1) objG;
            if (x1Var.c(obj) == r0.IMMINENT) {
                com.bumptech.glide.g.d(i0Var, obj, x1Var);
                return;
            }
            return;
        }
        y.j0 j0Var = (y.j0) objG;
        Object[] objArr = j0Var.f56721b;
        long[] jArr = j0Var.f56720a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        x1 x1Var2 = (x1) objArr[(i11 << 3) + i13];
                        if (x1Var2.c(obj) == r0.IMMINENT) {
                            com.bumptech.glide.g.d(i0Var, obj, x1Var2);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z11 = set instanceof n1.h;
        y.i0 i0Var = this.L;
        y.i0 i0Var2 = this.f39522t;
        if (z11) {
            y.j0 j0Var = ((n1.h) set).f43122a;
            Object[] objArr = j0Var.f56721b;
            long[] jArr = j0Var.f56720a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                loop0: while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                Object obj = objArr[(i11 << 3) + i13];
                                if (i0Var2.c(obj) || i0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (i0Var2.c(obj2) || i0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.f39519d) {
            n1 n1Var = this.S;
            boolean zJ = false;
            if (n1Var != null && (n1Var.f39376h.get() != o1.Recomposing || n1Var.f39377i != t1.e.c())) {
                AtomicReference atomicReference = n1Var.f39376h;
                o1 o1Var = o1.ApplyPending;
                o1 o1Var2 = o1.RecomposePending;
                while (!atomicReference.compareAndSet(o1Var, o1Var2) && atomicReference.get() == o1Var) {
                }
                ((y.w) n1Var.f39380l.f44826b).a(9);
                return false;
            }
            m();
            try {
                y.i0 i0Var = this.P;
                this.P = com.bumptech.glide.g.k();
                try {
                    s sVar = this.X;
                    se.n nVar = this.R;
                    m1.l0 l0Var = sVar.f39438e.f40762d;
                    if (!l0Var.I()) {
                        u.a("Expected applyChanges() to have been called");
                    }
                    if (i0Var.f56717e > 0 || !sVar.f39451s.isEmpty()) {
                        sVar.P = nVar;
                        try {
                            sVar.n(i0Var, null);
                            sVar.P = null;
                            zJ = l0Var.J();
                        } catch (Throwable th2) {
                            sVar.P = null;
                            throw th2;
                        }
                    }
                    if (!zJ) {
                        n();
                    }
                    return zJ;
                } catch (Throwable th3) {
                    this.P = i0Var;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f39520e.f56734a.g()) {
                        t1.j jVar = this.W;
                        try {
                            jVar.g(this.f39520e, this.X.D());
                            jVar.b();
                        } finally {
                            jVar.a();
                        }
                    }
                    throw th4;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(n1.h hVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f39518c.get();
            if (obj2 == null || obj2.equals(t.f39463b)) {
                obj = hVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, hVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f39518c).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f39518c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f39519d) {
                            n();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void y(Object obj) {
        x1 x1VarB;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        s sVar = this.X;
        if (sVar.A <= 0 && (x1VarB = sVar.B()) != null) {
            boolean z14 = true;
            int i12 = x1VarB.f39500b | 1;
            x1VarB.f39500b = i12;
            if ((i12 & 32) == 0) {
                y.d0 d0Var = x1VarB.f39504f;
                if (d0Var == null) {
                    d0Var = new y.d0();
                    x1VarB.f39504f = d0Var;
                }
                int i13 = x1VarB.f39503e;
                int iC = d0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i11 = -1;
                } else {
                    i11 = d0Var.f56679c[iC];
                }
                d0Var.f56678b[iC] = obj;
                d0Var.f56679c[iC] = i13;
                if (i11 == x1VarB.f39503e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            this.V.g();
            if (z11) {
                return;
            }
            if (obj instanceof x1.z) {
                ((x1.z) obj).k(1);
            }
            com.bumptech.glide.g.d(this.f39522t, obj, x1VarB);
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                f0 f0VarM = g0Var.m();
                y.i0 i0Var = this.L;
                com.bumptech.glide.g.w(i0Var, obj);
                y.d0 d0Var2 = f0VarM.f39294e;
                Object[] objArr = d0Var2.f56678b;
                long[] jArr = d0Var2.f56677a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j11 = jArr[i14];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j11 & 255) < 128) {
                                    x1.y yVar = (x1.y) objArr[(i14 << 3) + i17];
                                    if (yVar instanceof x1.z) {
                                        z13 = true;
                                        ((x1.z) yVar).k(1);
                                    } else {
                                        z13 = true;
                                    }
                                    com.bumptech.glide.g.d(i0Var, yVar, obj);
                                } else {
                                    z13 = z14;
                                }
                                j11 >>= i15;
                                i17++;
                                z14 = z13;
                                i15 = i15;
                            }
                            z12 = z14;
                            if (i16 != i15) {
                                break;
                            }
                        } else {
                            z12 = z14;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        z14 = z12;
                    }
                }
                Object obj2 = f0VarM.f39295f;
                y.i0 i0Var2 = x1VarB.f39505g;
                if (i0Var2 == null) {
                    i0Var2 = new y.i0();
                    x1VarB.f39505g = i0Var2;
                }
                i0Var2.m(g0Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.f39519d) {
            try {
                u(obj);
                Object objG = this.L.g(obj);
                if (objG != null) {
                    if (objG instanceof y.j0) {
                        y.j0 j0Var = (y.j0) objG;
                        Object[] objArr = j0Var.f56721b;
                        long[] jArr = j0Var.f56720a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j11 = jArr[i11];
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i11 != length) {
                                        break;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((255 & j11) < 128) {
                                            u((g0) objArr[(i11 << 3) + i13]);
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i12 != 8) {
                                        break;
                                    } else if (i11 != length) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((g0) objG);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
