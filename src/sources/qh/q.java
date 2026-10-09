package qh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingo.fluent.ui.game.WordGameActivity;
import com.lingo.fluent.ui.game.adapter.WordReviewListAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import hj.a4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends ji.e {
    public th.e N;
    public final ArrayList O;
    public WordReviewListAdapter P;
    public final fv.c Q;
    public int R;
    public int S;

    public q() {
        super(p.f47780a, BuildConfig.VERSION_NAME);
        this.O = new ArrayList();
        this.Q = new fv.c();
        this.R = -1;
    }

    @Override // ji.e
    public final void q() {
        th.e eVar = this.N;
        if (eVar == null) {
            kotlin.jvm.internal.m.n("player");
            throw null;
        }
        eVar.b();
        this.Q.a(this.R);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        long j11 = ((o0) s()).j();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        th.e eVar = new th.e(contextRequireContext);
        this.N = eVar;
        this.P = new WordReviewListAdapter(this.O, eVar, ((o0) s()).j());
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RecyclerView recyclerView = ((a4) aVar).f32346e;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        RecyclerView recyclerView2 = ((a4) aVar2).f32346e;
        WordReviewListAdapter wordReviewListAdapter = this.P;
        vy.d dVar = null;
        if (wordReviewListAdapter == null) {
            kotlin.jvm.internal.m.n("adapter");
            throw null;
        }
        recyclerView2.setAdapter(wordReviewListAdapter);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((a4) aVar3).f32346e.setVisibility(8);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((a4) aVar4).f32343b.setVisibility(8);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((a4) aVar5).f32345d.setVisibility(0);
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new mv.f0(this, dVar, 7), 3);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i11 = 0;
        bq.z.b(((a4) aVar6).f32343b, new fz.c(this) { // from class: qh.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f47779b;

            {
                this.f47779b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        q qVar = this.f47779b;
                        if (qVar.O.size() < 3) {
                            Toast.makeText(qVar.requireContext(), qVar.getString(R.string.words_not_enough_play_game), 0).show();
                        } else {
                            qVar.startActivity(new Intent(qVar.requireContext(), (Class<?>) WordGameActivity.class));
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar = this.f47779b.f36398d;
                        if (mVar != null) {
                            mVar.finish();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        if (j11 == 3) {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((a4) aVar7).f32347f.setBackgroundResource(R.drawable.bg_word_choose_game_index);
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((a4) aVar8).f32343b.setBackgroundResource(R.drawable.bg_game_word_choose_finish_btn);
        } else if (j11 == 1) {
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((a4) aVar9).f32347f.setBackgroundResource(R.drawable.bg_word_listen_game);
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((a4) aVar10).f32343b.setBackgroundResource(R.drawable.bg_game_word_listen_finish_btn);
        } else if (j11 == 2) {
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((a4) aVar11).f32347f.setBackgroundResource(R.drawable.bg_word_spell_game);
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((a4) aVar12).f32343b.setBackgroundResource(R.drawable.bg_game_word_spell_finish_btn);
        }
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        final int i12 = 1;
        bq.z.b(((a4) aVar13).f32344c, new fz.c(this) { // from class: qh.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f47779b;

            {
                this.f47779b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        q qVar = this.f47779b;
                        if (qVar.O.size() < 3) {
                            Toast.makeText(qVar.requireContext(), qVar.getString(R.string.words_not_enough_play_game), 0).show();
                        } else {
                            qVar.startActivity(new Intent(qVar.requireContext(), (Class<?>) WordGameActivity.class));
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar = this.f47779b.f36398d;
                        if (mVar != null) {
                            mVar.finish();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }

    public final void x() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((a4) aVar).f32346e.setVisibility(0);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((a4) aVar2).f32343b.setVisibility(0);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((a4) aVar3).f32345d.setVisibility(8);
    }
}
