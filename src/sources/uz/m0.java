package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53357a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i[] f53358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xy.i f53359c;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(i[] iVarArr, fz.g gVar) {
        this.f53358b = iVarArr;
        this.f53359c = (xy.i) gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fz.g, xy.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fz.h, xy.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [fz.i, xy.i] */
    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        switch (this.f53357a) {
            case 0:
                Object objA = vz.b.a(n0.f53370a, new l0((vy.d) null, (fz.g) this.f53359c), jVar, dVar, this.f53358b);
                return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
            case 1:
                Object objA2 = vz.b.a(n0.f53370a, new l0((vy.d) null, (fz.h) this.f53359c), jVar, dVar, this.f53358b);
                return objA2 == wy.a.COROUTINE_SUSPENDED ? objA2 : qy.b0.f48488a;
            default:
                Object objA3 = vz.b.a(n0.f53370a, new l0((vy.d) null, (fz.i) this.f53359c), jVar, dVar, this.f53358b);
                return objA3 == wy.a.COROUTINE_SUSPENDED ? objA3 : qy.b0.f48488a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(i[] iVarArr, fz.h hVar) {
        this.f53358b = iVarArr;
        this.f53359c = (xy.i) hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(i[] iVarArr, fz.i iVar) {
        this.f53358b = iVarArr;
        this.f53359c = (xy.i) iVar;
    }
}
