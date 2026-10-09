package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f8612b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f8614d;

    public zzs(int i11, int i12, Bundle bundle) {
        this.f8611a = i11;
        this.f8613c = i12;
        this.f8614d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zztVar.toString();
        }
        this.f8612b.setException(zztVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request { what=");
        sb2.append(this.f8613c);
        sb2.append(" id=");
        sb2.append(this.f8611a);
        sb2.append(" oneWay=");
        return p0.p(sb2, b(), "}");
    }
}
