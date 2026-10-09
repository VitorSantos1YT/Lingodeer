package qh;

import android.R;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import com.lingo.fluent.ui.game.WordChooseGameReviewListActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import hj.v5;
import mt.k4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ji.e {
    public PopupWindow N;

    public m() {
        super(k.f47773a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        int color;
        int color2;
        long j11 = ((o0) s()).j();
        if (j11 == 3) {
            color = Color.parseColor("#a22a26");
        } else if (j11 == 1) {
            color = Color.parseColor("#722C9E");
        } else {
            color = j11 == 2 ? Color.parseColor("#F37052") : 0;
        }
        if (j11 == 3) {
            color2 = Color.parseColor("#ff3939");
        } else if (j11 == 1) {
            color2 = Color.parseColor("#CF3DFE");
        } else {
            color2 = j11 == 2 ? Color.parseColor("#FFEFA1") : 0;
        }
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{color, color2});
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RadioButton radioButton = ((v5) aVar).f33470j;
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        RadioButton radioButton2 = ((v5) aVar2).f33472l;
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        RadioButton radioButton3 = ((v5) aVar3).f33471k;
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        RadioButton radioButton4 = ((v5) aVar4).f33467g;
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        RadioButton radioButton5 = ((v5) aVar5).f33468h;
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        RadioButton[] radioButtonArr = {radioButton, radioButton2, radioButton3, radioButton4, radioButton5, ((v5) aVar6).f33469i};
        for (int i11 = 0; i11 < 6; i11++) {
            RadioButton radioButton6 = radioButtonArr[i11];
            kotlin.jvm.internal.m.c(radioButton6);
            radioButton6.setButtonTintList(colorStateList);
        }
        int iL = ((o0) s()).l();
        if (iL == 0) {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((v5) aVar7).f33472l.setChecked(true);
        } else if (iL == 1) {
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ((v5) aVar8).f33470j.setChecked(true);
        } else if (iL == 2) {
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((v5) aVar9).f33471k.setChecked(true);
        }
        int iK = ((o0) s()).k();
        if (iK == 20) {
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((v5) aVar10).f33467g.setChecked(true);
        } else if (iK == 30) {
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((v5) aVar11).f33468h.setChecked(true);
        } else if (iK == 50) {
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((v5) aVar12).f33469i.setChecked(true);
        }
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        ((v5) aVar13).f33472l.setOnCheckedChangeListener(new g(this, 0));
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        ((v5) aVar14).f33470j.setOnCheckedChangeListener(new g(this, 1));
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        ((v5) aVar15).f33471k.setOnCheckedChangeListener(new g(this, 2));
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        ((v5) aVar16).m.setOnCheckedChangeListener(new cn.a(this, 9));
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        final int i12 = 0;
        bq.z.b(((v5) aVar17).f33462b, new fz.c(this) { // from class: qh.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f47763b;

            {
                this.f47763b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        m mVar = this.f47763b;
                        mVar.startActivity(new Intent(mVar.requireContext(), (Class<?>) WordChooseGameReviewListActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = this.f47763b.f36398d;
                        if (mVar2 != null) {
                            mVar2.finish();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        final int i13 = 1;
        bq.z.b(((v5) aVar18).f33464d, new fz.c(this) { // from class: qh.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f47763b;

            {
                this.f47763b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        m mVar = this.f47763b;
                        mVar.startActivity(new Intent(mVar.requireContext(), (Class<?>) WordChooseGameReviewListActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = this.f47763b.f36398d;
                        if (mVar2 != null) {
                            mVar2.finish();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        if (j11 == 3) {
            ta.a aVar19 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar19);
            ((v5) aVar19).f33473n.setBackgroundResource(com.lingodeer.R.drawable.bg_word_choose_game_index);
            ta.a aVar20 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar20);
            ((v5) aVar20).f33462b.setBackgroundResource(com.lingodeer.R.drawable.bg_game_word_choose_finish_btn);
            ta.a aVar21 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar21);
            ((v5) aVar21).f33466f.setBackgroundResource(com.lingodeer.R.drawable.bg_game_choose_index_elem);
            ta.a aVar22 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar22);
            ((v5) aVar22).f33463c.setBackgroundResource(com.lingodeer.R.drawable.bg_game_choose_index_elem);
            ta.a aVar23 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar23);
            ((v5) aVar23).f33475p.setText(getString(com.lingodeer.R.string.acquisition));
            ta.a aVar24 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar24);
            ((v5) aVar24).f33474o.setText(getString(com.lingodeer.R.string.game_1_short_desc));
        } else if (j11 == 1) {
            ta.a aVar25 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar25);
            ((v5) aVar25).f33473n.setBackgroundResource(com.lingodeer.R.drawable.bg_word_listen_game);
            ta.a aVar26 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar26);
            ((v5) aVar26).f33462b.setBackgroundResource(com.lingodeer.R.drawable.bg_game_word_listen_finish_btn);
            ta.a aVar27 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar27);
            ((v5) aVar27).f33466f.setBackgroundResource(com.lingodeer.R.drawable.bg_game_listen_index_elem);
            ta.a aVar28 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar28);
            ((v5) aVar28).f33463c.setBackgroundResource(com.lingodeer.R.drawable.bg_game_listen_index_elem);
            ta.a aVar29 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar29);
            ((v5) aVar29).f33475p.setText(getString(com.lingodeer.R.string.retention));
            ta.a aVar30 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar30);
            ((v5) aVar30).f33474o.setText(getString(com.lingodeer.R.string.game_2_short_desc));
        } else if (j11 == 2) {
            ta.a aVar31 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar31);
            ((v5) aVar31).f33473n.setBackgroundResource(com.lingodeer.R.drawable.bg_word_spell_game_reverse);
            ta.a aVar32 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar32);
            ((v5) aVar32).f33462b.setBackgroundResource(com.lingodeer.R.drawable.bg_game_word_spell_finish_btn);
            ta.a aVar33 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar33);
            ((v5) aVar33).f33466f.setBackgroundResource(com.lingodeer.R.drawable.bg_game_spell_index_elem);
            ta.a aVar34 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar34);
            ((v5) aVar34).f33463c.setBackgroundResource(com.lingodeer.R.drawable.bg_game_spell_index_elem);
            ta.a aVar35 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar35);
            ((v5) aVar35).f33475p.setText(getString(com.lingodeer.R.string.spelling));
            ta.a aVar36 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar36);
            ((v5) aVar36).f33474o.setText(getString(com.lingodeer.R.string.game_3_short_desc));
        }
        ta.a aVar37 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar37);
        bq.z.b(((v5) aVar37).f33465e, new k4(this, j11, 3));
    }
}
