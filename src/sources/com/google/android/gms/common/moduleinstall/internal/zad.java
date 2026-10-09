package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean h1(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 == 1) {
            Status status = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.a(parcel, ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            J(status, moduleAvailabilityResponse);
            return true;
        }
        if (i11 == 2) {
            Status status2 = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) com.google.android.gms.internal.base.zac.a(parcel, ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            i0(status2, moduleInstallResponse);
            return true;
        }
        if (i11 == 3) {
            Status status3 = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.a(parcel, ModuleInstallIntentResponse.CREATOR);
            com.google.android.gms.internal.base.zac.d(parcel);
            F(status3, moduleInstallIntentResponse);
            return true;
        }
        if (i11 != 4) {
            return false;
        }
        Status status4 = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
        com.google.android.gms.internal.base.zac.d(parcel);
        S(status4);
        return true;
    }
}
