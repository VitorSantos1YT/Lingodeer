package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12523a = 102;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12524b = 3600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12525c = 600000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12526d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12527e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12528f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f12529t = CropImageView.DEFAULT_ASPECT_RATIO;
    public long H = 0;
    public boolean K = false;

    @Deprecated
    public LocationRequest() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f12523a != locationRequest.f12523a) {
            return false;
        }
        long j11 = this.f12524b;
        long j12 = locationRequest.f12524b;
        if (j11 != j12 || this.f12525c != locationRequest.f12525c || this.f12526d != locationRequest.f12526d || this.f12527e != locationRequest.f12527e || this.f12528f != locationRequest.f12528f || this.f12529t != locationRequest.f12529t) {
            return false;
        }
        long j13 = this.H;
        if (j13 >= j11) {
            j11 = j13;
        }
        long j14 = locationRequest.H;
        if (j14 >= j12) {
            j12 = j14;
        }
        return j11 == j12 && this.K == locationRequest.K;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12523a), Long.valueOf(this.f12524b), Float.valueOf(this.f12529t), Long.valueOf(this.H)});
    }

    public final String toString() {
        String str;
        int i11 = this.f12528f;
        float f5 = this.f12529t;
        long j11 = this.H;
        long j12 = this.f12524b;
        StringBuilder sb2 = new StringBuilder("Request[");
        int i12 = this.f12523a;
        if (i12 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i12 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i12 != 104) {
            str = i12 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb2.append(str);
        if (i12 != 105) {
            sb2.append(" requested=");
            sb2.append(j12);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f12525c);
        sb2.append("ms");
        if (j11 > j12) {
            sb2.append(" maxWait=");
            sb2.append(j11);
            sb2.append("ms");
        }
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            sb2.append(" smallestDisplacement=");
            sb2.append(f5);
            sb2.append("m");
        }
        long j13 = this.f12527e;
        if (j13 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j13 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (i11 != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(i11);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        int i12 = this.f12523a;
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(i12);
        long j11 = this.f12524b;
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(j11);
        long j12 = this.f12525c;
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(j12);
        boolean z11 = this.f12526d;
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        long j13 = this.f12527e;
        SafeParcelWriter.p(parcel, 5, 8);
        parcel.writeLong(j13);
        int i13 = this.f12528f;
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(i13);
        float f5 = this.f12529t;
        SafeParcelWriter.p(parcel, 7, 4);
        parcel.writeFloat(f5);
        long j14 = this.H;
        SafeParcelWriter.p(parcel, 8, 8);
        parcel.writeLong(j14);
        boolean z12 = this.K;
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(z12 ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
