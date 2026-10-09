package oo;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.ui.SpeakPreviewActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f45678b;

    public /* synthetic */ g0(k0 k0Var, int i11) {
        this.f45677a = i11;
        this.f45678b = k0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f45677a;
        qy.b0 b0Var = qy.b0.f48488a;
        k0 k0Var = this.f45678b;
        switch (i11) {
            case 0:
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                k0Var.t().c("jxz_main_story_speak_preview", new f0(k0Var, 1));
                int i12 = SpeakPreviewActivity.R;
                l.m mVar = k0Var.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                int i13 = k0Var.U;
                long j11 = k0Var.V;
                Intent intent = new Intent(mVar, (Class<?>) SpeakPreviewActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, i13);
                intent.putExtra(INTENTS.EXTRA_LONG, j11);
                k0Var.startActivity(intent);
                l.m mVar2 = k0Var.f36398d;
                kotlin.jvm.internal.m.c(mVar2);
                mVar2.finish();
                break;
            case 1:
                lc.d it2 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                l.m mVar3 = k0Var.f36398d;
                if (mVar3 != null) {
                    mVar3.finish();
                }
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(k0Var), null, null, new mv.f0(k0Var, null, 5), 3);
                break;
            default:
                lc.d it3 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                SpeakTryAdapter speakTryAdapter = k0Var.R;
                if (speakTryAdapter != null) {
                    speakTryAdapter.notifyDataSetChanged();
                }
                break;
        }
        return b0Var;
    }
}
