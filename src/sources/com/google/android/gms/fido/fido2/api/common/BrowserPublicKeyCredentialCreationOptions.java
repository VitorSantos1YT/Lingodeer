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
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new zzn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialCreationOptions f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f9246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9247c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        Preconditions.g(publicKeyCredentialCreationOptions);
        this.f9245a = publicKeyCredentialCreationOptions;
        Preconditions.g(uri);
        Preconditions.a("origin scheme must be non-empty", uri.getScheme() != null);
        Preconditions.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f9246b = uri;
        Preconditions.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f9247c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return Objects.a(this.f9245a, browserPublicKeyCredentialCreationOptions.f9245a) && Objects.a(this.f9246b, browserPublicKeyCredentialCreationOptions.f9246b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9245a, this.f9246b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 2, this.f9245a, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f9246b, i11, false);
        SafeParcelWriter.c(parcel, 4, this.f9247c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
