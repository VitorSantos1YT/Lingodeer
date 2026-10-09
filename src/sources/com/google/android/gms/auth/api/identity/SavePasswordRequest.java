package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SignInPassword f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8459c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SignInPassword f8460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8462c;
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i11) {
        Preconditions.g(signInPassword);
        this.f8457a = signInPassword;
        this.f8458b = str;
        this.f8459c = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.a(this.f8457a, savePasswordRequest.f8457a) && Objects.a(this.f8458b, savePasswordRequest.f8458b) && this.f8459c == savePasswordRequest.f8459c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8457a, this.f8458b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f8457a, i11, false);
        SafeParcelWriter.k(parcel, 2, this.f8458b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8459c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
