package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16217c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16219e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f16215a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f16218d = new Object();

    public y(String str, long j11) {
        this.f16216b = str;
        this.f16217c = j11;
    }

    public final Task a(Activity activity, int i11) {
        synchronized (this.f16218d) {
            try {
                if (this.f16219e) {
                    return Tasks.forResult(0);
                }
                this.f16219e = true;
                com.google.android.play.integrity.internal.s sVar = this.f16215a;
                Object[] objArr = {Integer.valueOf(i11)};
                if (Log.isLoggable("PlayCore", 3)) {
                    com.google.android.play.integrity.internal.s.d(sVar.f16265a, "checkAndShowDialog(%s)", objArr);
                } else {
                    sVar.getClass();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i11);
                bundle.putString("package.name", this.f16216b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 4);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f16217c);
                return b(activity, bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
