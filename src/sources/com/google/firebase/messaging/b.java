package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnhancedIntentService f20572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f20573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f20574c;

    public /* synthetic */ b(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f20572a = enhancedIntentService;
        this.f20573b = intent;
        this.f20574c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnhancedIntentService enhancedIntentService = this.f20572a;
        Intent intent = this.f20573b;
        TaskCompletionSource taskCompletionSource = this.f20574c;
        int i11 = EnhancedIntentService.f20458f;
        try {
            enhancedIntentService.c(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }
}
