package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzak();
    public final Integer H;
    public final TokenBinding K;
    public final AttestationConveyancePreference L;
    public final AuthenticationExtensions M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRpEntity f9268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublicKeyCredentialUserEntity f9269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f9272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f9273f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f9274t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d5, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        Preconditions.g(publicKeyCredentialRpEntity);
        this.f9268a = publicKeyCredentialRpEntity;
        Preconditions.g(publicKeyCredentialUserEntity);
        this.f9269b = publicKeyCredentialUserEntity;
        Preconditions.g(bArr);
        this.f9270c = bArr;
        Preconditions.g(arrayList);
        this.f9271d = arrayList;
        this.f9272e = d5;
        this.f9273f = arrayList2;
        this.f9274t = authenticatorSelectionCriteria;
        this.H = num;
        this.K = tokenBinding;
        if (str != null) {
            try {
                this.L = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e8) {
                throw new IllegalArgumentException(e8);
            }
        } else {
            this.L = null;
        }
        this.M = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.f9271d;
        List list3 = publicKeyCredentialCreationOptions.f9273f;
        if (Objects.a(this.f9268a, publicKeyCredentialCreationOptions.f9268a) && Objects.a(this.f9269b, publicKeyCredentialCreationOptions.f9269b) && Arrays.equals(this.f9270c, publicKeyCredentialCreationOptions.f9270c) && Objects.a(this.f9272e, publicKeyCredentialCreationOptions.f9272e)) {
            List list4 = this.f9271d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f9273f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && Objects.a(this.f9274t, publicKeyCredentialCreationOptions.f9274t) && Objects.a(this.H, publicKeyCredentialCreationOptions.H) && Objects.a(this.K, publicKeyCredentialCreationOptions.K) && Objects.a(this.L, publicKeyCredentialCreationOptions.L) && Objects.a(this.M, publicKeyCredentialCreationOptions.M))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9268a, this.f9269b, Integer.valueOf(Arrays.hashCode(this.f9270c)), this.f9271d, this.f9272e, this.f9273f, this.f9274t, this.H, this.K, this.L, this.M});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 2, this.f9268a, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f9269b, i11, false);
        SafeParcelWriter.c(parcel, 4, this.f9270c, false);
        SafeParcelWriter.o(parcel, 5, this.f9271d, false);
        SafeParcelWriter.e(parcel, 6, this.f9272e);
        SafeParcelWriter.o(parcel, 7, this.f9273f, false);
        SafeParcelWriter.j(parcel, 8, this.f9274t, i11, false);
        SafeParcelWriter.h(parcel, 9, this.H);
        SafeParcelWriter.j(parcel, 10, this.K, i11, false);
        AttestationConveyancePreference attestationConveyancePreference = this.L;
        SafeParcelWriter.k(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), false);
        SafeParcelWriter.j(parcel, 12, this.M, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
