package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface Chronology extends Comparable<Chronology> {
    List A();

    j C(int i11);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    int E(j jVar, int i11);

    ChronoLocalDate I(TemporalAccessor temporalAccessor);

    ChronoLocalDate M();

    ChronoLocalDate R(int i11, int i12, int i13);

    ChronoLocalDate T(Map map, j$.time.format.c0 c0Var);

    boolean X(long j11);

    boolean equals(Object obj);

    int hashCode();

    ChronoLocalDate p(long j11);

    String q();

    String t();

    String toString();

    ChronoLocalDate v(int i11, int i12);

    j$.time.temporal.p z(ChronoField chronoField);

    static Chronology r(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.n.f35177b);
        p pVar = p.f34989d;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(pVar, "defaultObj");
        return pVar;
    }

    static Chronology ofLocale(Locale locale) {
        return a.ofLocale(locale);
    }

    static Chronology of(String str) {
        ConcurrentHashMap concurrentHashMap = a.f34948a;
        Objects.requireNonNull(str, "id");
        do {
            Chronology chronology = (Chronology) a.f34948a.get(str);
            if (chronology == null) {
                chronology = (Chronology) a.f34949b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
        } while (a.B());
        for (Chronology chronology2 : ServiceLoader.load(Chronology.class)) {
            if (str.equals(chronology2.q()) || str.equals(chronology2.t())) {
                return chronology2;
            }
        }
        throw new j$.time.c("Unknown chronology: ".concat(str));
    }

    default ChronoLocalDateTime N(TemporalAccessor temporalAccessor) {
        try {
            return I(temporalAccessor).L(LocalTime.H(temporalAccessor));
        } catch (j$.time.c e8) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    default ChronoZonedDateTime u(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdW = ZoneId.w(temporalAccessor);
            try {
                temporalAccessor = U(Instant.B(temporalAccessor), zoneIdW);
                return temporalAccessor;
            } catch (j$.time.c unused) {
                return i.B(zoneIdW, null, e.w(this, N(temporalAccessor)));
            }
        } catch (j$.time.c e8) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e8);
        }
    }

    default ChronoZonedDateTime U(Instant instant, ZoneId zoneId) {
        return i.H(this, instant, zoneId);
    }
}
