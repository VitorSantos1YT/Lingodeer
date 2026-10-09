package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzay extends zzbl {
    @Override // com.google.android.gms.internal.play_billing.zzbl
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
