package com.google.android.gms.internal.measurement;

import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.AbstractFuture;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkz extends AbstractFuture {
    public Task H;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void c() {
        this.H = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String k() {
        Task task = this.H;
        return task == null ? BuildConfig.VERSION_NAME : task.toString();
    }
}
