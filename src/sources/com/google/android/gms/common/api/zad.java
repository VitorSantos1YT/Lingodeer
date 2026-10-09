package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zad<R extends Result> extends BasePendingResult<R> {
    public final Status m;

    public zad(Status status) {
        super(null);
        this.m = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result d(Status status) {
        return this.m;
    }
}
