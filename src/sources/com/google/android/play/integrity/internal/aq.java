package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class aq extends ar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f16245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f16246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ar f16247e;

    public aq(ar arVar, int i11, int i12) {
        this.f16247e = arVar;
        this.f16245c = i11;
        this.f16246d = i12;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int d() {
        return this.f16247e.e() + this.f16245c + this.f16246d;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int e() {
        return this.f16247e.e() + this.f16245c;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] g() {
        return this.f16247e.g();
    }

    @Override // java.util.List
    public final Object get(int i11) {
        al.a(i11, this.f16246d);
        return this.f16247e.get(i11 + this.f16245c);
    }

    @Override // com.google.android.play.integrity.internal.ar, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ar subList(int i11, int i12) {
        al.b(i11, i12, this.f16246d);
        int i13 = this.f16245c;
        return this.f16247e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16246d;
    }
}
