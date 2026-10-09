package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zze {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zze f12342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zze f12343c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f12344a;

    static {
        if (zzo.f12479d) {
            f12343c = null;
            f12342b = null;
        } else {
            f12343c = new zze(null);
            f12342b = new zze(null);
        }
    }

    public zze(CancellationException cancellationException) {
        this.f12344a = cancellationException;
    }
}
