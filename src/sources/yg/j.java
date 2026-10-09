package yg;

import l1.b3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f57815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ni.m f57816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg.d f57817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f57818e;

    public /* synthetic */ j(b3 b3Var, ni.m mVar, xg.d dVar, String str, int i11) {
        this.f57814a = i11;
        this.f57815b = b3Var;
        this.f57816c = mVar;
        this.f57817d = dVar;
        this.f57818e = str;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f57814a) {
            case 0:
                com.android.billingclient.api.o oVar = (com.android.billingclient.api.o) this.f57815b.getValue();
                if (oVar != null) {
                    this.f57816c.a(this.f57817d, oVar, this.f57818e);
                }
                break;
            default:
                com.android.billingclient.api.o oVar2 = (com.android.billingclient.api.o) this.f57815b.getValue();
                if (oVar2 != null) {
                    this.f57816c.a(this.f57817d, oVar2, this.f57818e);
                }
                break;
        }
        return b0.f48488a;
    }
}
