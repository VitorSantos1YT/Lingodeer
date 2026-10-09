package i7;

import android.os.Handler;
import androidx.media3.common.ParserException;
import b7.f0;
import b7.w;
import p7.w0;
import p7.y0;
import x7.d0;
import x7.e0;
import y6.c0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f34246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.e f34247b = new ob.e(8, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.a f34248c = new g8.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34249d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f34250e;

    public n(o oVar, t7.g gVar) {
        this.f34250e = oVar;
        this.f34246a = new y0(gVar, null, null);
    }

    @Override // x7.e0
    public final void a(w wVar, int i11, int i12) {
        this.f34246a.a(wVar, i11, 0);
    }

    @Override // x7.e0
    public final void b(p pVar) {
        this.f34246a.b(pVar);
    }

    @Override // x7.e0
    public final int c(y6.h hVar, int i11, boolean z11) {
        return this.f34246a.c(hVar, i11, z11);
    }

    @Override // x7.e0
    public final void d(long j11, int i11, int i12, int i13, d0 d0Var) {
        long jE;
        long jN;
        this.f34246a.d(j11, i11, i12, i13, d0Var);
        while (this.f34246a.p(false)) {
            g8.a aVar = this.f34248c;
            aVar.n();
            if (this.f34246a.s(this.f34247b, aVar, 0, false) == -4) {
                aVar.r();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f25117t;
                c0 c0VarJ = this.f34250e.f34253c.j(aVar);
                if (c0VarJ != null) {
                    i8.a aVar2 = (i8.a) c0VarJ.f57178a[0];
                    String str = aVar2.f34260a;
                    String str2 = aVar2.f34261b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jN = f0.N(f0.n(aVar2.f34264e));
                        } catch (ParserException unused) {
                            jN = -9223372036854775807L;
                        }
                        if (jN != -9223372036854775807L) {
                            m mVar = new m(j12, jN);
                            Handler handler = this.f34250e.f34254d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        y0 y0Var = this.f34246a;
        w0 w0Var = y0Var.f46538a;
        synchronized (y0Var) {
            int i14 = y0Var.f46555s;
            jE = i14 == 0 ? -1L : y0Var.e(i14);
        }
        w0Var.b(jE);
    }
}
