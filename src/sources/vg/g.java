package vg;

import g2.x;
import j3.p0;
import j3.v;
import j3.v0;
import n3.o;
import n3.p;
import n3.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v0 f54030e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54031d;

    static {
        long j11 = x.f28620g;
        f54030e = new v0(new p0(j11, 0L, (s) null, (o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65534), new p0(j11, 0L, (s) null, (o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, u3.l.f52752c, (g2.v0) null, 61438), 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String destination) {
        super(null);
        kotlin.jvm.internal.m.f(destination, "destination");
        this.f54031d = destination;
    }

    @Override // vg.l
    public final Object a(n nVar) {
        return new v(this.f54031d, nVar.f54053h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return kotlin.jvm.internal.m.a(this.f54031d, ((g) obj).f54031d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f54031d.hashCode() * 31;
    }

    public final String toString() {
        return ep.a.g("Link(destination='", this.f54031d, "', linkInteractionListener=null)");
    }
}
