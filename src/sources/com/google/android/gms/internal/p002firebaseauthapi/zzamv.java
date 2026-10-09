package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamv implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f10203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzamt f10204c;

    public zzamv(zzamt zzamtVar) {
        Objects.requireNonNull(zzamtVar);
        this.f10204c = zzamtVar;
        this.f10202a = zzamtVar.f10197b;
    }

    public final Iterator a() {
        if (this.f10203b == null) {
            this.f10203b = this.f10204c.f10201f.entrySet().iterator();
        }
        return this.f10203b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f10202a;
        return (i11 > 0 && i11 <= this.f10204c.f10197b) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        Object[] objArr = this.f10204c.f10196a;
        int i11 = this.f10202a - 1;
        this.f10202a = i11;
        return (zzamx) objArr[i11];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
