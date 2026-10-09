package zd;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59153b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f59152a = i11;
        this.f59153b = obj;
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        switch (this.f59152a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, td.j jVar) {
        switch (this.f59152a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new p(new oe.b(bArr), new m(1, bArr, (x) this.f59153b));
            case 1:
                return new p(new oe.b(obj), new ud.c(obj.toString(), (x) this.f59153b, 1));
            default:
                File file = (File) obj;
                return new p(new oe.b(file), new ud.c(file, (x) this.f59153b, 2));
        }
    }
}
