package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13620a;

    public zzph(Context context) {
        Preconditions.g(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.g(applicationContext);
        this.f13620a = applicationContext;
    }
}
