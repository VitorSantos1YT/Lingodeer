package defpackage;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f2b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f3c;

    public /* synthetic */ a(int i11, fz.a aVar, fz.a aVar2) {
        this.f1a = i11;
        this.f2b = aVar;
        this.f3c = aVar2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f1a) {
            case 0:
                this.f2b.invoke();
                this.f3c.invoke();
                break;
            case 1:
                this.f2b.invoke();
                this.f3c.invoke();
                break;
            case 2:
                this.f2b.invoke();
                this.f3c.invoke();
                break;
            case 3:
                this.f2b.invoke();
                this.f3c.invoke();
                break;
            default:
                this.f2b.invoke();
                this.f3c.invoke();
                break;
        }
        return b0.f48488a;
    }
}
