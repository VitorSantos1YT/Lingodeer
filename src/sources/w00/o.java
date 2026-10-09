package w00;

import z00.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00.r f54439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54441c;

    public o(z00.r rVar) {
        this.f54439a = rVar;
    }

    @Override // c10.a
    public final boolean c(z00.a aVar) {
        if (!(aVar instanceof s)) {
            return false;
        }
        if (this.f54440b && this.f54441c == 1) {
            this.f54440b = false;
        }
        return true;
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f54439a;
    }

    @Override // c10.a
    public final boolean h() {
        return true;
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        if (fVar.f54391i) {
            this.f54440b = true;
            this.f54441c = 0;
        } else if (this.f54440b) {
            this.f54441c++;
        }
        return l8.h.a(fVar.f54385c);
    }
}
