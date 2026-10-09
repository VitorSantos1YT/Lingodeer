package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbn extends zzbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9449a;

    public zzbn(TaskCompletionSource taskCompletionSource) {
        this.f9449a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void d(String str) {
        TaskUtil.a(str != null ? Status.f8703e : new Status(INTENTS.RESLUT_LOGIN_SUCCESS, null, null, null), str, this.f9449a);
    }
}
