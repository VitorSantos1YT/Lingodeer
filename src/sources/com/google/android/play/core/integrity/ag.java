package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f16101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f16102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f16104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f16105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i11) {
        super(taskCompletionSource);
        this.f16101a = bundle;
        this.f16102b = activity;
        this.f16103c = taskCompletionSource2;
        this.f16104d = i11;
        this.f16105e = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            aj ajVar = this.f16105e;
            ((com.google.android.play.integrity.internal.n) ajVar.f16110a.f16239n).m(this.f16101a, ajVar.f16114e.a(this.f16102b, this.f16103c, ajVar.f16110a));
        } catch (RemoteException e8) {
            this.f16105e.f16111b.a(e8, "requestAndShowDialog(%s)", Integer.valueOf(this.f16104d));
            this.f16103c.trySetException(new IntegrityServiceException(-100, e8));
        }
    }
}
