package l2;

import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i0 {
    public final float H;
    public final int K;
    public final int L;
    public final float M;
    public final float N;
    public final float O;
    public final float P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.t f39653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g2.t f39655f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f39656t;

    public k0(String str, List list, int i11, g2.t tVar, float f5, g2.t tVar2, float f11, float f12, int i12, int i13, float f13, float f14, float f15, float f16) {
        this.f39650a = str;
        this.f39651b = list;
        this.f39652c = i11;
        this.f39653d = tVar;
        this.f39654e = f5;
        this.f39655f = tVar2;
        this.f39656t = f11;
        this.H = f12;
        this.K = i12;
        this.L = i13;
        this.M = f13;
        this.N = f14;
        this.O = f15;
        this.P = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return kotlin.jvm.internal.m.a(this.f39650a, k0Var.f39650a) && kotlin.jvm.internal.m.a(this.f39653d, k0Var.f39653d) && this.f39654e == k0Var.f39654e && kotlin.jvm.internal.m.a(this.f39655f, k0Var.f39655f) && this.f39656t == k0Var.f39656t && this.H == k0Var.H && this.K == k0Var.K && this.L == k0Var.L && this.M == k0Var.M && this.N == k0Var.N && this.O == k0Var.O && this.P == k0Var.P && this.f39652c == k0Var.f39652c && kotlin.jvm.internal.m.a(this.f39651b, k0Var.f39651b);
        }
        return false;
    }

    public final int hashCode() {
        int iB = p0.b(this.f39650a.hashCode() * 31, 31, this.f39651b);
        g2.t tVar = this.f39653d;
        int iA = defpackage.e.a((iB + (tVar != null ? tVar.hashCode() : 0)) * 31, this.f39654e, 31);
        g2.t tVar2 = this.f39655f;
        return Integer.hashCode(this.f39652c) + defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.b(this.L, defpackage.e.b(this.K, defpackage.e.a(defpackage.e.a((iA + (tVar2 != null ? tVar2.hashCode() : 0)) * 31, this.f39656t, 31), this.H, 31), 31), 31), this.M, 31), this.N, 31), this.O, 31), this.P, 31);
    }
}
