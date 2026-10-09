package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f16214f;

    public w(Context context, v vVar) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        com.google.android.play.integrity.internal.az azVar = new com.google.android.play.integrity.internal.az(context);
        this.f16209a = azVar;
        com.google.android.play.integrity.internal.ax axVarB = com.google.android.play.integrity.internal.ax.b(bb.f16147a);
        this.f16210b = axVarB;
        au auVar = new au(azVar, n.f16201a);
        this.f16211c = auVar;
        com.google.android.play.integrity.internal.ax axVarB2 = com.google.android.play.integrity.internal.ax.b(new bp(azVar, axVarB, auVar, n.f16201a));
        this.f16212d = axVarB2;
        com.google.android.play.integrity.internal.ax axVarB3 = com.google.android.play.integrity.internal.ax.b(new bu(axVarB2));
        this.f16213e = axVarB3;
        this.f16214f = com.google.android.play.integrity.internal.ax.b(new ba(axVarB2, axVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f16214f.a();
    }
}
