package ah;

import av.y;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20.a f709b;

    public /* synthetic */ b(e20.a aVar, int i11) {
        this.f708a = i11;
        this.f709b = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f708a) {
            case 0:
                return (y) this.f709b.a(null, null, z.a(y.class));
            default:
                return (fv.c) this.f709b.a(null, null, z.a(fv.c.class));
        }
    }
}
