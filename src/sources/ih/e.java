package ih;

import androidx.recyclerview.widget.u;
import com.lingo.lingoskill.object.PdLessonFav;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f34415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f34416c;

    public e(ArrayList oldItems, List list) {
        m.f(oldItems, "oldItems");
        this.f34415b = oldItems;
        this.f34416c = list;
    }

    @Override // androidx.recyclerview.widget.u
    public final boolean areContentsTheSame(int i11, int i12) {
        return m.a(this.f34415b.get(i11), this.f34416c.get(i12));
    }

    @Override // androidx.recyclerview.widget.u
    public final boolean areItemsTheSame(int i11, int i12) {
        return m.a(((PdLessonFav) this.f34415b.get(i11)).getId(), ((PdLessonFav) this.f34416c.get(i12)).getId());
    }

    @Override // androidx.recyclerview.widget.u
    public final int getNewListSize() {
        return this.f34416c.size();
    }

    @Override // androidx.recyclerview.widget.u
    public final int getOldListSize() {
        return this.f34415b.size();
    }
}
