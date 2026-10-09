package com.google.android.gms.internal.auth;

import android.net.Uri;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9461b = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9462c;

    public zzcz(Uri uri, boolean z11, boolean z12) {
        this.f9460a = uri;
        this.f9462c = z12;
    }

    public final zzcz a() {
        if (!this.f9461b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzcz(this.f9460a, true, this.f9462c);
    }

    public final void b(long j11) {
        new zzcv(this, Long.valueOf(j11));
    }

    public final void c(boolean z11) {
        new zzcw(this, Boolean.valueOf(z11));
    }
}
