package qa;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f47605b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47604a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f47606c = new ArrayList();

    public d0(View view) {
        this.f47605b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f47605b == d0Var.f47605b && this.f47604a.equals(d0Var.f47604a);
    }

    public final int hashCode() {
        return this.f47604a.hashCode() + (this.f47605b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = defpackage.e.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbR.append(this.f47605b);
        sbR.append("\n");
        String strM = defpackage.e.m(sbR.toString(), "    values:");
        HashMap map = this.f47604a;
        for (String str : map.keySet()) {
            strM = strM + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM;
    }
}
