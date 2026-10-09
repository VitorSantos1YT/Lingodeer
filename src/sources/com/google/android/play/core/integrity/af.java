package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f16096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Parcelable f16097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f16098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f16099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ aj f16100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l9, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f16095a = bArr;
        this.f16096b = l9;
        this.f16097c = parcelable;
        this.f16098d = taskCompletionSource2;
        this.f16099e = integrityTokenRequest;
        this.f16100f = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            aj ajVar = this.f16100f;
            ((com.google.android.play.integrity.internal.n) ajVar.f16110a.f16239n).z(aj.a(ajVar, this.f16095a, this.f16096b, this.f16097c), new ai(this.f16100f, this.f16098d));
        } catch (RemoteException e8) {
            this.f16100f.f16111b.a(e8, "requestIntegrityToken(%s)", this.f16099e);
            this.f16098d.trySetException(new IntegrityServiceException(-100, e8));
        }
    }
}
