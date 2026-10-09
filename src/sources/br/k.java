package br;

import com.lingo.main.ui.MainComposeActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5061b;

    public /* synthetic */ k(MainComposeActivity mainComposeActivity, int i11, int i12) {
        this.f5060a = i12;
        this.f5061b = mainComposeActivity;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5060a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                q.b(this.f5061b, nVar, l1.t.M(1));
                break;
            case 1:
                e.f(this.f5061b, nVar, l1.t.M(1));
                break;
            default:
                e.h(this.f5061b, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }
}
