package qh;

import com.lingodeer.R;
import hj.x5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f47768b;

    public /* synthetic */ i0(k0 k0Var, int i11) {
        this.f47767a = i11;
        this.f47768b = k0Var;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f47767a) {
            case 0:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar = this.f47768b.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((x5) aVar).f33594e.setImageResource(R.drawable.ic_game_word_spell_moution_top);
                break;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                k0 k0Var = this.f47768b;
                k0Var.x().f32541f.animate().translationYBy((-k0Var.x().f32541f.getY()) - k0Var.x().f32541f.getHeight()).setDuration(300L).start();
                break;
        }
    }
}
