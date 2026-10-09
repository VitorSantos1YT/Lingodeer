package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[][] f40412c;

    public k0(List list, b bVar, Object[][] objArr) {
        Preconditions.k(list, "addresses are not set");
        this.f40410a = list;
        Preconditions.k(bVar, "attrs");
        this.f40411b = bVar;
        Preconditions.k(objArr, "customOptions");
        this.f40412c = objArr;
    }

    public static ob.m b() {
        ob.m mVar = new ob.m(21, false);
        mVar.f44827c = b.f40342b;
        mVar.f44828d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return mVar;
    }

    public final Object a() {
        int i11 = 0;
        while (true) {
            Object[][] objArr = this.f40412c;
            if (i11 >= objArr.length) {
                return null;
            }
            if (q0.f40429c.equals(objArr[i11][0])) {
                return objArr[i11][1];
            }
            i11++;
        }
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40410a, "addrs");
        toStringHelperB.c(this.f40411b, "attrs");
        toStringHelperB.c(Arrays.deepToString(this.f40412c), "customOptions");
        return toStringHelperB.toString();
    }
}
