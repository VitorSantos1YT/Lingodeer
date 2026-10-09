package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzbj f12535d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    public LocationSettingsRequest(ArrayList arrayList, boolean z11, boolean z12, zzbj zzbjVar) {
        this.f12532a = arrayList;
        this.f12533b = z11;
        this.f12534c = z12;
        this.f12535d = zzbjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, Collections.unmodifiableList(this.f12532a), false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12533b ? 1 : 0);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f12534c ? 1 : 0);
        SafeParcelWriter.j(parcel, 5, this.f12535d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
