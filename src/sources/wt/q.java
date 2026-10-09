package wt;

import fr.n3;
import java.util.List;
import vt.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f55344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f55345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f55346c;

    public q(m mVar, v0 v0Var, vt.n0 n0Var) {
        this.f55344a = mVar;
        this.f55345b = v0Var;
        this.f55346c = n0Var;
    }

    public final bh.i0 a(String cwsId) {
        kotlin.jvm.internal.m.f(cwsId, "cwsId");
        return new bh.i0(qx.p.l(((n3) this.f55345b).f27724a.f3103a, new String[]{"review_status"}, new au.f(cwsId, 19)), 10);
    }

    public final n9.n0 b(int i11, List list, List list2, List unitIds) {
        kotlin.jvm.internal.m.f(unitIds, "unitIds");
        return new n9.n0(new gp.r(new ad.b0(((fr.o0) this.f55346c).f27733a.keyLanguage, list, list2, (n3) this.f55345b, unitIds, null)), i11, 2);
    }
}
