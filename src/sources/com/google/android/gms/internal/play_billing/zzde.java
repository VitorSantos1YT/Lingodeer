package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzde extends zzcq {
    public zzcz H;
    public ScheduledFuture K;

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final String d() {
        zzcz zzczVar = this.H;
        ScheduledFuture scheduledFuture = this.K;
        if (zzczVar == null) {
            return null;
        }
        String strG = ep.a.g("inputFuture=[", zzczVar.toString(), "]");
        if (scheduledFuture == null) {
            return strG;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strG;
        }
        return strG + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final void e() {
        zzcz zzczVar = this.H;
        if ((this.f12306a instanceof zzcj.zza) & (zzczVar != null)) {
            Object obj = this.f12306a;
            zzczVar.cancel((obj instanceof zzcj.zza) && ((zzcj.zza) obj).f12291a);
        }
        ScheduledFuture scheduledFuture = this.K;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.H = null;
        this.K = null;
    }
}
