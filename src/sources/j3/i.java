package j3;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f35705a = new h(BuildConfig.VERSION_NAME);

    public static final List a(h hVar, int i11, int i12, in.c cVar) {
        List list;
        if (i11 == i12 || (list = hVar.f35699a) == null) {
            return null;
        }
        if (i11 != 0 || i12 < hVar.f35700b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                f fVar = (f) list.get(i13);
                if ((cVar != null ? ((Boolean) cVar.invoke(fVar.f35689a)).booleanValue() : true) && b(i11, i12, fVar.f35690b, fVar.f35691c)) {
                    arrayList.add(new f(hz.b.l(fVar.f35690b, i11, i12) - i11, hz.b.l(fVar.f35691c, i11, i12) - i11, (c) fVar.f35689a, fVar.f35692d));
                }
            }
            return arrayList;
        }
        if (cVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Object obj = list.get(i14);
            if (((Boolean) cVar.invoke(((f) obj).f35689a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i11, int i12, int i13, int i14) {
        return ((i11 < i14) & (i13 < i12)) | (((i11 == i12) | (i13 == i14)) & (i11 == i13));
    }
}
