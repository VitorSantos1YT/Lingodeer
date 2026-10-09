package s8;

import b7.f0;
import java.math.BigInteger;
import x7.x;
import x7.y;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f51474a;

    public a(b bVar) {
        this.f51474a = bVar;
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.y
    public final x i(long j11) {
        b bVar = this.f51474a;
        long j12 = (((long) bVar.f51478d.f51510i) * j11) / 1000000;
        long j13 = bVar.f51476b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j12);
        long j14 = bVar.f51477c;
        z zVar = new z(j11, f0.h((bigIntegerValueOf.multiply(BigInteger.valueOf(j14 - j13)).divide(BigInteger.valueOf(bVar.f51480f)).longValue() + j13) - 30000, bVar.f51476b, j14 - 1));
        return new x(zVar, zVar);
    }

    @Override // x7.y
    public final long k() {
        b bVar = this.f51474a;
        return (bVar.f51480f * 1000000) / ((long) bVar.f51478d.f51510i);
    }
}
