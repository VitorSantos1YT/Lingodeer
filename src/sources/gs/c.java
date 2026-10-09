package gs;

import js.y;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f29771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f29772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f29773d;

    public /* synthetic */ c(fz.a aVar, fz.a aVar2, y yVar, int i11, int i12) {
        this.f29770a = i12;
        this.f29771b = aVar;
        this.f29772c = aVar2;
        this.f29773d = yVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f29770a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.a(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            case 1:
                a.c(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            case 2:
                a.e(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            case 3:
                a.h(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            case 4:
                a.j(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            case 5:
                a.n(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            case 6:
                a.p(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
            default:
                a.r(this.f29771b, this.f29772c, this.f29773d, nVar, t.M(1));
                break;
        }
        return b0.f48488a;
    }
}
