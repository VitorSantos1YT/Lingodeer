package gr;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import av.f0;
import bp.g1;
import com.google.api.Service;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.fluent.ui.base.PdLearnActivity;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.fluent.ui.compose.PdFeedDifficultyActivity;
import com.lingo.fluent.ui.compose.PdFeedStarredActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllable.adapter.YinTuAdapter;
import com.lingo.lingoskill.japanskill.ui.syllablenew.JPSyllableIndexActivity;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteGroupActivity;
import com.lingo.lingoskill.ui.handwrite.HandWriteSearchActivity;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;
import com.lingo.lingoskill.ui.learn.DebugTestActivity;
import com.lingo.lingoskill.ui.learn.DebugTestIndexActivity;
import com.lingo.lingoskill.ui.learn.GenFilterSentenceIdActivity;
import com.lingo.lingoskill.ui.learn.adapter.LessonFinishSummaryAdapter;
import com.lingo.splash.SplashIndexActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.UserInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import f7.a0;
import fb.g0;
import hh.c0;
import hh.c1;
import hh.j0;
import hh.o0;
import hh.u0;
import hj.e3;
import hj.k0;
import hj.l6;
import hj.m6;
import hj.r3;
import j9.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.w0;
import jp.z;
import km.f2;
import km.i2;
import km.j2;
import kr.l1;
import qy.b0;
import rz.e0;
import w2.r0;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29745b;

    public /* synthetic */ s(LessonFinishSummaryAdapter lessonFinishSummaryAdapter, Object obj, int i11) {
        this.f29744a = i11;
        this.f29745b = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View viewInflate;
        View viewInflate2;
        int i11 = -1;
        vy.d dVar = null;
        int i12 = 0;
        switch (this.f29744a) {
            case 0:
                SplashIndexActivity context = (SplashIndexActivity) this.f29745b;
                LanguageItem languageItem = (LanguageItem) obj;
                int i13 = SplashIndexActivity.M;
                kotlin.jvm.internal.m.f(languageItem, "languageItem");
                kotlin.jvm.internal.m.f(context, "context");
                Intent intent = new Intent(context, (Class<?>) SwitchLanguageActivity.class);
                intent.putExtra(INTENTS.EXTRA_OBJECT, languageItem);
                intent.putExtra(INTENTS.EXTRA_BOOLEAN, true);
                intent.putExtra(INTENTS.EXTRA_STRING, "splash");
                context.startActivity(intent);
                return b0.f48488a;
            case 1:
                PdFinishActivity pdFinishActivity = (PdFinishActivity) this.f29745b;
                int iIntValue = ((Integer) obj).intValue();
                int i14 = PdFinishActivity.H;
                Intent intent2 = new Intent(pdFinishActivity, (Class<?>) LoginActivity.class);
                intent2.putExtra(INTENTS.EXTRA_INT, iIntValue);
                pdFinishActivity.startActivity(intent2);
                return b0.f48488a;
            case 2:
                hh.t tVar = (hh.t) this.f29745b;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                tVar.q(false, false);
                return b0.f48488a;
            case 3:
                PdLearnActivity pdLearnActivity = (PdLearnActivity) this.f29745b;
                Integer num = (Integer) obj;
                e3 e3Var = ((k0) pdLearnActivity.j()).f32804b;
                boolean z11 = num == null || num.intValue() != 100;
                LinearLayout linearLayout = (LinearLayout) e3Var.f32525d;
                if (z11) {
                    ComposeView composeView = (ComposeView) e3Var.f32524c;
                    ep.a.x(355243232, true, ep.a.b(composeView, p1.f58646d, CropImageView.DEFAULT_ASPECT_RATIO), composeView);
                    linearLayout.setVisibility(0);
                } else {
                    linearLayout.setVisibility(8);
                }
                if (num != null && num.intValue() == 100) {
                    long j11 = pdLearnActivity.Q;
                    if (j11 == 0) {
                        ff.h.A(pdLearnActivity, new o0());
                    } else if (j11 == 1) {
                        ff.h.A(pdLearnActivity, new c0());
                    } else if (j11 == 3) {
                        ff.h.A(pdLearnActivity, new j0());
                    } else if (j11 == 4) {
                        ff.h.A(pdLearnActivity, new u0());
                    }
                }
                return b0.f48488a;
            case 4:
                PdLearnIndexActivity pdLearnIndexActivity = (PdLearnIndexActivity) this.f29745b;
                String featureName = (String) obj;
                int i15 = PdLearnIndexActivity.L;
                kotlin.jvm.internal.m.f(featureName, "featureName");
                g0.w(pdLearnIndexActivity, pdLearnIndexActivity, featureName);
                return b0.f48488a;
            case 5:
                c1 c1Var = (c1) this.f29745b;
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ta.a aVar = c1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((l6) aVar).f32871f.performClick();
                return b0.f48488a;
            case 6:
                HandWriteGroupActivity handWriteGroupActivity = (HandWriteGroupActivity) this.f29745b;
                List groupCharacters = (List) obj;
                int i16 = HandWriteGroupActivity.f22048t;
                kotlin.jvm.internal.m.f(groupCharacters, "groupCharacters");
                e0.B(LifecycleOwnerKt.getLifecycleScope(handWriteGroupActivity), null, null, new f0(28, groupCharacters, handWriteGroupActivity, dVar), 3);
                return b0.f48488a;
            case 7:
                HandWriteSearchActivity context2 = (HandWriteSearchActivity) this.f29745b;
                CourseCharacterGroup group = (CourseCharacterGroup) obj;
                int i17 = HandWriteSearchActivity.f22049t;
                kotlin.jvm.internal.m.f(group, "group");
                kotlin.jvm.internal.m.f(context2, "context");
                Intent intent3 = new Intent(context2, (Class<?>) HandWriteGroupActivity.class);
                intent3.putExtra(INTENTS.EXTRA_OBJECT, group);
                context2.startActivity(intent3);
                return b0.f48488a;
            case 8:
                return UserInfo.copy$default((UserInfo) obj, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, ((DayStreakFinishedStatus) this.f29745b).getDayStreak(), 0, null, null, 31457279, null);
            case 9:
                i00.m mVar = (i00.m) this.f29745b;
                h00.m node = (h00.m) obj;
                kotlin.jvm.internal.m.f(node, "node");
                mVar.O(node, (String) ry.m.z0(mVar.f33912a));
                return b0.f48488a;
            case 10:
                PdLearnDetailAdapter.a((PdLearnDetailAdapter) this.f29745b, (View) obj);
                return b0.f48488a;
            case 11:
                PdLearnSpeakAdapter pdLearnSpeakAdapter = (PdLearnSpeakAdapter) this.f29745b;
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                pdLearnSpeakAdapter.j(!pdLearnSpeakAdapter.f21647i.get());
                return b0.f48488a;
            case 12:
                v3.c cVar = (v3.c) this.f29745b;
                int iIntValue2 = ((Integer) obj).intValue();
                kotlin.jvm.internal.m.f(cVar, "<this>");
                return new v3.o(cVar.I(iIntValue2));
            case 13:
                n1.e eVar = (n1.e) this.f29745b;
                Object[] objArr = eVar.f43112a;
                int i18 = eVar.f43114c;
                while (i12 < i18) {
                    ((r0) objArr[i12]).b();
                    i12++;
                }
                return b0.f48488a;
            case 14:
                j9.c0 c0Var = (j9.c0) this.f29745b;
                j9.e backStackEntry = (j9.e) obj;
                kotlin.jvm.internal.m.f(backStackEntry, "backStackEntry");
                m9.c cVar2 = backStackEntry.H;
                j9.q qVar = backStackEntry.f36188b;
                if (qVar == null) {
                    qVar = null;
                }
                if (qVar == null) {
                    return null;
                }
                cVar2.a();
                j9.q qVarC = c0Var.c(qVar);
                if (qVarC == null) {
                    return null;
                }
                return qVarC.equals(qVar) ? backStackEntry : c0Var.b().b(qVarC, qVarC.b(cVar2.a()));
            case 15:
                AdVideoPromptActivity adVideoPromptActivity = (AdVideoPromptActivity) this.f29745b;
                p7.a aVar2 = (p7.a) obj;
                int i19 = AdVideoPromptActivity.V;
                File file = new File(((fr.o0) adVideoPromptActivity.l()).v() + ry.m.z0(oz.q.W0(adVideoPromptActivity.P, new String[]{"/"}, 0, 6)));
                if (file.exists()) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(file.getPath());
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    if (strExtractMetadata == null) {
                        strExtractMetadata = "0";
                    }
                    float f5 = Float.parseFloat(strExtractMetadata);
                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    ((hj.g) adVideoPromptActivity.j()).f32588e.getViewTreeObserver().addOnGlobalLayoutListener(new jp.n(adVideoPromptActivity, Float.parseFloat(strExtractMetadata2 != null ? strExtractMetadata2 : "0"), f5));
                } else {
                    ((hj.g) adVideoPromptActivity.j()).f32587d.setVisibility(0);
                    ((hj.g) adVideoPromptActivity.j()).f32586c.setVisibility(0);
                }
                a0 a0Var = adVideoPromptActivity.Q;
                if (a0Var != null) {
                    a0Var.G0(aVar2);
                }
                a0 a0Var2 = adVideoPromptActivity.Q;
                if (a0Var2 != null) {
                    a0Var2.a();
                }
                return b0.f48488a;
            case 16:
                z zVar = (z) this.f29745b;
                List list = (List) obj;
                kotlin.jvm.internal.m.c(list);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    if (kotlin.jvm.internal.m.a(((File) it4.next()).getName(), zVar.x().f49338c)) {
                        i11 = i12;
                        zVar.Q = i11 + 1;
                        ta.a aVar3 = zVar.f36400f;
                        kotlin.jvm.internal.m.c(aVar3);
                        ((r3) aVar3).f33220i.setText(zVar.getString(R.string.lesson_s, String.valueOf(zVar.Q)));
                        return b0.f48488a;
                    }
                    i12++;
                }
                zVar.Q = i11 + 1;
                ta.a aVar4 = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((r3) aVar4).f33220i.setText(zVar.getString(R.string.lesson_s, String.valueOf(zVar.Q)));
                return b0.f48488a;
            case 17:
                w0 w0Var = (w0) this.f29745b;
                int[] iArr = bq.r.f4959a;
                Context contextRequireContext = w0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "lesson_tips");
                return b0.f48488a;
            case 18:
                DebugTestIndexActivity debugTestIndexActivity = (DebugTestIndexActivity) this.f29745b;
                View it5 = (View) obj;
                int i21 = DebugTestIndexActivity.P;
                kotlin.jvm.internal.m.f(it5, "it");
                EditText editText = ((hj.n) debugTestIndexActivity.j()).f32945c;
                kotlin.jvm.internal.m.c(editText);
                String string = editText.getText().toString();
                int length = string.length() - 1;
                int i22 = 0;
                boolean z12 = false;
                while (i22 <= length) {
                    boolean z13 = kotlin.jvm.internal.m.h(string.charAt(!z12 ? i22 : length), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            String modelStr = string.subSequence(i22, length + 1).toString();
                            kotlin.jvm.internal.m.f(modelStr, "modelStr");
                            Intent intent4 = new Intent(debugTestIndexActivity, (Class<?>) DebugTestActivity.class);
                            intent4.putExtra(INTENTS.EXTRA_STRING, modelStr);
                            debugTestIndexActivity.startActivity(intent4);
                            return b0.f48488a;
                        }
                        length--;
                    } else if (z13) {
                        i22++;
                    } else {
                        z12 = true;
                    }
                }
                String modelStr2 = string.subSequence(i22, length + 1).toString();
                kotlin.jvm.internal.m.f(modelStr2, "modelStr");
                Intent intent5 = new Intent(debugTestIndexActivity, (Class<?>) DebugTestActivity.class);
                intent5.putExtra(INTENTS.EXTRA_STRING, modelStr2);
                debugTestIndexActivity.startActivity(intent5);
                return b0.f48488a;
            case 19:
                GenFilterSentenceIdActivity genFilterSentenceIdActivity = (GenFilterSentenceIdActivity) this.f29745b;
                View it6 = (View) obj;
                int i23 = GenFilterSentenceIdActivity.Q;
                kotlin.jvm.internal.m.f(it6, "it");
                String str = BuildConfig.VERSION_NAME;
                List listW0 = oz.q.W0(genFilterSentenceIdActivity.P, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(ry.n.W(listW0, 10));
                Iterator it7 = listW0.iterator();
                while (it7.hasNext()) {
                    arrayList.add(Long.valueOf(Long.parseLong(oz.q.i1((String) it7.next()).toString())));
                }
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            ij.d.f34419e = new ij.d(lingoSkillApplication);
                        }
                        break;
                    }
                }
                ij.d dVar2 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar2);
                List<Sentence> listD = dVar2.u().queryBuilder().d();
                kotlin.jvm.internal.m.e(listD, "list(...)");
                for (Sentence sentence : listD) {
                    String wordList = sentence.getWordList();
                    kotlin.jvm.internal.m.e(wordList, "getWordList(...)");
                    List listW1 = oz.q.W0(wordList, new String[]{";"}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listW1) {
                        if (oz.q.i1((String) obj2).toString().length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList2, 10));
                    int size = arrayList2.size();
                    int i24 = 0;
                    while (i24 < size) {
                        Object obj3 = arrayList2.get(i24);
                        i24++;
                        arrayList3.add(Long.valueOf(Long.parseLong(oz.q.i1((String) obj3).toString())));
                    }
                    int size2 = arrayList3.size();
                    boolean z14 = false;
                    int i25 = 0;
                    while (i25 < size2) {
                        Object obj4 = arrayList3.get(i25);
                        i25++;
                        if (arrayList.contains(Long.valueOf(((Number) obj4).longValue()))) {
                            z14 = true;
                        }
                    }
                    if (z14) {
                        str = str + sentence.getSentenceId() + ";";
                    }
                }
                return b0.f48488a;
            case 20:
                l1 l1Var = (l1) this.f29745b;
                e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new bp.j0(((Integer) obj).intValue(), l1Var, null), 3);
                return b0.f48488a;
            case 21:
                ((jt.e) this.f29745b).e().setValue(RecordingStatus.Recognizing.INSTANCE);
                return b0.f48488a;
            case 22:
                PdFeedDifficultyActivity pdFeedDifficultyActivity = (PdFeedDifficultyActivity) this.f29745b;
                mh.i lesson = (mh.i) obj;
                int i26 = PdFeedDifficultyActivity.H;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                long j12 = lesson.f41135a;
                Intent intent6 = new Intent(pdFeedDifficultyActivity, (Class<?>) PdLearnIndexActivity.class);
                intent6.putExtra(INTENTS.EXTRA_LONG, j12);
                pdFeedDifficultyActivity.startActivity(intent6);
                return b0.f48488a;
            case 23:
                PdFeedStarredActivity context3 = (PdFeedStarredActivity) this.f29745b;
                mh.i lesson2 = (mh.i) obj;
                int i27 = PdFeedStarredActivity.f21657t;
                kotlin.jvm.internal.m.f(lesson2, "lesson");
                long j13 = lesson2.f41135a;
                kotlin.jvm.internal.m.f(context3, "context");
                Intent intent7 = new Intent(context3, (Class<?>) PdLearnIndexActivity.class);
                intent7.putExtra(INTENTS.EXTRA_LONG, j13);
                context3.startActivity(intent7);
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                km.u uVar = (km.u) this.f29745b;
                int iIntValue3 = ((Integer) obj).intValue();
                int i28 = LoginActivity.Q;
                Context contextRequireContext2 = uVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                uVar.startActivity(g1.p(contextRequireContext2, iIntValue3));
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                f2 f2Var = (f2) this.f29745b;
                View it8 = (View) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                int i29 = JPSyllableIndexActivity.f21908t;
                Context contextRequireContext3 = f2Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                Intent intent8 = new Intent(contextRequireContext3, (Class<?>) JPSyllableIndexActivity.class);
                intent8.putExtra("extra_open_introduction", true);
                f2Var.startActivity(intent8);
                b7.e0.A(f2Var.t(), "jxz_alphabet_chart_click_whatisgojuon");
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                j2 j2Var = (j2) this.f29745b;
                List it9 = (List) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                j2Var.N = it9;
                if (j2Var.O == 2) {
                    viewInflate = LayoutInflater.from(j2Var.f36398d).inflate(R.layout.header_yintu_top_higher, (ViewGroup) null, false);
                    kotlin.jvm.internal.m.e(viewInflate, "inflate(...)");
                    viewInflate2 = LayoutInflater.from(j2Var.f36398d).inflate(R.layout.footer_yintu_bottom_heigher, (ViewGroup) null, false);
                    kotlin.jvm.internal.m.e(viewInflate2, "inflate(...)");
                } else {
                    viewInflate = LayoutInflater.from(j2Var.f36398d).inflate(R.layout.header_yintu_top, (ViewGroup) null, false);
                    kotlin.jvm.internal.m.e(viewInflate, "inflate(...)");
                    viewInflate2 = LayoutInflater.from(j2Var.f36398d).inflate(R.layout.footer_yintu_bottom, (ViewGroup) null, false);
                    kotlin.jvm.internal.m.e(viewInflate2, "inflate(...)");
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(16);
                ta.a aVar5 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((m6) aVar5).f32941b.setLayoutManager(gridLayoutManager);
                List list2 = j2Var.N;
                kotlin.jvm.internal.m.c(list2);
                int i30 = j2Var.O;
                YinTuAdapter yinTuAdapter = new YinTuAdapter(list2);
                yinTuAdapter.f21906a = -1;
                yinTuAdapter.f21907b = -1;
                if (i30 == 2) {
                    yinTuAdapter.addItemType(0, R.layout.item_syllable_heigher);
                    yinTuAdapter.addItemType(1, R.layout.item_syllable_control_right_heigher);
                } else {
                    yinTuAdapter.addItemType(0, R.layout.item_syllable);
                    yinTuAdapter.addItemType(1, R.layout.item_syllable_control_right);
                }
                ta.a aVar6 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((m6) aVar6).f32941b.setAdapter(yinTuAdapter);
                yinTuAdapter.setOnItemClickListener(new jg.a(j2Var, viewInflate, viewInflate2, yinTuAdapter));
                yinTuAdapter.addHeaderView(viewInflate);
                yinTuAdapter.addFooterView(viewInflate2);
                ArrayList arrayList4 = new ArrayList();
                List list3 = j2Var.N;
                kotlin.jvm.internal.m.c(list3);
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(Integer.valueOf((int) ((BaseYintuIntel) it10.next()).getId()));
                }
                j2Var.B(viewInflate, arrayList4);
                ta.a aVar7 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                RecyclerView recyclerView = ((m6) aVar7).f32941b;
                ta.a aVar8 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                j2Var.x(viewInflate, viewInflate2, recyclerView, ((m6) aVar8).f32942c);
                j2Var.B(viewInflate2, arrayList4);
                ta.a aVar9 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                RecyclerView recyclerView2 = ((m6) aVar9).f32941b;
                ta.a aVar10 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                j2Var.x(viewInflate2, viewInflate, recyclerView2, ((m6) aVar10).f32942c);
                if (j2Var.O == 2) {
                    j2Var.P = 4;
                }
                gridLayoutManager.f2390t = new i2(j2Var);
                ta.a aVar11 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                b1 adapter = ((m6) aVar11).f32941b.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                ta.a aVar12 = j2Var.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                j2Var.A(((m6) aVar12).f32941b, viewInflate, viewInflate2);
                return b0.f48488a;
            case 27:
                Word word = (Word) this.f29745b;
                View it11 = (View) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                qy.q qVar2 = fv.b.f28186a;
                fv.b.Y(word.getWordId(), null, null);
                throw null;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Sentence sentence2 = (Sentence) this.f29745b;
                View it12 = (View) obj;
                kotlin.jvm.internal.m.f(it12, "it");
                qy.q qVar3 = fv.b.f28186a;
                fv.b.G(sentence2.getSentenceId(), null, null);
                throw null;
            default:
                LDCharacter lDCharacter = (LDCharacter) this.f29745b;
                View it13 = (View) obj;
                kotlin.jvm.internal.m.f(it13, "it");
                xt.b.a().g();
                qy.q qVar4 = fv.b.f28186a;
                String audioName = lDCharacter.getAudioName();
                kotlin.jvm.internal.m.e(audioName, "getAudioName(...)");
                fv.b.a(audioName, null, null);
                throw null;
        }
    }

    public /* synthetic */ s(j9.c0 c0Var, y yVar) {
        this.f29744a = 14;
        this.f29745b = c0Var;
    }

    public /* synthetic */ s(Object obj, int i11) {
        this.f29744a = i11;
        this.f29745b = obj;
    }
}
