package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzba extends AbstractSafeParcelable {
    public final boolean H;
    public final boolean K;
    public final String L;
    public final long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationRequest f11078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11083f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11084t;
    public static final List N = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public zzba(LocationRequest locationRequest, List list, String str, boolean z11, boolean z12, boolean z13, String str2, boolean z14, boolean z15, String str3, long j11) {
        this.f11078a = locationRequest;
        this.f11079b = list;
        this.f11080c = str;
        this.f11081d = z11;
        this.f11082e = z12;
        this.f11083f = z13;
        this.f11084t = str2;
        this.H = z14;
        this.K = z15;
        this.L = str3;
        this.M = j11;
    }

    public static zzba D1() {
        return new zzba(null, N, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.a(this.f11078a, zzbaVar.f11078a) && Objects.a(this.f11079b, zzbaVar.f11079b) && Objects.a(this.f11080c, zzbaVar.f11080c) && this.f11081d == zzbaVar.f11081d && this.f11082e == zzbaVar.f11082e && this.f11083f == zzbaVar.f11083f && Objects.a(this.f11084t, zzbaVar.f11084t) && this.H == zzbaVar.H && this.K == zzbaVar.K && Objects.a(this.L, zzbaVar.L)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11078a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11078a);
        String str = this.f11080c;
        if (str != null) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        String str2 = this.f11084t;
        if (str2 != null) {
            sb2.append(" moduleId=");
            sb2.append(str2);
        }
        if (this.L != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.L);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f11081d);
        sb2.append(" clients=");
        sb2.append(this.f11079b);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f11082e);
        if (this.f11083f) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.H) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.K) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f11078a, i11, false);
        SafeParcelWriter.o(parcel, 5, this.f11079b, false);
        SafeParcelWriter.k(parcel, 6, this.f11080c, false);
        SafeParcelWriter.p(parcel, 7, 4);
        parcel.writeInt(this.f11081d ? 1 : 0);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.f11082e ? 1 : 0);
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(this.f11083f ? 1 : 0);
        SafeParcelWriter.k(parcel, 10, this.f11084t, false);
        SafeParcelWriter.p(parcel, 11, 4);
        parcel.writeInt(this.H ? 1 : 0);
        SafeParcelWriter.p(parcel, 12, 4);
        parcel.writeInt(this.K ? 1 : 0);
        SafeParcelWriter.k(parcel, 13, this.L, false);
        SafeParcelWriter.p(parcel, 14, 8);
        parcel.writeLong(this.M);
        SafeParcelWriter.r(parcel, iQ);
    }
}
