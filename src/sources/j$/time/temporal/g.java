package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35164a;

    static {
        Duration.B(31556952L, 0);
        Duration.B(7889238L, 0);
    }

    g(String str) {
        this.f35164a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal w(Temporal temporal, long j11) {
        int i11 = a.f35160a[ordinal()];
        if (i11 == 1) {
            f fVar = h.f35167c;
            return temporal.a(fVar, Math.addExact(temporal.get(fVar), j11));
        }
        if (i11 == 2) {
            return temporal.b(j11 / 4, ChronoUnit.YEARS).b((j11 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.m(temporal2, this);
        }
        int i11 = a.f35160a[ordinal()];
        if (i11 == 1) {
            f fVar = h.f35167c;
            return Math.subtractExact(temporal2.j(fVar), temporal.j(fVar));
        }
        if (i11 == 2) {
            return temporal.m(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35164a;
    }
}
