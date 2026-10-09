package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z11;
        if (task.isSuccessful()) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
            crashlyticsReportWithSessionId.getClass();
            File fileB = crashlyticsReportWithSessionId.b();
            if (fileB.delete()) {
                fileB.getPath();
            } else {
                fileB.getPath();
            }
            z11 = true;
        } else {
            task.getException();
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
