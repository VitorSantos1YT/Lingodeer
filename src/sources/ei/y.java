package ei;

import com.lingo.lingoskill.object.ARChar;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements ms.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ARChar f25676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25677b;

    public y(ARChar aRChar, String headerText) {
        kotlin.jvm.internal.m.f(headerText, "headerText");
        this.f25676a = aRChar;
        this.f25677b = headerText;
    }

    @Override // ms.c
    public final String a() {
        String character;
        ARChar aRChar = this.f25676a;
        return (aRChar == null || (character = aRChar.getCharacter()) == null) ? this.f25677b : character;
    }

    @Override // ms.c
    public final String b() {
        String zhuyin;
        ARChar aRChar = this.f25676a;
        return (aRChar == null || (zhuyin = aRChar.getZhuyin()) == null) ? BuildConfig.VERSION_NAME : zhuyin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.f25676a, yVar.f25676a) && kotlin.jvm.internal.m.a(this.f25677b, yVar.f25677b);
    }

    public final int hashCode() {
        ARChar aRChar = this.f25676a;
        return this.f25677b.hashCode() + ((aRChar == null ? 0 : aRChar.hashCode()) * 31);
    }

    @Override // ms.c
    public final boolean isEmpty() {
        return this.f25676a == null && this.f25677b.length() == 0;
    }

    public final String toString() {
        return "ARTableItem(arChar=" + this.f25676a + ", headerText=" + this.f25677b + ")";
    }

    public /* synthetic */ y(ARChar aRChar) {
        this(aRChar, BuildConfig.VERSION_NAME);
    }
}
