package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzu implements Continuation<GetTokenResult, Task<Void>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<Void> then(Task<GetTokenResult> task) {
        if (task.isSuccessful()) {
            throw null;
        }
        Exception exception = task.getException();
        Preconditions.g(exception);
        return Tasks.forException(exception);
    }
}
