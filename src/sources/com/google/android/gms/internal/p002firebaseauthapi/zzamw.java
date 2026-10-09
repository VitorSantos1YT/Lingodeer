package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamw implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f10207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzamt f10208d;

    public zzamw(zzamt zzamtVar) {
        Objects.requireNonNull(zzamtVar);
        this.f10208d = zzamtVar;
        this.f10205a = -1;
    }

    public final Iterator a() {
        if (this.f10207c == null) {
            this.f10207c = this.f10208d.f10198c.entrySet().iterator();
        }
        return this.f10207c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f10205a + 1;
        zzamt zzamtVar = this.f10208d;
        return i11 < zzamtVar.f10197b || (!zzamtVar.f10198c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f10206b = true;
        int i11 = this.f10205a + 1;
        this.f10205a = i11;
        zzamt zzamtVar = this.f10208d;
        return i11 < zzamtVar.f10197b ? (zzamx) zzamtVar.f10196a[i11] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10206b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f10206b = false;
        int i11 = zzamt.f10195t;
        zzamt zzamtVar = this.f10208d;
        zzamtVar.h();
        int i12 = this.f10205a;
        if (i12 >= zzamtVar.f10197b) {
            a().remove();
        } else {
            this.f10205a = i12 - 1;
            zzamtVar.e(i12);
        }
    }
}
