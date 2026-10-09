package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import i.c;
import l1.k1;
import l1.t;
import n4.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MutablePermissionState implements PermissionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f7786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f7787c = t.B(b());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f7788d;

    public MutablePermissionState(Context context, Activity activity) {
        this.f7785a = context;
        this.f7786b = activity;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public final void a() {
        c cVar = this.f7788d;
        if (cVar == null) {
            throw new IllegalStateException("ActivityResultLauncher cannot be null");
        }
        cVar.a("android.permission.RECORD_AUDIO");
    }

    public final PermissionStatus b() {
        return o4.c.a(this.f7785a, "android.permission.RECORD_AUDIO") == 0 ? PermissionStatus.Granted.f7791a : new PermissionStatus.Denied(b.e(this.f7786b, "android.permission.RECORD_AUDIO"));
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public final PermissionStatus getStatus() {
        return (PermissionStatus) this.f7787c.getValue();
    }
}
