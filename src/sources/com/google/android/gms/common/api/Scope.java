package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zzd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8702b;

    public Scope(int i11, String str) {
        Preconditions.e(str, "scopeUri must not be null or empty");
        this.f8701a = i11;
        this.f8702b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f8702b.equals(((Scope) obj).f8702b);
    }

    public final int hashCode() {
        return this.f8702b.hashCode();
    }

    public final String toString() {
        return this.f8702b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8701a);
        SafeParcelWriter.k(parcel, 2, this.f8702b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
