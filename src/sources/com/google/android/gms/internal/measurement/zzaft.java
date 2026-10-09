package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaft implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f11334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzafv f11335d;

    public /* synthetic */ zzaft(zzafv zzafvVar) {
        Objects.requireNonNull(zzafvVar);
        this.f11335d = zzafvVar;
        this.f11332a = -1;
    }

    public final Iterator a() {
        if (this.f11334c == null) {
            this.f11334c = this.f11335d.f11339c.entrySet().iterator();
        }
        return this.f11334c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f11332a + 1;
        zzafv zzafvVar = this.f11335d;
        if (i11 >= zzafvVar.f11338b) {
            return !zzafvVar.f11339c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f11333b = true;
        int i11 = this.f11332a + 1;
        this.f11332a = i11;
        zzafv zzafvVar = this.f11335d;
        return i11 < zzafvVar.f11338b ? (zzafs) zzafvVar.f11337a[i11] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f11333b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f11333b = false;
        zzafv zzafvVar = this.f11335d;
        zzafvVar.g();
        int i11 = this.f11332a;
        if (i11 >= zzafvVar.f11338b) {
            a().remove();
        } else {
            this.f11332a = i11 - 1;
            zzafvVar.e(i11);
        }
    }
}
