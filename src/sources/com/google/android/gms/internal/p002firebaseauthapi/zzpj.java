package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzpj implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f10831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10832b;

    public zzpj(zzpg zzpgVar, List list, List list2) {
        this.f10831a = list;
        this.f10832b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzpl(this.f10831a.iterator(), this.f10832b.iterator());
    }
}
