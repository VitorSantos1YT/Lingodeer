package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcf implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcg f18006a;

    public zzcf(zzcg zzcgVar) {
        this.f18006a = zzcgVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z11) {
        if (z11) {
            this.f18006a.f18009c = true;
            zzas zzasVar = this.f18006a.f18008b;
            zzasVar.f17961d.removeCallbacks(zzasVar.f17962e);
        } else {
            this.f18006a.f18009c = false;
            zzcg zzcgVar = this.f18006a;
            if (zzcgVar.f18007a <= 0 || zzcgVar.f18009c) {
                return;
            }
            this.f18006a.f18008b.a();
        }
    }
}
