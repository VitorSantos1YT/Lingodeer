package en;

import com.lingo.lingoskill.object.KOCharZhuyin;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ms.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KOCharZhuyin f25715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25716b;

    public f(KOCharZhuyin kOCharZhuyin, String headerText) {
        m.f(headerText, "headerText");
        this.f25715a = kOCharZhuyin;
        this.f25716b = headerText;
    }

    @Override // ms.c
    public final String a() {
        String character;
        KOCharZhuyin kOCharZhuyin = this.f25715a;
        return (kOCharZhuyin == null || (character = kOCharZhuyin.getCharacter()) == null) ? this.f25716b : character;
    }

    @Override // ms.c
    public final String b() {
        String zhuyin;
        KOCharZhuyin kOCharZhuyin = this.f25715a;
        return (kOCharZhuyin == null || (zhuyin = kOCharZhuyin.getZhuyin()) == null) ? BuildConfig.VERSION_NAME : zhuyin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return m.a(this.f25715a, fVar.f25715a) && m.a(this.f25716b, fVar.f25716b);
    }

    public final int hashCode() {
        KOCharZhuyin kOCharZhuyin = this.f25715a;
        return this.f25716b.hashCode() + ((kOCharZhuyin == null ? 0 : kOCharZhuyin.hashCode()) * 31);
    }

    @Override // ms.c
    public final boolean isEmpty() {
        return this.f25715a == null && this.f25716b.length() == 0;
    }

    public final String toString() {
        return "KOTableItem(koChar=" + this.f25715a + ", headerText=" + this.f25716b + ")";
    }
}
