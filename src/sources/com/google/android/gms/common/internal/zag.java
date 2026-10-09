package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zag extends zaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f8978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiActivity f8979b;

    public zag(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f8978a = intent;
        this.f8979b = googleApiActivity;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public final void a() {
        Intent intent = this.f8978a;
        if (intent != null) {
            this.f8979b.startActivityForResult(intent, 2);
        }
    }
}
