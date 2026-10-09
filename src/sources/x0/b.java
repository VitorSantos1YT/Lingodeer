package x0;

import kotlin.jvm.internal.y;
import s0.u;
import w2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0.d f55572c;

    public /* synthetic */ b(f fVar, z0.d dVar, int i11) {
        this.f55570a = i11;
        this.f55571b = fVar;
        this.f55572c = dVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f55570a) {
            case 0:
                f fVar = this.f55571b;
                a aVar = fVar.f55586f;
                u uVar = new u(this.f55572c, 26);
                y yVar = new y();
                fVar.f55585e.d("dataBuilder", aVar, new pv.c(19, yVar, uVar));
                Object obj = yVar.f38361a;
                if (obj != null) {
                    return (v0.c) obj;
                }
                kotlin.jvm.internal.m.n("result");
                throw null;
            case 1:
                f fVar2 = this.f55571b;
                a aVar2 = fVar2.f55587g;
                b bVar = new b(fVar2, this.f55572c, 2);
                y yVar2 = new y();
                fVar2.f55585e.d("positioner", aVar2, new pv.c(19, yVar2, bVar));
                Object obj2 = yVar2.f38361a;
                if (obj2 != null) {
                    return (f2.c) obj2;
                }
                kotlin.jvm.internal.m.n("result");
                throw null;
            default:
                x xVar = (x) this.f55571b.f55583c.invoke();
                return this.f55572c.l0(xVar).i(xVar.P(0L));
        }
    }
}
