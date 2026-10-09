package au;

import com.lingodeer.database.model.SubLearnProgressEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f2984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2985b = new c(21);

    public e1(w9.s sVar) {
        this.f2984a = sVar;
    }

    public final Object a(SubLearnProgressEntity subLearnProgressEntity, xy.c cVar) {
        Object objC = cf.x.C(cVar, this.f2984a, false, true, new d1(0, this, subLearnProgressEntity));
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }
}
