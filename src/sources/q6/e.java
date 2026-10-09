package q6;

import b1.p;
import gb.r;
import java.util.List;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List cubics, long j11, long j12, boolean z11) {
        super(cubics);
        kotlin.jvm.internal.m.f(cubics, "cubics");
        this.f47481b = j11;
        this.f47482c = j12;
        this.f47483d = z11;
    }

    @Override // q6.g
    public final g a(p pVar) {
        sy.c cVarO = o.o();
        List list = this.f47484a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVarO.add(((c) list.get(i11)).e(pVar));
        }
        return new e(o.e(cVarO), r.X(this.f47481b, pVar), r.X(this.f47482c, pVar), this.f47483d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) y.h.b(this.f47481b)) + ", center=" + ((Object) y.h.b(this.f47482c)) + ", convex=" + this.f47483d;
    }
}
