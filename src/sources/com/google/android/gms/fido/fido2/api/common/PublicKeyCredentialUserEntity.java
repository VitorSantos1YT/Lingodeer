package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzar();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9293d;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        Preconditions.g(bArr);
        this.f9290a = bArr;
        Preconditions.g(str);
        this.f9291b = str;
        this.f9292c = str2;
        Preconditions.g(str3);
        this.f9293d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.f9290a, publicKeyCredentialUserEntity.f9290a) && Objects.a(this.f9291b, publicKeyCredentialUserEntity.f9291b) && Objects.a(this.f9292c, publicKeyCredentialUserEntity.f9292c) && Objects.a(this.f9293d, publicKeyCredentialUserEntity.f9293d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9290a, this.f9291b, this.f9292c, this.f9293d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.f9290a, false);
        SafeParcelWriter.k(parcel, 3, this.f9291b, false);
        SafeParcelWriter.k(parcel, 4, this.f9292c, false);
        SafeParcelWriter.k(parcel, 5, this.f9293d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
