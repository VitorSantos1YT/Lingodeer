package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f28483a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f28484b = new k1("kotlin.time.Duration", e00.e.f24681k);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        int i11 = pz.a.f47220d;
        String value = cVar.l();
        kotlin.jvm.internal.m.f(value, "value");
        try {
            return new pz.a(pz.f.a(value));
        } catch (IllegalArgumentException e8) {
            throw new IllegalArgumentException(ep.a.g("Invalid ISO duration string format: '", value, "'."), e8);
        }
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f28484b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        long j11 = ((pz.a) obj).f47221a;
        int i11 = pz.a.f47220d;
        StringBuilder sb2 = new StringBuilder();
        if (j11 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jL = j11 < 0 ? pz.a.l(j11) : j11;
        long j12 = pz.a.j(jL, pz.c.HOURS);
        boolean z11 = false;
        int iJ = pz.a.g(jL) ? 0 : (int) (pz.a.j(jL, pz.c.MINUTES) % ((long) 60));
        int iJ2 = pz.a.g(jL) ? 0 : (int) (pz.a.j(jL, pz.c.SECONDS) % ((long) 60));
        int iF = pz.a.f(jL);
        if (pz.a.g(j11)) {
            j12 = 9999999999999L;
        }
        boolean z12 = j12 != 0;
        boolean z13 = (iJ2 == 0 && iF == 0) ? false : true;
        if (iJ != 0 || (z13 && z12)) {
            z11 = true;
        }
        if (z12) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(iJ);
            sb2.append('M');
        }
        if (z13 || (!z12 && !z11)) {
            pz.a.b(sb2, iJ2, iF, 9, "S", true);
        }
        dVar.F(sb2.toString());
    }
}
