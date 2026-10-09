package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35151a;

    static {
        Duration.H(1L);
        Duration.H(1000L);
        Duration.H(1000000L);
        Duration.B(1L, 0);
        Duration.B(60L, 0);
        Duration.B(3600L, 0);
        Duration.B(43200L, 0);
        Duration.B(86400L, 0);
        Duration.B(604800L, 0);
        Duration.B(2629746L, 0);
        Duration.B(31556952L, 0);
        Duration.B(315569520L, 0);
        Duration.B(3155695200L, 0);
        Duration.B(31556952000L, 0);
        Duration.B(31556952000000000L, 0);
        Duration.B(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, 1000000000L)), (int) Math.floorMod(999999999L, 1000000000L));
    }

    ChronoUnit(String str) {
        this.f35151a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal w(Temporal temporal, long j11) {
        return temporal.b(j11, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.m(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35151a;
    }
}
