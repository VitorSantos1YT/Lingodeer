package ot;

import androidx.lifecycle.livedata.HeRS.DytezVyM;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.o f45995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f45996b;

    public t0(ht.o oVar, n nVar) {
        this.f45995a = oVar;
        this.f45996b = nVar;
    }

    @Override // ot.j1
    public final ht.o a() {
        return this.f45995a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.a(this.f45995a, t0Var.f45995a) && kotlin.jvm.internal.m.a(this.f45996b, t0Var.f45996b);
    }

    public final int hashCode() {
        return this.f45996b.hashCode() + (this.f45995a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceModelM5(courseTestParams=" + this.f45995a + DytezVyM.Orvw + this.f45996b + ")";
    }
}
