package bp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f4664b;

    public /* synthetic */ k(l lVar, int i11) {
        this.f4663a = i11;
        this.f4664b = lVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4663a) {
            case 0:
                return ef.e.q(this.f4664b).a(null, null, kotlin.jvm.internal.z.a(vt.h1.class));
            case 1:
                return ef.e.q(this.f4664b).a(null, null, kotlin.jvm.internal.z.a(ur.a.class));
            default:
                return ef.e.q(this.f4664b).a(null, null, kotlin.jvm.internal.z.a(xt.q.class));
        }
    }
}
