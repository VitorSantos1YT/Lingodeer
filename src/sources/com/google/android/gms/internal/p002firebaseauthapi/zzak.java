package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzak<E> extends zzaf<E> {
    public zzak() {
        this.f9894a = new Object[4];
        this.f9895b = 0;
    }

    public final zzaf b(Object obj) {
        Object[] objArr = this.f9894a;
        int iA = zzai.a(objArr.length, this.f9895b + 1);
        if (iA > objArr.length || this.f9896c) {
            this.f9894a = Arrays.copyOf(this.f9894a, iA);
            this.f9896c = false;
        }
        Object[] objArr2 = this.f9894a;
        int i11 = this.f9895b;
        this.f9895b = i11 + 1;
        objArr2[i11] = obj;
        return this;
    }

    public final zzah c() {
        this.f9896c = true;
        return zzah.j(this.f9895b, this.f9894a);
    }
}
