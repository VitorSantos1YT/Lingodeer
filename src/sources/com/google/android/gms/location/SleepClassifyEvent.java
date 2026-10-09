package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzbu();
    public final boolean H;
    public final int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12549f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12550t;

    public SleepClassifyEvent(int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, int i18) {
        this.f12544a = i11;
        this.f12545b = i12;
        this.f12546c = i13;
        this.f12547d = i14;
        this.f12548e = i15;
        this.f12549f = i16;
        this.f12550t = i17;
        this.H = z11;
        this.K = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.f12544a == sleepClassifyEvent.f12544a && this.f12545b == sleepClassifyEvent.f12545b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12544a), Integer.valueOf(this.f12545b)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append(this.f12544a);
        sb2.append(" Conf:");
        sb2.append(this.f12545b);
        sb2.append(" Motion:");
        sb2.append(this.f12546c);
        sb2.append(" Light:");
        sb2.append(this.f12547d);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Preconditions.g(parcel);
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f12544a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f12545b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f12546c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f12547d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f12548e);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f12549f);
        SafeParcelWriter.p(parcel, 7, 4);
        parcel.writeInt(this.f12550t);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.H ? 1 : 0);
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(this.K);
        SafeParcelWriter.r(parcel, iQ);
    }
}
