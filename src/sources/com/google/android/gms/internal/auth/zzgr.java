package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgr implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9549a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f9551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzgv f9552d;

    public final Iterator a() {
        if (this.f9551c == null) {
            this.f9551c = this.f9552d.f9557c.entrySet().iterator();
        }
        return this.f9551c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f9549a + 1;
        zzgv zzgvVar = this.f9552d;
        if (i11 >= zzgvVar.f9556b.size()) {
            return !zzgvVar.f9557c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f9550b = true;
        int i11 = this.f9549a + 1;
        this.f9549a = i11;
        zzgv zzgvVar = this.f9552d;
        return i11 < zzgvVar.f9556b.size() ? (Map.Entry) zzgvVar.f9556b.get(this.f9549a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9550b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f9550b = false;
        int i11 = zzgv.f9554t;
        zzgv zzgvVar = this.f9552d;
        zzgvVar.f();
        if (this.f9549a >= zzgvVar.f9556b.size()) {
            a().remove();
            return;
        }
        int i12 = this.f9549a;
        this.f9549a = i12 - 1;
        zzgvVar.d(i12);
    }
}
