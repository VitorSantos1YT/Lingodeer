package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.d0;
import com.android.billingclient.api.g0;
import com.android.billingclient.api.j;
import com.android.billingclient.api.j0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzct implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcz f12323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f12324b;

    public zzct(zzcz zzczVar, d0 d0Var) {
        this.f12323a = zzczVar;
        this.f12324b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        zzcz zzczVar = this.f12323a;
        boolean z11 = zzczVar instanceof zzdf;
        d0 d0Var = this.f12324b;
        if (z11 && (thA = ((zzdf) zzczVar).a()) != null) {
            d0Var.e(thA);
            return;
        }
        try {
            if (!zzczVar.isDone()) {
                throw new IllegalStateException(zzbj.a("Future was expected to be done: %s", zzczVar));
            }
            boolean z12 = false;
            Future future = zzczVar;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z12 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z12) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            g0 g0Var = (g0) d0Var.f7500d;
            if (iIntValue <= 0) {
                ((Runnable) d0Var.f7499c).run();
                return;
            }
            int i11 = d0Var.f7497a;
            int iIntValue2 = num.intValue();
            g0Var.getClass();
            j jVarA = j0.a(iIntValue2, "Billing override value was set by a license tester.");
            g0Var.H(zzie.LICENSE_TESTER_BILLING_OVERRIDE, i11, jVarA);
            ((y4.a) d0Var.f7498b).accept(jVarA);
        } catch (ExecutionException e8) {
            d0Var.e(e8.getCause());
        } catch (Throwable th3) {
            d0Var.e(th3);
        }
    }

    public final String toString() {
        zzbc zzbcVar = new zzbc("zzct");
        zzbb zzbbVar = new zzbb();
        zzbcVar.f12247c.f12244b = zzbbVar;
        zzbcVar.f12247c = zzbbVar;
        zzbbVar.f12243a = this.f12324b;
        return zzbcVar.toString();
    }
}
