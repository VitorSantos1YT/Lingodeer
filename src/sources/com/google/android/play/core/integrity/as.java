package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f16128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f16129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f16130c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f16132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f16133f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.f16131d = context.getPackageName();
        this.f16132e = kVar;
        this.f16128a = taskCompletionSource;
        this.f16133f = activity;
        this.f16129b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.f16129b.d(this.f16128a);
        this.f16130c.b("onRequestDialog(%s)", this.f16131d);
        ApiException apiExceptionA = this.f16132e.a(bundle);
        if (apiExceptionA != null) {
            this.f16128a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            com.google.android.play.integrity.internal.s sVar = this.f16130c;
            Object[] objArr = {this.f16131d};
            if (Log.isLoggable("PlayCore", 6)) {
                com.google.android.play.integrity.internal.s.d(sVar.f16265a, "onRequestDialog(%s): got null dialog intent", objArr);
            } else {
                sVar.getClass();
            }
            this.f16128a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f16133f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f16129b.a()));
        com.google.android.play.integrity.internal.s sVar2 = this.f16130c;
        Object[] objArr2 = new Object[0];
        if (Log.isLoggable("PlayCore", 3)) {
            com.google.android.play.integrity.internal.s.d(sVar2.f16265a, "Starting dialog intent...", objArr2);
        } else {
            sVar2.getClass();
        }
        this.f16133f.startActivityForResult(intent, 0);
    }
}
