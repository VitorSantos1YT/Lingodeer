package q0;

import d0.g1;
import g3.k;
import kotlin.jvm.internal.m;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.i f47323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f47324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f47327f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fz.a f47328t;

    public a(boolean z11, h0.i iVar, g1 g1Var, boolean z12, boolean z13, k kVar, fz.a aVar) {
        this.f47322a = z11;
        this.f47323b = iVar;
        this.f47324c = g1Var;
        this.f47325d = z12;
        this.f47326e = z13;
        this.f47327f = kVar;
        this.f47328t = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f47322a == aVar.f47322a && m.a(this.f47323b, aVar.f47323b) && m.a(this.f47324c, aVar.f47324c) && this.f47325d == aVar.f47325d && this.f47326e == aVar.f47326e && m.a(this.f47327f, aVar.f47327f) && this.f47328t == aVar.f47328t;
    }

    @Override // y2.d1
    public final q f() {
        d dVar = new d(this.f47323b, this.f47324c, this.f47325d, this.f47326e, null, this.f47327f, this.f47328t);
        dVar.f47334n0 = this.f47322a;
        return dVar;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f47322a) * 31;
        h0.i iVar = this.f47323b;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        g1 g1Var = this.f47324c;
        int iE = defpackage.e.e(defpackage.e.e((iHashCode2 + (g1Var != null ? g1Var.hashCode() : 0)) * 31, 31, this.f47325d), 31, this.f47326e);
        k kVar = this.f47327f;
        return this.f47328t.hashCode() + ((iE + (kVar != null ? Integer.hashCode(kVar.f28656a) : 0)) * 31);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        d dVar = (d) qVar;
        boolean z11 = dVar.f47334n0;
        boolean z12 = this.f47322a;
        if (z11 != z12) {
            dVar.f47334n0 = z12;
            y2.f.o(dVar);
        }
        dVar.f1(this.f47323b, this.f47324c, this.f47325d, this.f47326e, null, this.f47327f, this.f47328t);
    }
}
