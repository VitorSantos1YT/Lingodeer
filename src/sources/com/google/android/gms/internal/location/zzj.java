package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.material.datepicker.d;
import java.util.Collections;
import java.util.List;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.location.zzs f11115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f11113d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.android.gms.location.zzs f11114e = new com.google.android.gms.location.zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(com.google.android.gms.location.zzs zzsVar, List list, String str) {
        this.f11115a = zzsVar;
        this.f11116b = list;
        this.f11117c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return Objects.a(this.f11115a, zzjVar.f11115a) && Objects.a(this.f11116b, zzjVar.f11116b) && Objects.a(this.f11117c, zzjVar.f11117c);
    }

    public final int hashCode() {
        return this.f11115a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11115a);
        String strValueOf2 = String.valueOf(this.f11116b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.f11117c;
        StringBuilder sb2 = new StringBuilder(length + 77 + length2 + String.valueOf(str).length());
        d.w(sb2, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return p.u(sb2, ", tag='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f11115a, i11, false);
        SafeParcelWriter.o(parcel, 2, this.f11116b, false);
        SafeParcelWriter.k(parcel, 3, this.f11117c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
