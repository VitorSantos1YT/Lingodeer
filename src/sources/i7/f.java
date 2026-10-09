package i7;

import android.net.Uri;
import d7.p;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import p7.s;
import t7.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements t7.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34195b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f34194a = i11;
        this.f34195b = obj;
    }

    @Override // t7.j
    public final void c(t7.l lVar, long j11, long j12) {
        boolean z11;
        switch (this.f34194a) {
            case 0:
                q qVar = (q) lVar;
                g gVar = (g) this.f34195b;
                long j13 = qVar.f52100a;
                p pVar = qVar.f52103d;
                Uri uri = pVar.f23255c;
                s sVar = new s(pVar.f23256d);
                gVar.m.getClass();
                gVar.f34204q.d(sVar, qVar.f52102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                gVar.L = ((Long) qVar.f52105f).longValue() - j11;
                gVar.w(true);
                return;
            default:
                hd.b bVar = (hd.b) this.f34195b;
                synchronized (u7.b.f52815b) {
                    z11 = u7.b.f52816c;
                    break;
                }
                if (z11) {
                    bVar.u();
                    return;
                } else {
                    ((g) bVar.f32184b).v(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // t7.j
    public final f9.e e(t7.l lVar, long j11, long j12, IOException iOException, int i11) {
        switch (this.f34194a) {
            case 0:
                q qVar = (q) lVar;
                g gVar = (g) this.f34195b;
                k7.c cVar = gVar.f34204q;
                long j13 = qVar.f52100a;
                p pVar = qVar.f52103d;
                Uri uri = pVar.f23255c;
                cVar.e(new s(pVar.f23256d), qVar.f52102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                gVar.m.getClass();
                gVar.v(iOException);
                break;
            default:
                ((g) ((hd.b) this.f34195b).f32184b).v(iOException);
                break;
        }
        return t7.n.f52095d;
    }

    @Override // t7.j
    public final void g(t7.l lVar, long j11, long j12, boolean z11) {
        switch (this.f34194a) {
            case 0:
                ((g) this.f34195b).u((q) lVar);
                break;
        }
    }

    private final void a(t7.l lVar, long j11, long j12, boolean z11) {
    }
}
