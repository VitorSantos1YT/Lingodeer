package ad;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ob.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i11) {
        super(19);
        this.f641d = i11;
        this.f642e = obj;
    }

    @Override // ob.u
    public final Object t(ld.b bVar) {
        switch (this.f641d) {
            case 0:
                return ((a0.g) this.f642e).invoke(bVar);
            default:
                Float f5 = (Float) ((ob.u) this.f642e).t(bVar);
                if (f5 == null) {
                    return null;
                }
                return Float.valueOf(f5.floatValue() * 2.55f);
        }
    }
}
