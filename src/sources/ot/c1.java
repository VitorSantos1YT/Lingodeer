package ot;

import a.ar.MFeWs;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f45766b;

    public c1(ht.o courseTestParams, u1 u1Var) {
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        this.f45765a = courseTestParams;
        this.f45766b = u1Var;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45765a;
    }

    public final u1 b() {
        return this.f45766b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.m.a(this.f45765a, c1Var.f45765a) && kotlin.jvm.internal.m.a(this.f45766b, c1Var.f45766b);
    }

    public final int hashCode() {
        return this.f45766b.hashCode() + (this.f45765a.hashCode() * 31);
    }

    public final String toString() {
        return bjXGJ.UmrdCxRwHm + this.f45765a + ", data=" + this.f45766b + MFeWs.qstxZuA;
    }
}
