package iv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.i0 f34823b;

    public /* synthetic */ s(kv.i0 i0Var, int i11) {
        this.f34822a = i11;
        this.f34823b = i0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f34822a) {
            case 0:
                return com.bumptech.glide.d.G(this.f34823b);
            default:
                return new a20.a(2, ry.l.l0(new Object[]{this.f34823b, Boolean.FALSE}));
        }
    }
}
