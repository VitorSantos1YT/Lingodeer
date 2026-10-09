package xg;

import kotlin.jvm.internal.z;
import vt.n0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f56058b;

    public /* synthetic */ c(d dVar, int i11) {
        this.f56057a = i11;
        this.f56058b = dVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56057a) {
            case 0:
                return ef.e.q(this.f56058b).a(null, null, z.a(vt.c.class));
            case 1:
                return ef.e.q(this.f56058b).a(null, null, z.a(o0.class));
            case 2:
                return ef.e.q(this.f56058b).a(null, null, z.a(ur.a.class));
            default:
                return ef.e.q(this.f56058b).a(null, null, z.a(n0.class));
        }
    }
}
