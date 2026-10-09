package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f44627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44628b;

    public a(j3.h hVar, int i11) {
        this.f44627a = hVar;
        this.f44628b = i11;
    }

    @Override // o3.g
    public final void a(b7.p pVar) {
        int i11 = pVar.f4018d;
        j3.h hVar = this.f44627a;
        if (i11 != -1) {
            pVar.f(i11, pVar.f4019e, hVar.f35700b);
        } else {
            pVar.f(pVar.f4016b, pVar.f4017c, hVar.f35700b);
        }
        int i12 = pVar.f4016b;
        int i13 = pVar.f4017c;
        int i14 = i12 == i13 ? i13 : -1;
        int i15 = this.f44628b;
        int iL = hz.b.l(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - hVar.f35700b.length(), 0, ((ar.f) pVar.f4020f).e());
        pVar.h(iL, iL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f44627a.f35700b, aVar.f44627a.f35700b) && this.f44628b == aVar.f44628b;
    }

    public final int hashCode() {
        return (this.f44627a.f35700b.hashCode() * 31) + this.f44628b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f44627a.f35700b);
        sb2.append("', newCursorPosition=");
        return ep.a.j(sb2, this.f44628b, ')');
    }

    public a(String str, int i11) {
        this(new j3.h(str), i11);
    }
}
