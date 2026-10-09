package g;

import f.x;
import ie.o;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f28309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fz.e f28310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f28311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28312g;

    @Override // f.x
    public final void a() {
        o oVar = this.f28311f;
        if (oVar != null) {
            oVar.b();
        }
        o oVar2 = this.f28311f;
        if (oVar2 != null) {
            oVar2.f34405b = false;
        }
        this.f28312g = false;
    }

    @Override // f.x
    public final void b() {
        o oVar = this.f28311f;
        if (oVar != null && !oVar.f34405b) {
            oVar.b();
            this.f28311f = null;
        }
        if (this.f28311f == null) {
            this.f28311f = new o(this.f28309d, false, this.f28310e, this);
        }
        o oVar2 = this.f28311f;
        if (oVar2 != null) {
            ((tz.h) oVar2.f34406c).k(null);
        }
        o oVar3 = this.f28311f;
        if (oVar3 != null) {
            oVar3.f34405b = false;
        }
        this.f28312g = false;
    }

    @Override // f.x
    public final void c(f.a aVar) {
        super.c(aVar);
        o oVar = this.f28311f;
        if (oVar != null) {
            ((tz.h) oVar.f34406c).i(aVar);
        }
    }

    @Override // f.x
    public final void d(f.a aVar) {
        super.d(aVar);
        o oVar = this.f28311f;
        if (oVar != null) {
            oVar.b();
        }
        if (this.f26172a) {
            this.f28311f = new o(this.f28309d, true, this.f28310e, this);
        }
        this.f28312g = true;
    }
}
