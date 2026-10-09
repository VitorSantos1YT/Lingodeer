package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements j$.time.temporal.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35009a;

    public /* synthetic */ f(int i11) {
        this.f35009a = i11;
    }

    @Override // j$.time.temporal.k
    public Temporal f(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.a(chronoField, temporal.k(chronoField).f35186d);
    }

    public Object k(TemporalAccessor temporalAccessor) {
        int i11 = this.f35009a;
        f fVar = j$.time.temporal.n.f35176a;
        switch (i11) {
            case 0:
                return LocalDate.H(temporalAccessor);
            case 1:
                return ZonedDateTime.B(temporalAccessor);
            case 2:
                f fVar2 = DateTimeFormatterBuilder.f35016h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(fVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.h(chronoField)) {
                    return LocalTime.W(temporalAccessor.j(chronoField));
                }
                return null;
            case 4:
                return (ZoneId) temporalAccessor.d(fVar);
            case 5:
                return (Chronology) temporalAccessor.d(j$.time.temporal.n.f35177b);
            case 6:
                return (TemporalUnit) temporalAccessor.d(j$.time.temporal.n.f35178c);
            case 7:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.h(chronoField2)) {
                    return ZoneOffset.c0(temporalAccessor.get(chronoField2));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(fVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.d(j$.time.temporal.n.f35179d);
            case 9:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.h(chronoField3)) {
                    return LocalDate.ofEpochDay(temporalAccessor.j(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f35009a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
