package yr;

import com.lingodeer.data.model.CourseCharacterGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ns.o;
import nv.p;
import oz.q;
import ry.n;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static List a(List groups) {
        int i11;
        kotlin.jvm.internal.m.f(groups, "groups");
        if (groups.isEmpty()) {
            return r.f50854a;
        }
        ArrayList arrayList = new ArrayList(n.W(groups, 10));
        Iterator it = groups.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            CourseCharacterGroup courseCharacterGroup = (CourseCharacterGroup) it.next();
            List listW0 = q.W0(xt.b.b().isSChinese ? courseCharacterGroup.getGroupList() : courseCharacterGroup.getTGroupList(), new String[]{";"}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listW0) {
                if (!q.K0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(new xr.b(courseCharacterGroup, arrayList2.size()));
        }
        ArrayList arrayListG1 = ry.m.g1(arrayList, 10, 10);
        ArrayList arrayList3 = new ArrayList(n.W(arrayListG1, 10));
        int size = arrayListG1.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayListG1.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                o.V();
                throw null;
            }
            arrayList3.add(new xr.c(p.j(i13, "Group "), (List) obj2));
            i11 = i13;
        }
        return arrayList3;
    }
}
