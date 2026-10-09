package g;

import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f28317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z11, fz.e eVar, int i11) {
        super(2);
        this.f28316a = z11;
        this.f28317b = eVar;
        this.f28318c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = t.M(this.f28318c | 1);
        se.k.c(this.f28316a, this.f28317b, (l1.n) obj, iM);
        return b0.f48488a;
    }
}
