package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f16163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f16164b;

    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f16164b = bnVar;
        this.f16163a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) {
        this.f16164b.f16172a.d(this.f16163a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) {
        this.f16164b.f16172a.d(this.f16163a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) {
        this.f16164b.f16172a.d(this.f16163a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) {
        this.f16164b.f16172a.d(this.f16163a);
    }
}
