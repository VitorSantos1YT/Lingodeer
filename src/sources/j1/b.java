package j1;

import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f35454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f35455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.r f35457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f35458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f35459f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f35460t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, q qVar, boolean z11, z1.r rVar, long j11, long j12, float f5, int i11) {
        super(2);
        this.f35454a = cVar;
        this.f35455b = qVar;
        this.f35456c = z11;
        this.f35457d = rVar;
        this.f35458e = j11;
        this.f35459f = j12;
        this.f35460t = f5;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = t.M(1572865);
        this.f35454a.a(this.f35455b, this.f35456c, this.f35457d, this.f35458e, this.f35459f, this.f35460t, (l1.n) obj, iM);
        return b0.f48488a;
    }
}
