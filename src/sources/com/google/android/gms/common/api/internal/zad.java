package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zad extends zac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f8832b;

    public zad(int i11, TaskCompletionSource taskCompletionSource) {
        super(i11);
        this.f8832b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.f8832b.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        this.f8832b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zabk zabkVar) throws DeadObjectException {
        try {
            i(zabkVar);
        } catch (DeadObjectException e8) {
            a(zai.e(e8));
            throw e8;
        } catch (RemoteException e10) {
            a(zai.e(e10));
        } catch (RuntimeException e11) {
            this.f8832b.trySetException(e11);
        }
    }

    public abstract void i(zabk zabkVar);

    @Override // com.google.android.gms.common.api.internal.zai
    public void c(zaaa zaaaVar, boolean z11) {
    }
}
