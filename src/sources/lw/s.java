package lw;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f40453d = new k(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f40454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f40455f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f40456t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f40457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f40459c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f40454e = nanos;
        f40455f = -nanos;
        f40456t = TimeUnit.SECONDS.toNanos(1L);
    }

    public s(long j11) {
        k kVar = f40453d;
        long jNanoTime = System.nanoTime();
        this.f40457a = kVar;
        long jMin = Math.min(f40454e, Math.max(f40455f, j11));
        this.f40458b = jNanoTime + jMin;
        this.f40459c = jMin <= 0;
    }

    public final boolean a() {
        if (!this.f40459c) {
            long j11 = this.f40458b;
            this.f40457a.getClass();
            if (j11 - System.nanoTime() > 0) {
                return false;
            }
            this.f40459c = true;
        }
        return true;
    }

    public final long b() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f40457a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f40459c && this.f40458b - jNanoTime <= 0) {
            this.f40459c = true;
        }
        return timeUnit.convert(this.f40458b - jNanoTime, timeUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        k kVar = sVar.f40457a;
        k kVar2 = this.f40457a;
        if (kVar2 == kVar) {
            long j11 = this.f40458b - sVar.f40458b;
            if (j11 < 0) {
                return -1;
            }
            return j11 > 0 ? 1 : 0;
        }
        throw new AssertionError("Tickers (" + kVar2 + " and " + sVar.f40457a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        k kVar = sVar.f40457a;
        k kVar2 = this.f40457a;
        if (kVar2 != null ? kVar2 == kVar : kVar == null) {
            return this.f40458b == sVar.f40458b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f40457a, Long.valueOf(this.f40458b)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jB = b();
        long jAbs = Math.abs(jB);
        long j11 = f40456t;
        long j12 = jAbs / j11;
        long jAbs2 = Math.abs(jB) % j11;
        StringBuilder sb2 = new StringBuilder();
        if (jB < 0) {
            sb2.append('-');
        }
        sb2.append(j12);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        k kVar = f40453d;
        k kVar2 = this.f40457a;
        if (kVar2 != kVar) {
            sb2.append(" (ticker=" + kVar2 + ")");
        }
        return sb2.toString();
    }
}
