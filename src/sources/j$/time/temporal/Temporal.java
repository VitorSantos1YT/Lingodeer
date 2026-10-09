package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(TemporalField temporalField, long j11);

    Temporal b(long j11, TemporalUnit temporalUnit);

    long m(Temporal temporal, TemporalUnit temporalUnit);

    /* JADX INFO: renamed from: e */
    default Temporal i(LocalDate localDate) {
        return localDate.f(this);
    }

    default Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }
}
