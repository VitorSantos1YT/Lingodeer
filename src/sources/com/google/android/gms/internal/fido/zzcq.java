package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzcq extends zzcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9694a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzcz f9696c;

    public zzcq(zzcz zzczVar) {
        this.f9696c = zzczVar;
        this.f9695b = zzczVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9694a < this.f9695b;
    }

    public final byte zza() {
        int i11 = this.f9694a;
        if (i11 >= this.f9695b) {
            throw new NoSuchElementException();
        }
        this.f9694a = i11 + 1;
        return this.f9696c.d(i11);
    }
}
