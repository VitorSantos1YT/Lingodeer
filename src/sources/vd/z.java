package vd;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4.c f53965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f53966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53967c;

    public z(Class cls, Class cls2, Class cls3, List list, y4.c cVar) {
        this.f53965a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f53966b = list;
        this.f53967c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final b0 a(int i11, int i12, com.bumptech.glide.load.data.f fVar, o2 o2Var, td.j jVar) {
        y4.c cVar = this.f53965a;
        List list = (List) cVar.acquire();
        pe.f.c(list, "Argument must not be null");
        try {
            List list2 = this.f53966b;
            int size = list2.size();
            b0 b0VarA = null;
            for (int i13 = 0; i13 < size; i13++) {
                try {
                    b0VarA = ((m) list2.get(i13)).a(i11, i12, fVar, o2Var, jVar);
                } catch (GlideException e8) {
                    list.add(e8);
                }
                if (b0VarA != null) {
                    break;
                }
            }
            if (b0VarA == null) {
                throw new GlideException(this.f53967c, new ArrayList(list));
            }
            cVar.c(list);
            return b0VarA;
        } catch (Throwable th2) {
            cVar.c(list);
            throw th2;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f53966b.toArray()) + '}';
    }
}
