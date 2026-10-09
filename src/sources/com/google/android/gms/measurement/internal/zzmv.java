package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f13446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zznl f13447e;

    public zzmv(zznl zznlVar, AtomicReference atomicReference, String str, String str2, zzr zzrVar) {
        this.f13443a = atomicReference;
        this.f13444b = str;
        this.f13445c = str2;
        this.f13446d = zzrVar;
        this.f13447e = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f13443a;
        synchronized (atomicReference2) {
            try {
                try {
                    zznl zznlVar = this.f13447e;
                    zzgb zzgbVar = zznlVar.f13489d;
                    if (zzgbVar == null) {
                        zzgu zzguVar = zznlVar.f13202a.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f13444b, this.f13445c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        atomicReference2.set(zzgbVar.Z0(this.f13444b, this.f13445c, this.f13446d));
                    } else {
                        atomicReference2.set(zzgbVar.X(null, this.f13444b, this.f13445c));
                    }
                    zznlVar.t();
                    atomicReference = this.f13443a;
                    atomicReference.notify();
                } catch (RemoteException e8) {
                    zzgu zzguVar2 = this.f13447e.f13202a.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.d("(legacy) Failed to get conditional properties; remote exception", null, this.f13444b, e8);
                    this.f13443a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f13443a;
                }
            } catch (Throwable th2) {
                this.f13443a.notify();
                throw th2;
            }
        }
    }
}
