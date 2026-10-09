package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f34998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v[] f34999e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f35000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient LocalDate f35001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f35002c;

    static {
        v vVar = new v(-1, LocalDate.of(1868, 1, 1), "Meiji");
        f34998d = vVar;
        f34999e = new v[]{vVar, new v(0, LocalDate.of(1912, 7, 30), "Taisho"), new v(1, LocalDate.of(1926, 12, 25), "Showa"), new v(2, LocalDate.of(1989, 1, 8), "Heisei"), new v(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public final v q() {
        v[] vVarArr = f34999e;
        if (this == vVarArr[vVarArr.length - 1]) {
            return null;
        }
        return r(this.f35000a + 1);
    }

    public v(int i11, LocalDate localDate, String str) {
        this.f35000a = i11;
        this.f35001b = localDate;
        this.f35002c = str;
    }

    public static v r(int i11) {
        int i12 = i11 + 1;
        if (i12 >= 0) {
            v[] vVarArr = f34999e;
            if (i12 < vVarArr.length) {
                return vVarArr[i12];
            }
        }
        throw new j$.time.c("Invalid era: " + i11);
    }

    public static v p(LocalDate localDate) {
        if (localDate.Z(u.f34994d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f34999e.length - 1; length >= 0; length--) {
            v vVar = f34999e[length];
            if (localDate.compareTo((ChronoLocalDate) vVar.f35001b) >= 0) {
                return vVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return this.f35000a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return s.f34992d.z(chronoField);
        }
        return super.k(temporalField);
    }

    public final String toString() {
        return this.f35002c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new b0((byte) 5, this);
    }
}
