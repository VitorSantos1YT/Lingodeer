package qp;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47922i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(mp.b bVar, long j11, int i11) {
        super(bVar, j11);
        this.f47922i = i11;
    }

    @Override // hi.a
    public final boolean a() {
        switch (this.f47922i) {
        }
        return true;
    }

    @Override // hi.a
    public final String b() {
        switch (this.f47922i) {
        }
        return BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final String c() {
        switch (this.f47922i) {
            case 0:
                return "-1;0;1";
            default:
                return "-1;0;2";
        }
    }

    @Override // hi.a
    public final List g() {
        switch (this.f47922i) {
            case 0:
                break;
        }
        return ry.r.f50854a;
    }

    @Override // hi.a
    public final int i() {
        switch (this.f47922i) {
        }
        return -1;
    }

    @Override // hi.a
    public final void j() {
        int i11 = this.f47922i;
    }

    @Override // hi.a
    public final void k() {
        int i11 = this.f47922i;
    }

    @Override // qp.d
    public final fz.f n() {
        switch (this.f47922i) {
            case 0:
                return e1.f47909a;
            default:
                return t3.f48203a;
        }
    }

    @Override // qp.d
    public final void p() {
        switch (this.f47922i) {
            case 0:
                ((jp.p0) this.f47881a).O(3);
                xx.f fVarH = qx.h.m(2L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(this, 11), c.K);
                th.j.a(fVarH, this.f47887g);
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.c) aVar).f32411b.setOnClickListener(new com.google.android.material.snackbar.a(4, this, fVarH));
                break;
            default:
                ((jp.p0) this.f47881a).O(3);
                xx.f fVarH2 = qx.h.m(2L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new lf.x0(this, 24), c.T);
                th.j.a(fVarH2, this.f47887g);
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.e) aVar2).f32505b.setOnClickListener(new com.google.android.material.snackbar.a(5, this, fVarH2));
                break;
        }
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }
}
