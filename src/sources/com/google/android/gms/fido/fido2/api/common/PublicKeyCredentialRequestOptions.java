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
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzao();
    public final AuthenticationExtensions H;
    public final Long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f9281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f9283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f9284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TokenBinding f9285f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzay f9286t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d5, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l9) {
        Preconditions.g(bArr);
        this.f9280a = bArr;
        this.f9281b = d5;
        Preconditions.g(str);
        this.f9282c = str;
        this.f9283d = arrayList;
        this.f9284e = num;
        this.f9285f = tokenBinding;
        this.K = l9;
        if (str2 != null) {
            try {
                this.f9286t = zzay.a(str2);
            } catch (zzax e8) {
                throw new IllegalArgumentException(e8);
            }
        } else {
            this.f9286t = null;
        }
        this.H = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.f9283d;
        return Arrays.equals(this.f9280a, publicKeyCredentialRequestOptions.f9280a) && Objects.a(this.f9281b, publicKeyCredentialRequestOptions.f9281b) && Objects.a(this.f9282c, publicKeyCredentialRequestOptions.f9282c) && (((list = this.f9283d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.a(this.f9284e, publicKeyCredentialRequestOptions.f9284e) && Objects.a(this.f9285f, publicKeyCredentialRequestOptions.f9285f) && Objects.a(this.f9286t, publicKeyCredentialRequestOptions.f9286t) && Objects.a(this.H, publicKeyCredentialRequestOptions.H) && Objects.a(this.K, publicKeyCredentialRequestOptions.K);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f9280a)), this.f9281b, this.f9282c, this.f9283d, this.f9284e, this.f9285f, this.f9286t, this.H, this.K});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.f9280a, false);
        SafeParcelWriter.e(parcel, 3, this.f9281b);
        SafeParcelWriter.k(parcel, 4, this.f9282c, false);
        SafeParcelWriter.o(parcel, 5, this.f9283d, false);
        SafeParcelWriter.h(parcel, 6, this.f9284e);
        SafeParcelWriter.j(parcel, 7, this.f9285f, i11, false);
        zzay zzayVar = this.f9286t;
        SafeParcelWriter.k(parcel, 8, zzayVar == null ? null : zzayVar.toString(), false);
        SafeParcelWriter.j(parcel, 9, this.H, i11, false);
        SafeParcelWriter.i(parcel, 10, this.K);
        SafeParcelWriter.r(parcel, iQ);
    }
}
