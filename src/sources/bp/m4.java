package bp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.lingo.lingoskill.ui.base.OffLineActivity;
import com.lingo.lingoskill.ui.base.OfflineManagerActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m4 extends ji.e {
    public m4() {
        super(l4.f4695a, "OfflineLearning");
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.offline_learning);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        androidx.fragment.app.p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        ((hj.f4) aVar).f32569c.setOnClickListener(new View.OnClickListener(this) { // from class: bp.k4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m4 f4673b;

            {
                this.f4673b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                m4 m4Var = this.f4673b;
                switch (i12) {
                    case 0:
                        int i13 = OffLineActivity.R;
                        Context contextRequireContext = m4Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext, (Class<?>) OffLineActivity.class);
                        intent.putExtra(INTENTS.EXTRA_LONG, -1L);
                        intent.putExtra(INTENTS.EXTRA_STRING, "f");
                        m4Var.startActivity(new Intent(intent));
                        break;
                    default:
                        m4Var.startActivity(new Intent(m4Var.requireContext(), (Class<?>) OfflineManagerActivity.class));
                        break;
                }
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        ((hj.f4) aVar2).f32568b.setOnClickListener(new View.OnClickListener(this) { // from class: bp.k4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m4 f4673b;

            {
                this.f4673b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                m4 m4Var = this.f4673b;
                switch (i13) {
                    case 0:
                        int i14 = OffLineActivity.R;
                        Context contextRequireContext = m4Var.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext, (Class<?>) OffLineActivity.class);
                        intent.putExtra(INTENTS.EXTRA_LONG, -1L);
                        intent.putExtra(INTENTS.EXTRA_STRING, "f");
                        m4Var.startActivity(new Intent(intent));
                        break;
                    default:
                        m4Var.startActivity(new Intent(m4Var.requireContext(), (Class<?>) OfflineManagerActivity.class));
                        break;
                }
            }
        });
    }
}
