package vt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusKt;
import com.lingodeer.database.model.SRSStatusEntity;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.c1 f54302a;

    public z0(au.c1 c1Var) {
        this.f54302a = c1Var;
    }

    public final bh.i0 a() {
        return new bh.i0(qx.p.l(this.f54302a.f2964a, new String[]{"srs_status"}, new au.a(21)), 14);
    }

    public final gp.r b(int i11, List list, List unitIds) {
        kotlin.jvm.internal.m.f(unitIds, "unitIds");
        return new gp.r(new cj.b(i11, list, this, unitIds, (vy.d) null));
    }

    public final bh.i0 c(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        return new bh.i0(qx.p.l(this.f54302a.f2964a, new String[]{"srs_status"}, new au.f(id2, 21)), 15);
    }

    public final Object d(SRSStatus sRSStatus, xy.c cVar) {
        Objects.toString(sRSStatus);
        SRSStatusEntity sRSStatusEntityAsEntityModel = SRSStatusKt.asEntityModel(sRSStatus);
        au.c1 c1Var = this.f54302a;
        Object objC = cf.x.C(cVar, c1Var.f2964a, false, true, new zi.j(1, c1Var, sRSStatusEntityAsEntityModel));
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? objC : b0Var;
    }

    public final Object e(List list, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new sr.d(14, this, list, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }
}
