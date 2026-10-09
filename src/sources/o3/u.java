package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f44699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44700b;

    public u(String str, int i11) {
        this.f44699a = new j3.h(str);
        this.f44700b = i11;
    }

    @Override // o3.g
    public final void a(b7.p pVar) {
        int i11 = pVar.f4018d;
        j3.h hVar = this.f44699a;
        if (i11 != -1) {
            int i12 = pVar.f4019e;
            String str = hVar.f35700b;
            String str2 = hVar.f35700b;
            pVar.f(i11, i12, str);
            if (str2.length() > 0) {
                pVar.g(i11, str2.length() + i11);
            }
        } else {
            int i13 = pVar.f4016b;
            int i14 = pVar.f4017c;
            String str3 = hVar.f35700b;
            String str4 = hVar.f35700b;
            pVar.f(i13, i14, str3);
            if (str4.length() > 0) {
                pVar.g(i13, str4.length() + i13);
            }
        }
        int i15 = pVar.f4016b;
        int i16 = pVar.f4017c;
        int i17 = i15 == i16 ? i16 : -1;
        int i18 = this.f44700b;
        int iL = hz.b.l(i18 > 0 ? (i17 + i18) - 1 : (i17 + i18) - hVar.f35700b.length(), 0, ((ar.f) pVar.f4020f).e());
        pVar.h(iL, iL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f44699a.f35700b, uVar.f44699a.f35700b) && this.f44700b == uVar.f44700b;
    }

    public final int hashCode() {
        return (this.f44699a.f35700b.hashCode() * 31) + this.f44700b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f44699a.f35700b);
        sb2.append("', newCursorPosition=");
        return ep.a.j(sb2, this.f44700b, ')');
    }
}
