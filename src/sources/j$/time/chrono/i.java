package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient e f34970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f34971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient ZoneId f34972c;

    public static i B(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new i(zoneId, (ZoneOffset) zoneId, eVar);
        }
        j$.time.zone.f fVarB = zoneId.B();
        LocalDateTime localDateTimeB = LocalDateTime.B(eVar);
        List listF = fVarB.f(localDateTimeB);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            eVar = eVar;
        } else {
            Object objE = fVarB.e(localDateTimeB);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            eVar = eVar.H(eVar.f34958a, 0L, 0L, Duration.B(bVar.f35209d.f34941b - bVar.f35208c.f34941b, 0).getSeconds(), 0L);
            zoneOffset = bVar.f35209d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new i(zoneId, zoneOffset, eVar);
    }

    public static i H(Chronology chronology, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.B().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new i(zoneId, zoneOffsetD, (e) chronology.N(LocalDateTime.Q(instant.getEpochSecond(), instant.f34914b, zoneOffsetD)));
    }

    public static i w(Chronology chronology, Temporal temporal) {
        i iVar = (i) temporal;
        if (chronology.equals(iVar.g())) {
            return iVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.q() + ", actual: " + iVar.g().q());
    }

    public i(ZoneId zoneId, ZoneOffset zoneOffset, e eVar) {
        Objects.requireNonNull(eVar, "dateTime");
        this.f34970a = eVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f34971b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f34972c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset n() {
        return this.f34971b;
    }

    public final int hashCode() {
        return (this.f34970a.hashCode() ^ this.f34971b.f34941b) ^ Integer.rotateLeft(this.f34972c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f34970a.toString() + this.f34971b.f34942c;
        ZoneOffset zoneOffset = this.f34971b;
        ZoneId zoneId = this.f34972c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime x() {
        return this.f34970a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId K() {
        return this.f34972c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime F(ZoneId zoneId) {
        return B(zoneId, this.f34971b, this.f34970a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime o(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f34972c.equals(zoneId)) {
            return this;
        }
        e eVar = this.f34970a;
        return H(g(), Instant.H(eVar.toEpochSecond(this.f34971b), eVar.toLocalTime().f34930d), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime a(TemporalField temporalField, long j11) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i11 = h.f34969a[chronoField.ordinal()];
            if (i11 == 1) {
                return b(j11 - Y(), (TemporalUnit) ChronoUnit.SECONDS);
            }
            if (i11 == 2) {
                ZoneOffset zoneOffsetC0 = ZoneOffset.c0(chronoField.f35149b.a(chronoField, j11));
                e eVar = this.f34970a;
                return H(g(), Instant.H(eVar.toEpochSecond(zoneOffsetC0), eVar.toLocalTime().f34930d), this.f34972c);
            }
            return B(this.f34972c, this.f34971b, this.f34970a.a(temporalField, j11));
        }
        return w(g(), temporalField.W(this, j11));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.Temporal
    public final ChronoZonedDateTime b(long j11, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return i(this.f34970a.b(j11, temporalUnit));
        }
        return w(g(), temporalUnit.w(this, j11));
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeU = g().u(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f34970a.m(chronoZonedDateTimeU.o(this.f34971b).x(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.between(this, chronoZonedDateTimeU);
    }

    private Object writeReplace() {
        return new b0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
