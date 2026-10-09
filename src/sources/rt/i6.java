package rt;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f49875a = ns.o.L(x8.CHARACTER, x8.WORD, x8.SENTENCE);

    public static final String a(x8 x8Var) {
        int i11 = h6.f49832a[x8Var.ordinal()];
        if (i11 == 1) {
            return "course_c";
        }
        if (i11 == 2) {
            return "course_w";
        }
        if (i11 == 3) {
            return "course_s";
        }
        if (i11 == 4) {
            return "extent_w";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final c6 b(Set candidateItemIds, List bookmarks, String languageCode, String str, Set set) {
        kotlin.jvm.internal.m.f(candidateItemIds, "candidateItemIds");
        kotlin.jvm.internal.m.f(bookmarks, "bookmarks");
        kotlin.jvm.internal.m.f(languageCode, "languageCode");
        Map mapI0 = ry.x.i0(nz.n.X(nz.n.R(ry.m.g0(bookmarks), new pr.a0(str, languageCode, set, 15)), new q(2, candidateItemIds)));
        return new c6(mapI0, mapI0.keySet());
    }

    public static final c6 c(c6 c6Var, Set itemIds) {
        kotlin.jvm.internal.m.f(c6Var, "<this>");
        kotlin.jvm.internal.m.f(itemIds, "itemIds");
        Set setV0 = ry.m.v0(c6Var.f49566a, itemIds);
        Map map = c6Var.f49567b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (setV0.contains(Long.valueOf(((Number) entry.getKey()).longValue()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new c6(linkedHashMap, setV0);
    }
}
