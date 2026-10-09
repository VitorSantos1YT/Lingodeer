package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b3 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f57933b;

    public /* synthetic */ b3(long j11, int i11) {
        this.f57932a = i11;
        this.f57933b = j11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f57932a) {
            case 0:
                return com.bumptech.glide.d.G(Long.valueOf(this.f57933b));
            default:
                return new a20.a(2, ry.l.l0(new Object[]{Long.valueOf(this.f57933b), Boolean.FALSE}));
        }
    }
}
