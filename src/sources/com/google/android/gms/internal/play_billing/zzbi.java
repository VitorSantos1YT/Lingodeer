package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzbl f12249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12252d;

    public zzbi() {
        this.f12249a = zzbl.f12253a;
    }

    public final void a() {
        if (this.f12250b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f12250b = true;
        this.f12252d = this.f12249a.a();
    }

    public final String toString() {
        String str;
        long jA = this.f12250b ? (this.f12249a.a() - this.f12252d) + this.f12251c : this.f12251c;
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
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jA / timeUnit2.convert(1L, timeUnit)));
        switch (zzbh.f12248a[timeUnit.ordinal()]) {
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
        return ep.a.D(str2, " ", str);
    }

    public zzbi(zzbl zzblVar) {
        if (zzblVar == null) {
            throw new NullPointerException("ticker");
        }
        this.f12249a = zzblVar;
    }
}
