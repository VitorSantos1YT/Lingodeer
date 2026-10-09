package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20596b;

    public /* synthetic */ m(Object obj, Object obj2) {
        this.f20595a = obj;
        this.f20596b = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.f20595a;
        Intent intent = (Intent) this.f20596b;
        int i11 = EnhancedIntentService.f20458f;
        enhancedIntentService.a(intent);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        RequestDeduplicator requestDeduplicator = (RequestDeduplicator) this.f20595a;
        String str = (String) this.f20596b;
        synchronized (requestDeduplicator) {
            requestDeduplicator.f20510b.remove(str);
        }
        return task;
    }
}
