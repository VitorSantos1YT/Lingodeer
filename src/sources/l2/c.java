package l2;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f39559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f39560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f39561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f39562j;

    public c(String str, float f5, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i11) {
        str = (i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str;
        f5 = (i11 & 2) != 0 ? 0.0f : f5;
        f11 = (i11 & 4) != 0 ? 0.0f : f11;
        f12 = (i11 & 8) != 0 ? 0.0f : f12;
        f13 = (i11 & 16) != 0 ? 1.0f : f13;
        f14 = (i11 & 32) != 0 ? 1.0f : f14;
        f15 = (i11 & 64) != 0 ? 0.0f : f15;
        f16 = (i11 & 128) != 0 ? 0.0f : f16;
        if ((i11 & 256) != 0) {
            int i12 = h0.f39633a;
            list = ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        this.f39553a = str;
        this.f39554b = f5;
        this.f39555c = f11;
        this.f39556d = f12;
        this.f39557e = f13;
        this.f39558f = f14;
        this.f39559g = f15;
        this.f39560h = f16;
        this.f39561i = list;
        this.f39562j = arrayList;
    }
}
