package cf;

import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f6902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Currency f6903c;

    public a(String eventName, double d5, Currency currency) {
        kotlin.jvm.internal.m.f(eventName, "eventName");
        this.f6901a = eventName;
        this.f6902b = d5;
        this.f6903c = currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f6901a, aVar.f6901a) && Double.compare(this.f6902b, aVar.f6902b) == 0 && kotlin.jvm.internal.m.a(this.f6903c, aVar.f6903c);
    }

    public final int hashCode() {
        return this.f6903c.hashCode() + ((Double.hashCode(this.f6902b) + (this.f6901a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.f6901a + ", amount=" + this.f6902b + ", currency=" + this.f6903c + ')';
    }
}
