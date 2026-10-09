package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8342b;

    public AccountChangeEventsResponse(int i11, ArrayList arrayList) {
        this.f8341a = i11;
        Preconditions.g(arrayList);
        this.f8342b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8341a);
        SafeParcelWriter.o(parcel, 2, this.f8342b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
