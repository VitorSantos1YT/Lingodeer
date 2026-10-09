package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements TemporalAccessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZoneId f35039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Chronology f35040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f35042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ChronoLocalDate f35043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocalTime f35044g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f35038a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j$.time.p f35045h = j$.time.p.f35135d;

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (((HashMap) this.f35038a).containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f35043f;
        if (chronoLocalDate != null && chronoLocalDate.h(temporalField)) {
            return true;
        }
        LocalTime localTime = this.f35044g;
        if (localTime == null || !localTime.h(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.w(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l9 = (Long) ((HashMap) this.f35038a).get(temporalField);
        if (l9 != null) {
            return l9.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f35043f;
        if (chronoLocalDate != null && chronoLocalDate.h(temporalField)) {
            return this.f35043f.j(temporalField);
        }
        LocalTime localTime = this.f35044g;
        if (localTime != null && localTime.h(temporalField)) {
            return this.f35044g.j(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.d.a("Unsupported field: ", temporalField));
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f35176a) {
            return this.f35039b;
        }
        if (fVar == j$.time.temporal.n.f35177b) {
            return this.f35040c;
        }
        if (fVar == j$.time.temporal.n.f35181f) {
            ChronoLocalDate chronoLocalDate = this.f35043f;
            if (chronoLocalDate != null) {
                return LocalDate.H(chronoLocalDate);
            }
            return null;
        }
        if (fVar == j$.time.temporal.n.f35182g) {
            return this.f35044g;
        }
        if (fVar == j$.time.temporal.n.f35179d) {
            Long l9 = (Long) ((HashMap) this.f35038a).get(ChronoField.OFFSET_SECONDS);
            if (l9 != null) {
                return ZoneOffset.c0(l9.intValue());
            }
            ZoneId zoneId = this.f35039b;
            return zoneId instanceof ZoneOffset ? zoneId : fVar.k(this);
        }
        if (fVar == j$.time.temporal.n.f35180e) {
            return fVar.k(this);
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return null;
        }
        return fVar.k(this);
    }

    public final void z(TemporalField temporalField, ChronoField chronoField, Long l9) {
        Long l11 = (Long) ((HashMap) this.f35038a).put(chronoField, l9);
        if (l11 == null || l11.longValue() == l9.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + chronoField + " " + l11 + " differs from " + chronoField + " " + l9 + " while resolving  " + temporalField);
    }

    public final void q() {
        if (((HashMap) this.f35038a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f35039b;
            if (zoneId != null) {
                r(zoneId);
                return;
            }
            Long l9 = (Long) ((HashMap) this.f35038a).get(ChronoField.OFFSET_SECONDS);
            if (l9 != null) {
                r(ZoneOffset.c0(l9.intValue()));
            }
        }
    }

    public final void r(ZoneId zoneId) {
        Map map = this.f35038a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        ChronoZonedDateTime chronoZonedDateTimeU = this.f35040c.U(Instant.ofEpochSecond(((Long) ((HashMap) map).remove(chronoField)).longValue()), zoneId);
        w(chronoZonedDateTimeU.l());
        z(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(chronoZonedDateTimeU.toLocalTime().g0()));
    }

    public final void w(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f35043f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f35043f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f35040c.equals(chronoLocalDate.g())) {
                throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.f35040c);
            }
            this.f35043f = chronoLocalDate;
        }
    }

    public final void u() {
        Map map = this.f35038a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.f35038a).remove(chronoField)).longValue();
            c0 c0Var = this.f35042e;
            if (c0Var == c0.STRICT || (c0Var == c0.SMART && jLongValue != 0)) {
                chronoField.Z(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            z(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f35038a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f35038a).remove(chronoField3)).longValue();
            c0 c0Var2 = this.f35042e;
            if (c0Var2 == c0.STRICT || (c0Var2 == c0.SMART && jLongValue2 != 0)) {
                chronoField3.Z(jLongValue2);
            }
            z(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f35038a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.f35038a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f35038a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f35038a).remove(chronoField5)).longValue();
                if (this.f35042e == c0.LENIENT) {
                    z(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.Z(jLongValue3);
                    chronoField5.Z(jLongValue3);
                    z(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f35038a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f35038a).remove(chronoField6)).longValue();
            if (this.f35042e != c0.LENIENT) {
                chronoField6.Z(jLongValue5);
            }
            z(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            z(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            z(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            z(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f35038a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f35038a).remove(chronoField7)).longValue();
            if (this.f35042e != c0.LENIENT) {
                chronoField7.Z(jLongValue6);
            }
            z(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            z(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f35038a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f35038a).remove(chronoField8)).longValue();
            if (this.f35042e != c0.LENIENT) {
                chronoField8.Z(jLongValue7);
            }
            z(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            z(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f35038a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f35038a).remove(chronoField9)).longValue();
            if (this.f35042e != c0.LENIENT) {
                chronoField9.Z(jLongValue8);
            }
            z(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            z(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            z(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f35038a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f35038a).remove(chronoField10)).longValue();
            if (this.f35042e != c0.LENIENT) {
                chronoField10.Z(jLongValue9);
            }
            z(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            z(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f35038a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f35038a).get(chronoField11)).longValue();
            c0 c0Var3 = this.f35042e;
            c0 c0Var4 = c0.LENIENT;
            if (c0Var3 != c0Var4) {
                chronoField11.Z(jLongValue10);
            }
            Map map11 = this.f35038a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f35038a).remove(chronoField12)).longValue();
                if (this.f35042e != c0Var4) {
                    chronoField12.Z(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                z(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f35038a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f35038a).remove(chronoField13)).longValue();
                if (this.f35042e != c0Var4) {
                    chronoField13.Z(jLongValue12);
                }
                z(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f35038a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.f35038a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.f35038a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.f35038a).containsKey(chronoField11)) {
                    t(((Long) ((HashMap) this.f35038a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.f35038a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.f35038a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.f35038a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void t(long j11, long j12, long j13, long j14) {
        if (this.f35042e == c0.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j11, 3600000000000L), Math.multiplyExact(j12, 60000000000L)), Math.multiplyExact(j13, 1000000000L)), j14);
            v(LocalTime.W(Math.floorMod(jAddExact, 86400000000000L)), j$.time.p.a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.f35149b.a(chronoField, j12);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.f35149b.a(chronoField2, j14);
        if (this.f35042e == c0.SMART && j11 == 24 && iA == 0 && j13 == 0 && iA2 == 0) {
            v(LocalTime.MIDNIGHT, j$.time.p.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.f35149b.a(chronoField3, j11);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        v(LocalTime.Q(iA3, iA, chronoField4.f35149b.a(chronoField4, j13), iA2), j$.time.p.f35135d);
    }

    public final void v(LocalTime localTime, j$.time.p pVar) {
        LocalTime localTime2 = this.f35044g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.f35044g + " " + localTime);
            }
            j$.time.p pVar2 = this.f35045h;
            pVar2.getClass();
            j$.time.p pVar3 = j$.time.p.f35135d;
            if (pVar2 != pVar3 && pVar != pVar3 && !this.f35045h.equals(pVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.f35045h + " " + pVar);
            }
            this.f35045h = pVar;
            return;
        }
        this.f35044g = localTime;
        this.f35045h = pVar;
    }

    public final void p(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f35038a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.h(temporalField)) {
                try {
                    long j11 = temporalAccessor.j(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (j11 != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + temporalField + " " + j11 + " differs from " + temporalField + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f35038a);
        sb2.append(',');
        sb2.append(this.f35040c);
        if (this.f35039b != null) {
            sb2.append(',');
            sb2.append(this.f35039b);
        }
        if (this.f35043f != null || this.f35044g != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f35043f;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f35044g != null) {
                    sb2.append('T');
                    sb2.append(this.f35044g);
                }
            } else {
                sb2.append(this.f35044g);
            }
        }
        return sb2.toString();
    }
}
