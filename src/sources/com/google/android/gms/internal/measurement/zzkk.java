package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzkk extends GoogleApi {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f11671l = 0;

    static {
        Pair.create(new zzkm(), Tasks.forResult(null));
    }

    public final void c(final String str, final String[] strArr) {
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzki
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i11 = zzkk.f11671l;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).y();
                Parcel parcelH = zzktVar.h();
                zzbn.c(parcelH, zzkjVar);
                parcelH.writeString(str);
                parcelH.writeInt(0);
                parcelH.writeStringArray(strArr);
                parcelH.writeByteArray(null);
                zzktVar.j(parcelH, 1);
            }
        };
        b(0, builderA.a());
    }

    public final Task d(final String str) {
        TaskApiCall.Builder builderA = TaskApiCall.a();
        builderA.f8761a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i11 = zzkk.f11671l;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).y();
                Parcel parcelH = zzktVar.h();
                zzbn.c(parcelH, zzkjVar);
                parcelH.writeString(str);
                zzktVar.j(parcelH, 5);
            }
        };
        return b(0, builderA.a());
    }
}
