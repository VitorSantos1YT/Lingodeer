package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f42968a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bq.f f42970c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42973f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.m f42969b = new ob.m(23);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42971d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42972e = -1;

    public l0(fz.c cVar) {
        this.f42968a = cVar;
    }

    public final k0 a(int i11, long j11, boolean z11, fz.c cVar) {
        bq.f fVar = this.f42970c;
        if (fVar == null) {
            return g.f42941a;
        }
        a1 a1Var = (a1) fVar.f4946d;
        boolean z12 = a1Var instanceof a;
        z0 z0Var = new z0(fVar, i11, this.f42969b, cVar);
        z0Var.f43045d = new v3.a(j11);
        if (!z12) {
            a1Var.a(z0Var);
        } else if (z11) {
            a aVar = (a) a1Var;
            aVar.f42911b.add(new d1(1, z0Var));
            if (!aVar.f42912c) {
                aVar.f42912c = true;
                aVar.f42910a.post(aVar);
            }
        } else {
            a aVar2 = (a) a1Var;
            aVar2.f42911b.add(new d1(0, z0Var));
            if (!aVar2.f42912c) {
                aVar2.f42912c = true;
                aVar2.f42910a.post(aVar2);
            }
        }
        c3.c.r(i11, "compose:lazy:schedule_prefetch:index");
        return z0Var;
    }
}
