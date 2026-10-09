package iv;

import mt.y3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f34701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34702c;

    public /* synthetic */ d(int i11, fz.c cVar, int i12) {
        this.f34700a = 10;
        this.f34702c = i11;
        this.f34701b = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f34700a) {
            case 0:
                num.intValue();
                o.l(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 1:
                num.intValue();
                o.o(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 2:
                num.intValue();
                o.m(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 3:
                num.intValue();
                o.b(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 4:
                num.intValue();
                o.c(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 5:
                num.intValue();
                b1.i(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 6:
                num.intValue();
                b1.b(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 7:
                num.intValue();
                b1.g(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 8:
                num.intValue();
                b1.f(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 9:
                num.intValue();
                b1.h(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
            case 10:
                num.getClass();
                y3.w(this.f34702c, l1.t.M(1), this.f34701b, nVar);
                break;
            default:
                num.getClass();
                nn.c.i(this.f34701b, nVar, l1.t.M(this.f34702c | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d(fz.c cVar, int i11, int i12) {
        this.f34700a = i12;
        this.f34701b = cVar;
        this.f34702c = i11;
    }
}
