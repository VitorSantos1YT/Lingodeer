package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9062d;

    static {
        int i11 = zab.f9063a;
    }

    public ApiFeatureRequest(ArrayList arrayList, boolean z11, String str, String str2) {
        Preconditions.g(arrayList);
        this.f9059a = arrayList;
        this.f9060b = z11;
        this.f9061c = str;
        this.f9062d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f9060b == apiFeatureRequest.f9060b && Objects.a(this.f9059a, apiFeatureRequest.f9059a) && Objects.a(this.f9061c, apiFeatureRequest.f9061c) && Objects.a(this.f9062d, apiFeatureRequest.f9062d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9060b), this.f9059a, this.f9061c, this.f9062d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f9059a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f9060b ? 1 : 0);
        SafeParcelWriter.k(parcel, 3, this.f9061c, false);
        SafeParcelWriter.k(parcel, 4, this.f9062d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
