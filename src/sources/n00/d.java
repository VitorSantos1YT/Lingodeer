package n00;

import java.io.IOException;
import kotlin.jvm.internal.m;
import m00.i0;
import m00.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43068c;

    public d(i0 i0Var, long j11, boolean z11) {
        super(i0Var);
        this.f43066a = j11;
        this.f43067b = z11;
    }

    @Override // m00.r, m00.i0
    public final long read(m00.i sink, long j11) throws IOException {
        m.f(sink, "sink");
        long j12 = this.f43068c;
        long j13 = this.f43066a;
        if (j12 > j13) {
            j11 = 0;
        } else if (this.f43067b) {
            long j14 = j13 - j12;
            if (j14 == 0) {
                return -1L;
            }
            j11 = Math.min(j11, j14);
        }
        long j15 = super.read(sink, j11);
        if (j15 != -1) {
            this.f43068c += j15;
        }
        long j16 = this.f43068c;
        if ((j16 >= j13 || j15 != -1) && j16 <= j13) {
            return j15;
        }
        if (j15 > 0 && j16 > j13) {
            long j17 = sink.f40718b - (j16 - j13);
            m00.i iVar = new m00.i();
            iVar.m0(sink);
            sink.K0(iVar, j17);
            iVar.a();
        }
        StringBuilder sbJ = w4.c.j(j13, "expected ", " bytes but got ");
        sbJ.append(this.f43068c);
        throw new IOException(sbJ.toString());
    }
}
