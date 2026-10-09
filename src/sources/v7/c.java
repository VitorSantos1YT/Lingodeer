package v7;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import lf.i0;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f53586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f53587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f53588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f53589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y6.p f53590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f53591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f53592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f53593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f53594i;

    public c(u uVar, b7.y yVar) {
        this.f53586a = uVar;
        uVar.f53692l = yVar;
        this.f53587b = new z(new qh.z(this), uVar);
        this.f53588c = new ArrayDeque();
        this.f53590e = new y6.p(new y6.o());
        this.f53591f = -9223372036854775807L;
        this.f53592g = c0.f53595a;
        this.f53593h = new s.a(2);
        this.f53594i = new a();
    }

    @Override // v7.d0
    public final boolean a() {
        z zVar = this.f53587b;
        long j11 = zVar.f53729i;
        return j11 != -9223372036854775807L && zVar.f53728h == j11;
    }

    @Override // v7.d0
    public final void b(y6.p pVar, long j11, int i11, List list) {
        b7.a.j(list.isEmpty());
        int i12 = pVar.f57298u;
        int i13 = pVar.f57299v;
        y6.p pVar2 = this.f53590e;
        int i14 = pVar2.f57298u;
        z zVar = this.f53587b;
        if (i12 != i14 || i13 != pVar2.f57299v) {
            ar.f fVar = zVar.f53724d;
            long j12 = zVar.f53727g;
            fVar.a(j12 == -9223372036854775807L ? 0L : j12 + 1, new z0(i12, i13));
        }
        float f5 = pVar.f57302y;
        if (f5 != this.f53590e.f57302y) {
            this.f53586a.g(f5);
        }
        this.f53590e = pVar;
        if (j11 != this.f53591f) {
            if (zVar.f53726f.f4018d == 0) {
                zVar.f53722b.f(i11);
                zVar.f53731k = j11;
            } else {
                ar.f fVar2 = zVar.f53725e;
                long j13 = zVar.f53727g;
                fVar2.a(j13 == -9223372036854775807L ? -4611686018427387904L : j13 + 1, Long.valueOf(j11));
            }
            this.f53591f = j11;
        }
    }

    @Override // v7.d0
    public final boolean c() {
        return true;
    }

    @Override // v7.d0
    public final void d(Surface surface, b7.x xVar) {
        this.f53589d = surface;
        this.f53586a.h(surface);
    }

    @Override // v7.d0
    public final Surface e() {
        Surface surface = this.f53589d;
        b7.a.k(surface);
        return surface;
    }

    @Override // v7.d0
    public final boolean f(long j11, g gVar) {
        this.f53588c.add(gVar);
        z zVar = this.f53587b;
        b7.p pVar = zVar.f53726f;
        int i11 = pVar.f4018d;
        long[] jArr = (long[]) pVar.f4020f;
        if (i11 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i12 = pVar.f4016b;
            int i13 = length2 - i12;
            System.arraycopy(jArr, i12, jArr2, 0, i13);
            System.arraycopy((long[]) pVar.f4020f, 0, jArr2, i13, i12);
            pVar.f4016b = 0;
            pVar.f4017c = pVar.f4018d - 1;
            pVar.f4020f = jArr2;
            pVar.f4019e = length - 1;
        }
        int i14 = (pVar.f4017c + 1) & pVar.f4019e;
        pVar.f4017c = i14;
        ((long[]) pVar.f4020f)[i14] = j11;
        pVar.f4018d++;
        zVar.f53727g = j11;
        zVar.f53729i = -9223372036854775807L;
        this.f53593h.execute(new i0(this, 18));
        return true;
    }

    @Override // v7.d0
    public final void g() {
        this.f53586a.e();
    }

    @Override // v7.d0
    public final void h() {
        this.f53586a.d();
    }

    @Override // v7.d0
    public final void i(t tVar) {
        this.f53594i = tVar;
    }

    @Override // v7.d0
    public final void j(long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // v7.d0
    public final void k() {
        z zVar = this.f53587b;
        if (zVar.f53727g == -9223372036854775807L) {
            zVar.f53727g = Long.MIN_VALUE;
            zVar.f53728h = Long.MIN_VALUE;
        }
        zVar.f53729i = zVar.f53727g;
    }

    @Override // v7.d0
    public final void l(f fVar, Executor executor) {
        this.f53592g = fVar;
        this.f53593h = executor;
    }

    @Override // v7.d0
    public final void m(int i11) {
        y yVar = this.f53586a.f53682b;
        if (yVar.f53714j == i11) {
            return;
        }
        yVar.f53714j = i11;
        yVar.d(true);
    }

    @Override // v7.d0
    public final void n(float f5) {
        this.f53586a.i(f5);
    }

    @Override // v7.d0
    public final void o() {
        this.f53589d = null;
        this.f53586a.h(null);
    }

    @Override // v7.d0
    public final void p(boolean z11) {
        if (z11) {
            u uVar = this.f53586a;
            y yVar = uVar.f53682b;
            yVar.m = 0L;
            yVar.f53719p = -1L;
            yVar.f53717n = -1L;
            uVar.f53688h = -9223372036854775807L;
            uVar.f53686f = -9223372036854775807L;
            uVar.f53685e = Math.min(uVar.f53685e, 1);
            uVar.f53689i = -9223372036854775807L;
        }
        z zVar = this.f53587b;
        ar.f fVar = zVar.f53724d;
        b7.p pVar = zVar.f53726f;
        pVar.f4016b = 0;
        pVar.f4017c = -1;
        pVar.f4018d = 0;
        zVar.f53727g = -9223372036854775807L;
        zVar.f53728h = -9223372036854775807L;
        zVar.f53729i = -9223372036854775807L;
        ar.f fVar2 = zVar.f53725e;
        if (fVar2.t() > 0) {
            b7.a.d(fVar2.t() > 0);
            while (fVar2.t() > 1) {
                fVar2.n();
            }
            Object objN = fVar2.n();
            objN.getClass();
            zVar.f53731k = ((Long) objN).longValue();
        }
        if (fVar.t() > 0) {
            b7.a.d(fVar.t() > 0);
            while (fVar.t() > 1) {
                fVar.n();
            }
            Object objN2 = fVar.n();
            objN2.getClass();
            fVar.a(0L, (z0) objN2);
        }
        this.f53588c.clear();
    }

    @Override // v7.d0
    public final void q(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // v7.d0
    public final void r(long j11, long j12) throws VideoSink$VideoSinkException {
        try {
            this.f53587b.a(j11, j12);
        } catch (ExoPlaybackException e8) {
            throw new VideoSink$VideoSinkException(e8, this.f53590e);
        }
    }

    @Override // v7.d0
    public final void s(boolean z11) {
        this.f53586a.c(z11);
    }

    @Override // v7.d0
    public final boolean t(boolean z11) {
        return this.f53586a.b(z11);
    }

    @Override // v7.d0
    public final void u() {
        throw new UnsupportedOperationException();
    }

    @Override // v7.d0
    public final boolean v(y6.p pVar) {
        return true;
    }

    @Override // v7.d0
    public final void w() {
        u uVar = this.f53586a;
        if (uVar.f53685e == 0) {
            uVar.f53685e = 1;
        }
    }

    @Override // v7.d0
    public final void release() {
    }
}
