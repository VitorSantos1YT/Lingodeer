package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f23015b = new x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f23016c = new x(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.firebase.remoteconfig.a f23017d = new com.google.firebase.remoteconfig.a(17);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.firebase.remoteconfig.a f23018e = new com.google.firebase.remoteconfig.a(18);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.firebase.remoteconfig.a f23019f = new com.google.firebase.remoteconfig.a(19);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.firebase.remoteconfig.a f23020g = new com.google.firebase.remoteconfig.a(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23021a;

    public /* synthetic */ x(int i11) {
        this.f23021a = i11;
    }

    @Override // d1.i
    public long a(t tVar, int i11) {
        switch (this.f23021a) {
            case 0:
                String str = ((j3.u0) tVar.f22994e).f35797a.f35784a.f35700b;
                return j3.t.b(s0.o0.t(str, i11), s0.o0.s(str, i11));
            default:
                return ((j3.u0) tVar.f22994e).j(i11);
        }
    }
}
