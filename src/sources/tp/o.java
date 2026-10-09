package tp;

import a.ar.MFeWs;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e1;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends bp.m {
    public ArrayList O;
    public int P;
    public a9.i Q;
    public String R;
    public String S;
    public fv.a T;
    public fv.c U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final qy.q f52482a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final qy.q f52483b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f52484c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final qy.q f52485d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i.c f52486e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final aj.e f52487f0;

    public o() {
        super(m.f52477a, "FlashcardPractice");
        this.O = new ArrayList();
        this.R = BuildConfig.VERSION_NAME;
        this.S = BuildConfig.VERSION_NAME;
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        kotlin.jvm.internal.m.e(lVar.a().getFlashCardFocusUnit(), "getFlashCardFocusUnit(...)");
        this.f52482a0 = com.bumptech.glide.d.v(new l(this, 0));
        this.f52483b0 = com.bumptech.glide.d.v(new l(this, 1));
        LearnType learnType = LearnType.LEARN;
        this.f52485d0 = com.bumptech.glide.d.v(new l(this, 2));
        i.c cVarRegisterForActivityResult = registerForActivityResult(new e1(4), new k(this));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f52486e0 = cVarRegisterForActivityResult;
        this.f52487f0 = new aj.e(this, 21);
    }

    public static TravelPhrase x(ReviewNew reviewNew) {
        if (dj.c.f23436a == null) {
            synchronized (dj.c.class) {
                if (dj.c.f23436a == null) {
                    dj.c.f23436a = new dj.c();
                }
            }
        }
        kotlin.jvm.internal.m.c(dj.c.f23436a);
        return dj.c.a(reviewNew.getId());
    }

    public static String y(ReviewNew reviewNew) {
        if (dj.c.f23436a == null) {
            synchronized (dj.c.class) {
                if (dj.c.f23436a == null) {
                    dj.c.f23436a = new dj.c();
                }
            }
        }
        kotlin.jvm.internal.m.c(dj.c.f23436a);
        TravelPhrase travelPhraseA = dj.c.a(reviewNew.getId());
        if (travelPhraseA == null) {
            return BuildConfig.VERSION_NAME;
        }
        qy.q qVar = fv.b.f28186a;
        String strR = fv.b.R(travelPhraseA.getCID(), travelPhraseA.getID());
        return strR == null ? BuildConfig.VERSION_NAME : strR;
    }

    public static String z(ReviewNew reviewNew) {
        Sentence sentenceE = ij.c.e(reviewNew.getId());
        kotlin.jvm.internal.m.c(sentenceE);
        String translations = sentenceE.getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        return translations;
    }

    public final void A(String relAudioPath, String url) {
        kotlin.jvm.internal.m.f(relAudioPath, "relAudioPath");
        kotlin.jvm.internal.m.f(url, "url");
        this.R = relAudioPath;
        this.S = url;
        qy.q qVar = this.f52483b0;
        String strN = ((Number) qVar.getValue()).intValue() == 3 ? xt.b.a().n() : xt.b.a().h();
        aj.e eVar = this.f52487f0;
        if (eVar != null) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            if (this.U == null) {
                return;
            }
            if (!new File(defpackage.e.m(strN, this.R)).exists()) {
                fv.a aVar2 = ((Number) qVar.getValue()).intValue() == 3 ? new fv.a(7L, url, relAudioPath) : new fv.a(2L, url, relAudioPath);
                this.T = aVar2;
                fv.c cVar = this.U;
                if (cVar != null) {
                    cVar.d(aVar2, eVar);
                    return;
                }
                return;
            }
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((ImageView) ((hj.v) aVar3).f33436k.f32408d).setBackgroundResource(R.drawable.srs_audio_ls);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            android.support.v4.media.session.a.K(((ImageView) ((hj.v) aVar4).f33436k.f32408d).getBackground());
            a9.i iVar = this.Q;
            if (iVar != null) {
                iVar.f520d = new k(this);
            }
            if (iVar != null) {
                iVar.y();
            }
            a9.i iVar2 = this.Q;
            if (iVar2 != null) {
                iVar2.v(strN + this.R);
            }
        }
    }

    public final void B(ArrayList arrayList, FlexboxLayout flexboxLayout) {
        cj.c cVar = new cj.c(arrayList, flexboxLayout, this, requireContext());
        cVar.f59268d = 0;
        cVar.f59269e = 22;
        cVar.f59270f = 0;
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            cVar.f59274j = 2;
        } else {
            cVar.f59274j = ff.h.l(2.0f);
        }
        cVar.f59278o = true;
        cVar.d();
    }

    public final void D() {
        this.T = null;
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.v) aVar).f33430e.clearAnimation();
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.v) aVar2).f33430e.setVisibility(8);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.v) aVar3).f33438n.setVisibility(8);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.v) aVar4).f33429d.setVisibility(0);
        int i11 = this.P + 1;
        this.P = i11;
        if (i11 < this.O.size()) {
            C();
            return;
        }
        l.m mVar = this.f36398d;
        if (mVar != null) {
            mVar.finish();
        }
        int i12 = FlashCardFinishActivity.K;
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
        String str = this.X + ";" + this.Y + ";" + this.Z;
        kotlin.jvm.internal.m.e(str, "toString(...)");
        boolean zBooleanValue = ((Boolean) this.f52482a0.getValue()).booleanValue();
        Intent intent = new Intent(p0VarRequireActivity, (Class<?>) FlashCardFinishActivity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, str);
        intent.putExtra(INTENTS.EXTRA_BOOLEAN, zBooleanValue);
        startActivity(intent);
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
        a9.i iVar = this.Q;
        if (iVar != null) {
            iVar.y();
        }
        a9.i iVar2 = this.Q;
        if (iVar2 != null) {
            iVar2.l();
        }
        fv.c cVar = this.U;
        if (cVar != null) {
            cVar.a(this.V);
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new n(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0676  */
    public final void C() {
        TravelPhrase travelPhraseX;
        String translation;
        String strQ;
        String translation2;
        String translation3;
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((FrameLayout) ((hj.v) aVar).f33436k.f32407c).setVisibility(8);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.v) aVar2).f33434i.setVisibility(0);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.v) aVar3).f33431f.setVisibility(8);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.v) aVar4).f33432g.setVisibility(8);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.v) aVar5).f33439o.setVisibility(8);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.v) aVar6).f33440p.setVisibility(8);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.v) aVar7).f33445u.setVisibility(8);
        ReviewNew reviewNew = (ReviewNew) this.O.get(this.P);
        ArrayList arrayList = new ArrayList();
        Integer elemType = reviewNew.getElemType();
        if (elemType != null && elemType.intValue() == 0) {
            Word wordH = ij.c.h(reviewNew.getId());
            if (wordH == null) {
                D();
                return;
            }
            arrayList.add(wordH);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i11 = cf.x.n().flashCardDisplayIn;
            if (i11 == 0) {
                ta.a aVar8 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                B(arrayList, ((hj.v) aVar8).f33434i);
                ta.a aVar9 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((hj.v) aVar9).f33431f.setVisibility(0);
                ta.a aVar10 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((hj.v) aVar10).f33431f.setText(wordH.getTranslations());
                ta.a aVar11 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                ((hj.v) aVar11).f33428c.setVisibility(8);
            } else if (i11 != 1) {
                ta.a aVar12 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                ((hj.v) aVar12).f33434i.setVisibility(8);
                ta.a aVar13 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                ((FrameLayout) ((hj.v) aVar13).f33436k.f32407c).setVisibility(0);
                ta.a aVar14 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                B(arrayList, ((hj.v) aVar14).f33433h);
                ta.a aVar15 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar15);
                ((hj.v) aVar15).f33431f.setText(wordH.getTranslations());
                ta.a aVar16 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar16);
                ((hj.v) aVar16).f33431f.setVisibility(0);
                ta.a aVar17 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar17);
                ((hj.v) aVar17).f33428c.setVisibility(0);
            } else {
                ta.a aVar18 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar18);
                ((hj.v) aVar18).f33432g.setVisibility(0);
                ta.a aVar19 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar19);
                ((hj.v) aVar19).f33432g.setText(wordH.getTranslations());
                ta.a aVar20 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar20);
                ((hj.v) aVar20).f33434i.setVisibility(8);
                ta.a aVar21 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar21);
                ((hj.v) aVar21).f33431f.setVisibility(8);
                ta.a aVar22 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar22);
                ((hj.v) aVar22).f33428c.setVisibility(0);
                ta.a aVar23 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar23);
                B(arrayList, ((hj.v) aVar23).f33433h);
            }
            qy.q qVar = fv.b.f28186a;
            this.R = fv.b.V(reviewNew.getId());
            this.S = fv.b.Z(reviewNew.getId());
            if (r().flashCardIsPlayModel == 1) {
                A(fv.b.V(reviewNew.getId()), fv.b.Z(reviewNew.getId()));
                return;
            }
            return;
        }
        if (elemType != null && elemType.intValue() == 1) {
            try {
                Sentence sentenceE = ij.c.e(reviewNew.getId());
                kotlin.jvm.internal.m.c(sentenceE);
                List<Word> sentWords = sentenceE.getSentWords();
                kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
                arrayList.addAll(sentWords);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i12 = cf.x.n().flashCardDisplayIn;
                if (i12 == 0) {
                    ta.a aVar24 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar24);
                    B(arrayList, ((hj.v) aVar24).f33434i);
                    ta.a aVar25 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar25);
                    ((hj.v) aVar25).f33431f.setVisibility(0);
                    ta.a aVar26 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar26);
                    ((hj.v) aVar26).f33431f.setText(z(reviewNew));
                    ta.a aVar27 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar27);
                    ((hj.v) aVar27).f33428c.setVisibility(8);
                } else if (i12 != 1) {
                    ta.a aVar28 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar28);
                    ((hj.v) aVar28).f33434i.setVisibility(8);
                    ta.a aVar29 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar29);
                    ((FrameLayout) ((hj.v) aVar29).f33436k.f32407c).setVisibility(0);
                    ta.a aVar30 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar30);
                    B(arrayList, ((hj.v) aVar30).f33433h);
                    ta.a aVar31 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar31);
                    ((hj.v) aVar31).f33431f.setText(z(reviewNew));
                    ta.a aVar32 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar32);
                    ((hj.v) aVar32).f33431f.setVisibility(0);
                    ta.a aVar33 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar33);
                    ((hj.v) aVar33).f33428c.setVisibility(0);
                } else {
                    ta.a aVar34 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar34);
                    ((hj.v) aVar34).f33432g.setVisibility(0);
                    ta.a aVar35 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar35);
                    ((hj.v) aVar35).f33432g.setText(z(reviewNew));
                    ta.a aVar36 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar36);
                    ((hj.v) aVar36).f33434i.setVisibility(8);
                    ta.a aVar37 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar37);
                    ((hj.v) aVar37).f33431f.setVisibility(8);
                    ta.a aVar38 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar38);
                    ((hj.v) aVar38).f33428c.setVisibility(0);
                    ta.a aVar39 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar39);
                    B(arrayList, ((hj.v) aVar39).f33433h);
                }
                qy.q qVar2 = fv.b.f28186a;
                this.R = fv.b.F(reviewNew.getId());
                this.S = fv.b.H(reviewNew.getId());
                if (r().flashCardIsPlayModel == 1) {
                    A(fv.b.F(reviewNew.getId()), fv.b.H(reviewNew.getId()));
                    return;
                }
                return;
            } catch (Exception unused) {
                D();
                return;
            }
        }
        if (elemType != null && elemType.intValue() == 2) {
            if (oi.c.f44924t == null) {
                synchronized (oi.c.class) {
                    if (oi.c.f44924t == null) {
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication3);
                        oi.c.f44924t = new oi.c(lingoSkillApplication3);
                    }
                }
            }
            oi.c cVar = oi.c.f44924t;
            kotlin.jvm.internal.m.c(cVar);
            HwCharacter hwCharacter = (HwCharacter) cVar.g().load(Long.valueOf(reviewNew.getId()));
            if (hwCharacter == null) {
                D();
                return;
            }
            Word word = new Word();
            word.setZhuyin(hwCharacter.getPinyin());
            word.setTranslations(hwCharacter.getTranslation());
            word.setWord(hwCharacter.getShowCharacter());
            word.setWordType(-1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(word);
            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
            int i13 = cf.x.n().flashCardDisplayIn;
            if (i13 == 0) {
                ta.a aVar40 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar40);
                B(arrayList2, ((hj.v) aVar40).f33434i);
                ta.a aVar41 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar41);
                ((hj.v) aVar41).f33431f.setVisibility(0);
                ta.a aVar42 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar42);
                ((hj.v) aVar42).f33431f.setText(hwCharacter.getTranslation());
                ta.a aVar43 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar43);
                ((hj.v) aVar43).f33428c.setVisibility(8);
            } else if (i13 != 1) {
                ta.a aVar44 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar44);
                ((hj.v) aVar44).f33434i.setVisibility(8);
                ta.a aVar45 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar45);
                ((FrameLayout) ((hj.v) aVar45).f33436k.f32407c).setVisibility(0);
                ta.a aVar46 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar46);
                B(arrayList2, ((hj.v) aVar46).f33433h);
                ta.a aVar47 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar47);
                ((hj.v) aVar47).f33431f.setText(hwCharacter.getTranslation());
                ta.a aVar48 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar48);
                ((hj.v) aVar48).f33431f.setVisibility(0);
                ta.a aVar49 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar49);
                ((hj.v) aVar49).f33428c.setVisibility(0);
            } else {
                ta.a aVar50 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar50);
                ((hj.v) aVar50).f33432g.setVisibility(0);
                ta.a aVar51 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar51);
                ((hj.v) aVar51).f33432g.setText(word.getTranslations());
                ta.a aVar52 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar52);
                ((hj.v) aVar52).f33434i.setVisibility(8);
                ta.a aVar53 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar53);
                ((hj.v) aVar53).f33431f.setVisibility(8);
                ta.a aVar54 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar54);
                ((hj.v) aVar54).f33428c.setVisibility(0);
                ta.a aVar55 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar55);
                B(arrayList2, ((hj.v) aVar55).f33433h);
            }
            qy.q qVar3 = fv.f.f28191a;
            String pinyin = hwCharacter.getPinyin();
            kotlin.jvm.internal.m.e(pinyin, "getPinyin(...)");
            this.R = fv.f.b(pinyin);
            String pinyin2 = hwCharacter.getPinyin();
            kotlin.jvm.internal.m.e(pinyin2, "getPinyin(...)");
            this.S = fv.f.i(pinyin2);
            if (r().flashCardIsPlayModel == 1) {
                String pinyin3 = hwCharacter.getPinyin();
                kotlin.jvm.internal.m.e(pinyin3, MFeWs.vEqvZifjbaXhMc);
                String strB = fv.f.b(pinyin3);
                String pinyin4 = hwCharacter.getPinyin();
                kotlin.jvm.internal.m.e(pinyin4, "getPinyin(...)");
                A(strB, fv.f.i(pinyin4));
                return;
            }
            return;
        }
        if (elemType == null || elemType.intValue() != 3 || (travelPhraseX = x(reviewNew)) == null) {
            return;
        }
        arrayList.addAll(travelPhraseX.getSentenceWords());
        LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
        int i14 = cf.x.n().flashCardDisplayIn;
        if (i14 == 0) {
            ta.a aVar56 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar56);
            B(arrayList, ((hj.v) aVar56).f33434i);
            ta.a aVar57 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar57);
            ((hj.v) aVar57).f33431f.setVisibility(0);
            ta.a aVar58 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar58);
            TextView textView = ((hj.v) aVar58).f33431f;
            TravelPhrase travelPhraseX2 = x(reviewNew);
            if (travelPhraseX2 == null || (translation = travelPhraseX2.getTranslation()) == null) {
                translation = BuildConfig.VERSION_NAME;
            }
            textView.setText(translation);
            ta.a aVar59 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar59);
            ((hj.v) aVar59).f33428c.setVisibility(8);
            if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                ta.a aVar60 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar60);
                TextView textView2 = ((hj.v) aVar60).f33440p;
                String phraseLuoma = travelPhraseX.getPhraseLuoma();
                kotlin.jvm.internal.m.e(phraseLuoma, "getPhraseLuoma(...)");
                textView2.setText(oz.x.q0(phraseLuoma, "/", " "));
                ta.a aVar61 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar61);
                ((hj.v) aVar61).f33440p.setVisibility(0);
            }
        } else if (i14 != 1) {
            ta.a aVar62 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar62);
            ((hj.v) aVar62).f33434i.setVisibility(8);
            ta.a aVar63 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar63);
            ((FrameLayout) ((hj.v) aVar63).f33436k.f32407c).setVisibility(0);
            ta.a aVar64 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar64);
            B(arrayList, ((hj.v) aVar64).f33433h);
            ta.a aVar65 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar65);
            TextView textView3 = ((hj.v) aVar65).f33431f;
            TravelPhrase travelPhraseX3 = x(reviewNew);
            if (travelPhraseX3 == null || (translation3 = travelPhraseX3.getTranslation()) == null) {
                translation3 = BuildConfig.VERSION_NAME;
            }
            textView3.setText(translation3);
            ta.a aVar66 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar66);
            ((hj.v) aVar66).f33431f.setVisibility(0);
            ta.a aVar67 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar67);
            ((hj.v) aVar67).f33428c.setVisibility(0);
            if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                ta.a aVar68 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar68);
                TextView textView4 = ((hj.v) aVar68).f33439o;
                String phraseLuoma2 = travelPhraseX.getPhraseLuoma();
                kotlin.jvm.internal.m.e(phraseLuoma2, "getPhraseLuoma(...)");
                textView4.setText(oz.x.q0(phraseLuoma2, "/", " "));
                ta.a aVar69 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar69);
                ((hj.v) aVar69).f33439o.setVisibility(0);
            }
        } else {
            ta.a aVar70 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar70);
            ((hj.v) aVar70).f33432g.setVisibility(0);
            ta.a aVar71 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar71);
            TextView textView5 = ((hj.v) aVar71).f33432g;
            TravelPhrase travelPhraseX4 = x(reviewNew);
            if (travelPhraseX4 == null || (translation2 = travelPhraseX4.getTranslation()) == null) {
                translation2 = BuildConfig.VERSION_NAME;
            }
            textView5.setText(translation2);
            ta.a aVar72 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar72);
            ((hj.v) aVar72).f33434i.setVisibility(8);
            ta.a aVar73 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar73);
            ((hj.v) aVar73).f33431f.setVisibility(8);
            ta.a aVar74 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar74);
            ((hj.v) aVar74).f33428c.setVisibility(0);
            ta.a aVar75 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar75);
            B(arrayList, ((hj.v) aVar75).f33433h);
            if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                ta.a aVar76 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar76);
                TextView textView6 = ((hj.v) aVar76).f33439o;
                String phraseLuoma3 = travelPhraseX.getPhraseLuoma();
                kotlin.jvm.internal.m.e(phraseLuoma3, "getPhraseLuoma(...)");
                textView6.setText(oz.x.q0(phraseLuoma3, "/", " "));
                ta.a aVar77 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar77);
                ((hj.v) aVar77).f33439o.setVisibility(0);
            }
        }
        if (dj.c.f23436a == null) {
            synchronized (dj.c.class) {
                if (dj.c.f23436a == null) {
                    dj.c.f23436a = new dj.c();
                }
            }
        }
        kotlin.jvm.internal.m.c(dj.c.f23436a);
        TravelPhrase travelPhraseA = dj.c.a(reviewNew.getId());
        if (travelPhraseA != null) {
            qy.q qVar4 = fv.b.f28186a;
            strQ = fv.b.Q(travelPhraseA.getCID(), travelPhraseA.getID());
            if (strQ == null) {
                strQ = BuildConfig.VERSION_NAME;
            }
        } else {
            strQ = BuildConfig.VERSION_NAME;
        }
        this.R = strQ;
        this.S = y(reviewNew);
        if (r().flashCardIsPlayModel == 1) {
            A(this.R, y(reviewNew));
        }
    }
}
