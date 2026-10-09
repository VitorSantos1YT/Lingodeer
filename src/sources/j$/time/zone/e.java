package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f35212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f35213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DayOfWeek f35214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalTime f35215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f35217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoneOffset f35218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZoneOffset f35219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoneOffset f35220i;

    public e(Month month, int i11, DayOfWeek dayOfWeek, LocalTime localTime, boolean z11, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f35212a = month;
        this.f35213b = (byte) i11;
        this.f35214c = dayOfWeek;
        this.f35215d = localTime;
        this.f35216e = z11;
        this.f35217f = dVar;
        this.f35218g = zoneOffset;
        this.f35219h = zoneOffset2;
        this.f35220i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b3;
        int iG0 = this.f35216e ? 86400 : this.f35215d.g0();
        int i11 = this.f35218g.f34941b;
        int i12 = this.f35219h.f34941b - i11;
        int i13 = this.f35220i.f34941b - i11;
        if (iG0 % 3600 == 0) {
            b3 = this.f35216e ? (byte) 24 : this.f35215d.f34927a;
        } else {
            b3 = 31;
        }
        int i14 = i11 % 900 == 0 ? (i11 / 900) + 128 : 255;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        int i16 = (i13 == 0 || i13 == 1800 || i13 == 3600) ? i13 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f35214c;
        dataOutput.writeInt((this.f35212a.getValue() << 28) + ((this.f35213b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b3 << 14) + (this.f35217f.ordinal() << 12) + (i14 << 4) + (i15 << 2) + i16);
        if (b3 == 31) {
            dataOutput.writeInt(iG0);
        }
        if (i14 == 255) {
            dataOutput.writeInt(i11);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f35219h.f34941b);
        }
        if (i16 == 3) {
            dataOutput.writeInt(this.f35220i.f34941b);
        }
    }

    public static e a(DataInput dataInput) {
        LocalTime localTimeB;
        int i11;
        int i12;
        int i13 = dataInput.readInt();
        Month monthJ = Month.J(i13 >>> 28);
        int i14 = ((264241152 & i13) >>> 22) - 32;
        int i15 = (3670016 & i13) >>> 19;
        DayOfWeek dayOfWeekW = i15 == 0 ? null : DayOfWeek.w(i15);
        int i16 = (507904 & i13) >>> 14;
        d dVar = d.values()[(i13 & 12288) >>> 12];
        int i17 = (i13 & 4080) >>> 4;
        int i18 = (i13 & 12) >>> 2;
        int i19 = i13 & 3;
        if (i16 == 31) {
            long j11 = dataInput.readInt();
            LocalTime localTime = LocalTime.f34924e;
            ChronoField.SECOND_OF_DAY.Z(j11);
            int i21 = (int) (j11 / 3600);
            long j12 = j11 - ((long) (i21 * 3600));
            int i22 = (int) (j12 / 60);
            localTimeB = LocalTime.B(i21, i22, (int) (j12 - ((long) (i22 * 60))), 0);
        } else {
            int i23 = i16 % 24;
            LocalTime localTime2 = LocalTime.f34924e;
            ChronoField.HOUR_OF_DAY.Z(i23);
            localTimeB = LocalTime.f34926g[i23];
        }
        ZoneOffset zoneOffsetC0 = ZoneOffset.c0(i17 == 255 ? dataInput.readInt() : (i17 - 128) * 900);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetC0.f34941b;
        }
        ZoneOffset zoneOffsetC1 = ZoneOffset.c0(i11);
        if (i19 == 3) {
            i12 = dataInput.readInt();
        } else {
            i12 = (i19 * 1800) + zoneOffsetC0.f34941b;
        }
        ZoneOffset zoneOffsetC2 = ZoneOffset.c0(i12);
        boolean z11 = i16 == 24;
        Objects.requireNonNull(monthJ, "month");
        Objects.requireNonNull(localTimeB, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i14 < -28 || i14 > 31 || i14 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z11 && !localTimeB.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeB.f34930d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(monthJ, i14, dayOfWeekW, localTimeB, z11, dVar, zoneOffsetC0, zoneOffsetC1, zoneOffsetC2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f35212a == eVar.f35212a && this.f35213b == eVar.f35213b && this.f35214c == eVar.f35214c && this.f35217f == eVar.f35217f && this.f35215d.equals(eVar.f35215d) && this.f35216e == eVar.f35216e && this.f35218g.equals(eVar.f35218g) && this.f35219h.equals(eVar.f35219h) && this.f35220i.equals(eVar.f35220i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG0 = ((this.f35215d.g0() + (this.f35216e ? 1 : 0)) << 15) + (this.f35212a.ordinal() << 11) + ((this.f35213b + 32) << 5);
        DayOfWeek dayOfWeek = this.f35214c;
        return ((this.f35218g.f34941b ^ (this.f35217f.ordinal() + (iG0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f35219h.f34941b) ^ this.f35220i.f34941b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f35220i.f34941b - this.f35219h.f34941b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f35219h);
        sb2.append(" to ");
        sb2.append(this.f35220i);
        sb2.append(", ");
        DayOfWeek dayOfWeek = this.f35214c;
        if (dayOfWeek != null) {
            byte b3 = this.f35213b;
            if (b3 == -1) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f35212a.name());
            } else if (b3 < 0) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f35213b) - 1);
                sb2.append(" of ");
                sb2.append(this.f35212a.name());
            } else {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or after ");
                sb2.append(this.f35212a.name());
                sb2.append(' ');
                sb2.append((int) this.f35213b);
            }
        } else {
            sb2.append(this.f35212a.name());
            sb2.append(' ');
            sb2.append((int) this.f35213b);
        }
        sb2.append(" at ");
        sb2.append(this.f35216e ? "24:00" : this.f35215d.toString());
        sb2.append(" ");
        sb2.append(this.f35217f);
        sb2.append(", standard offset ");
        sb2.append(this.f35218g);
        sb2.append(']');
        return sb2.toString();
    }
}
