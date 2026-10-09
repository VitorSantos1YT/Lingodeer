package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new zzba();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f9299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f9300c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public UvmEntry(int i11, short s3, short s11) {
        this.f9298a = i11;
        this.f9299b = s3;
        this.f9300c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f9298a == uvmEntry.f9298a && this.f9299b == uvmEntry.f9299b && this.f9300c == uvmEntry.f9300c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9298a), Short.valueOf(this.f9299b), Short.valueOf(this.f9300c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9298a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f9299b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9300c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
