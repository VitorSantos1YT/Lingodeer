package zd;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f59204b = new y(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59205a;

    public /* synthetic */ y(int i11) {
        this.f59205a = i11;
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        switch (this.f59205a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, td.j jVar) {
        switch (this.f59205a) {
            case 0:
                return new p(new oe.b(obj), new d(obj, 1));
            case 1:
                File file = (File) obj;
                return new p(new oe.b(file), new d(file, 0));
            default:
                return null;
        }
    }
}
