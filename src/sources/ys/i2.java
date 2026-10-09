package ys;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import rt.dd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dd f58062b;

    public /* synthetic */ i2(dd ddVar, int i11) {
        this.f58061a = i11;
        this.f58062b = ddVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58061a) {
            case 0:
                ht.o params = (ht.o) obj;
                String str = (String) obj2;
                kotlin.jvm.internal.m.f(params, "params");
                kotlin.jvm.internal.m.f(str, OCBJEWZHh.TGMPEUtMuJVAvN);
                this.f58062b.F(params, str);
                return qy.b0.f48488a;
            case 1:
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                return this.f58062b.h(jLongValue, bookmarkValue);
            case 2:
                String bookmarkValue2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue2, "bookmarkValue");
                return this.f58062b.v(jLongValue2, bookmarkValue2);
            default:
                String bookmarkValue3 = (String) obj;
                long jLongValue3 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue3, "bookmarkValue");
                return this.f58062b.h(jLongValue3, bookmarkValue3);
        }
    }
}
