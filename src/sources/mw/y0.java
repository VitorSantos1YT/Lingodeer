package mw;

import com.google.common.base.Preconditions;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f42800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f42802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f42803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f42804e;

    public final long a() {
        long j11 = this.f42804e;
        double d5 = j11;
        this.f42804e = Math.min((long) (this.f42802c * d5), this.f42801b);
        double d11 = this.f42803d;
        double d12 = (-d11) * d5;
        double d13 = d11 * d5;
        Preconditions.g(d13 >= d12);
        return j11 + ((long) ((this.f42800a.nextDouble() * (d13 - d12)) + d12));
    }
}
