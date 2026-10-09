package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.j0 f5614c;

    public /* synthetic */ k3(ys.d0 d0Var, jt.j0 j0Var, int i11) {
        this.f5612a = i11;
        this.f5613b = d0Var;
        this.f5614c = j0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String audioPath = (String) obj;
        ht.l audioPlayingState = (ht.l) obj2;
        switch (this.f5612a) {
            case 0:
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
                ys.d0 d0Var = this.f5613b;
                if (d0Var != null) {
                    jh.h.m(d0Var, ns.o.K(audioPath), audioPlayingState, new i3(this.f5614c, 1));
                }
                break;
            default:
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
                ys.d0 d0Var2 = this.f5613b;
                if (d0Var2 != null) {
                    jh.h.m(d0Var2, ns.o.K(audioPath), audioPlayingState, new i3(this.f5614c, 2));
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
