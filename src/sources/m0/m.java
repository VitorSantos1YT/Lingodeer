package m0;

import b0.h2;
import java.util.List;
import n0.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h2 {
    public final /* synthetic */ int H;
    public final /* synthetic */ int K;
    public final /* synthetic */ long L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f40570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f40571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f40573f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f40574t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, d0 d0Var, int i11, x xVar, int i12, int i13, long j11) {
        super(6);
        this.f40573f = d0Var;
        this.f40574t = xVar;
        this.H = i12;
        this.K = i13;
        this.L = j11;
        this.f40570c = kVar;
        this.f40571d = d0Var;
        this.f40572e = i11;
    }

    public final q s0(int i11, int i12, int i13, int i14, long j11) {
        int i15;
        k kVar = this.f40570c;
        Object objA = kVar.a(i11);
        Object objJ = kVar.f40567b.j(i11);
        List listZ = Z(this.f40571d, i11, j11);
        if (v3.a.f(j11)) {
            i15 = v3.a.j(j11);
        } else {
            if (!v3.a.e(j11)) {
                i0.a.a("does not have fixed height");
            }
            i15 = v3.a.i(j11);
        }
        int i16 = i15;
        v3.m layoutDirection = this.f40573f.f42933b.getLayoutDirection();
        n0.w wVar = this.f40574t.m;
        return new q(i11, objA, i16, i14, layoutDirection, this.H, this.K, listZ, this.L, objJ, wVar, j11, i12, i13);
    }
}
