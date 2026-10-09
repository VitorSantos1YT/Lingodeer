package eq;

import kotlin.jvm.internal.m;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25736d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25739c;

    public final void a(String positionStr) {
        int i11;
        int i12;
        m.f(positionStr, "positionStr");
        if (x.k0(positionStr, ";", false)) {
            positionStr = positionStr.substring(0, positionStr.length() - 1);
            m.e(positionStr, "substring(...)");
        }
        String[] strArr = (String[]) q.W0(positionStr, new String[]{":"}, 0, 6).toArray(new String[0]);
        try {
            i11 = Integer.parseInt(strArr[0]);
        } catch (Exception unused) {
            i11 = 1;
        }
        this.f25737a = i11;
        try {
            i12 = Integer.parseInt(strArr[1]);
        } catch (Exception unused2) {
            i12 = 1;
        }
        this.f25738b = i12;
        try {
            this.f25739c = Integer.parseInt(strArr[2]);
        } catch (Exception unused3) {
            this.f25737a = 1;
        }
    }

    public final String toString() {
        String str = this.f25737a + ":" + this.f25738b + ":" + this.f25739c;
        m.e(str, "toString(...)");
        return str;
    }
}
