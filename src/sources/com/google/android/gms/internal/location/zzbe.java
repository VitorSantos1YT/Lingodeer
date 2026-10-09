package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.Geofence;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    public final int H;
    public final int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f11093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f11094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f11095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11096f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11097t;

    public zzbe(String str, int i11, short s3, double d5, double d11, float f5, long j11, int i12, int i13) {
        if (str == null || str.length() > 100) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new String("requestId is null or too long: "));
        }
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("invalid radius: ");
            sb2.append(f5);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d5 > 90.0d || d5 < -90.0d) {
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("invalid latitude: ");
            sb3.append(d5);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (d11 > 180.0d || d11 < -180.0d) {
            StringBuilder sb4 = new StringBuilder(43);
            sb4.append("invalid longitude: ");
            sb4.append(d11);
            throw new IllegalArgumentException(sb4.toString());
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            StringBuilder sb5 = new StringBuilder(46);
            sb5.append("No supported transition specified: ");
            sb5.append(i11);
            throw new IllegalArgumentException(sb5.toString());
        }
        this.f11093c = s3;
        this.f11091a = str;
        this.f11094d = d5;
        this.f11095e = d11;
        this.f11096f = f5;
        this.f11092b = j11;
        this.f11097t = i14;
        this.H = i12;
        this.K = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.f11096f == zzbeVar.f11096f && this.f11094d == zzbeVar.f11094d && this.f11095e == zzbeVar.f11095e && this.f11093c == zzbeVar.f11093c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f11094d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f11095e);
        return ((((Float.floatToIntBits(this.f11096f) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.f11093c) * 31) + this.f11097t;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s3 = this.f11093c;
        if (s3 != -1) {
            str = s3 != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.f11091a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f11097t), Double.valueOf(this.f11094d), Double.valueOf(this.f11095e), Float.valueOf(this.f11096f), Integer.valueOf(this.H / 1000), Integer.valueOf(this.K), Long.valueOf(this.f11092b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f11091a, false);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f11092b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f11093c);
        SafeParcelWriter.p(parcel, 4, 8);
        parcel.writeDouble(this.f11094d);
        SafeParcelWriter.p(parcel, 5, 8);
        parcel.writeDouble(this.f11095e);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeFloat(this.f11096f);
        SafeParcelWriter.p(parcel, 7, 4);
        parcel.writeInt(this.f11097t);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.H);
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(this.K);
        SafeParcelWriter.r(parcel, iQ);
    }
}
