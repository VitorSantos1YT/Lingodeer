package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzkp extends zzbm implements zzkq {
    public zzkp() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean g(int i11, Parcel parcel, Parcel parcel2) {
        if (i11 != 2) {
            return false;
        }
        Status status = (Status) zzbn.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.d(parcel);
        TaskCompletionSource taskCompletionSource = ((zzjy) this).f11654a;
        if (!status.D1()) {
            TaskUtil.a(status, null, taskCompletionSource);
            return true;
        }
        try {
            zzadf zzadfVar = zzadf.f11253b;
            int i12 = zzacf.f11197a;
            TaskUtil.a(status, zzno.A(bArrCreateByteArray, zzadf.f11254c), taskCompletionSource);
            return true;
        } catch (zzaeh e8) {
            taskCompletionSource.setException(e8);
            return true;
        }
    }
}
