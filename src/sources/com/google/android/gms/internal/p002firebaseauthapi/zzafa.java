package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzafa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzadw f9897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f9898b;

    public final Task a(zzafc zzafcVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executor executor = this.f9898b;
        zzaez zzaezVar = new zzaez();
        zzaezVar.f9891a = this;
        zzaezVar.f9892b = zzafcVar;
        zzaezVar.f9893c = taskCompletionSource;
        executor.execute(zzaezVar);
        return taskCompletionSource.getTask();
    }
}
