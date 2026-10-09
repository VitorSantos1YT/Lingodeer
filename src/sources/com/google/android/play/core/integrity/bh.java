package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f16158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f16159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f16161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f16162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i11) {
        super(bnVar, taskCompletionSource);
        this.f16158a = bundle;
        this.f16159b = activity;
        this.f16160c = taskCompletionSource2;
        this.f16161d = i11;
        this.f16162e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.l(this.f16162e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f16162e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f16172a;
            ((com.google.android.play.integrity.internal.i) aeVar.f16239n).m(this.f16158a, bnVar.f16176e.a(this.f16159b, this.f16160c, aeVar));
        } catch (RemoteException e8) {
            this.f16162e.f16173b.a(e8, "requestAndShowDialog(%s)", Integer.valueOf(this.f16161d));
            this.f16160c.trySetException(new StandardIntegrityException(-100, e8));
        }
    }
}
