package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactorSession;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzak implements Continuation<GetTokenResult, Task<MultiFactorSession>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<MultiFactorSession> then(Task<GetTokenResult> task) {
        if (task.isSuccessful()) {
            String str = task.getResult().f17900a;
            throw null;
        }
        Exception exception = task.getException();
        Preconditions.g(exception);
        return Tasks.forException(exception);
    }
}
