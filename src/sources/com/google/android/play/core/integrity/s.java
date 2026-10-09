package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16207e;

    public s(Context context, r rVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        com.google.android.play.integrity.internal.az azVar = new com.google.android.play.integrity.internal.az(context);
        this.f16203a = azVar;
        com.google.android.play.integrity.internal.ax axVarB = com.google.android.play.integrity.internal.ax.b(ac.f16094a);
        this.f16204b = axVarB;
        au auVar = new au(azVar, l.f16196a);
        this.f16205c = auVar;
        com.google.android.play.integrity.internal.ax axVarB2 = com.google.android.play.integrity.internal.ax.b(new al(azVar, axVarB, auVar, l.f16196a));
        this.f16206d = axVarB2;
        this.f16207e = com.google.android.play.integrity.internal.ax.b(new ab(axVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f16207e.a();
    }
}
