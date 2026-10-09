package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    public final zzag H;
    public final GoogleThirdPartyPaymentExtension K;
    public final zzai L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FidoAppIdExtension f9217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzs f9218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserVerificationMethodExtension f9219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzz f9220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzab f9221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzad f9222f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzu f9223t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.f9217a = fidoAppIdExtension;
        this.f9219c = userVerificationMethodExtension;
        this.f9218b = zzsVar;
        this.f9220d = zzzVar;
        this.f9221e = zzabVar;
        this.f9222f = zzadVar;
        this.f9223t = zzuVar;
        this.H = zzagVar;
        this.K = googleThirdPartyPaymentExtension;
        this.L = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return Objects.a(this.f9217a, authenticationExtensions.f9217a) && Objects.a(this.f9218b, authenticationExtensions.f9218b) && Objects.a(this.f9219c, authenticationExtensions.f9219c) && Objects.a(this.f9220d, authenticationExtensions.f9220d) && Objects.a(this.f9221e, authenticationExtensions.f9221e) && Objects.a(this.f9222f, authenticationExtensions.f9222f) && Objects.a(this.f9223t, authenticationExtensions.f9223t) && Objects.a(this.H, authenticationExtensions.H) && Objects.a(this.K, authenticationExtensions.K) && Objects.a(this.L, authenticationExtensions.L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9217a, this.f9218b, this.f9219c, this.f9220d, this.f9221e, this.f9222f, this.f9223t, this.H, this.K, this.L});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 2, this.f9217a, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f9218b, i11, false);
        SafeParcelWriter.j(parcel, 4, this.f9219c, i11, false);
        SafeParcelWriter.j(parcel, 5, this.f9220d, i11, false);
        SafeParcelWriter.j(parcel, 6, this.f9221e, i11, false);
        SafeParcelWriter.j(parcel, 7, this.f9222f, i11, false);
        SafeParcelWriter.j(parcel, 8, this.f9223t, i11, false);
        SafeParcelWriter.j(parcel, 9, this.H, i11, false);
        SafeParcelWriter.j(parcel, 10, this.K, i11, false);
        SafeParcelWriter.j(parcel, 11, this.L, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
