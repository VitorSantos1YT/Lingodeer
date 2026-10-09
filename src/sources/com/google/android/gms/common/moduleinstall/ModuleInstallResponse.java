package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zac();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9053b;

    public ModuleInstallResponse(int i11, boolean z11) {
        this.f9052a = i11;
        this.f9053b = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9052a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f9053b ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
