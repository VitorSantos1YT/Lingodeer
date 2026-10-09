package c6;

import java.util.ArrayList;
import oz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6630b;

    public i(int i11, int i12) {
        this.f6629a = (i12 & 1) != 0 ? Integer.MAX_VALUE : i11;
        this.f6630b = new ArrayList();
    }

    public final String d() {
        return r.e0(ry.m.y0(this.f6630b, ",\n", null, null, null, 62), "  ");
    }
}
