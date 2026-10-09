package s8;

import b7.f0;
import java.io.EOFException;
import java.io.IOException;
import x7.n;
import x7.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {
    public long H;
    public long K;
    public long L;
    public long M;
    public long N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f51475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f51478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f51480f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f51481t;

    public b(i iVar, long j11, long j12, long j13, long j14, boolean z11) {
        b7.a.d(j11 >= 0 && j12 > j11);
        this.f51478d = iVar;
        this.f51476b = j11;
        this.f51477c = j12;
        if (j13 == j12 - j11 || z11) {
            this.f51480f = j14;
            this.f51479e = 4;
        } else {
            this.f51479e = 0;
        }
        this.f51475a = new f();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    @Override // s8.g
    public final long f(n nVar) throws IOException {
        long j11;
        long j12;
        long jH;
        int i11 = this.f51479e;
        long j13 = this.f51477c;
        f fVar = this.f51475a;
        if (i11 == 0) {
            j11 = 0;
            long position = nVar.getPosition();
            this.f51481t = position;
            this.f51479e = 1;
            long j14 = j13 - 65307;
            if (j14 > position) {
                return j14;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (this.K == this.L) {
                    jH = -1;
                } else {
                    long position2 = nVar.getPosition();
                    if (fVar.b(nVar, this.L)) {
                        fVar.a(nVar, false);
                        nVar.r();
                        long j15 = this.H;
                        long j16 = fVar.f51493b;
                        long j17 = j15 - j16;
                        j12 = 2;
                        int i12 = fVar.f51495d + fVar.f51496e;
                        if (0 > j17 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.L = position2;
                                this.N = j16;
                            } else {
                                this.K = nVar.getPosition() + ((long) i12);
                                this.M = fVar.f51493b;
                            }
                            long j18 = this.L;
                            long j19 = this.K;
                            if (j18 - j19 < 100000) {
                                this.L = j19;
                                jH = j19;
                            } else {
                                long position3 = nVar.getPosition() - (((long) i12) * (j17 <= 0 ? 2L : 1L));
                                long j21 = this.L;
                                long j22 = this.K;
                                jH = f0.h((((j21 - j22) * j17) / (this.N - this.M)) + position3, j22, j21 - 1);
                            }
                        } else {
                            jH = -1;
                        }
                    } else {
                        jH = this.K;
                        if (jH == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jH != -1) {
                        return jH;
                    }
                    this.f51479e = 3;
                }
                j12 = 2;
                if (jH != -1) {
                    return jH;
                }
                this.f51479e = 3;
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j12 = 2;
            }
            while (true) {
                fVar.b(nVar, -1L);
                fVar.a(nVar, false);
                if (fVar.f51493b > this.H) {
                    nVar.r();
                    this.f51479e = 4;
                    return -(this.M + j12);
                }
                nVar.s(fVar.f51495d + fVar.f51496e);
                this.K = nVar.getPosition();
                this.M = fVar.f51493b;
            }
        } else {
            j11 = 0;
        }
        fVar.f51492a = 0;
        fVar.f51493b = j11;
        fVar.f51494c = 0;
        fVar.f51495d = 0;
        fVar.f51496e = 0;
        if (!fVar.b(nVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(nVar, false);
        nVar.s(fVar.f51495d + fVar.f51496e);
        long j23 = fVar.f51493b;
        while ((fVar.f51492a & 4) != 4 && fVar.b(nVar, -1L) && nVar.getPosition() < j13 && fVar.a(nVar, true)) {
            try {
                nVar.s(fVar.f51495d + fVar.f51496e);
                j23 = fVar.f51493b;
            } catch (EOFException unused) {
            }
        }
        this.f51480f = j23;
        this.f51479e = 4;
        return this.f51481t;
    }

    @Override // s8.g
    public final y h() {
        if (this.f51480f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // s8.g
    public final void k(long j11) {
        this.H = f0.h(j11, 0L, this.f51480f - 1);
        this.f51479e = 2;
        this.K = this.f51476b;
        this.L = this.f51477c;
        this.M = 0L;
        this.N = this.f51480f;
    }
}
