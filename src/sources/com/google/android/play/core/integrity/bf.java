package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f16150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f16152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i11, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f16150a = j11;
        this.f16151b = taskCompletionSource2;
        this.f16152c = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.l(this.f16152c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f16152c, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f16152c;
            ((com.google.android.play.integrity.internal.i) bnVar.f16172a.f16239n).s0(bn.b(bnVar, this.f16150a, 0), new bl(this.f16152c, this.f16151b));
        } catch (RemoteException e8) {
            this.f16152c.f16173b.a(e8, "warmUpIntegrityToken(%s)", Long.valueOf(this.f16150a));
            this.f16151b.trySetException(new StandardIntegrityException(-100, e8));
        }
    }
}
