package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ad.a0 f26394a = new ad.a0(3, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ad.a0 f26395b = new ad.a0(3, 3, null);

    public static z1.r a(z1.r rVar, s0 s0Var, h1 h1Var, boolean z11, h0.i iVar, boolean z12, fz.f fVar, boolean z13, int i11) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            iVar = null;
        }
        return rVar.i(new o0(s0Var, h1Var, z14, iVar, (i11 & 16) != 0 ? false : z12, f26394a, fVar, (i11 & 128) != 0 ? false : z13));
    }
}
