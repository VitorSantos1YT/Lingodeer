package ji;

import com.lingodeer.data.env.Env;
import kotlin.jvm.internal.z;
import vt.n0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f36394b;

    public /* synthetic */ d(e eVar, int i11) {
        this.f36393a = i11;
        this.f36394b = eVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36393a) {
            case 0:
                return ef.e.q(this.f36394b).a(null, null, z.a(Env.class));
            case 1:
                return ef.e.q(this.f36394b).a(null, null, z.a(n0.class));
            case 2:
                return ef.e.q(this.f36394b).a(null, null, z.a(vt.c.class));
            case 3:
                return ef.e.q(this.f36394b).a(null, null, z.a(o0.class));
            default:
                return ef.e.q(this.f36394b).a(null, null, z.a(ur.a.class));
        }
    }
}
