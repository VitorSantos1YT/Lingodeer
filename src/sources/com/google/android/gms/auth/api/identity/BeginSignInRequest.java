package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();
    public final boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordRequestOptions f8399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f8400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PasskeysRequestOptions f8404f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f8405t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PasswordRequestOptions f8406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public GoogleIdTokenRequestOptions f8407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PasskeysRequestOptions f8408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PasskeyJsonRequestOptions f8409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8412g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f8413h;

        public Builder() {
            Parcelable.Creator<PasswordRequestOptions> creator = PasswordRequestOptions.CREATOR;
            new PasswordRequestOptions.Builder();
            this.f8406a = new PasswordRequestOptions(false);
            Parcelable.Creator<GoogleIdTokenRequestOptions> creator2 = GoogleIdTokenRequestOptions.CREATOR;
            new GoogleIdTokenRequestOptions.Builder();
            this.f8407b = new GoogleIdTokenRequestOptions(false, null, null, true, null, null, false, null);
            Parcelable.Creator<PasskeysRequestOptions> creator3 = PasskeysRequestOptions.CREATOR;
            new PasskeysRequestOptions.Builder();
            this.f8408c = new PasskeysRequestOptions(false, null, null);
            Parcelable.Creator<PasskeyJsonRequestOptions> creator4 = PasskeyJsonRequestOptions.CREATOR;
            new PasskeyJsonRequestOptions.Builder();
            this.f8409d = new PasskeyJsonRequestOptions(false, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbn();
        public final List H;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f8418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f8419f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f8420t;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder {
        }

        public GoogleIdTokenRequestOptions(boolean z11, String str, String str2, boolean z12, String str3, ArrayList arrayList, boolean z13, ArrayList arrayList2) {
            boolean z14 = true;
            if (z12 && z13) {
                z14 = false;
            }
            Preconditions.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z14);
            this.f8414a = z11;
            if (z11) {
                Preconditions.h(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f8415b = str;
            this.f8416c = str2;
            this.f8417d = z12;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList3 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3);
            }
            this.f8419f = arrayList3;
            this.f8418e = str3;
            this.f8420t = z13;
            this.H = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f8414a == googleIdTokenRequestOptions.f8414a && Objects.a(this.f8415b, googleIdTokenRequestOptions.f8415b) && Objects.a(this.f8416c, googleIdTokenRequestOptions.f8416c) && this.f8417d == googleIdTokenRequestOptions.f8417d && Objects.a(this.f8418e, googleIdTokenRequestOptions.f8418e) && Objects.a(this.f8419f, googleIdTokenRequestOptions.f8419f) && this.f8420t == googleIdTokenRequestOptions.f8420t && Objects.a(this.H, googleIdTokenRequestOptions.H);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8414a), this.f8415b, this.f8416c, Boolean.valueOf(this.f8417d), this.f8418e, this.f8419f, Boolean.valueOf(this.f8420t), this.H});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int iQ = SafeParcelWriter.q(parcel, 20293);
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8414a ? 1 : 0);
            SafeParcelWriter.k(parcel, 2, this.f8415b, false);
            SafeParcelWriter.k(parcel, 3, this.f8416c, false);
            SafeParcelWriter.p(parcel, 4, 4);
            parcel.writeInt(this.f8417d ? 1 : 0);
            SafeParcelWriter.k(parcel, 5, this.f8418e, false);
            SafeParcelWriter.m(parcel, 6, this.f8419f);
            SafeParcelWriter.p(parcel, 7, 4);
            parcel.writeInt(this.f8420t ? 1 : 0);
            SafeParcelWriter.o(parcel, 8, this.H, false);
            SafeParcelWriter.r(parcel, iQ);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbo();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8422b;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder {
        }

        public PasskeyJsonRequestOptions(boolean z11, String str) {
            if (z11) {
                Preconditions.g(str);
            }
            this.f8421a = z11;
            this.f8422b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f8421a == passkeyJsonRequestOptions.f8421a && Objects.a(this.f8422b, passkeyJsonRequestOptions.f8422b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8421a), this.f8422b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int iQ = SafeParcelWriter.q(parcel, 20293);
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8421a ? 1 : 0);
            SafeParcelWriter.k(parcel, 2, this.f8422b, false);
            SafeParcelWriter.r(parcel, iQ);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbp();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f8424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8425c;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder {
        }

        public PasskeysRequestOptions(boolean z11, byte[] bArr, String str) {
            if (z11) {
                Preconditions.g(bArr);
                Preconditions.g(str);
            }
            this.f8423a = z11;
            this.f8424b = bArr;
            this.f8425c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f8423a == passkeysRequestOptions.f8423a && Arrays.equals(this.f8424b, passkeysRequestOptions.f8424b) && java.util.Objects.equals(this.f8425c, passkeysRequestOptions.f8425c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8424b) + (java.util.Objects.hash(Boolean.valueOf(this.f8423a), this.f8425c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int iQ = SafeParcelWriter.q(parcel, 20293);
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8423a ? 1 : 0);
            SafeParcelWriter.c(parcel, 2, this.f8424b, false);
            SafeParcelWriter.k(parcel, 3, this.f8425c, false);
            SafeParcelWriter.r(parcel, iQ);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbq();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8426a;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Builder {
        }

        public PasswordRequestOptions(boolean z11) {
            this.f8426a = z11;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f8426a == ((PasswordRequestOptions) obj).f8426a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8426a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            int iQ = SafeParcelWriter.q(parcel, 20293);
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8426a ? 1 : 0);
            SafeParcelWriter.r(parcel, iQ);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z11, int i11, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z12) {
        Preconditions.g(passwordRequestOptions);
        this.f8399a = passwordRequestOptions;
        Preconditions.g(googleIdTokenRequestOptions);
        this.f8400b = googleIdTokenRequestOptions;
        this.f8401c = str;
        this.f8402d = z11;
        this.f8403e = i11;
        if (passkeysRequestOptions == null) {
            Parcelable.Creator<PasskeysRequestOptions> creator = PasskeysRequestOptions.CREATOR;
            new PasskeysRequestOptions.Builder();
            passkeysRequestOptions = new PasskeysRequestOptions(false, null, null);
        }
        this.f8404f = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            Parcelable.Creator<PasskeyJsonRequestOptions> creator2 = PasskeyJsonRequestOptions.CREATOR;
            new PasskeyJsonRequestOptions.Builder();
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(false, null);
        }
        this.f8405t = passkeyJsonRequestOptions;
        this.H = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.a(this.f8399a, beginSignInRequest.f8399a) && Objects.a(this.f8400b, beginSignInRequest.f8400b) && Objects.a(this.f8404f, beginSignInRequest.f8404f) && Objects.a(this.f8405t, beginSignInRequest.f8405t) && Objects.a(this.f8401c, beginSignInRequest.f8401c) && this.f8402d == beginSignInRequest.f8402d && this.f8403e == beginSignInRequest.f8403e && this.H == beginSignInRequest.H;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8399a, this.f8400b, this.f8404f, this.f8405t, this.f8401c, Boolean.valueOf(this.f8402d), Integer.valueOf(this.f8403e), Boolean.valueOf(this.H)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f8399a, i11, false);
        SafeParcelWriter.j(parcel, 2, this.f8400b, i11, false);
        SafeParcelWriter.k(parcel, 3, this.f8401c, false);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8402d ? 1 : 0);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8403e);
        SafeParcelWriter.j(parcel, 6, this.f8404f, i11, false);
        SafeParcelWriter.j(parcel, 7, this.f8405t, i11, false);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.H ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
