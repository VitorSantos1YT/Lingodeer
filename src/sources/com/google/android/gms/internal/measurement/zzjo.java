package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import defpackage.e;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new zzjp();
    public final int H;
    public final int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f11642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f11644f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11645t;

    public zzjo(String str, long j11, boolean z11, double d5, String str2, byte[] bArr, int i11, int i12, int i13) {
        this.f11639a = str;
        this.f11640b = j11;
        this.f11641c = z11;
        this.f11642d = d5;
        this.f11643e = str2;
        this.f11644f = bArr;
        this.f11645t = i11;
        this.H = i12;
        this.K = i13;
    }

    public final void D1(StringBuilder sb2) {
        sb2.append("Flag(");
        String str = this.f11639a;
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f11645t;
        if (i11 == 1) {
            sb2.append(this.f11640b);
        } else if (i11 == 2) {
            sb2.append(this.f11641c);
        } else if (i11 == 3) {
            sb2.append(this.f11642d);
        } else if (i11 == 4) {
            sb2.append("'");
            String str2 = this.f11643e;
            Preconditions.g(str2);
            sb2.append(str2);
            sb2.append("'");
        } else {
            if (i11 != 5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i11).length());
                sb3.append("Invalid type: ");
                sb3.append(str);
                sb3.append(", ");
                sb3.append(i11);
                throw new AssertionError(sb3.toString());
            }
            sb2.append("'");
            byte[] bArr = this.f11644f;
            Preconditions.g(bArr);
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.K);
        sb2.append(")");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(zzjo zzjoVar) {
        int i11;
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.f11639a.compareTo(zzjoVar2.f11639a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i12 = zzjoVar2.f11645t;
        int i13 = this.f11645t;
        if (i13 < i12) {
            i11 = -1;
        } else {
            i11 = i13 != i12 ? 1 : 0;
        }
        if (i11 != 0) {
            return i11;
        }
        if (i13 == 1) {
            long j11 = this.f11640b;
            long j12 = zzjoVar2.f11640b;
            if (j11 >= j12) {
                if (j11 == j12) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i13 == 2) {
            boolean z11 = zzjoVar2.f11641c;
            boolean z12 = this.f11641c;
            if (z12 != z11) {
                if (z12) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i13 == 3) {
            return Double.compare(this.f11642d, zzjoVar2.f11642d);
        }
        if (i13 == 4) {
            String str = zzjoVar2.f11643e;
            String str2 = this.f11643e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i13 != 5) {
            throw new AssertionError(e.g(i13, "Invalid enum value: ", new StringBuilder(String.valueOf(i13).length() + 20)));
        }
        byte[] bArr = zzjoVar2.f11644f;
        byte[] bArr2 = this.f11644f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i14 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i14 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i15 = bArr2[i14] - bArr[i14];
                        if (i15 != 0) {
                            return i15;
                        }
                        i14++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (zzkl.a(this.f11639a, zzjoVar.f11639a)) {
                int i11 = zzjoVar.f11645t;
                int i12 = this.f11645t;
                if (i12 == i11 && this.H == zzjoVar.H && this.K == zzjoVar.K) {
                    if (i12 == 1) {
                        return this.f11640b == zzjoVar.f11640b;
                    }
                    if (i12 == 2) {
                        return this.f11641c == zzjoVar.f11641c;
                    }
                    if (i12 == 3) {
                        return this.f11642d == zzjoVar.f11642d;
                    }
                    if (i12 == 4) {
                        return zzkl.a(this.f11643e, zzjoVar.f11643e);
                    }
                    if (i12 == 5) {
                        return Arrays.equals(this.f11644f, zzjoVar.f11644f);
                    }
                    throw new AssertionError(e.g(i12, "Invalid enum value: ", new StringBuilder(String.valueOf(i12).length() + 20)));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        D1(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.f11639a;
        boolean z11 = str == null;
        int iQ = SafeParcelWriter.q(parcel, 20293);
        if (!z11) {
            SafeParcelWriter.k(parcel, 2, str, false);
        }
        long j11 = this.f11640b;
        if (j11 != 0) {
            SafeParcelWriter.p(parcel, 3, 8);
            parcel.writeLong(j11);
        }
        if (this.f11641c) {
            SafeParcelWriter.p(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d5 = this.f11642d;
        if (d5 != 0.0d) {
            SafeParcelWriter.p(parcel, 5, 8);
            parcel.writeDouble(d5);
        }
        String str2 = this.f11643e;
        if (str2 != null) {
            SafeParcelWriter.k(parcel, 6, str2, false);
        }
        byte[] bArr = this.f11644f;
        if (bArr != null) {
            SafeParcelWriter.c(parcel, 7, bArr, false);
        }
        int i12 = this.f11645t;
        if (i12 != 0) {
            SafeParcelWriter.p(parcel, 8, 4);
            parcel.writeInt(i12);
        }
        int i13 = this.H;
        if (i13 != 0) {
            SafeParcelWriter.p(parcel, 9, 4);
            parcel.writeInt(i13);
        }
        int i14 = this.K;
        if (i14 != 0) {
            SafeParcelWriter.p(parcel, 10, 4);
            parcel.writeInt(i14);
        }
        SafeParcelWriter.r(parcel, iQ);
    }
}
