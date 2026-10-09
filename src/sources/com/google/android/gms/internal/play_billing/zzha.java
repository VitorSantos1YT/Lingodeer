package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzha implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f12439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzhd f12440d;

    public /* synthetic */ zzha(zzhd zzhdVar) {
        Objects.requireNonNull(zzhdVar);
        this.f12440d = zzhdVar;
        this.f12437a = -1;
    }

    public final Iterator a() {
        if (this.f12439c == null) {
            this.f12439c = this.f12440d.f12445c.entrySet().iterator();
        }
        return this.f12439c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f12437a + 1;
        zzhd zzhdVar = this.f12440d;
        if (i11 >= zzhdVar.f12444b) {
            return !zzhdVar.f12445c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f12438b = true;
        int i11 = this.f12437a + 1;
        this.f12437a = i11;
        zzhd zzhdVar = this.f12440d;
        return i11 < zzhdVar.f12444b ? (zzgz) zzhdVar.f12443a[i11] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12438b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f12438b = false;
        int i11 = zzhd.f12442t;
        zzhd zzhdVar = this.f12440d;
        zzhdVar.h();
        int i12 = this.f12437a;
        if (i12 >= zzhdVar.f12444b) {
            a().remove();
        } else {
            this.f12437a = i12 - 1;
            zzhdVar.f(i12);
        }
    }
}
