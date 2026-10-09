package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.m, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f35135d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35138c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static p a(int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f35135d;
        }
        return new p(i11, i12, i13);
    }

    public p(int i11, int i12, int i13) {
        this.f35136a = i11;
        this.f35137b = i12;
        this.f35138c = i13;
    }

    @Override // j$.time.temporal.m
    public final Temporal w(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDateB;
        Chronology chronology = (Chronology) chronoLocalDate.d(j$.time.temporal.n.f35177b);
        if (chronology == null || j$.time.chrono.p.f34989d.equals(chronology)) {
            int i11 = this.f35137b;
            if (i11 != 0) {
                long j11 = (((long) this.f35136a) * 12) + ((long) i11);
                if (j11 != 0) {
                    chronoLocalDateB = chronoLocalDate;
                    chronoLocalDateB = chronoLocalDate.b(j11, (TemporalUnit) ChronoUnit.MONTHS);
                }
            } else {
                int i12 = this.f35136a;
                if (i12 != 0) {
                    chronoLocalDateB = chronoLocalDate;
                    chronoLocalDateB = chronoLocalDate.b(i12, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            chronoLocalDateB = chronoLocalDate;
            chronoLocalDateB = chronoLocalDate;
            int i13 = this.f35138c;
            return i13 != 0 ? chronoLocalDateB.b(i13, (TemporalUnit) ChronoUnit.DAYS) : chronoLocalDateB;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + chronology.q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f35136a == pVar.f35136a && this.f35137b == pVar.f35137b && this.f35138c == pVar.f35138c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f35138c, 16) + Integer.rotateLeft(this.f35137b, 8) + this.f35136a;
    }

    public final String toString() {
        if (this == f35135d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i11 = this.f35136a;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('Y');
        }
        int i12 = this.f35137b;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('M');
        }
        int i13 = this.f35138c;
        if (i13 != 0) {
            sb2.append(i13);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
