package defpackage;

import fz.a;
import fz.e;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f6399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f6400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f6401d;

    public /* synthetic */ c(g gVar, a aVar, a aVar2, int i11, int i12) {
        this.f6398a = i12;
        this.f6399b = gVar;
        this.f6400c = aVar;
        this.f6401d = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6398a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                android.support.v4.media.session.a.b(this.f6399b, this.f6400c, this.f6401d, nVar, t.M(1));
                break;
            default:
                android.support.v4.media.session.a.a(this.f6399b, this.f6400c, this.f6401d, nVar, t.M(385));
                break;
        }
        return b0.f48488a;
    }
}
