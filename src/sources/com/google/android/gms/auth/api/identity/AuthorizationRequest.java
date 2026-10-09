package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new zbb();
    public final boolean H;
    public final Bundle K;
    public final boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Account f8390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8391f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8392t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum ResourceParameter {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state"),
        PICKER_ALLOW_MULTIPLE("allow_multiple"),
        PICKER_MIMETYPES("mimetypes"),
        PICKER_FILE_IDS("file_ids"),
        PICKER_OAUTH_TRIGGER("trigger_onepick");

        final String zba;

        ResourceParameter(String str) {
            this.zba = str;
        }
    }

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z11, boolean z12, Account account, String str2, String str3, boolean z13, Bundle bundle, boolean z14) {
        boolean z15 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z15 = true;
        }
        Preconditions.a("requestedScopes cannot be null or empty", z15);
        this.f8386a = arrayList;
        this.f8387b = str;
        this.f8388c = z11;
        this.f8389d = z12;
        this.f8390e = account;
        this.f8391f = str2;
        this.f8392t = str3;
        this.H = z13;
        this.K = bundle;
        this.L = z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f8386a;
        int size = list.size();
        List list2 = authorizationRequest.f8386a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.K;
            Bundle bundle2 = this.K;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!Objects.a(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f8388c == authorizationRequest.f8388c && this.H == authorizationRequest.H && this.f8389d == authorizationRequest.f8389d && this.L == authorizationRequest.L && Objects.a(this.f8387b, authorizationRequest.f8387b) && Objects.a(this.f8390e, authorizationRequest.f8390e) && Objects.a(this.f8391f, authorizationRequest.f8391f) && Objects.a(this.f8392t, authorizationRequest.f8392t)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8386a, this.f8387b, Boolean.valueOf(this.f8388c), Boolean.valueOf(this.H), Boolean.valueOf(this.f8389d), this.f8390e, this.f8391f, this.f8392t, this.K, Boolean.valueOf(this.L)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f8386a, false);
        SafeParcelWriter.k(parcel, 2, this.f8387b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8388c ? 1 : 0);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8389d ? 1 : 0);
        SafeParcelWriter.j(parcel, 5, this.f8390e, i11, false);
        SafeParcelWriter.k(parcel, 6, this.f8391f, false);
        SafeParcelWriter.k(parcel, 7, this.f8392t, false);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.H ? 1 : 0);
        SafeParcelWriter.b(parcel, 9, this.K);
        SafeParcelWriter.p(parcel, 10, 4);
        parcel.writeInt(this.L ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
