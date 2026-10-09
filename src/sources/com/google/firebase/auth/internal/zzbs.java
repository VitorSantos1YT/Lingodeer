package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbs implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ zzbq f17986a;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zzbq zzbqVar = this.f17986a;
        if (task.isSuccessful()) {
            return zzbqVar.b((String) task.getResult());
        }
        Exception exception = task.getException();
        Preconditions.g(exception);
        exception.getMessage();
        return zzbqVar.b("NO_RECAPTCHA");
    }
}
