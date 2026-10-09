package okhttp3.internal.ws;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class WebSocketExtensions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45577a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f45578b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45579c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f45580d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45581e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45582f = false;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f45577a == webSocketExtensions.f45577a && m.a(this.f45578b, webSocketExtensions.f45578b) && this.f45579c == webSocketExtensions.f45579c && m.a(this.f45580d, webSocketExtensions.f45580d) && this.f45581e == webSocketExtensions.f45581e && this.f45582f == webSocketExtensions.f45582f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f45577a) * 31;
        Integer num = this.f45578b;
        int iE = e.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f45579c);
        Integer num2 = this.f45580d;
        return Boolean.hashCode(this.f45582f) + e.e((iE + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f45581e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f45577a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f45578b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f45579c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f45580d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f45581e);
        sb2.append(", unknownValues=");
        return a.l(sb2, this.f45582f, ')');
    }
}
