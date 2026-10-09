package tp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import hj.t3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends bp.m {
    public List O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public final Object V;

    public i0() {
        super(e0.f52455a, BuildConfig.VERSION_NAME);
        this.O = new ArrayList();
        LearnType learnType = LearnType.LEARN;
        this.U = true;
        this.V = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new h0(this, 0));
    }

    public static HwCharacter x(long j11) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
            if (dm.c.f23488f == null) {
                synchronized (dm.c.class) {
                    if (dm.c.f23488f == null) {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication2);
                        dm.c.f23488f = new dm.c(lingoSkillApplication2);
                    }
                }
            }
            dm.c cVar = dm.c.f23488f;
            kotlin.jvm.internal.m.c(cVar);
            return (HwCharacter) cVar.f().load(Long.valueOf(j11));
        }
        if (oi.c.f44924t == null) {
            synchronized (oi.c.class) {
                if (oi.c.f44924t == null) {
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication3);
                    oi.c.f44924t = new oi.c(lingoSkillApplication3);
                }
            }
        }
        oi.c cVar2 = oi.c.f44924t;
        kotlin.jvm.internal.m.c(cVar2);
        return (HwCharacter) cVar2.g().load(Long.valueOf(j11));
    }

    public final void A() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((t3) aVar).f33330d.f();
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((t3) aVar2).f33332f.setBackgroundResource(R.drawable.strokes_order_replay_onclick);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((t3) aVar3).f33332f.setClickable(false);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((t3) aVar4).f33333g.setBackgroundResource(R.drawable.strokes_order_write_noclick);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((t3) aVar5).f33334h.setBackgroundResource(R.drawable.strokes_order_write_style2_noclick);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((t3) aVar6).f33330d.setBgHanziVisibility(true);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((t3) aVar7).f33330d.setShowBijiWhenWriting(false);
    }

    public final void B() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((t3) aVar).f33330d.c();
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((t3) aVar2).f33333g.setBackgroundResource(R.drawable.strokes_order_write_onclick);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((t3) aVar3).f33334h.setBackgroundResource(R.drawable.strokes_order_write_style2_noclick);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((t3) aVar4).f33332f.setBackgroundResource(R.drawable.strokes_order_replay_noclick);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((t3) aVar5).f33330d.setBgHanziVisibility(true);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((t3) aVar6).f33330d.setShowBijiWhenWriting(false);
        this.U = true;
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((t3) aVar7).f33332f.setClickable(true);
    }

    public final void C() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((t3) aVar).f33330d.d();
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((t3) aVar2).f33334h.setBackgroundResource(R.drawable.strokes_order_write_style2_onclick);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((t3) aVar3).f33333g.setBackgroundResource(R.drawable.strokes_order_write_noclick);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((t3) aVar4).f33332f.setBackgroundResource(R.drawable.strokes_order_replay_noclick);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((t3) aVar5).f33330d.setBgHanziVisibility(false);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((t3) aVar6).f33330d.setShowBijiWhenWriting2(false);
        this.U = false;
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((t3) aVar7).f33332f.setClickable(true);
    }

    @Override // androidx.fragment.app.k0, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        View viewFindViewById;
        kotlin.jvm.internal.m.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        View view = this.f36399e;
        if (view == null || (viewFindViewById = view.findViewById(R.id.rl_btm_panel)) == null) {
            return;
        }
        viewFindViewById.setPadding(ff.h.s(R.dimen.main_activity_padding_left_right), 0, ff.h.s(R.dimen.main_activity_padding_left_right), 0);
    }

    @Override // ji.e
    public final void q() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        HwView hwView = ((t3) aVar).f33330d;
        if (hwView != null) {
            hwView.a();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new sr.d(this, null, 2), 3);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b(((t3) aVar).f33328b, new c0(this, 0));
    }

    public final void y() {
        ReviewNew reviewNew = (ReviewNew) this.O.get(this.P);
        Integer elemType = reviewNew.getElemType();
        if (elemType != null && elemType.intValue() == 2) {
            Word word = new Word();
            HwCharacter hwCharacterX = x(reviewNew.getId());
            if (hwCharacterX != null) {
                word.setZhuyin(hwCharacterX.getPinyin());
                word.setTranslations(hwCharacterX.getTranslation());
                word.setWord(hwCharacterX.getCharacter());
            }
            String word2 = word.getWord();
            if (word2 == null || word2.length() == 0) {
                z();
                return;
            }
            word.setWordType(-1);
            new ArrayList().add(word);
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((t3) aVar).f33339n.setText(word.getWord());
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((t3) aVar2).m.setText(word.getTranslations());
        }
    }

    public final void z() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((t3) aVar).f33330d.g();
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((t3) aVar2).f33329c.clearAnimation();
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((t3) aVar3).f33329c.setVisibility(8);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((t3) aVar4).f33331e.setVisibility(8);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((t3) aVar5).f33328b.setVisibility(0);
        int i11 = this.P + 1;
        this.P = i11;
        if (i11 < this.O.size()) {
            y();
            return;
        }
        l.m mVar = this.f36398d;
        if (mVar != null) {
            mVar.finish();
        }
        int i12 = FlashCardFinishActivity.K;
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
        String str = this.R + ";" + this.S + ";" + this.T;
        kotlin.jvm.internal.m.e(str, "toString(...)");
        Intent intent = new Intent(p0VarRequireActivity, (Class<?>) FlashCardFinishActivity.class);
        intent.putExtra(wuoM.ZDqNkTb, str);
        intent.putExtra(INTENTS.EXTRA_BOOLEAN, false);
        startActivity(intent);
    }
}
