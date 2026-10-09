package xm;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.KOCharZhuyin;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm.a f56112a;

    public b() {
        if (wm.a.f55177e == null) {
            synchronized (wm.a.class) {
                if (wm.a.f55177e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    wm.a.f55177e = new wm.a(lingoSkillApplication);
                }
            }
        }
        wm.a aVar = wm.a.f55177e;
        m.c(aVar);
        this.f56112a = aVar;
    }

    public static final c a(b bVar, String str, int i11) {
        bVar.getClass();
        int i12 = 0;
        List listW0 = q.W0(str, new String[]{"\t"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        List listK0 = ry.m.k0(ry.m.U0(arrayList, i11), 1);
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 1; i13 < 20; i13++) {
            arrayList2.add(arrayList.get(i13 * i11));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 1; i14 < 20; i14++) {
            for (int i15 = 1; i15 < i11; i15++) {
                int i16 = (i14 * i11) + i15;
                if (i16 < arrayList.size()) {
                    arrayList4.add(arrayList.get(i16));
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList4.size();
        while (i12 < size) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            String str2 = (String) obj2;
            bVar.f56112a.getClass();
            linkedHashMap.put(str2, wm.a.a(str2));
        }
        for (int i17 = 1; i17 < 20; i17++) {
            ArrayList arrayList5 = new ArrayList();
            for (int i18 = 1; i18 < i11; i18++) {
                int i19 = (i17 * i11) + i18;
                if (i19 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i19);
                    arrayList5.add(new KOCharZhuyin(0L, str3, (String) linkedHashMap.get(str3)));
                }
            }
            arrayList3.add(arrayList5);
        }
        return new c(arrayList2, listK0, arrayList3);
    }
}
