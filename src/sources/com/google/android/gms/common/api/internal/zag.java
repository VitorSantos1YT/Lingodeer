package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zag extends zac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskApiCall f8835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f8836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StatusExceptionMapper f8837d;

    public zag(int i11, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i11);
        this.f8836c = taskCompletionSource;
        this.f8835b = taskApiCall;
        this.f8837d = statusExceptionMapper;
        if (i11 == 2 && taskApiCall.f8759b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        this.f8836c.trySetException(this.f8837d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        this.f8836c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zaaa zaaaVar, boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        Map map = zaaaVar.f8768b;
        TaskCompletionSource taskCompletionSource = this.f8836c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new zaz(zaaaVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zabk zabkVar) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f8836c;
        try {
            TaskApiCall taskApiCall = this.f8835b;
            ((zacn) taskApiCall).f8830d.f8761a.a(zabkVar.f8779b, taskCompletionSource);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e10) {
            a(zai.e(e10));
        } catch (RuntimeException e11) {
            taskCompletionSource.trySetException(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] f(zabk zabkVar) {
        return this.f8835b.f8758a;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean g(zabk zabkVar) {
        return this.f8835b.f8759b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int h(zabk zabkVar) {
        return this.f8835b.f8760c;
    }
}
