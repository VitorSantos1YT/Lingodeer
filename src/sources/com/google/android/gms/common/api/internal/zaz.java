package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zaz implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zaaa f8854b;

    public zaz(zaaa zaaaVar, TaskCompletionSource taskCompletionSource) {
        this.f8853a = taskCompletionSource;
        Objects.requireNonNull(zaaaVar);
        this.f8854b = zaaaVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f8854b.f8768b.remove(this.f8853a);
    }
}
