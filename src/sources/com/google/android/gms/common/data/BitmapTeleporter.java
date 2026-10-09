package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f8867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8868c;

    public BitmapTeleporter(int i11, ParcelFileDescriptor parcelFileDescriptor, int i12) {
        this.f8866a = i11;
        this.f8867b = parcelFileDescriptor;
        this.f8868c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        if (this.f8867b == null) {
            Preconditions.g(null);
            throw null;
        }
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8866a);
        SafeParcelWriter.j(parcel, 2, this.f8867b, i11 | 1, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8868c);
        SafeParcelWriter.r(parcel, iQ);
        this.f8867b = null;
    }
}
