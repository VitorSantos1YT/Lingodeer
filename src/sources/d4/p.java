package d4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends m {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f23198w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f23199x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f23200y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f23201z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final e4.b F0 = new e4.b();
    public j4.f G0 = null;

    @Override // d4.m
    public final void U() {
        for (int i11 = 0; i11 < this.f23196v0; i11++) {
            g gVar = this.f23195u0[i11];
            if (gVar != null) {
                gVar.G = true;
            }
        }
    }

    public abstract void V(int i11, int i12, int i13, int i14);

    public final void W(g gVar, f fVar, int i11, f fVar2, int i12) {
        j4.f fVar3;
        g gVar2;
        while (true) {
            fVar3 = this.G0;
            if (fVar3 != null || (gVar2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((h) gVar2).f23165y0;
            }
        }
        e4.b bVar = this.F0;
        bVar.f24778a = fVar;
        bVar.f24779b = fVar2;
        bVar.f24780c = i11;
        bVar.f24781d = i12;
        fVar3.b(gVar, bVar);
        gVar.P(bVar.f24782e);
        gVar.M(bVar.f24783f);
        gVar.E = bVar.f24785h;
        gVar.J(bVar.f24784g);
    }
}
