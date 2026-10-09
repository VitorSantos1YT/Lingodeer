package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zan extends zabr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zao f8843b;

    public zan(zao zaoVar, AlertDialog alertDialog) {
        this.f8842a = alertDialog;
        this.f8843b = zaoVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void a() {
        zap zapVar = this.f8843b.f8845b;
        zapVar.f8847b.set(null);
        zapVar.b();
        AlertDialog alertDialog = this.f8842a;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}
