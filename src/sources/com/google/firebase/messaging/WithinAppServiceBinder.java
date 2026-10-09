package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class WithinAppServiceBinder extends Binder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20561b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnhancedIntentService.AnonymousClass1 f20562a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface IntentHandler {
    }

    public WithinAppServiceBinder(EnhancedIntentService.AnonymousClass1 anonymousClass1) {
        this.f20562a = anonymousClass1;
    }

    public final void a(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = bindRequest.f20569a;
        EnhancedIntentService enhancedIntentService = EnhancedIntentService.this;
        int i11 = EnhancedIntentService.f20458f;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        enhancedIntentService.f20459a.execute(new b(enhancedIntentService, intent, taskCompletionSource));
        taskCompletionSource.getTask().addOnCompleteListener(new s.a(1), new k(bindRequest, 2));
    }
}
