package com.google.android.gms.common.api;

import android.content.IntentSender;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    @Override // com.google.android.gms.common.api.ResultCallbacks
    public final void b(Status status) {
        if (status.f8708c == null) {
            d();
            return;
        }
        try {
            status.E1();
        } catch (IntentSender.SendIntentException unused) {
            new Status(8, null, null, null);
            d();
        }
    }

    public abstract void d();
}
