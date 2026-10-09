package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f13222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzdb f13224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f13226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f13227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13228h;

    public zzjs(Context context, com.google.android.gms.internal.measurement.zzdb zzdbVar, Long l9, Long l11) {
        this.f13225e = true;
        Preconditions.g(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.g(applicationContext);
        this.f13221a = applicationContext;
        this.f13226f = l9;
        this.f13227g = l11;
        if (zzdbVar != null) {
            this.f13224d = zzdbVar;
            this.f13225e = zzdbVar.f11499c;
            this.f13223c = zzdbVar.f11498b;
            this.f13228h = zzdbVar.f11501e;
            Bundle bundle = zzdbVar.f11500d;
            if (bundle != null) {
                this.f13222b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
