package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements j$.time.temporal.m, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34961e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Chronology f34962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34965d;

    static {
        j$.time.b.c(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public f(Chronology chronology, int i11, int i12, int i13) {
        this.f34962a = chronology;
        this.f34963b = i11;
        this.f34964c = i12;
        this.f34965d = i13;
    }

    public final String toString() {
        if (this.f34963b == 0 && this.f34964c == 0 && this.f34965d == 0) {
            return this.f34962a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34962a.toString());
        sb2.append(" P");
        int i11 = this.f34963b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('Y');
        }
        int i12 = this.f34964c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('M');
        }
        int i13 = this.f34965d;
        if (i13 != 0) {
            sb2.append(i13);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public final Temporal w(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDateB;
        Temporal temporalB;
        Chronology chronology = (Chronology) chronoLocalDate.d(j$.time.temporal.n.f35177b);
        if (chronology == null || this.f34962a.equals(chronology)) {
            if (this.f34964c != 0) {
                j$.time.temporal.p pVarZ = this.f34962a.z(ChronoField.MONTH_OF_YEAR);
                long j11 = (pVarZ.f35183a == pVarZ.f35184b && pVarZ.f35185c == pVarZ.f35186d && pVarZ.d()) ? (pVarZ.f35186d - pVarZ.f35183a) + 1 : -1L;
                if (j11 > 0) {
                    temporalB = chronoLocalDate.b((((long) this.f34963b) * j11) + ((long) this.f34964c), (TemporalUnit) ChronoUnit.MONTHS);
                } else {
                    int i11 = this.f34963b;
                    if (i11 != 0) {
                        chronoLocalDateB = chronoLocalDate;
                        chronoLocalDateB = chronoLocalDate.b(i11, (TemporalUnit) ChronoUnit.YEARS);
                    }
                    chronoLocalDateB = chronoLocalDate;
                    temporalB = chronoLocalDateB.b(this.f34964c, (TemporalUnit) ChronoUnit.MONTHS);
                }
            } else {
                int i12 = this.f34963b;
                if (i12 != 0) {
                    temporalB = chronoLocalDate;
                    temporalB = chronoLocalDate.b(i12, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            temporalB = chronoLocalDate;
            int i13 = this.f34965d;
            return i13 != 0 ? temporalB.b(i13, ChronoUnit.DAYS) : temporalB;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + this.f34962a.q() + ", actual: " + chronology.q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f34963b == fVar.f34963b && this.f34964c == fVar.f34964c && this.f34965d == fVar.f34965d && this.f34962a.equals(fVar.f34962a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f34965d, 16) + (Integer.rotateLeft(this.f34964c, 8) + this.f34963b)) ^ this.f34962a.hashCode();
    }

    public Object writeReplace() {
        return new b0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
