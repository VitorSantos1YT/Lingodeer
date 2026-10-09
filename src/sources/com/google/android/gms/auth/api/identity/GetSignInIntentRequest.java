package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zbm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8438f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f8439t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f8443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8446g;
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z11, int i11, List list) {
        Preconditions.g(str);
        this.f8433a = str;
        this.f8434b = str2;
        this.f8435c = str3;
        this.f8436d = str4;
        this.f8437e = z11;
        this.f8438f = i11;
        this.f8439t = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return Objects.a(this.f8433a, getSignInIntentRequest.f8433a) && Objects.a(this.f8436d, getSignInIntentRequest.f8436d) && Objects.a(this.f8434b, getSignInIntentRequest.f8434b) && Objects.a(Boolean.valueOf(this.f8437e), Boolean.valueOf(getSignInIntentRequest.f8437e)) && this.f8438f == getSignInIntentRequest.f8438f && Objects.a(this.f8439t, getSignInIntentRequest.f8439t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8433a, this.f8434b, this.f8436d, Boolean.valueOf(this.f8437e), Integer.valueOf(this.f8438f), this.f8439t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8433a, false);
        SafeParcelWriter.k(parcel, 2, this.f8434b, false);
        SafeParcelWriter.k(parcel, 3, this.f8435c, false);
        SafeParcelWriter.k(parcel, 4, this.f8436d, false);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8437e ? 1 : 0);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f8438f);
        SafeParcelWriter.o(parcel, 7, this.f8439t, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
