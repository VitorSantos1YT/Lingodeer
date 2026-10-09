package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Claim extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Claim> CREATOR = new zbi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8429b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
    }

    public Claim(String str, boolean z11) {
        this.f8428a = str;
        this.f8429b = z11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Claim) {
            Claim claim = (Claim) obj;
            if (this.f8428a.equals(claim.f8428a) && this.f8429b == claim.f8429b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8428a, Boolean.valueOf(this.f8429b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8428a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8429b ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
