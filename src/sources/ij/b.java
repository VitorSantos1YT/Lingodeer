package ij;

import com.lingo.lingoskill.object.Lesson;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return qx.b.i(Integer.valueOf(((Lesson) obj).getSortIndex()), Integer.valueOf(((Lesson) obj2).getSortIndex()));
    }
}
