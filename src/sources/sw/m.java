package sw;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f51872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51873b;

    public m(lw.v vVar) {
        Preconditions.k(vVar, "eag");
        List list = vVar.f40480a;
        this.f51872a = new String[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            this.f51872a[i11] = ((SocketAddress) it.next()).toString();
            i11++;
        }
        Arrays.sort(this.f51872a);
        this.f51873b = Arrays.hashCode(this.f51872a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (mVar.f51873b == this.f51873b) {
            String[] strArr = mVar.f51872a;
            int length = strArr.length;
            String[] strArr2 = this.f51872a;
            if (length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51873b;
    }

    public final String toString() {
        return Arrays.toString(this.f51872a);
    }
}
