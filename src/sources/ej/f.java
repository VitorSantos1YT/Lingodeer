package ej;

import kotlin.jvm.internal.z;
import wt.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25687b;

    public /* synthetic */ f(g gVar, int i11) {
        this.f25686a = i11;
        this.f25687b = gVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f25686a) {
            case 0:
                return this.f25687b.requireActivity();
            case 1:
                return ef.e.q(this.f25687b).a(null, null, z.a(q.class));
            default:
                return ef.e.q(this.f25687b).a(null, null, z.a(vt.e.class));
        }
    }
}
