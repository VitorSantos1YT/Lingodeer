package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import com.google.common.base.Ticker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxg extends Ticker {
    @Override // com.google.common.base.Ticker
    public final long a() {
        return SystemClock.elapsedRealtime() * 1000000;
    }
}
