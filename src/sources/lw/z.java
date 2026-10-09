package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f40488e = 0;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocketAddress f40489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f40490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40492d;

    public z(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Preconditions.k(inetSocketAddress, "proxyAddress");
        Preconditions.k(inetSocketAddress2, "targetAddress");
        Preconditions.q("The proxy address %s is not resolved", !inetSocketAddress.isUnresolved(), inetSocketAddress);
        this.f40489a = inetSocketAddress;
        this.f40490b = inetSocketAddress2;
        this.f40491c = str;
        this.f40492d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Objects.a(this.f40489a, zVar.f40489a) && Objects.a(this.f40490b, zVar.f40490b) && Objects.a(this.f40491c, zVar.f40491c) && Objects.a(this.f40492d, zVar.f40492d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40489a, this.f40490b, this.f40491c, this.f40492d});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40489a, "proxyAddr");
        toStringHelperB.c(this.f40490b, "targetAddr");
        toStringHelperB.c(this.f40491c, "username");
        toStringHelperB.d("hasPassword", this.f40492d != null);
        return toStringHelperB.toString();
    }
}
