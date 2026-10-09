package bp;

import androidx.lifecycle.LifecycleOwnerKt;
import com.lingodeer.data.model.LearnType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends ji.e {
    public long N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fz.f inflate, String str) {
        super(inflate, str);
        kotlin.jvm.internal.m.f(inflate, "inflate");
        LearnType learnType = LearnType.LEARN;
    }

    @Override // androidx.fragment.app.k0
    public void onPause() {
        super.onPause();
        if (this.N > 0) {
            vy.d dVar = null;
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b0.a1(this, dVar, 2), 3);
            if (r().hasFindPerfectTime.booleanValue()) {
                return;
            }
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new av.p(this, dVar, 3), 3);
        }
    }

    @Override // ji.e, androidx.fragment.app.k0
    public void onResume() {
        super.onResume();
        this.N = System.currentTimeMillis();
    }
}
