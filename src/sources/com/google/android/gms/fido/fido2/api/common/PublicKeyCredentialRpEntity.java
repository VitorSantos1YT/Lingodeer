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
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new zzap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9289c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        Preconditions.g(str);
        this.f9287a = str;
        Preconditions.g(str2);
        this.f9288b = str2;
        this.f9289c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return Objects.a(this.f9287a, publicKeyCredentialRpEntity.f9287a) && Objects.a(this.f9288b, publicKeyCredentialRpEntity.f9288b) && Objects.a(this.f9289c, publicKeyCredentialRpEntity.f9289c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9287a, this.f9288b, this.f9289c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f9287a, false);
        SafeParcelWriter.k(parcel, 3, this.f9288b, false);
        SafeParcelWriter.k(parcel, 4, this.f9289c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
