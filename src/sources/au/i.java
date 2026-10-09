package au;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f3011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3012b = new c(1);

    public i(w9.s sVar) {
        this.f3011a = sVar;
    }

    public final Object a(ArrayList arrayList, xy.i iVar) {
        Object objC = cf.x.C(iVar, this.f3011a, false, true, new b(2, this, arrayList));
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }
}
