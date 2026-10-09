package p7;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements z, y {
    public g1 H;
    public z[] K;
    public m L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z[] f46403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f46404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f46405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p20.c f46406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f46407e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f46408f = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f46409t;

    public j0(p20.c cVar, long[] jArr, z... zVarArr) {
        this.f46406d = cVar;
        this.f46403a = zVarArr;
        cVar.getClass();
        this.L = new m(ImmutableList.s(), ImmutableList.s());
        this.f46405c = new IdentityHashMap();
        this.K = new z[0];
        this.f46404b = new boolean[zVarArr.length];
        for (int i11 = 0; i11 < zVarArr.length; i11++) {
            long j11 = jArr[i11];
            if (j11 != 0) {
                this.f46404b[i11] = true;
                this.f46403a[i11] = new f1(zVarArr[i11], j11);
            }
        }
    }

    @Override // p7.b1
    public final boolean a() {
        return this.L.a();
    }

    @Override // p7.a1
    public final void b(b1 b1Var) {
        y yVar = this.f46409t;
        yVar.getClass();
        yVar.b(this);
    }

    @Override // p7.y
    public final void d(z zVar) {
        ArrayList arrayList = this.f46407e;
        arrayList.remove(zVar);
        if (arrayList.isEmpty()) {
            z[] zVarArr = this.f46403a;
            int i11 = 0;
            for (z zVar2 : zVarArr) {
                i11 += zVar2.t().f46388a;
            }
            y6.p0[] p0VarArr = new y6.p0[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < zVarArr.length; i13++) {
                g1 g1VarT = zVarArr[i13].t();
                int i14 = g1VarT.f46388a;
                int i15 = 0;
                while (i15 < i14) {
                    y6.p0 p0VarA = g1VarT.a(i15);
                    y6.p[] pVarArr = new y6.p[p0VarA.f57304a];
                    for (int i16 = 0; i16 < p0VarA.f57304a; i16++) {
                        y6.p pVar = p0VarA.f57307d[i16];
                        y6.o oVarA = pVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i13);
                        sb2.append(":");
                        String str = pVar.f57279a;
                        if (str == null) {
                            str = BuildConfig.VERSION_NAME;
                        }
                        sb2.append(str);
                        oVarA.f57253a = sb2.toString();
                        pVarArr[i16] = new y6.p(oVarA);
                    }
                    y6.p0 p0Var = new y6.p0(i13 + ":" + p0VarA.f57305b, pVarArr);
                    this.f46408f.put(p0Var, p0VarA);
                    p0VarArr[i12] = p0Var;
                    i15++;
                    i12++;
                }
            }
            this.H = new g1(p0VarArr);
            y yVar = this.f46409t;
            yVar.getClass();
            yVar.d(this);
        }
    }

    @Override // p7.b1
    public final long h() {
        return this.L.h();
    }

    @Override // p7.z
    public final long i(long j11, f7.h1 h1Var) {
        z[] zVarArr = this.K;
        return (zVarArr.length > 0 ? zVarArr[0] : this.f46403a[0]).i(j11, h1Var);
    }

    @Override // p7.z
    public final void j() {
        for (z zVar : this.f46403a) {
            zVar.j();
        }
    }

    @Override // p7.z
    public final long k(long j11) {
        long jK = this.K[0].k(j11);
        int i11 = 1;
        while (true) {
            z[] zVarArr = this.K;
            if (i11 >= zVarArr.length) {
                return jK;
            }
            if (zVarArr[i11].k(jK) != jK) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i11++;
        }
    }

    @Override // p7.z
    public final void l(long j11) {
        for (z zVar : this.K) {
            zVar.l(j11);
        }
    }

    @Override // p7.z
    public final void n(y yVar, long j11) {
        this.f46409t = yVar;
        ArrayList arrayList = this.f46407e;
        z[] zVarArr = this.f46403a;
        Collections.addAll(arrayList, zVarArr);
        for (z zVar : zVarArr) {
            zVar.n(this, j11);
        }
    }

    @Override // p7.z
    public final long r(s7.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j11) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f46405c;
            if (i12 >= length) {
                break;
            }
            z0 z0Var = z0VarArr[i12];
            Integer num = z0Var == null ? null : (Integer) identityHashMap.get(z0Var);
            iArr[i12] = num == null ? -1 : num.intValue();
            s7.s sVar = sVarArr[i12];
            if (sVar != null) {
                String str = sVar.b().f57305b;
                iArr2[i12] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i12] = -1;
            }
            i12++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        z0[] z0VarArr2 = new z0[length2];
        z0[] z0VarArr3 = new z0[sVarArr.length];
        s7.s[] sVarArr2 = new s7.s[sVarArr.length];
        z[] zVarArr = this.f46403a;
        ArrayList arrayList = new ArrayList(zVarArr.length);
        long j12 = j11;
        int i13 = 0;
        while (i13 < zVarArr.length) {
            int i14 = i11;
            while (i14 < sVarArr.length) {
                z0VarArr3[i14] = iArr[i14] == i13 ? z0VarArr[i14] : null;
                if (iArr2[i14] == i13) {
                    s7.s sVar2 = sVarArr[i14];
                    sVar2.getClass();
                    y6.p0 p0Var = (y6.p0) this.f46408f.get(sVar2.b());
                    p0Var.getClass();
                    sVarArr2[i14] = new i0(sVar2, p0Var);
                } else {
                    sVarArr2[i14] = null;
                }
                i14++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            z[] zVarArr2 = zVarArr;
            int i15 = i13;
            long jR = zVarArr2[i13].r(sVarArr2, zArr, z0VarArr3, zArr2, j12);
            if (i15 == 0) {
                j12 = jR;
            } else if (jR != j12) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < sVarArr.length; i16++) {
                if (iArr2[i16] == i15) {
                    z0 z0Var2 = z0VarArr3[i16];
                    z0Var2.getClass();
                    z0VarArr2[i16] = z0VarArr3[i16];
                    identityHashMap.put(z0Var2, Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr3[i16] == i15) {
                    b7.a.j(z0VarArr3[i16] == null);
                }
            }
            if (z11) {
                arrayList.add(zVarArr2[i15]);
            }
            i13 = i15 + 1;
            zVarArr = zVarArr2;
            iArr = iArr3;
            i11 = 0;
        }
        int i17 = i11;
        System.arraycopy(z0VarArr2, i17, z0VarArr, i17, length2);
        this.K = (z[]) arrayList.toArray(new z[i17]);
        AbstractList abstractListE = Lists.e(arrayList, new a7.c(6));
        this.f46406d.getClass();
        this.L = new m(arrayList, abstractListE);
        return j12;
    }

    @Override // p7.z
    public final long s() {
        long j11 = -9223372036854775807L;
        for (z zVar : this.K) {
            long jS = zVar.s();
            if (jS == -9223372036854775807L) {
                if (j11 != -9223372036854775807L && zVar.k(j11) != j11) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j11 == -9223372036854775807L) {
                for (z zVar2 : this.K) {
                    if (zVar2 == zVar) {
                        break;
                    }
                    if (zVar2.k(jS) != jS) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j11 = jS;
            } else if (jS != j11) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j11;
    }

    @Override // p7.z
    public final g1 t() {
        g1 g1Var = this.H;
        g1Var.getClass();
        return g1Var;
    }

    @Override // p7.b1
    public final boolean u(f7.j0 j0Var) {
        ArrayList arrayList = this.f46407e;
        if (arrayList.isEmpty()) {
            return this.L.u(j0Var);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((z) arrayList.get(i11)).u(j0Var);
        }
        return false;
    }

    @Override // p7.b1
    public final long w() {
        return this.L.w();
    }

    @Override // p7.b1
    public final void x(long j11) {
        this.L.x(j11);
    }
}
