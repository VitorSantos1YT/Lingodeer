package ji;

import kotlin.jvm.internal.z;
import vt.n0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f36385b;

    public /* synthetic */ a(int i11, b bVar) {
        this.f36384a = i11;
        this.f36385b = bVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36384a) {
            case 0:
                return ef.e.q(this.f36385b).a(null, null, z.a(n0.class));
            case 1:
                return ef.e.q(this.f36385b).a(null, null, z.a(o0.class));
            case 2:
                return ef.e.q(this.f36385b).a(null, null, z.a(vt.c.class));
            case 3:
                return ef.e.q(this.f36385b).a(null, null, z.a(ur.a.class));
            default:
                return ef.e.q(this.f36385b).a(null, null, z.a(ur.c.class));
        }
    }
}
