package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import rz.e0;
import rz.h0;
import rz.q1;
import rz.t;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbx {
    public static final h0 zza(Task task) {
        final t tVarB = e0.b();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) throws IllegalAccessException, InvocationTargetException {
                i iVar = tVarB;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((t) iVar).X(exception);
                } else if (task2.isCanceled()) {
                    ((q1) iVar).cancel(null);
                } else {
                    ((t) iVar).J(task2.getResult());
                }
            }
        });
        return new zzbw(tVarB);
    }
}
