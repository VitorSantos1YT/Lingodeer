package com.lingo.lingoskill.base.refill;

import android.content.Context;
import ay.g0;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.Phrase;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.TranlateObject;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import java.util.Iterator;
import java.util.List;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DaoSession f21720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lc.d f21721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21723h;

    public h(UpdateLessonActivity context, String str, String str2, String str3, DaoSession daoSession, lc.d dialog) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(daoSession, "daoSession");
        kotlin.jvm.internal.m.f(dialog, "dialog");
        this.f21716a = context;
        this.f21717b = str;
        this.f21718c = str2;
        this.f21719d = str3;
        this.f21720e = daoSession;
        this.f21721f = dialog;
        this.f21723h = 16;
    }

    public static final void a(h hVar) {
        String str = hVar.f21717b;
        if (hVar.f21722g >= hVar.f21723h) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            int i11 = x.n().locateLanguage;
            if (i11 == 51) {
                k kVar = new k(str, 1);
                ((n) kVar.f21731a).l().f(new o(kVar, 0)).f(new d(hVar, 0)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 1), b.L);
                return;
            }
            if (i11 == 57) {
                k kVar2 = new k(str, 1);
                ((n) kVar2.f21731a).k().f(new o(kVar2, 13)).f(new d(hVar, 26)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 27), b.Y);
                return;
            }
            switch (i11) {
                case 1:
                    k kVar3 = new k(str, 1);
                    ((n) kVar3.f21731a).j().f(new o(kVar3, 6)).f(new d(hVar, 14)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 15), b.S);
                    break;
                case 2:
                    k kVar4 = new k(str, 1);
                    ((n) kVar4.f21731a).h().f(new o(kVar4, 7)).f(new d(hVar, 16)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 17), b.T);
                    break;
                case 3:
                    k kVar5 = new k(str, 1);
                    ((n) kVar5.f21731a).d().f(new o(kVar5, 2)).f(new d(hVar, 4)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 5), b.N);
                    break;
                case 4:
                    k kVar6 = new k(str, 1);
                    ((n) kVar6.f21731a).b().f(new o(kVar6, 11)).f(new d(hVar, 6)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 7), b.O);
                    break;
                case 5:
                    k kVar7 = new k(str, 1);
                    ((n) kVar7.f21731a).m().f(new o(kVar7, 3)).f(new d(hVar, 8)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 9), b.P);
                    break;
                case 6:
                    k kVar8 = new k(str, 1);
                    ((n) kVar8.f21731a).g().f(new o(kVar8, 1)).f(new d(hVar, 2)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 3), b.M);
                    break;
                case 7:
                    k kVar9 = new k(str, 1);
                    ((n) kVar9.f21731a).n().f(new o(kVar9, 14)).f(new d(hVar, 28)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 29), b.Z);
                    break;
                case 8:
                    k kVar10 = new k(str, 1);
                    ((n) kVar10.f21731a).e().f(new o(kVar10, 9)).f(new d(hVar, 20)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 21), b.V);
                    break;
                case 9:
                    k kVar11 = new k(str, 1);
                    ((n) kVar11.f21731a).o().f(new o(kVar11, 12)).f(new d(hVar, 24)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 25), b.X);
                    break;
                case 10:
                    k kVar12 = new k(str, 1);
                    ((n) kVar12.f21731a).a().f(new o(kVar12, 10)).f(new d(hVar, 22)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 23), b.W);
                    break;
                default:
                    switch (i11) {
                        case 18:
                            k kVar13 = new k(str, 1);
                            ((n) kVar13.f21731a).c().f(new o(kVar13, 4)).f(new d(hVar, 10)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 11), b.Q);
                            break;
                        case 19:
                            k kVar14 = new k(str, 1);
                            ((n) kVar14.f21731a).f().f(new o(kVar14, 8)).f(new d(hVar, 18)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 19), b.U);
                            break;
                        case 20:
                            k kVar15 = new k(str, 1);
                            ((n) kVar15.f21731a).i().f(new o(kVar15, 5)).f(new d(hVar, 12)).k(ky.e.f38937b).g(px.b.a()).h(new d(hVar, 13), b.R);
                            break;
                    }
                    break;
            }
        }
    }

    public static final void b(h hVar, List list) {
        Unit unit;
        DaoSession daoSession = hVar.f21720e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TranlateObject tranlateObject = (TranlateObject) it.next();
            int modelType = tranlateObject.getModelType();
            String value = tranlateObject.getValue();
            if (modelType == 1) {
                Word word = (Word) daoSession.getWordDao().load(Long.valueOf(tranlateObject.getCWSId()));
                if (word != null) {
                    kotlin.jvm.internal.m.c(value);
                    word.setTranslations(q.i1(value).toString());
                    daoSession.getWordDao().update(word);
                }
            } else if (modelType == 2) {
                Word word2 = (Word) daoSession.getWordDao().load(Long.valueOf(tranlateObject.getCWSId()));
                if (word2 != null) {
                    kotlin.jvm.internal.m.c(value);
                    word2.setExplanation(q.i1(value).toString());
                    daoSession.getWordDao().update(word2);
                }
            } else if (modelType == 5) {
                Sentence sentence = (Sentence) daoSession.getSentenceDao().load(Long.valueOf(tranlateObject.getCWSId()));
                if (sentence != null) {
                    kotlin.jvm.internal.m.c(value);
                    sentence.setTranslations(q.i1(value).toString());
                    daoSession.getSentenceDao().update(sentence);
                }
            } else if (modelType == 11 && oz.x.s0(String.valueOf(tranlateObject.getId()), "11", false)) {
                Unit unit2 = (Unit) daoSession.getUnitDao().load(Long.valueOf(tranlateObject.getCWSId()));
                if (unit2 != null) {
                    kotlin.jvm.internal.m.c(value);
                    unit2.setUnitName(q.i1(value).toString());
                    daoSession.getUnitDao().update(unit2);
                }
            } else if (modelType == 30) {
                Unit unit3 = (Unit) daoSession.getUnitDao().load(Long.valueOf(tranlateObject.getCWSId()));
                if (unit3 != null) {
                    kotlin.jvm.internal.m.c(value);
                    unit3.setDescription(q.i1(value).toString());
                    daoSession.getUnitDao().update(unit3);
                }
            } else if (modelType == 102) {
                Phrase phrase = (Phrase) daoSession.getPhraseDao().load(Long.valueOf(tranlateObject.getCWSId()));
                if (phrase != null) {
                    kotlin.jvm.internal.m.c(value);
                    phrase.setTranslations(q.i1(value).toString());
                    daoSession.getPhraseDao().update(phrase);
                }
            } else if (modelType == 999 && (unit = (Unit) daoSession.getUnitDao().load(Long.valueOf(tranlateObject.getCWSId()))) != null) {
                kotlin.jvm.internal.m.c(value);
                unit.setDescription(q.i1(value).toString());
                daoSession.getUnitDao().update(unit);
            }
        }
    }

    public final void c() {
        ((i) com.google.android.material.datepicker.d.i(i.class, this.f21717b, "create(...)")).a().f(g.X).f(new a(this.f21720e.getLDCharacterDao(), 3)).k(ky.e.f38937b).g(px.b.a()).h(new e(this, 0), b.f21678b0);
    }

    public final void d() {
        DaoSession daoSession = this.f21720e;
        LevelDao levelDao = daoSession.getLevelDao();
        String str = this.f21717b;
        g0 g0VarF = ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).e().f(g.Z);
        dy.j jVar = ky.e.f38937b;
        g0VarF.k(jVar).g(px.b.a()).h(new f(levelDao, this, 0), b.f21682d0);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).d().f(j.O).k(jVar).g(px.b.a()).h(new f(daoSession.getWordDao(), this, 25), g.P);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).k().f(j.H).k(jVar).g(px.b.a()).h(new f(daoSession.getSentenceDao(), this, 23), g.M);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).x().f(g.f21706c0).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_010Dao(), this, 13), b.f21687g0);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).l().f(g.f21708d0).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_020Dao(), this, 14), g.f21703b);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).b().f(g.f21710e0).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_030Dao(), this, 15), g.f21705c);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).t().f(g.f21712f0).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_040Dao(), this, 16), g.f21707d);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).j().f(g.f21713g0).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_050Dao(), this, 17), g.f21709e);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).C().f(j.f21724b).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_060Dao(), this, 18), g.f21711f);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).q().f(j.f21725c).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_070Dao(), this, 19), new e(this, 2));
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).g().f(j.f21726d).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_080Dao(), this, 20), g.f21714t);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).z().f(j.f21728f).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_100Dao(), this, 22), g.K);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).w().f(j.N).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Word_010Dao(), this, 24), g.O);
        ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).o().f(g.Q).k(jVar).g(px.b.a()).h(new f(daoSession.getAckDao(), this, 10), b.f21676a0);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{47, 48}, Integer.valueOf(x.n().keyLanguage))) {
            this.f21723h = 17;
            e();
        }
        if (ry.l.D(new Integer[]{53, 54}, Integer.valueOf(x.n().keyLanguage))) {
            this.f21723h = 17;
            e();
        }
        int i11 = 21;
        if (ry.l.D(new Integer[]{49, 50}, Integer.valueOf(x.n().keyLanguage))) {
            this.f21723h = 20;
            e();
            f();
            ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).B().f(j.f21727e).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_090Dao(), this, i11), g.H);
            ((i) com.google.android.material.datepicker.d.i(i.class, str, "create(...)")).f().f(g.f21704b0).k(jVar).g(px.b.a()).h(new f(daoSession.getModel_Sentence_000Dao(), this, 12), b.f21686f0);
        }
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(x.n().keyLanguage))) {
            this.f21723h = 18;
            c();
            f();
        }
        if (ry.l.D(new Integer[]{57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
            this.f21723h = 18;
            c();
            f();
        }
        if (ry.l.D(new Integer[]{21, 19, 18, 69}, Integer.valueOf(x.n().keyLanguage))) {
            this.f21723h = 17;
            f();
        }
    }

    public final void e() {
        ((i) com.google.android.material.datepicker.d.i(i.class, this.f21717b, "create(...)")).y().f(g.f21702a0).f(new a(this.f21720e.getPhraseDao(), 4)).k(ky.e.f38937b).g(px.b.a()).h(new e(this, 1), b.f21684e0);
    }

    public final void f() {
        ((i) com.google.android.material.datepicker.d.i(i.class, this.f21717b, "create(...)")).A().f(j.f21729t).f(new a(this.f21720e.getModel_Sentence_QADao(), 5)).k(ky.e.f38937b).g(px.b.a()).h(new e(this, 3), g.L);
    }
}
