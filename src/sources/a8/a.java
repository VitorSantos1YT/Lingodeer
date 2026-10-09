package a8;

import b7.w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import kw.b;
import x7.a0;
import x7.j;
import x7.m;
import x7.n;
import x7.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f453c;

    public a(int i11) {
        this.f451a = i11;
        switch (i11) {
            case 1:
                this.f452b = new w(4);
                this.f453c = new a0(-1, -1, "image/heif");
                break;
            case 2:
                this.f452b = new w(4);
                this.f453c = new a0(-1, -1, "image/webp");
                break;
            default:
                this.f452b = new w(4);
                this.f453c = new a0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // x7.m
    public final boolean c(n nVar) throws EOFException, InterruptedIOException {
        switch (this.f451a) {
            case 0:
                j jVar = (j) nVar;
                jVar.b(4, false);
                w wVar = this.f452b;
                wVar.F(4);
                jVar.f(wVar.f4039a, 0, 4, false);
                if (wVar.y() != 1718909296) {
                    return false;
                }
                wVar.F(4);
                jVar.f(wVar.f4039a, 0, 4, false);
                return wVar.y() == ((long) 1635150182);
            case 1:
                j jVar2 = (j) nVar;
                jVar2.b(4, false);
                w wVar2 = this.f452b;
                wVar2.F(4);
                jVar2.f(wVar2.f4039a, 0, 4, false);
                if (wVar2.y() != 1718909296) {
                    return false;
                }
                wVar2.F(4);
                jVar2.f(wVar2.f4039a, 0, 4, false);
                return wVar2.y() == ((long) 1751476579);
            default:
                w wVar3 = this.f452b;
                wVar3.F(4);
                j jVar3 = (j) nVar;
                jVar3.f(wVar3.f4039a, 0, 4, false);
                if (wVar3.y() != 1380533830) {
                    return false;
                }
                jVar3.b(4, false);
                wVar3.F(4);
                jVar3.f(wVar3.f4039a, 0, 4, false);
                return wVar3.y() == 1464156752;
        }
    }

    @Override // x7.m
    public final void e(o oVar) {
        switch (this.f451a) {
            case 0:
                this.f453c.e(oVar);
                break;
            case 1:
                this.f453c.e(oVar);
                break;
            default:
                this.f453c.e(oVar);
                break;
        }
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        switch (this.f451a) {
            case 0:
                this.f453c.f(j11, j12);
                break;
            case 1:
                this.f453c.f(j11, j12);
                break;
            default:
                this.f453c.f(j11, j12);
                break;
        }
    }

    @Override // x7.m
    public final int g(n nVar, b bVar) {
        switch (this.f451a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f453c.g(nVar, bVar);
    }

    @Override // x7.m
    public final void release() {
        int i11 = this.f451a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void d() {
    }
}
