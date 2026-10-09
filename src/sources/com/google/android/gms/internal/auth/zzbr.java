package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbr extends zzbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbs f9451a;

    public zzbr(zzbs zzbsVar) {
        this.f9451a = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void d(String str) {
        zzbs zzbsVar = this.f9451a;
        if (str != null) {
            zzbsVar.a(new zzbv(str));
        } else {
            zzbsVar.a(new zzbv(new Status(INTENTS.RESLUT_LOGIN_SUCCESS, null, null, null)));
        }
    }
}
