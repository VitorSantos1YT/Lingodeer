package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f11504c;

    public zzdd(int i11, String str, Intent intent) {
        this.f11502a = i11;
        this.f11503b = str;
        this.f11504c = intent;
    }

    public static zzdd D1(Activity activity) {
        return new zzdd(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return false;
        }
        zzdd zzddVar = (zzdd) obj;
        return this.f11502a == zzddVar.f11502a && Objects.equals(this.f11503b, zzddVar.f11503b) && Objects.equals(this.f11504c, zzddVar.f11504c);
    }

    public final int hashCode() {
        return this.f11502a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f11502a);
        SafeParcelWriter.k(parcel, 2, this.f11503b, false);
        SafeParcelWriter.j(parcel, 3, this.f11504c, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
