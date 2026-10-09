package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new zzbp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12574d;

    public zzbo(int i11, int i12, long j11, long j12) {
        this.f12571a = i11;
        this.f12572b = i12;
        this.f12573c = j11;
        this.f12574d = j12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f12571a == zzboVar.f12571a && this.f12572b == zzboVar.f12572b && this.f12573c == zzboVar.f12573c && this.f12574d == zzboVar.f12574d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12572b), Integer.valueOf(this.f12571a), Long.valueOf(this.f12574d), Long.valueOf(this.f12573c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f12571a + " Cell status: " + this.f12572b + " elapsed time NS: " + this.f12574d + " system time ms: " + this.f12573c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12571a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12572b);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f12573c);
        SafeParcelWriter.p(parcel, 4, 8);
        parcel.writeLong(this.f12574d);
        SafeParcelWriter.r(parcel, iQ);
    }
}
