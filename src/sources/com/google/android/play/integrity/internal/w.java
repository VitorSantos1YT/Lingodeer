package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class w extends t {
    public final /* synthetic */ t H;
    public final /* synthetic */ ae K;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f16270t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f16270t = taskCompletionSource2;
        this.H = tVar;
        this.K = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.K.f16232f) {
            try {
                final ae aeVar = this.K;
                final TaskCompletionSource taskCompletionSource = this.f16270t;
                aeVar.f16231e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        ae aeVar2 = aeVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (aeVar2.f16232f) {
                            aeVar2.f16231e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.K.f16238l.getAndIncrement() > 0) {
                    this.K.f16228b.b("Already connected to the service.", new Object[0]);
                }
                ae.b(this.K, this.H);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
