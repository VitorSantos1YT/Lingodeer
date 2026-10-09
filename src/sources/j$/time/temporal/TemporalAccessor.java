package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean h(TemporalField temporalField);

    long j(TemporalField temporalField);

    default p k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.B(this);
        }
        if (h(temporalField)) {
            return ((ChronoField) temporalField).f35149b;
        }
        throw new o(j$.time.d.a("Unsupported field: ", temporalField));
    }

    default int get(TemporalField temporalField) {
        p pVarK = k(temporalField);
        if (!pVarK.d()) {
            throw new o("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j11 = j(temporalField);
        if (pVarK.e(j11)) {
            return (int) j11;
        }
        throw new j$.time.c("Invalid value for " + temporalField + " (valid values " + pVarK + "): " + j11);
    }

    default Object d(j$.time.f fVar) {
        if (fVar == n.f35176a || fVar == n.f35177b || fVar == n.f35178c) {
            return null;
        }
        return fVar.k(this);
    }
}
