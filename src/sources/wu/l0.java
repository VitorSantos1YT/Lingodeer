package wu;

import com.lingodeer.data.model.LawInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LawInfo f55420d;

    public l0(String email, String nickName, String password, LawInfo lawInfo) {
        kotlin.jvm.internal.m.f(email, "email");
        kotlin.jvm.internal.m.f(nickName, "nickName");
        kotlin.jvm.internal.m.f(password, "password");
        this.f55417a = email;
        this.f55418b = nickName;
        this.f55419c = password;
        this.f55420d = lawInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.m.a(this.f55417a, l0Var.f55417a) && kotlin.jvm.internal.m.a(this.f55418b, l0Var.f55418b) && kotlin.jvm.internal.m.a(this.f55419c, l0Var.f55419c) && kotlin.jvm.internal.m.a(this.f55420d, l0Var.f55420d);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.d(this.f55417a.hashCode() * 31, 31, this.f55418b), 31, this.f55419c);
        LawInfo lawInfo = this.f55420d;
        return iD + (lawInfo == null ? 0 : lawInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("EmailSignup(email=", this.f55417a, ", nickName=", this.f55418b, ", password=");
        sbS.append(this.f55419c);
        sbS.append(", lawInfo=");
        sbS.append(this.f55420d);
        sbS.append(")");
        return sbS.toString();
    }
}
