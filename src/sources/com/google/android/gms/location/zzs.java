package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12589e;

    public zzs() {
        this(CropImageView.DEFAULT_ASPECT_RATIO, Integer.MAX_VALUE, 50L, Long.MAX_VALUE, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f12585a == zzsVar.f12585a && this.f12586b == zzsVar.f12586b && Float.compare(this.f12587c, zzsVar.f12587c) == 0 && this.f12588d == zzsVar.f12588d && this.f12589e == zzsVar.f12589e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12585a), Long.valueOf(this.f12586b), Float.valueOf(this.f12587c), Long.valueOf(this.f12588d), Integer.valueOf(this.f12589e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f12585a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f12586b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f12587c);
        long j11 = this.f12588d;
        if (j11 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j11 - jElapsedRealtime);
            sb2.append("ms");
        }
        int i11 = this.f12589e;
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
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12585a ? 1 : 0);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f12586b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeFloat(this.f12587c);
        SafeParcelWriter.p(parcel, 4, 8);
        parcel.writeLong(this.f12588d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f12589e);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzs(float f5, int i11, long j11, long j12, boolean z11) {
        this.f12585a = z11;
        this.f12586b = j11;
        this.f12587c = f5;
        this.f12588d = j12;
        this.f12589e = i11;
    }
}
