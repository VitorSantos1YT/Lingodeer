package hx;

import com.google.firebase.inappmessaging.internal.v;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.d f33839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33841c;

    public d(com.bumptech.glide.d dVar, Object obj, int i11) {
        this.f33840b = i11;
        this.f33839a = dVar;
        this.f33841c = obj;
    }

    @Override // com.bumptech.glide.d
    public final void K(k kVar) {
        switch (this.f33840b) {
            case 0:
                this.f33839a.J(new c(kVar, (v) this.f33841c, 0));
                break;
            case 1:
                this.f33839a.J(new c(kVar, (yw.c) this.f33841c, 1));
                break;
            default:
                i iVar = (i) this.f33841c;
                bq.f fVar = new bq.f();
                fVar.f4944b = kVar;
                fVar.f4945c = iVar;
                fVar.f4943a = true;
                fVar.f4946d = new zw.c();
                kVar.b((zw.c) fVar.f4946d);
                this.f33839a.J(fVar);
                break;
        }
    }
}
