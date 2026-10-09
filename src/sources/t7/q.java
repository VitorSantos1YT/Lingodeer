package t7;

import android.net.Uri;
import b7.f0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52100a = p7.s.f46460b.getAndIncrement();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.h f52101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d7.p f52103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f52104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f52105f;

    public q(d7.f fVar, d7.h hVar, int i11, p pVar) {
        this.f52103d = new d7.p(fVar);
        this.f52101b = hVar;
        this.f52102c = i11;
        this.f52104e = pVar;
    }

    @Override // t7.l
    public final void e() {
        this.f52103d.f23254b = 0L;
        d7.g gVar = new d7.g(this.f52103d, this.f52101b);
        try {
            gVar.f23218a.u(gVar.f23219b);
            gVar.f23221d = true;
            Uri uriX = this.f52103d.f23253a.x();
            uriX.getClass();
            this.f52105f = this.f52104e.e(uriX, gVar);
        } finally {
            String str = f0.f3975a;
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // t7.l
    public final void k() {
    }
}
