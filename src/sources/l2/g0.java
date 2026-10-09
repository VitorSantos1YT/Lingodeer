package l2;

import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, gz.a {
    public final float H;
    public final List K;
    public final List L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39612f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f39613t;

    public g0(String str, float f5, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f39607a = str;
        this.f39608b = f5;
        this.f39609c = f11;
        this.f39610d = f12;
        this.f39611e = f13;
        this.f39612f = f14;
        this.f39613t = f15;
        this.H = f16;
        this.K = list;
        this.L = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return kotlin.jvm.internal.m.a(this.f39607a, g0Var.f39607a) && this.f39608b == g0Var.f39608b && this.f39609c == g0Var.f39609c && this.f39610d == g0Var.f39610d && this.f39611e == g0Var.f39611e && this.f39612f == g0Var.f39612f && this.f39613t == g0Var.f39613t && this.H == g0Var.H && kotlin.jvm.internal.m.a(this.K, g0Var.K) && kotlin.jvm.internal.m.a(this.L, g0Var.L);
        }
        return false;
    }

    public final int hashCode() {
        return this.L.hashCode() + p0.b(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(this.f39607a.hashCode() * 31, this.f39608b, 31), this.f39609c, 31), this.f39610d, 31), this.f39611e, 31), this.f39612f, 31), this.f39613t, 31), this.H, 31), 31, this.K);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
