package e6;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24942a;

    public i1(int i11) {
        switch (i11) {
            case 1:
                this.f24942a = new LinkedHashMap();
                break;
            case 2:
                this.f24942a = new LinkedHashMap();
                break;
            default:
                this.f24942a = new LinkedHashMap();
                break;
        }
    }

    public static String c(int i11, int i12, String str) {
        return i11 + '-' + i12 + '-' + str;
    }

    public void a(x7.i iVar) {
        long[] jArr = iVar.f55896e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f24942a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(iVar.f55896e[0]), iVar);
        }
    }

    public void b(aa.a migration) {
        kotlin.jvm.internal.m.f(migration, "migration");
        int i11 = migration.f522a;
        int i12 = migration.f523b;
        Integer numValueOf = Integer.valueOf(i11);
        LinkedHashMap linkedHashMap = this.f24942a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i12))) {
            Objects.toString(treeMap2.get(Integer.valueOf(i12)));
            migration.toString();
        }
        treeMap2.put(Integer.valueOf(i12), migration);
    }
}
