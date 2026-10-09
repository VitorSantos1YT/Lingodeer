package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f8340d;

    public AccountChangeEventsRequest() {
        this.f8337a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8337a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8338b);
        SafeParcelWriter.k(parcel, 3, this.f8339c, false);
        SafeParcelWriter.j(parcel, 4, this.f8340d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public AccountChangeEventsRequest(int i11, int i12, String str, Account account) {
        this.f8337a = i11;
        this.f8338b = i12;
        this.f8339c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f8340d = account;
        } else {
            this.f8340d = new Account(str, "com.google");
        }
    }
}
