package gp;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingTheme;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MergedBillingThemeBillingPage f29331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NewBillingTheme f29332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29333c;

    public a0(MergedBillingThemeBillingPage config, NewBillingTheme newBillingTheme, String countDownStr) {
        kotlin.jvm.internal.m.f(config, "config");
        kotlin.jvm.internal.m.f(newBillingTheme, "newBillingTheme");
        kotlin.jvm.internal.m.f(countDownStr, "countDownStr");
        this.f29331a = config;
        this.f29332b = newBillingTheme;
        this.f29333c = countDownStr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.f29331a, a0Var.f29331a) && kotlin.jvm.internal.m.a(this.f29332b, a0Var.f29332b) && kotlin.jvm.internal.m.a(this.f29333c, a0Var.f29333c);
    }

    public final int hashCode() {
        return this.f29333c.hashCode() + ((this.f29332b.hashCode() + (this.f29331a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(config=");
        sb2.append(this.f29331a);
        sb2.append(", newBillingTheme=");
        sb2.append(this.f29332b);
        sb2.append(", countDownStr=");
        return ep.a.k(sb2, this.f29333c, ")");
    }
}
