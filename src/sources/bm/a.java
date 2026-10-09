package bm;

import ay.x;
import kotlin.jvm.internal.m;
import n9.q;
import oo.h;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo.a f4459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fv.c f4460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f4462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4463e;

    public a(jo.a mView, int i11) {
        this.f4463e = i11;
        m.f(mView, "mView");
        this.f4459a = mView;
        this.f4462d = new q(29, false);
        ((h) mView).N = this;
    }

    @Override // ii.a
    public final void A() {
        fv.c cVar = this.f4460b;
        if (cVar != null) {
            m.c(cVar);
            cVar.a(this.f4461c);
        }
    }

    public final void a(int i11) {
        j.a(new x(new mo.a(this, i11, 0)).k(ky.e.f38937b).g(px.b.a()).h(new lp.b(this, 2), vx.b.f54316e), this.f4462d);
    }

    @Override // ii.a
    public final void start() {
    }
}
