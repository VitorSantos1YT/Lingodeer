package xt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static g a(String str) {
        kotlin.jvm.internal.m.f(str, "str");
        g gVar = new g();
        gVar.f56294a = new HashMap();
        try {
            List listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW0) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                List listW1 = oz.q.W0((String) obj2, new String[]{":"}, 0, 6);
                gVar.f56294a.put(Long.valueOf(Long.parseLong((String) listW1.get(0))), Integer.valueOf(Integer.parseInt((String) listW1.get(1))));
            }
            return gVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            gVar.f56294a.clear();
            return gVar;
        }
    }
}
