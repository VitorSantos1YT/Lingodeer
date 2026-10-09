package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f16172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f16173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f16175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f16176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f16177f;

    public bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16175d = taskCompletionSource;
        this.f16174c = context.getPackageName();
        this.f16173b = sVar;
        this.f16176e = atVar;
        this.f16177f = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", bo.f16178a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final Object a(IBinder iBinder) {
                int i11 = com.google.android.play.integrity.internal.h.f16263t;
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                return iInterfaceQueryLocalInterface instanceof com.google.android.play.integrity.internal.i ? (com.google.android.play.integrity.internal.i) iInterfaceQueryLocalInterface : new com.google.android.play.integrity.internal.g(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f16172a = aeVar;
        aeVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j11, long j12, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f16174c);
        bundle.putLong("cloud.prj", j11);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j12);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j11, int i11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f16174c);
        bundle.putLong("cloud.prj", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar, int i11) {
        return bnVar.f16175d.getTask().isSuccessful() && ((Integer) bnVar.f16175d.getTask().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean l(bn bnVar) {
        return bnVar.f16175d.getTask().isSuccessful() && ((Integer) bnVar.f16175d.getTask().getResult()).intValue() == 0;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i11 = bundle.getInt("dialog.intent.type");
        this.f16173b.b("requestAndShowDialog(%s)", Integer.valueOf(i11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16172a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i11), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j11, long j12, int i11) {
        this.f16173b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j12));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16172a.c(new bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j11, j12, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j11, int i11) {
        this.f16173b.b("warmUpIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f16172a.c(new bf(this, taskCompletionSource, 0, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
