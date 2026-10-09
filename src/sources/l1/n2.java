package l1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements y1.c, Iterable, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f39381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39383c;

    public n2(m2 m2Var, int i11, int i12) {
        this.f39381a = m2Var;
        this.f39382b = i11;
        this.f39383c = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return n2Var.f39382b == this.f39382b && n2Var.f39383c == this.f39383c && kotlin.jvm.internal.m.a(n2Var.f39381a, this.f39381a);
    }

    public final int hashCode() {
        return (this.f39381a.hashCode() * 31) + this.f39382b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m2 m2Var = this.f39381a;
        if (m2Var.H != this.f39383c) {
            o2.f();
        }
        int i11 = this.f39382b;
        m2Var.h(i11);
        return new n0(m2Var, i11 + 1, m2Var.f39358a[(i11 * 5) + 3] + i11);
    }
}
