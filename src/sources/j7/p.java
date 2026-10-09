package j7;

import com.google.common.math.BigIntegerMath;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xq.c f36158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xq.c f36159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f36160l;

    public p(j jVar, long j11, long j12, long j13, long j14, long j15, List list, long j16, xq.c cVar, xq.c cVar2, long j17, long j18) {
        super(jVar, j11, j12, j13, j15, list, j16, j17, j18);
        this.f36158j = cVar;
        this.f36159k = cVar2;
        this.f36160l = j14;
    }

    @Override // j7.s
    public final j a(m mVar) {
        xq.c cVar = this.f36158j;
        if (cVar == null) {
            return this.f36165a;
        }
        y6.p pVar = mVar.f36144a;
        return new j(cVar.n(0L, 0L, pVar.f57279a, pVar.f57288j), 0L, -1L);
    }

    @Override // j7.n
    public final long d(long j11) {
        List list = this.f36153f;
        if (list != null) {
            return list.size();
        }
        long j12 = this.f36160l;
        if (j12 != -1) {
            return (j12 - this.f36151d) + 1;
        }
        if (j11 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j11).multiply(BigInteger.valueOf(this.f36166b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f36152e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i11 = BigIntegerMath.f17465a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // j7.n
    public final j h(k kVar, long j11) {
        long j12 = this.f36151d;
        List list = this.f36153f;
        long j13 = list != null ? ((q) list.get((int) (j11 - j12))).f36161a : (j11 - j12) * this.f36152e;
        y6.p pVar = kVar.f36144a;
        return new j(this.f36159k.n(j11, j13, pVar.f57279a, pVar.f57288j), 0L, -1L);
    }
}
