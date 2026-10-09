package ad;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements wc.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.m f647b;

    public /* synthetic */ w(rz.m mVar, int i11) {
        this.f646a = i11;
        this.f647b = mVar;
    }

    @Override // wc.y
    public final void onResult(Object obj) {
        switch (this.f646a) {
            case 0:
                rz.m mVar = this.f647b;
                if (!mVar.x()) {
                    mVar.resumeWith(obj);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj;
                rz.m mVar2 = this.f647b;
                if (!mVar2.x()) {
                    kotlin.jvm.internal.m.c(th2);
                    mVar2.resumeWith(com.bumptech.glide.e.l(th2));
                }
                break;
        }
    }
}
