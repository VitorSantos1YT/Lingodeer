package tu;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f52568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f52569d;

    public g(String str, String nickName, k kVar, ArrayList arrayList) {
        kotlin.jvm.internal.m.f(nickName, "nickName");
        this.f52566a = str;
        this.f52567b = nickName;
        this.f52568c = kVar;
        this.f52569d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f52566a.equals(gVar.f52566a) && kotlin.jvm.internal.m.a(this.f52567b, gVar.f52567b) && kotlin.jvm.internal.m.a(this.f52568c, gVar.f52568c) && this.f52569d.equals(gVar.f52569d);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(this.f52566a.hashCode() * 31, 31, this.f52567b);
        k kVar = this.f52568c;
        return this.f52569d.hashCode() + ((iD + (kVar == null ? 0 : kVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("Success(avatarUrl=", this.f52566a, ", nickName=", this.f52567b, ", selectedItem=");
        sbS.append(this.f52568c);
        sbS.append(", emojiStatusItems=");
        sbS.append(this.f52569d);
        sbS.append(")");
        return sbS.toString();
    }
}
