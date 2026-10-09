package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zai extends zaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f8980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleFragment f8981b;

    public zai(Intent intent, LifecycleFragment lifecycleFragment) {
        this.f8980a = intent;
        this.f8981b = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zaj
    public final void a() {
        Intent intent = this.f8980a;
        if (intent != null) {
            this.f8981b.startActivityForResult(intent, 2);
        }
    }
}
