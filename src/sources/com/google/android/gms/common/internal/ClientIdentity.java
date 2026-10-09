package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8897b;

    public ClientIdentity(int i11, String str) {
        this.f8896a = i11;
        this.f8897b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f8896a == this.f8896a && Objects.a(clientIdentity.f8897b, this.f8897b);
    }

    public final int hashCode() {
        return this.f8896a;
    }

    public final String toString() {
        int i11 = this.f8896a;
        int length = String.valueOf(i11).length();
        String str = this.f8897b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i11);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8896a);
        SafeParcelWriter.k(parcel, 2, this.f8897b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
