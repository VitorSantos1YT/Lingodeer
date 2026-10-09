package lw;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40479d = new a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40482c;

    public v(SocketAddress socketAddress) {
        b bVar = b.f40342b;
        List listSingletonList = Collections.singletonList(socketAddress);
        Preconditions.e("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f40480a = listUnmodifiableList;
        Preconditions.k(bVar, "attrs");
        this.f40481b = bVar;
        this.f40482c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list = vVar.f40480a;
        List list2 = this.f40480a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list2.size(); i11++) {
            if (!((SocketAddress) list2.get(i11)).equals(list.get(i11))) {
                return false;
            }
        }
        return this.f40481b.equals(vVar.f40481b);
    }

    public final int hashCode() {
        return this.f40482c;
    }

    public final String toString() {
        return "[" + this.f40480a + "/" + this.f40481b + "]";
    }
}
