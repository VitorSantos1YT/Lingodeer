package j$.time;

import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.m, Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f34909c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34911b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f34910a, duration2.f34910a);
        return iCompare != 0 ? iCompare : this.f34911b - duration2.f34911b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofDays(long j11) {
        return B(Math.multiplyExact(j11, 86400), 0);
    }

    public static Duration ofMinutes(long j11) {
        return B(Math.multiplyExact(j11, 60), 0);
    }

    public static Duration H(long j11) {
        long j12 = j11 / 1000000000;
        int i11 = (int) (j11 % 1000000000);
        if (i11 < 0) {
            i11 = (int) (((long) i11) + 1000000000);
            j12--;
        }
        return B(j12, i11);
    }

    public static Duration B(long j11, int i11) {
        if ((((long) i11) | j11) == 0) {
            return f34909c;
        }
        return new Duration(j11, i11);
    }

    public Duration(long j11, int i11) {
        this.f34910a = j11;
        this.f34911b = i11;
    }

    public long getSeconds() {
        return this.f34910a;
    }

    @Override // j$.time.temporal.m
    public final Temporal w(ChronoLocalDate chronoLocalDate) {
        long j11 = this.f34910a;
        ChronoLocalDate chronoLocalDateB = chronoLocalDate;
        if (j11 != 0) {
            chronoLocalDateB = chronoLocalDate.b(j11, (TemporalUnit) ChronoUnit.SECONDS);
        }
        int i11 = this.f34911b;
        return i11 != 0 ? chronoLocalDateB.b(i11, (TemporalUnit) ChronoUnit.NANOS) : chronoLocalDateB;
    }

    public long toMillis() {
        long j11 = this.f34910a;
        long j12 = this.f34911b;
        if (j11 < 0) {
            j11++;
            j12 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j11, 1000), j12 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f34910a == duration.f34910a && this.f34911b == duration.f34911b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f34910a;
        return (this.f34911b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        if (this == f34909c) {
            return "PT0S";
        }
        long j11 = this.f34910a;
        if (j11 < 0 && this.f34911b > 0) {
            j11++;
        }
        long j12 = j11 / 3600;
        int i11 = (int) ((j11 % 3600) / 60);
        int i12 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i12 == 0 && this.f34911b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f34910a < 0 && this.f34911b > 0 && i12 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i12);
        }
        if (this.f34911b > 0) {
            int length = sb2.length();
            if (this.f34910a < 0) {
                sb2.append(2000000000 - ((long) this.f34911b));
            } else {
                sb2.append(((long) this.f34911b) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
