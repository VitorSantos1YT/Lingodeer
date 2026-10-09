package w00;

import z00.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00.a f54377b;

    public c(int i11) {
        this.f54376a = i11;
        switch (i11) {
            case 1:
                this.f54377b = new b0();
                break;
            default:
                this.f54377b = new z00.g();
                break;
        }
    }

    @Override // c10.a
    public void a(a10.e eVar) {
        int i11 = this.f54376a;
    }

    @Override // c10.a
    public boolean c(z00.a aVar) {
        switch (this.f54376a) {
            case 0:
                return true;
            default:
                return super.c(aVar);
        }
    }

    @Override // c10.a
    public final z00.a f() {
        switch (this.f54376a) {
            case 0:
                return (z00.g) this.f54377b;
            default:
                return (b0) this.f54377b;
        }
    }

    @Override // c10.a
    public boolean h() {
        switch (this.f54376a) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        switch (this.f54376a) {
            case 0:
                return l8.h.a(fVar.f54385c);
            default:
                return null;
        }
    }

    private final void k(a10.e eVar) {
    }
}
