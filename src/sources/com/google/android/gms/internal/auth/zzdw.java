package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzdw extends zzdy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9477a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzef f9479c;

    public zzdw(zzef zzefVar) {
        this.f9479c = zzefVar;
        this.f9478b = zzefVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9477a < this.f9478b;
    }

    public final byte zza() {
        int i11 = this.f9477a;
        if (i11 >= this.f9478b) {
            throw new NoSuchElementException();
        }
        this.f9477a = i11 + 1;
        return this.f9479c.d(i11);
    }
}
