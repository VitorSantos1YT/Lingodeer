package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzajh extends zzajj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaje f10071c;

    public zzajh(zzaje zzajeVar) {
        Objects.requireNonNull(zzajeVar);
        this.f10071c = zzajeVar;
        this.f10069a = 0;
        this.f10070b = zzajeVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10069a < this.f10070b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajk
    public final byte zza() {
        int i11 = this.f10069a;
        if (i11 >= this.f10070b) {
            throw new NoSuchElementException();
        }
        this.f10069a = i11 + 1;
        return this.f10071c.b(i11);
    }
}
