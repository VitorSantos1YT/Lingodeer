package au;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f3103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3104b = new c(19);

    public z0(w9.s sVar) {
        this.f3103a = sVar;
    }

    public final Object a(List list, dr.g gVar) {
        StringBuilder sbN = ep.a.n("DELETE FROM review_status WHERE id IN (");
        ew.a.i(list.size(), sbN);
        sbN.append(")");
        String string = sbN.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        Object objC = cf.x.C(gVar, this.f3103a, false, true, new n(3, string, list));
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }

    public final no.g b() {
        a aVar = new a(19);
        return qx.p.l(this.f3103a, new String[]{"review_status"}, aVar);
    }

    public final Object c(ArrayList arrayList, xy.i iVar) {
        Object objC = cf.x.C(iVar, this.f3103a, false, true, new b(26, this, arrayList));
        return objC == wy.a.COROUTINE_SUSPENDED ? objC : qy.b0.f48488a;
    }
}
