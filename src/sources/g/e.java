package g;

import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f28299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z11, fz.a aVar, int i11, int i12) {
        super(2);
        this.f28298a = z11;
        this.f28299b = aVar;
        this.f28300c = i11;
        this.f28301d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = t.M(this.f28300c | 1);
        int i11 = this.f28301d;
        se.i.a(this.f28298a, this.f28299b, (l1.n) obj, iM, i11);
        return b0.f48488a;
    }
}
