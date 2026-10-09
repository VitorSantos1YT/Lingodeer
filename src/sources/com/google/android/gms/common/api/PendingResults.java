package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static PendingResult a(Status status) {
        Preconditions.a("Status code must not be SUCCESS", !status.D1());
        zad zadVar = new zad(status);
        zadVar.a(status);
        return zadVar;
    }
}
