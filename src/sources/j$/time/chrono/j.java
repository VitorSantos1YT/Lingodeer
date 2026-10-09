package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX INFO: loaded from: classes2.dex */
public interface j extends TemporalAccessor, j$.time.temporal.k {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int get(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.ERAS;
        }
        return super.d(fVar);
    }

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.ERA, getValue());
    }
}
