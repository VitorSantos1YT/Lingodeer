package au;

import com.lingodeer.database.model.DauMetricsEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f3046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3047b = new c(9);

    public m0(w9.s sVar) {
        this.f3046a = sVar;
    }

    public final Object a(DauMetricsEntity dauMetricsEntity, xy.i iVar) {
        Object objC = cf.x.C(iVar, this.f3046a, false, true, new b(12, this, dauMetricsEntity));
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }
}
