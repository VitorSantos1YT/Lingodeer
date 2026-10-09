package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.AuthResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzx implements AuthResult {
    public static final Parcelable.Creator<zzx> CREATOR = new zzaa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzad f18032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzv f18033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.firebase.auth.zzc f18034c;

    public zzx(zzad zzadVar) {
        this.f18032a = zzadVar;
        ArrayList arrayList = zzadVar.f17937e;
        this.f18033b = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (!TextUtils.isEmpty(((zzz) arrayList.get(i11)).H)) {
                this.f18033b = new zzv(((zzz) arrayList.get(i11)).f18036b, ((zzz) arrayList.get(i11)).H, zzadVar.L);
            }
        }
        if (this.f18033b == null) {
            this.f18033b = new zzv(zzadVar.L);
        }
        this.f18034c = zzadVar.M;
    }

    @Override // com.google.firebase.auth.AuthResult
    public final zzad Z0() {
        return this.f18032a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.j(parcel, 1, this.f18032a, i11, false);
        SafeParcelWriter.j(parcel, 2, this.f18033b, i11, false);
        SafeParcelWriter.j(parcel, 3, this.f18034c, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
