package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj implements BaseImplementation.ResultHolder<Status> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f12584a;

    public zzj(TaskCompletionSource taskCompletionSource) {
        this.f12584a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TaskUtil.a((Status) obj, null, this.f12584a);
    }
}
