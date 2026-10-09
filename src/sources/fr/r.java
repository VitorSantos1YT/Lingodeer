package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements vt.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.i f27803a;

    public r(au.i iVar) {
        this.f27803a = iVar;
    }

    public final Object a(String str, String str2, boolean z11, String str3, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new l(this, str2, str, z11, str3, null), cVar);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final bh.r b(String languageCode, String value) {
        kotlin.jvm.internal.m.f(languageCode, "languageCode");
        kotlin.jvm.internal.m.f(value, "value");
        return new bh.r(new bh.i0(qx.p.l(this.f27803a.f3011a, new String[]{"bookmark"}, new au.g(languageCode, value, 0)), 1), languageCode, 1);
    }

    public final bh.i0 c(String languageCode) {
        kotlin.jvm.internal.m.f(languageCode, "languageCode");
        return new bh.i0(qx.p.l(this.f27803a.f3011a, new String[]{"bookmark"}, new au.f(languageCode, 1)), 2);
    }

    public final bh.i0 d(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        return new bh.i0(qx.p.l(this.f27803a.f3011a, new String[]{"bookmark"}, new au.f(id2, 0)), 3);
    }
}
