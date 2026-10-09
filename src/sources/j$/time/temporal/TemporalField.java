package j$.time.temporal;

import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalField {
    p B(TemporalAccessor temporalAccessor);

    p J();

    long Q(TemporalAccessor temporalAccessor);

    Temporal W(Temporal temporal, long j11);

    boolean isDateBased();

    boolean w(TemporalAccessor temporalAccessor);

    default TemporalAccessor H(Map map, b0 b0Var, c0 c0Var) {
        return null;
    }
}
