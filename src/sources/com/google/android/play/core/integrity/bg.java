package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f16153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f16154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f16155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f16157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j11, long j12, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f16153a = standardIntegrityTokenRequest;
        this.f16154b = j11;
        this.f16155c = j12;
        this.f16156d = taskCompletionSource2;
        this.f16157e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.l(this.f16157e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f16157e, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f16157e;
            ((com.google.android.play.integrity.internal.i) bnVar.f16172a.f16239n).B0(bn.a(bnVar, this.f16153a, this.f16154b, this.f16155c, 0), new bk(this.f16157e, this.f16156d, this.f16154b));
        } catch (RemoteException e8) {
            this.f16157e.f16173b.a(e8, "requestExpressIntegrityToken(%s, %s, %s)", this.f16153a.requestHash(), this.f16153a.verdictOptOut(), Long.valueOf(this.f16154b));
            this.f16156d.trySetException(new StandardIntegrityException(-100, e8));
        }
    }
}
