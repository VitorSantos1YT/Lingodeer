package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new zzg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f9338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9340d;

    public RegisterRequest(int i11, String str, String str2, byte[] bArr) {
        this.f9337a = i11;
        try {
            this.f9338b = ProtocolVersion.a(str);
            this.f9339c = bArr;
            this.f9340d = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        String str = registerRequest.f9340d;
        if (!Arrays.equals(this.f9339c, registerRequest.f9339c) || this.f9338b != registerRequest.f9338b) {
            return false;
        }
        String str2 = this.f9340d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f9339c) + 31) * 31) + this.f9338b.hashCode();
        String str = this.f9340d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9337a);
        SafeParcelWriter.k(parcel, 2, this.f9338b.toString(), false);
        SafeParcelWriter.c(parcel, 3, this.f9339c, false);
        SafeParcelWriter.k(parcel, 4, this.f9340d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
