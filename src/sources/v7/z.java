package v7;

import android.os.SystemClock;
import b7.f0;
import java.util.NoSuchElementException;
import y6.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh.z f53721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f53722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i9.f f53723c = new i9.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar.f f53724d = new ar.f(1, (byte) 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ar.f f53725e = new ar.f(1, (byte) 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b7.p f53726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f53728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f53729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z0 f53730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f53731k;

    public z(qh.z zVar, u uVar) {
        this.f53721a = zVar;
        this.f53722b = uVar;
        b7.p pVar = new b7.p();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        pVar.f4016b = 0;
        pVar.f4017c = -1;
        pVar.f4018d = 0;
        pVar.f4020f = new long[iHighestOneBit];
        pVar.f4019e = iHighestOneBit - 1;
        this.f53726f = pVar;
        this.f53727g = -9223372036854775807L;
        this.f53730j = z0.f57406d;
        this.f53728h = -9223372036854775807L;
        this.f53729i = -9223372036854775807L;
    }

    public final void a(long j11, long j12) {
        final qh.z zVar = this.f53721a;
        c cVar = (c) zVar.f47797c;
        while (true) {
            b7.p pVar = this.f53726f;
            int i11 = pVar.f4018d;
            if (i11 == 0) {
                return;
            }
            if (i11 == 0) {
                throw new NoSuchElementException();
            }
            long j13 = ((long[]) pVar.f4020f)[pVar.f4016b];
            Long l9 = (Long) this.f53725e.o(j13);
            u uVar = this.f53722b;
            if (l9 != null && l9.longValue() != this.f53731k) {
                this.f53731k = l9.longValue();
                uVar.f(2);
            }
            long j14 = this.f53731k;
            u uVar2 = this.f53722b;
            i9.f fVar = this.f53723c;
            int iA = uVar2.a(j13, j11, j12, j14, false, false, fVar);
            if (iA == 0 || iA == 1) {
                this.f53728h = j13;
                boolean z11 = iA == 0;
                long jE = pVar.e();
                z0 z0Var = (z0) this.f53724d.o(jE);
                if (z0Var != null && !z0Var.equals(z0.f57406d) && !z0Var.equals(this.f53730j)) {
                    this.f53730j = z0Var;
                    y6.o oVar = new y6.o();
                    oVar.f57271t = z0Var.f57407a;
                    oVar.f57272u = z0Var.f57408b;
                    oVar.m = y6.d0.o("video/raw");
                    zVar.f47796b = new y6.p(oVar);
                    cVar.f53593h.execute(new pb.b(16, zVar, z0Var));
                }
                long jNanoTime = z11 ? System.nanoTime() : fVar.f34276b;
                boolean z12 = uVar.f53685e != 3;
                uVar.f53685e = 3;
                uVar.f53692l.getClass();
                uVar.f53687g = f0.K(SystemClock.elapsedRealtime());
                if (z12 && cVar.f53589d != null) {
                    final int i12 = 0;
                    cVar.f53593h.execute(new Runnable() { // from class: v7.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ((c) zVar.f47797c).f53592g.b();
                                    break;
                                default:
                                    ((c) zVar.f47797c).f53592g.c();
                                    break;
                            }
                        }
                    });
                }
                y6.p pVar2 = (y6.p) zVar.f47796b;
                cVar.f53594i.c(jE, jNanoTime, pVar2 == null ? new y6.p(new y6.o()) : pVar2, null);
                g gVar = (g) cVar.f53588c.remove();
                gVar.f53612c.I0(gVar.f53610a, gVar.f53611b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.f53728h = j13;
                pVar.e();
                final int i13 = 1;
                cVar.f53593h.execute(new Runnable() { // from class: v7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                ((c) zVar.f47797c).f53592g.b();
                                break;
                            default:
                                ((c) zVar.f47797c).f53592g.c();
                                break;
                        }
                    }
                });
                g gVar2 = (g) cVar.f53588c.remove();
                gVar2.f53612c.M0(gVar2.f53610a, gVar2.f53611b);
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.f53728h = j13;
            }
        }
    }
}
