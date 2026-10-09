package com.google.android.play.core.integrity;

import a.ar.MFeWs;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f16107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f16108b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f16109c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f16107a = ajVar;
        this.f16109c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f16107a.f16110a.d(this.f16109c);
        this.f16108b.b("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f16107a.f16115f.a(bundle);
        if (apiExceptionA != null) {
            this.f16109c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString(MFeWs.DNpwJpzqPBquh);
        if (string == null) {
            this.f16109c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f16107a.f16112c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f16109c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
