package lh;

import fz.e;
import l1.n;
import l1.t;
import mh.i;
import qy.b0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f40148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f40149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f40150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f40151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40152f;

    public /* synthetic */ a(i iVar, fz.a aVar, fz.a aVar2, r rVar, int i11, int i12) {
        this.f40147a = i12;
        this.f40148b = iVar;
        this.f40149c = aVar;
        this.f40150d = aVar2;
        this.f40151e = rVar;
        this.f40152f = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40147a) {
            case 0:
                ((Integer) obj2).getClass();
                ew.a.f(this.f40148b, this.f40149c, this.f40150d, this.f40151e, (n) obj, t.M(this.f40152f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ew.a.e(this.f40148b, this.f40149c, this.f40150d, this.f40151e, (n) obj, t.M(this.f40152f | 1));
                break;
        }
        return b0.f48488a;
    }
}
