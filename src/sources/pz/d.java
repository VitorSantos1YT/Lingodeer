package pz;

import com.lingodeer.data.model.AchievementLevelType;
import fa.EQx.nuRcCS;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f47223c = new d(-31557014167219200L, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f47224d = new d(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47226b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i11 = e.f47227a;
        i iVar = new i();
        iVar.f47234a = this.f47225a;
        iVar.f47235b = this.f47226b;
        return iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        m.f(other, "other");
        int i11 = m.i(this.f47225a, other.f47225a);
        return i11 != 0 ? i11 : m.h(this.f47226b, other.f47226b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f47225a == dVar.f47225a && this.f47226b == dVar.f47226b;
    }

    public final int hashCode() {
        return (this.f47226b * 51) + Long.hashCode(this.f47225a);
    }

    public final String toString() {
        int[] iArr;
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f47225a;
        long j12 = j11 / 86400;
        long j13 = 0;
        if ((j11 ^ 86400) < 0 && j12 * 86400 != j11) {
            j12--;
        }
        long j14 = j11 % 86400;
        int i11 = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
        long j15 = (j12 + ((long) 719528)) - ((long) 60);
        if (j15 < 0) {
            long j16 = 146097;
            long j17 = ((j15 + 1) / j16) - 1;
            j13 = ((long) 400) * j17;
            j15 += (-j17) * j16;
        }
        long j18 = 400;
        long j19 = ((j18 * j15) + ((long) 591)) / ((long) 146097);
        long j21 = AchievementLevelType.DAY_STREAK_LV_10;
        long j22 = 4;
        long j23 = 100;
        long j24 = j15 - ((j19 / j18) + (((j19 / j22) + (j21 * j19)) - (j19 / j23)));
        if (j24 < 0) {
            j19--;
            j24 = j15 - ((j19 / j18) + (((j19 / j22) + (j21 * j19)) - (j19 / j23)));
        }
        int i12 = (int) j24;
        int i13 = ((i12 * 5) + 2) / 153;
        int i14 = ((i13 + 2) % 12) + 1;
        int i15 = (i12 - (((i13 * 306) + 5) / 10)) + 1;
        int i16 = (int) (j19 + j13 + ((long) (i13 / 10)));
        int i17 = i11 / 3600;
        int i18 = i11 - (i17 * 3600);
        int i19 = i18 / 60;
        int i21 = i18 - (i19 * 60);
        int i22 = 0;
        if (Math.abs(i16) < 1000) {
            StringBuilder sb3 = new StringBuilder();
            if (i16 >= 0) {
                sb3.append(i16 + 10000);
                m.e(sb3.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb3.append(i16 - 10000);
                m.e(sb3.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb2.append((CharSequence) sb3);
        } else {
            if (i16 >= 10000) {
                sb2.append('+');
            }
            sb2.append(i16);
        }
        sb2.append('-');
        f.h(sb2, sb2, i14);
        sb2.append('-');
        f.h(sb2, sb2, i15);
        sb2.append('T');
        f.h(sb2, sb2, i17);
        sb2.append(':');
        f.h(sb2, sb2, i19);
        sb2.append(':');
        f.h(sb2, sb2, i21);
        int i23 = this.f47226b;
        if (i23 != 0) {
            sb2.append('.');
            while (true) {
                int i24 = i22 + 1;
                iArr = f.f47228a;
                if (i23 % iArr[i24] != 0) {
                    break;
                }
                i22 = i24;
            }
            int i25 = i22 - (i22 % 3);
            String strValueOf = String.valueOf((i23 / iArr[i25]) + iArr[9 - i25]);
            m.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            m.e(strSubstring, "substring(...)");
            sb2.append(strSubstring);
        }
        sb2.append('Z');
        return sb2.toString();
    }

    public d(long j11, int i11) {
        this.f47225a = j11;
        this.f47226b = i11;
        if (-31557014167219200L <= j11 && j11 < 31556889864403200L) {
        } else {
            throw new IllegalArgumentException(nuRcCS.rrmOiBIACVhuDgV);
        }
    }
}
