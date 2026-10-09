package d1;

import java.util.Map;
import rt.u8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22897a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22900d;

    public /* synthetic */ f(long j11, fz.a aVar, boolean z11) {
        this.f22898b = j11;
        this.f22900d = aVar;
        this.f22899c = z11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f22897a) {
            case 0:
                d2.e eVar = (d2.e) obj;
                return eVar.b(new g(0, (fz.a) this.f22900d, qx.p.m(eVar, Float.intBitsToFloat((int) (eVar.f23069a.d() >> 32)) / 2.0f), new g2.p(this.f22898b, 5), this.f22899c));
            default:
                String reviewId = (String) this.f22900d;
                u8 current = (u8) obj;
                kotlin.jvm.internal.m.f(current, "current");
                Map map = current.f50487a;
                kotlin.jvm.internal.m.f(reviewId, "reviewId");
                return this.f22899c ? new u8(ry.x.d0(map, new qy.l(reviewId, Long.valueOf(this.f22898b)))) : new u8(ry.x.Z(reviewId, map));
        }
    }

    public /* synthetic */ f(String str, long j11, boolean z11) {
        this.f22900d = str;
        this.f22898b = j11;
        this.f22899c = z11;
    }
}
