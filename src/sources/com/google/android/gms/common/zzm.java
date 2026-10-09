package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzm extends zzj {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakReference f9156d = new WeakReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f9157c;

    public zzm(byte[] bArr) {
        super(bArr);
        this.f9157c = f9156d;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] h() {
        byte[] bArrH1;
        synchronized (this) {
            try {
                bArrH1 = (byte[]) this.f9157c.get();
                if (bArrH1 == null) {
                    bArrH1 = h1();
                    this.f9157c = new WeakReference(bArrH1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrH1;
    }

    public abstract byte[] h1();
}
