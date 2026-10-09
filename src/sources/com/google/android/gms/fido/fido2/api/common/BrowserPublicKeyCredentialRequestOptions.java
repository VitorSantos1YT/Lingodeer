package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new zzo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRequestOptions f9248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f9249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9250c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        Preconditions.g(publicKeyCredentialRequestOptions);
        this.f9248a = publicKeyCredentialRequestOptions;
        Preconditions.g(uri);
        Preconditions.a("origin scheme must be non-empty", uri.getScheme() != null);
        Preconditions.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f9249b = uri;
        Preconditions.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f9250c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return Objects.a(this.f9248a, browserPublicKeyCredentialRequestOptions.f9248a) && Objects.a(this.f9249b, browserPublicKeyCredentialRequestOptions.f9249b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9248a, this.f9249b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 2, this.f9248a, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f9249b, i11, false);
        SafeParcelWriter.c(parcel, 4, this.f9250c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
