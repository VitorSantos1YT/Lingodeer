package g3;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Iterator;
import y.i0;
import y.r0;
import z2.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements b0, Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f28691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y.t f28692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28694d;

    public o() {
        long[] jArr = r0.f56756a;
        this.f28691a = new i0();
    }

    @Override // g3.b0
    public final void b(a0 a0Var, Object obj) {
        boolean z11 = obj instanceof a;
        i0 i0Var = this.f28691a;
        if (z11 && i0Var.c(a0Var)) {
            Object objG = i0Var.g(a0Var);
            kotlin.jvm.internal.m.d(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f28634a;
            if (str == null) {
                str = aVar.f28634a;
            }
            qy.e eVar = aVar2.f28635b;
            if (eVar == null) {
                eVar = aVar.f28635b;
            }
            i0Var.m(a0Var, new a(str, eVar));
        } else {
            i0Var.m(a0Var, obj);
        }
        a0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    public final o d() {
        o oVar = new o();
        oVar.f28693c = this.f28693c;
        oVar.f28694d = this.f28694d;
        i0 i0Var = oVar.f28691a;
        i0Var.getClass();
        i0 from = this.f28691a;
        kotlin.jvm.internal.m.f(from, "from");
        Object[] objArr = from.f56714b;
        Object[] objArr2 = from.f56715c;
        long[] jArr = from.f56713a;
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
                            int i14 = (i11 << 3) + i13;
                            i0Var.m(objArr[i14], objArr2[i14]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return oVar;
    }

    public final Object e(a0 a0Var) {
        Object objG = this.f28691a.g(a0Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + a0Var + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f28691a, oVar.f28691a) && this.f28693c == oVar.f28693c && this.f28694d == oVar.f28694d;
    }

    public final void f(o oVar) {
        i0 i0Var = oVar.f28691a;
        Object[] objArr = i0Var.f56714b;
        Object[] objArr2 = i0Var.f56715c;
        long[] jArr = i0Var.f56713a;
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
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        Object obj2 = objArr2[i14];
                        a0 a0Var = (a0) obj;
                        i0 i0Var2 = this.f28691a;
                        Object objG = i0Var2.g(a0Var);
                        kotlin.jvm.internal.m.d(a0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = a0Var.f28637b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            i0Var2.m(a0Var, objInvoke);
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

    public final int hashCode() {
        return Boolean.hashCode(this.f28694d) + defpackage.e.e(this.f28691a.hashCode() * 31, 31, this.f28693c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        y.t tVar = this.f28692b;
        if (tVar == null) {
            i0 i0Var = this.f28691a;
            i0Var.getClass();
            y.t tVar2 = new y.t(i0Var);
            this.f28692b = tVar2;
            tVar = tVar2;
        }
        return ((y.g) tVar.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f28693c) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        if (this.f28694d) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        i0 i0Var = this.f28691a;
        Object[] objArr = i0Var.f56714b;
        Object[] objArr2 = i0Var.f56715c;
        long[] jArr = i0Var.f56713a;
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
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            sb2.append(str);
                            sb2.append(((a0) obj).f28636a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return g0.D(this) + "{ " + ((Object) sb2) + " }";
    }
}
