package o20;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f44507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44508f;

    public e0(int i11, String str, boolean z11) {
        this.f44505c = i11;
        switch (i11) {
            case 1:
                b bVar = b.f44481b;
                Objects.requireNonNull(str, "name == null");
                this.f44506d = str;
                this.f44507e = bVar;
                this.f44508f = z11;
                break;
            case 2:
                b bVar2 = b.f44481b;
                Objects.requireNonNull(str, "name == null");
                this.f44506d = str;
                this.f44507e = bVar2;
                this.f44508f = z11;
                break;
            default:
                b bVar3 = b.f44481b;
                Objects.requireNonNull(str, "name == null");
                this.f44506d = str;
                this.f44507e = bVar3;
                this.f44508f = z11;
                break;
        }
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        switch (this.f44505c) {
            case 0:
                if (obj != null) {
                    this.f44507e.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        q0Var.a(this.f44506d, string, this.f44508f);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f44507e.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        q0Var.b(this.f44506d, string2, this.f44508f);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f44507e.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        q0Var.d(this.f44506d, string3, this.f44508f);
                        break;
                    }
                }
                break;
        }
    }
}
