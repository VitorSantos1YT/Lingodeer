package com.google.common.base;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Stopwatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ticker f16398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16401d;

    /* JADX INFO: renamed from: com.google.common.base.Stopwatch$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16402a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f16402a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16402a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16402a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16402a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16402a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16402a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16402a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public Stopwatch() {
        this.f16398a = Ticker.f16416a;
    }

    public final long a() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return timeUnit.convert(this.f16399b ? (this.f16398a.a() - this.f16401d) + this.f16400c : this.f16400c, timeUnit);
    }

    public final void b() {
        Preconditions.p("This stopwatch is already running.", !this.f16399b);
        this.f16399b = true;
        this.f16401d = this.f16398a.a();
    }

    public final String toString() {
        String str;
        long jA = this.f16399b ? (this.f16398a.a() - this.f16401d) + this.f16400c : this.f16400c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jA, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jA, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jA, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jA, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jA, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jA, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double dConvert = jA / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        Platform.JdkPatternCompiler jdkPatternCompiler = Platform.f16375a;
        sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb2.append(" ");
        switch (AnonymousClass1.f16402a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb2.append(str);
        return sb2.toString();
    }

    public Stopwatch(Ticker ticker) {
        Preconditions.k(ticker, "ticker");
        this.f16398a = ticker;
    }
}
