package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Attachment f9241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f9242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzay f9243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResidentKeyRequirement f9244d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment attachmentA;
        ResidentKeyRequirement residentKeyRequirementA = null;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzax e8) {
                throw new IllegalArgumentException(e8);
            }
        }
        this.f9241a = attachmentA;
        this.f9242b = bool;
        this.f9243c = str2 == null ? null : zzay.a(str2);
        if (str3 != null) {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.f9244d = residentKeyRequirementA;
    }

    public final ResidentKeyRequirement D1() {
        ResidentKeyRequirement residentKeyRequirement = this.f9244d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f9242b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return Objects.a(this.f9241a, authenticatorSelectionCriteria.f9241a) && Objects.a(this.f9242b, authenticatorSelectionCriteria.f9242b) && Objects.a(this.f9243c, authenticatorSelectionCriteria.f9243c) && Objects.a(D1(), authenticatorSelectionCriteria.D1());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9241a, this.f9242b, this.f9243c, D1()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        Attachment attachment = this.f9241a;
        SafeParcelWriter.k(parcel, 2, attachment == null ? null : attachment.toString(), false);
        SafeParcelWriter.a(parcel, 3, this.f9242b);
        zzay zzayVar = this.f9243c;
        SafeParcelWriter.k(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        SafeParcelWriter.k(parcel, 5, D1() != null ? D1().toString() : null, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
