package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35186d;

    public static p f(long j11, long j12) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new p(j11, j11, j12, j12);
    }

    public static p g(long j11, long j12, long j13) {
        if (j11 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j12 > j13) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j13) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new p(j11, 1L, j12, j13);
    }

    public p(long j11, long j12, long j13, long j14) {
        this.f35183a = j11;
        this.f35184b = j12;
        this.f35185c = j13;
        this.f35186d = j14;
    }

    public final boolean d() {
        return this.f35183a >= -2147483648L && this.f35186d <= 2147483647L;
    }

    public final boolean e(long j11) {
        return j11 >= this.f35183a && j11 <= this.f35186d;
    }

    public final int a(TemporalField temporalField, long j11) {
        if (d() && e(j11)) {
            return (int) j11;
        }
        throw new j$.time.c(c(temporalField, j11));
    }

    public final void b(TemporalField temporalField, long j11) {
        if (!e(j11)) {
            throw new j$.time.c(c(temporalField, j11));
        }
    }

    public final String c(TemporalField temporalField, long j11) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j11;
        }
        return "Invalid value (valid values " + this + "): " + j11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j11 = this.f35183a;
        long j12 = this.f35184b;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j13 = this.f35185c;
        long j14 = this.f35186d;
        if (j13 > j14) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j12 > j14) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f35183a == pVar.f35183a && this.f35184b == pVar.f35184b && this.f35185c == pVar.f35185c && this.f35186d == pVar.f35186d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f35183a;
        long j12 = this.f35184b;
        long j13 = j11 + (j12 << 16) + (j12 >> 48);
        long j14 = this.f35185c;
        long j15 = j13 + (j14 << 32) + (j14 >> 32);
        long j16 = this.f35186d;
        long j17 = j15 + (j16 << 48) + (j16 >> 16);
        return (int) (j17 ^ (j17 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35183a);
        if (this.f35183a != this.f35184b) {
            sb2.append('/');
            sb2.append(this.f35184b);
        }
        sb2.append(" - ");
        sb2.append(this.f35185c);
        if (this.f35185c != this.f35186d) {
            sb2.append('/');
            sb2.append(this.f35186d);
        }
        return sb2.toString();
    }
}
