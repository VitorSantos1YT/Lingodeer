package au;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w9.s f2964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2965b = new c(20);

    public c1(w9.s sVar) {
        this.f2964a = sVar;
    }

    public final no.g a(List ids) {
        kotlin.jvm.internal.m.f(ids, "ids");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM srs_status WHERE id IN (");
        ew.a.i(ids.size(), sb2);
        sb2.append(")");
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        n nVar = new n(4, string, ids);
        return qx.p.l(this.f2964a, new String[]{"srs_status"}, nVar);
    }
}
