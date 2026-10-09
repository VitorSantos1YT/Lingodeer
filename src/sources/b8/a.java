package b8;

import kw.b;
import x7.a0;
import x7.m;
import x7.n;
import x7.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f4048b;

    public a(int i11, byte b3) {
        this.f4047a = i11;
        switch (i11) {
            case 1:
                this.f4048b = new a0(35152, 2, "image/png");
                break;
            default:
                this.f4048b = new a0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // x7.m
    public final boolean c(n nVar) {
        switch (this.f4047a) {
            case 0:
                return ((a0) this.f4048b).c(nVar);
            case 1:
                return ((a0) this.f4048b).c(nVar);
            default:
                return this.f4048b.c(nVar);
        }
    }

    @Override // x7.m
    public final void e(o oVar) {
        switch (this.f4047a) {
            case 0:
                ((a0) this.f4048b).e(oVar);
                break;
            case 1:
                ((a0) this.f4048b).e(oVar);
                break;
            default:
                this.f4048b.e(oVar);
                break;
        }
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        switch (this.f4047a) {
            case 0:
                ((a0) this.f4048b).f(j11, j12);
                break;
            case 1:
                ((a0) this.f4048b).f(j11, j12);
                break;
            default:
                this.f4048b.f(j11, j12);
                break;
        }
    }

    @Override // x7.m
    public final int g(n nVar, b bVar) {
        switch (this.f4047a) {
            case 0:
                return ((a0) this.f4048b).g(nVar, bVar);
            case 1:
                return ((a0) this.f4048b).g(nVar, bVar);
            default:
                return this.f4048b.g(nVar, bVar);
        }
    }

    @Override // x7.m
    public final void release() {
        switch (this.f4047a) {
            case 0:
            case 1:
                break;
            default:
                this.f4048b.release();
                break;
        }
    }

    public a(int i11) {
        this.f4047a = 2;
        if ((i11 & 1) != 0) {
            this.f4048b = new a0(65496, 2, "image/jpeg");
        } else {
            this.f4048b = new f8.a();
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
