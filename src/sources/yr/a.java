package yr;

import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ns.o;
import ry.n;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static ArrayList a(List allCharacters, List allGroups) {
        kotlin.jvm.internal.m.f(allCharacters, "allCharacters");
        kotlin.jvm.internal.m.f(allGroups, "allGroups");
        ArrayList arrayList = new ArrayList();
        for (Object obj : allCharacters) {
            int version = ((CharacterStroke) obj).getVersion();
            if (1 <= version && version < 10) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            Integer numValueOf = Integer.valueOf(((CharacterStroke) obj2).getVersion());
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        lz.g gVar = new lz.g(1, 9, 1);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = gVar.iterator();
        while (((lz.f) it).f40537c) {
            int iNextInt = ((w) it).nextInt();
            List list = (List) linkedHashMap.get(Integer.valueOf(iNextInt));
            xr.a aVar = null;
            if (list != null) {
                ArrayList arrayList4 = new ArrayList(n.W(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((CharacterStroke) it2.next()).getCharacter());
                }
                if (!arrayList4.isEmpty()) {
                    ArrayList arrayListG1 = ry.m.g1(arrayList4, 10, 10);
                    ArrayList arrayList5 = new ArrayList(n.W(arrayListG1, 10));
                    int size2 = arrayListG1.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj3 = arrayListG1.get(i13);
                        i13++;
                        int i14 = i12 + 1;
                        if (i12 < 0) {
                            o.V();
                            throw null;
                        }
                        List list2 = (List) obj3;
                        arrayList5.add(new CourseCharacterGroup((iNextInt * 10000) + i14, i14, ry.m.y0(list2, ";", null, null, null, 62), String.valueOf(i14), ry.m.y0(list2, ";", null, null, null, 62), String.valueOf(i14)));
                        i12 = i14;
                    }
                    aVar = new xr.a(iNextInt, arrayList5);
                }
            }
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        return arrayList3;
    }
}
