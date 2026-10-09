package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzbf extends zzbb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbg f9655c;

    public zzbf(zzbg zzbgVar) {
        this.f9655c = zzbgVar;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    /* JADX INFO: renamed from: f */
    public final zzcb iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbc, com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzbc
    public final zzaz m() {
        return new zzbe(this);
    }

    @Override // com.google.android.gms.internal.fido.zzbb
    public final zzbg n() {
        return this.f9655c;
    }
}
