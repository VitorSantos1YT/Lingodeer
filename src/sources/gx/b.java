package gx;

import com.bumptech.glide.d;
import com.google.firebase.inappmessaging.internal.k;
import uw.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f29888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f29889b;

    public b(h hVar, k kVar) {
        this.f29888a = hVar;
        this.f29889b = kVar;
    }

    @Override // com.bumptech.glide.d
    public final void K(uw.k kVar) {
        a aVar = new a(kVar, this.f29889b);
        kVar.b(aVar);
        this.f29888a.b(aVar);
    }
}
