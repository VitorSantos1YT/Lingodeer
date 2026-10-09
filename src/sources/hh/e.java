package hh;

import com.lingo.lingoskill.object.PdLessonFav;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32222a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f32222a) {
            case 0:
                return qx.b.i(((PdLessonFav) obj2).getTime(), ((PdLessonFav) obj).getTime());
            case 1:
                return qx.b.i((String) obj, (String) obj2);
            default:
                return qx.b.i((String) obj, (String) obj2);
        }
    }
}
