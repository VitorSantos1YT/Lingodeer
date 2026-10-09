package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UvmEntries f9224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzf f9225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f9226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzh f9227d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.f9224a = uvmEntries;
        this.f9225b = zzfVar;
        this.f9226c = authenticationExtensionsCredPropsOutputs;
        this.f9227d = zzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return Objects.a(this.f9224a, authenticationExtensionsClientOutputs.f9224a) && Objects.a(this.f9225b, authenticationExtensionsClientOutputs.f9225b) && Objects.a(this.f9226c, authenticationExtensionsClientOutputs.f9226c) && Objects.a(this.f9227d, authenticationExtensionsClientOutputs.f9227d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9224a, this.f9225b, this.f9226c, this.f9227d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f9224a, i11, false);
        SafeParcelWriter.j(parcel, 2, this.f9225b, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f9226c, i11, false);
        SafeParcelWriter.j(parcel, 4, this.f9227d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
