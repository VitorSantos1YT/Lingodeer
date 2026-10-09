package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import ep.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12517d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public @interface InitialTrigger {
    }

    public GeofencingRequest(ArrayList arrayList, int i11, String str, String str2) {
        this.f12514a = arrayList;
        this.f12515b = i11;
        this.f12516c = str;
        this.f12517d = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeofencingRequest[geofences=");
        sb2.append(this.f12514a);
        sb2.append(", initialTrigger=");
        sb2.append(this.f12515b);
        sb2.append(", tag=");
        sb2.append(this.f12516c);
        sb2.append(", attributionTag=");
        return a.k(sb2, this.f12517d, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.f12514a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12515b);
        SafeParcelWriter.k(parcel, 3, this.f12516c, false);
        SafeParcelWriter.k(parcel, 4, this.f12517d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
