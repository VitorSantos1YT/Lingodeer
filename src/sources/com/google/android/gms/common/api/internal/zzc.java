package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.Collections;
import java.util.Map;
import nv.p;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8860a = Collections.synchronizedMap(new e(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8861b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f8862c;

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f8860a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(p.u(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f8861b > 0) {
            new zzg(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    public final void b(Bundle bundle) {
        this.f8861b = 1;
        this.f8862c = bundle;
        for (Map.Entry entry : this.f8860a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f8860a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
