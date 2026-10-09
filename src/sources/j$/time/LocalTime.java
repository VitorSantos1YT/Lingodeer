package j$.time;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements Temporal, j$.time.temporal.k, Comparable<LocalTime>, Serializable {
    public static final LocalTime MIDNIGHT;
    public static final LocalTime NOON;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LocalTime f34924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final LocalTime f34925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LocalTime[] f34926g = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f34927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f34928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f34929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34930d;

    static {
        int i11 = 0;
        while (true) {
            LocalTime[] localTimeArr = f34926g;
            if (i11 < localTimeArr.length) {
                localTimeArr[i11] = new LocalTime(i11, 0, 0, 0);
                i11++;
            } else {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                NOON = localTimeArr[12];
                f34924e = localTime;
                f34925f = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime Q(int i11, int i12, int i13, int i14) {
        ChronoField.HOUR_OF_DAY.Z(i11);
        ChronoField.MINUTE_OF_HOUR.Z(i12);
        ChronoField.SECOND_OF_MINUTE.Z(i13);
        ChronoField.NANO_OF_SECOND.Z(i14);
        return B(i11, i12, i13, i14);
    }

    public static LocalTime W(long j11) {
        ChronoField.NANO_OF_DAY.Z(j11);
        int i11 = (int) (j11 / 3600000000000L);
        long j12 = j11 - (((long) i11) * 3600000000000L);
        int i12 = (int) (j12 / 60000000000L);
        long j13 = j12 - (((long) i12) * 60000000000L);
        int i13 = (int) (j13 / 1000000000);
        return B(i11, i12, i13, (int) (j13 - (((long) i13) * 1000000000)));
    }

    public static LocalTime H(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.n.f35182g);
        if (localTime != null) {
            return localTime;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime B(int i11, int i12, int i13, int i14) {
        if ((i12 | i13 | i14) == 0) {
            return f34926g[i11];
        }
        return new LocalTime(i11, i12, i13, i14);
    }

    public LocalTime(int i11, int i12, int i13, int i14) {
        this.f34927a = (byte) i11;
        this.f34928b = (byte) i12;
        this.f34929c = (byte) i13;
        this.f34930d = i14;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0();
        }
        return temporalField != null && temporalField.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return J(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return f0();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return f0() / 1000;
            }
            return J(temporalField);
        }
        return temporalField.Q(this);
    }

    public final int J(TemporalField temporalField) {
        switch (i.f35123a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.f34930d;
            case 2:
                throw new j$.time.temporal.o("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f34930d / 1000;
            case 4:
                throw new j$.time.temporal.o("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f34930d / 1000000;
            case 6:
                return (int) (f0() / 1000000);
            case 7:
                return this.f34929c;
            case 8:
                return g0();
            case 9:
                return this.f34928b;
            case 10:
                return (this.f34927a * 60) + this.f34928b;
            case 11:
                return this.f34927a % 12;
            case 12:
                int i11 = this.f34927a % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 13:
                return this.f34927a;
            case 14:
                byte b3 = this.f34927a;
                if (b3 == 0) {
                    return 24;
                }
                return b3;
            case 15:
                return this.f34927a / 12;
            default:
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public final Temporal i(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final LocalTime a(TemporalField temporalField, long j11) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.W(this, j11);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.Z(j11);
        switch (i.f35123a[chronoField.ordinal()]) {
            case 1:
                return i0((int) j11);
            case 2:
                return W(j11);
            case 3:
                return i0(((int) j11) * 1000);
            case 4:
                return W(j11 * 1000);
            case 5:
                return i0(((int) j11) * 1000000);
            case 6:
                return W(j11 * 1000000);
            case 7:
                int i11 = (int) j11;
                if (this.f34929c != i11) {
                    ChronoField.SECOND_OF_MINUTE.Z(i11);
                    return B(this.f34927a, this.f34928b, i11, this.f34930d);
                }
                return this;
            case 8:
                return d0(j11 - ((long) g0()));
            case 9:
                int i12 = (int) j11;
                if (this.f34928b != i12) {
                    ChronoField.MINUTE_OF_HOUR.Z(i12);
                    return B(this.f34927a, i12, this.f34929c, this.f34930d);
                }
                return this;
            case 10:
                return b0(j11 - ((long) ((this.f34927a * 60) + this.f34928b)));
            case 11:
                return a0(j11 - ((long) (this.f34927a % 12)));
            case 12:
                if (j11 == 12) {
                    j11 = 0;
                }
                return a0(j11 - ((long) (this.f34927a % 12)));
            case 13:
                int i13 = (int) j11;
                if (this.f34927a != i13) {
                    ChronoField.HOUR_OF_DAY.Z(i13);
                    return B(i13, this.f34928b, this.f34929c, this.f34930d);
                }
                return this;
            case 14:
                if (j11 == 24) {
                    j11 = 0;
                }
                int i14 = (int) j11;
                if (this.f34927a != i14) {
                    ChronoField.HOUR_OF_DAY.Z(i14);
                    return B(i14, this.f34928b, this.f34929c, this.f34930d);
                }
                return this;
            case 15:
                return a0((j11 - ((long) (this.f34927a / 12))) * 12);
            default:
                throw new j$.time.temporal.o(d.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime i0(int i11) {
        if (this.f34930d == i11) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.Z(i11);
        return B(this.f34927a, this.f34928b, this.f34929c, i11);
    }

    @Override // j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j11, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (i.f35124b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return c0(j11);
                case 2:
                    return c0((j11 % 86400000000L) * 1000);
                case 3:
                    return c0((j11 % 86400000) * 1000000);
                case 4:
                    return d0(j11);
                case 5:
                    return b0(j11);
                case 6:
                    return a0(j11);
                case 7:
                    return a0((j11 % 2) * 12);
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.w(this, j11);
    }

    public final LocalTime a0(long j11) {
        return j11 == 0 ? this : B(((((int) (j11 % 24)) + this.f34927a) + 24) % 24, this.f34928b, this.f34929c, this.f34930d);
    }

    public final LocalTime b0(long j11) {
        if (j11 != 0) {
            int i11 = (this.f34927a * 60) + this.f34928b;
            int i12 = ((((int) (j11 % 1440)) + i11) + 1440) % 1440;
            if (i11 != i12) {
                return B(i12 / 60, i12 % 60, this.f34929c, this.f34930d);
            }
        }
        return this;
    }

    public final LocalTime d0(long j11) {
        if (j11 != 0) {
            int i11 = (this.f34928b * 60) + (this.f34927a * 3600) + this.f34929c;
            int i12 = ((((int) (j11 % 86400)) + i11) + 86400) % 86400;
            if (i11 != i12) {
                return B(i12 / 3600, (i12 / 60) % 60, i12 % 60, this.f34930d);
            }
        }
        return this;
    }

    public final LocalTime c0(long j11) {
        if (j11 != 0) {
            long jF0 = f0();
            long j12 = (((j11 % 86400000000000L) + jF0) + 86400000000000L) % 86400000000000L;
            if (jF0 != j12) {
                return B((int) (j12 / 3600000000000L), (int) ((j12 / 60000000000L) % 60), (int) ((j12 / 1000000000) % 60), (int) (j12 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j11, TemporalUnit temporalUnit) {
        return j11 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j11, temporalUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(f fVar) {
        if (fVar == j$.time.temporal.n.f35177b || fVar == j$.time.temporal.n.f35176a || fVar == j$.time.temporal.n.f35180e || fVar == j$.time.temporal.n.f35179d) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f35182g) {
            return this;
        }
        if (fVar == j$.time.temporal.n.f35181f) {
            return null;
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return ChronoUnit.NANOS;
        }
        return fVar.k(this);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.NANO_OF_DAY, f0());
    }

    @Override // j$.time.temporal.Temporal
    public final long m(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeH = H(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jF0 = localTimeH.f0() - f0();
            switch (i.f35124b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jF0;
                case 2:
                    return jF0 / 1000;
                case 3:
                    return jF0 / 1000000;
                case 4:
                    return jF0 / 1000000000;
                case 5:
                    return jF0 / 60000000000L;
                case 6:
                    return jF0 / 3600000000000L;
                case 7:
                    return jF0 / 43200000000000L;
                default:
                    throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.between(this, localTimeH);
    }

    public final int g0() {
        return (this.f34928b * 60) + (this.f34927a * 3600) + this.f34929c;
    }

    public final long f0() {
        return (((long) this.f34929c) * 1000000000) + (((long) this.f34928b) * 60000000000L) + (((long) this.f34927a) * 3600000000000L) + ((long) this.f34930d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f34927a, localTime.f34927a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f34928b, localTime.f34928b)) == 0 && (iCompare = Integer.compare(this.f34929c, localTime.f34929c)) == 0) ? Integer.compare(this.f34930d, localTime.f34930d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.f34927a == localTime.f34927a && this.f34928b == localTime.f34928b && this.f34929c == localTime.f34929c && this.f34930d == localTime.f34930d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jF0 = f0();
        return (int) (jF0 ^ (jF0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b3 = this.f34927a;
        byte b11 = this.f34928b;
        byte b12 = this.f34929c;
        int i11 = this.f34930d;
        sb2.append(b3 < 10 ? "0" : BuildConfig.VERSION_NAME);
        sb2.append((int) b3);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i11 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i11 > 0) {
                sb2.append('.');
                if (i11 % 1000000 == 0) {
                    sb2.append(Integer.toString((i11 / 1000000) + 1000).substring(1));
                } else if (i11 % 1000 == 0) {
                    sb2.append(Integer.toString((i11 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i11 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void j0(DataOutput dataOutput) throws IOException {
        if (this.f34930d == 0) {
            if (this.f34929c == 0) {
                if (this.f34928b == 0) {
                    dataOutput.writeByte(~this.f34927a);
                    return;
                } else {
                    dataOutput.writeByte(this.f34927a);
                    dataOutput.writeByte(~this.f34928b);
                    return;
                }
            }
            dataOutput.writeByte(this.f34927a);
            dataOutput.writeByte(this.f34928b);
            dataOutput.writeByte(~this.f34929c);
            return;
        }
        dataOutput.writeByte(this.f34927a);
        dataOutput.writeByte(this.f34928b);
        dataOutput.writeByte(this.f34929c);
        dataOutput.writeInt(this.f34930d);
    }

    public static LocalTime e0(DataInput dataInput) throws IOException {
        int i11;
        int i12;
        int i13 = dataInput.readByte();
        int i14 = 0;
        if (i13 < 0) {
            i13 = ~i13;
            i12 = 0;
            i11 = 0;
        } else {
            byte b3 = dataInput.readByte();
            if (b3 < 0) {
                int i15 = ~b3;
                i11 = 0;
                i14 = i15;
                i12 = 0;
            } else {
                byte b11 = dataInput.readByte();
                if (b11 < 0) {
                    i12 = ~b11;
                    i11 = 0;
                    i14 = b3;
                } else {
                    i11 = dataInput.readInt();
                    i14 = b3;
                    i12 = b11;
                }
            }
        }
        return Q(i13, i14, i12, i11);
    }
}
