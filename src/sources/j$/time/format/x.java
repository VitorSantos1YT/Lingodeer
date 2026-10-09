package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemporalAccessor f35115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f35116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35117c;

    public x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology = dateTimeFormatter.f35015e;
        if (chronology != null) {
            Chronology chronology2 = (Chronology) temporalAccessor.d(j$.time.temporal.n.f35177b);
            ZoneId zoneId = (ZoneId) temporalAccessor.d(j$.time.temporal.n.f35176a);
            ChronoLocalDate chronoLocalDateI = null;
            chronology = Objects.equals(chronology, chronology2) ? null : chronology;
            if (chronology != null) {
                Chronology chronology3 = chronology != null ? chronology : chronology2;
                if (chronology != null) {
                    if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
                        chronoLocalDateI = chronology3.I(temporalAccessor);
                    } else if (chronology != j$.time.chrono.p.f34989d || chronology2 != null) {
                        for (ChronoField chronoField : ChronoField.values()) {
                            if (chronoField.isDateBased() && temporalAccessor.h(chronoField)) {
                                throw new j$.time.c("Unable to apply override chronology '" + chronology + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new w(chronoLocalDateI, temporalAccessor, chronology3, zoneId);
            }
        }
        this.f35115a = temporalAccessor;
        this.f35116b = dateTimeFormatter;
    }

    public final Object b(j$.time.f fVar) {
        TemporalAccessor temporalAccessor = this.f35115a;
        Object objD = temporalAccessor.d(fVar);
        if (objD != null || this.f35117c != 0) {
            return objD;
        }
        throw new j$.time.c("Unable to extract " + fVar + " from temporal " + temporalAccessor);
    }

    public final Long a(TemporalField temporalField) {
        int i11 = this.f35117c;
        TemporalAccessor temporalAccessor = this.f35115a;
        if (i11 <= 0 || temporalAccessor.h(temporalField)) {
            return Long.valueOf(temporalAccessor.j(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.f35115a.toString();
    }
}
