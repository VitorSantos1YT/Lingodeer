package rt;

import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ke f50226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f50227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se f50228d;

    public /* synthetic */ p1(ke keVar, String str, se seVar, int i11) {
        this.f50225a = i11;
        this.f50226b = keVar;
        this.f50227c = str;
        this.f50228d = seVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean zA;
        c1 it = (c1) obj;
        switch (this.f50225a) {
            case 0:
                kotlin.jvm.internal.m.f(it, EHjhWcesDUIsIw.eNsRqgagD);
                zA = c2.a(it, this.f50226b, this.f50227c, this.f50228d);
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                zA = c2.a(it, this.f50226b, this.f50227c, this.f50228d);
                break;
        }
        return Boolean.valueOf(zA);
    }
}
