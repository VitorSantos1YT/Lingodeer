package bm;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements ii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo.b f4464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fv.c f4465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4467d;

    public c(jo.b mView, int i11) {
        this.f4467d = i11;
        m.f(mView, "mView");
        this.f4464a = mView;
        ((oo.m) mView).N = this;
    }

    @Override // ii.a
    public final void A() {
        fv.c cVar = this.f4465b;
        if (cVar != null) {
            m.c(cVar);
            cVar.a(this.f4466c);
        }
    }

    @Override // ii.a
    public final void start() {
    }
}
