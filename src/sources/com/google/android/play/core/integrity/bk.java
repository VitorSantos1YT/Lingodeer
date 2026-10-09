package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f16166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f16167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f16168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j11) {
        super(bnVar, taskCompletionSource);
        this.f16166c = bnVar;
        this.f16167d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.f16168e = j11;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f16167d.b("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f16166c.f16177f.a(bundle);
        if (apiExceptionA != null) {
            this.f16163a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f16166c.f16174c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f16163a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
