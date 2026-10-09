package n0;

import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f42950b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f42953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42954f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42951c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f42955g = l1.t.B(null);

    public h0(Object obj, i0 i0Var) {
        this.f42949a = obj;
        this.f42950b = i0Var;
    }

    public final h0 a() {
        if (this.f42954f) {
            i0.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f42952d == 0) {
            this.f42950b.f42958a.add(this);
            h0 h0Var = (h0) this.f42955g.getValue();
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.f42953e = h0Var;
        }
        this.f42952d++;
        return this;
    }

    public final void b() {
        if (this.f42954f) {
            return;
        }
        if (this.f42952d <= 0) {
            i0.a.c("Release should only be called once");
        }
        int i11 = this.f42952d - 1;
        this.f42952d = i11;
        if (i11 == 0) {
            this.f42950b.f42958a.remove(this);
            h0 h0Var = this.f42953e;
            if (h0Var != null) {
                h0Var.b();
            }
            this.f42953e = null;
        }
    }
}
