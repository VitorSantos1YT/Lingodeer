package j$.time;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient String f34942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f34937d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f34938e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = c0(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f34939f = c0(-64800);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f34940g = c0(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f34941b - this.f34941b;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    public static ZoneOffset a0(String str) {
        int iD0;
        int iD1;
        int iD2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) f34938e).get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iD0 = d0(str, 1, false);
                    iD1 = d0(str, 3, false);
                } else if (length == 6) {
                    iD0 = d0(str, 1, false);
                    iD1 = d0(str, 4, true);
                } else if (length == 7) {
                    iD0 = d0(str, 1, false);
                    iD1 = d0(str, 3, false);
                    iD2 = d0(str, 5, false);
                } else if (length == 9) {
                    iD0 = d0(str, 1, false);
                    iD1 = d0(str, 4, true);
                    iD2 = d0(str, 7, true);
                } else {
                    throw new c("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iD2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new c("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return b0(-iD0, -iD1, -iD2);
            }
            return b0(iD0, iD1, iD2);
        }
        iD0 = d0(str, 1, false);
        iD1 = 0;
        iD2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return b0(-iD0, -iD1, -iD2);
        }
        return b0(iD0, iD1, iD2);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f B() {
        return new j$.time.zone.f(this);
    }

    public static int d0(CharSequence charSequence, int i11, boolean z11) {
        if (z11) {
            String str = (String) charSequence;
            if (str.charAt(i11 - 1) != ':') {
                throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i11);
        char cCharAt2 = str2.charAt(i11 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset Z(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.d(j$.time.temporal.n.f35179d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new c("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public static ZoneOffset b0(int i11, int i12, int i13) {
        if (i11 < -18 || i11 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i11 + " is not in the range -18 to 18");
        }
        if (i11 > 0) {
            if (i12 < 0 || i13 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i11 < 0) {
            if (i12 > 0 || i13 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i12 > 0 && i13 < 0) || (i12 < 0 && i13 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i12 < -59 || i12 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (i13 < -59 || i13 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i13 + " is not in the range -59 to 59");
        }
        if (Math.abs(i11) == 18 && (i12 | i13) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return c0((i12 * 60) + (i11 * 3600) + i13);
    }

    public static ZoneOffset c0(int i11) {
        if (i11 < -64800 || i11 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i11 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i11);
            ConcurrentMap concurrentMap = f34937d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(numValueOf, new ZoneOffset(i11));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(numValueOf);
            f34938e.putIfAbsent(zoneOffset2.f34942c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i11);
    }

    public ZoneOffset(int i11) {
        String string;
        this.f34941b = i11;
        if (i11 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i11);
            StringBuilder sb2 = new StringBuilder();
            int i12 = iAbs / 3600;
            int i13 = (iAbs / 60) % 60;
            sb2.append(i11 < 0 ? "-" : "+");
            sb2.append(i12 < 10 ? "0" : BuildConfig.VERSION_NAME);
            sb2.append(i12);
            sb2.append(i13 < 10 ? ":0" : ":");
            sb2.append(i13);
            int i14 = iAbs % 60;
            if (i14 != 0) {
                sb2.append(i14 < 10 ? ":0" : ":");
                sb2.append(i14);
            }
            string = sb2.toString();
        }
        this.f34942c = string;
    }

    @Override // j$.time.ZoneId
    public final String q() {
        return this.f34942c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.OFFSET_SECONDS;
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f34941b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
        return super.k(temporalField).a(temporalField, j(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f34941b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
        return temporalField.Q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        return (fVar == j$.time.temporal.n.f35179d || fVar == j$.time.temporal.n.f35180e) ? this : super.d(fVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.OFFSET_SECONDS, this.f34941b);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f34941b == ((ZoneOffset) obj).f34941b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f34941b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f34942c;
    }

    private Object writeReplace() {
        return new q((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void W(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        f0(dataOutput);
    }

    public final void f0(DataOutput dataOutput) throws IOException {
        int i11 = this.f34941b;
        int i12 = i11 % 900 == 0 ? i11 / 900 : 127;
        dataOutput.writeByte(i12);
        if (i12 == 127) {
            dataOutput.writeInt(i11);
        }
    }

    public static ZoneOffset e0(DataInput dataInput) throws IOException {
        byte b3 = dataInput.readByte();
        return b3 == 127 ? c0(dataInput.readInt()) : c0(b3 * 900);
    }
}
