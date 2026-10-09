package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8641d;

    public Feature(String str, int i11, long j11, boolean z11) {
        this.f8638a = str;
        this.f8639b = i11;
        this.f8640c = j11;
        this.f8641d = z11;
    }

    public final long D1() {
        long j11 = this.f8640c;
        return j11 == -1 ? this.f8639b : j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (Objects.a(this.f8638a, feature.f8638a) && D1() == feature.D1() && this.f8641d == feature.f8641d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8638a, Long.valueOf(D1()), Boolean.valueOf(this.f8641d)});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f8638a, "name");
        toStringHelper.a(Long.valueOf(D1()), "version");
        toStringHelper.a(Boolean.valueOf(this.f8641d), "is_fully_rolled_out");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8638a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8639b);
        long jD1 = D1();
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(jD1);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8641d ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }

    public Feature(String str, long j11) {
        this(str, -1, j11, false);
    }
}
