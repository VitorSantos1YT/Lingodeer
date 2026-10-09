package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmx implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f13456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zznl f13458f;

    public zzmx(zznl zznlVar, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z11) {
        this.f13453a = atomicReference;
        this.f13454b = str;
        this.f13455c = str2;
        this.f13456d = zzrVar;
        this.f13457e = z11;
        this.f13458f = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f13453a;
        synchronized (atomicReference2) {
            try {
                try {
                    zznl zznlVar = this.f13458f;
                    zzgb zzgbVar = zznlVar.f13489d;
                    if (zzgbVar == null) {
                        zzgu zzguVar = zznlVar.f13202a.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.d("(legacy) Failed to get user properties; not connected to service", null, this.f13454b, this.f13455c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(zzgbVar.R0(this.f13454b, this.f13455c, this.f13457e, this.f13456d));
                    } else {
                        atomicReference2.set(zzgbVar.q(null, this.f13454b, this.f13455c, this.f13457e));
                    }
                    zznlVar.t();
                    atomicReference = this.f13453a;
                    atomicReference.notify();
                } catch (RemoteException e8) {
                    zzgu zzguVar2 = this.f13458f.f13202a.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.d("(legacy) Failed to get user properties; remote exception", null, this.f13454b, e8);
                    this.f13453a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f13453a;
                }
            } catch (Throwable th2) {
                this.f13453a.notify();
                throw th2;
            }
        }
    }
}
