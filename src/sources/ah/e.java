package ah;

import android.content.Context;
import av.n;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.AckDao;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.Model_Sentence_050Dao;
import com.lingo.lingoskill.object.Model_Sentence_060Dao;
import com.lingo.lingoskill.object.Model_Sentence_070Dao;
import com.lingo.lingoskill.object.Model_Sentence_080Dao;
import com.lingo.lingoskill.object.Model_Sentence_090Dao;
import com.lingo.lingoskill.object.Model_Sentence_QADao;
import com.lingo.lingoskill.object.Model_Word_010Dao;
import com.lingo.lingoskill.object.PhraseDao;
import com.lingo.lingoskill.object.UnitDao;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import h1.r4;
import h1.ua;
import j0.e2;
import js.r;
import js.w;
import js.y;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.s;
import org.koin.core.error.DefinitionParameterException;
import qy.b0;
import se.k;
import vf.eq.EHjhWcesDUIsIw;
import vt.b1;
import vt.e0;
import vt.g0;
import vt.n0;
import wt.o0;
import xt.q;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f712a;

    public /* synthetic */ e(int i11) {
        this.f712a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        switch (this.f712a) {
            case 0:
                e20.a single = (e20.a) obj;
                a20.a it = (a20.a) obj2;
                m.f(single, "$this$single");
                m.f(it, "it");
                return new q(com.bumptech.glide.d.e(single), (Env) single.a(null, null, z.a(Env.class)), (n0) single.a(null, null, z.a(n0.class)));
            case 1:
                e20.a factory = (e20.a) obj;
                a20.a it2 = (a20.a) obj2;
                m.f(factory, "$this$factory");
                m.f(it2, "it");
                return new n(com.bumptech.glide.d.e(factory));
            case 2:
                e20.a single2 = (e20.a) obj;
                a20.a it3 = (a20.a) obj2;
                m.f(single2, "$this$single");
                m.f(it3, "it");
                return new av.q(com.bumptech.glide.d.e(single2));
            case 3:
                e20.a single3 = (e20.a) obj;
                a20.a it4 = (a20.a) obj2;
                m.f(single3, "$this$single");
                m.f(it4, "it");
                return new gq.i(com.bumptech.glide.d.e(single3));
            case 4:
                a20.a it5 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it5, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication);
                            ij.d.f34419e = new ij.d(lingoSkillApplication);
                        }
                        break;
                    }
                }
                ij.d dVar = ij.d.f34419e;
                m.c(dVar);
                return dVar.q();
            case 5:
                a20.a it6 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it6, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication2);
                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                        }
                        break;
                    }
                }
                ij.d dVar2 = ij.d.f34419e;
                m.c(dVar2);
                Model_Sentence_050Dao model_Sentence_050Dao = ((DaoSession) dVar2.f34423d).getModel_Sentence_050Dao();
                m.e(model_Sentence_050Dao, "getModel_Sentence_050Dao(...)");
                return model_Sentence_050Dao;
            case 6:
                a20.a it7 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it7, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication3);
                            ij.d.f34419e = new ij.d(lingoSkillApplication3);
                        }
                        break;
                    }
                }
                ij.d dVar3 = ij.d.f34419e;
                m.c(dVar3);
                Model_Sentence_060Dao model_Sentence_060Dao = ((DaoSession) dVar3.f34423d).getModel_Sentence_060Dao();
                m.e(model_Sentence_060Dao, "getModel_Sentence_060Dao(...)");
                return model_Sentence_060Dao;
            case 7:
                a20.a it8 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it8, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication4);
                            ij.d.f34419e = new ij.d(lingoSkillApplication4);
                        }
                        break;
                    }
                }
                ij.d dVar4 = ij.d.f34419e;
                m.c(dVar4);
                Model_Sentence_070Dao model_Sentence_070Dao = ((DaoSession) dVar4.f34423d).getModel_Sentence_070Dao();
                m.e(model_Sentence_070Dao, "getModel_Sentence_070Dao(...)");
                return model_Sentence_070Dao;
            case 8:
                a20.a it9 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it9, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication5);
                            ij.d.f34419e = new ij.d(lingoSkillApplication5);
                        }
                        break;
                    }
                }
                ij.d dVar5 = ij.d.f34419e;
                m.c(dVar5);
                Model_Sentence_080Dao model_Sentence_080Dao = ((DaoSession) dVar5.f34423d).getModel_Sentence_080Dao();
                m.e(model_Sentence_080Dao, "getModel_Sentence_080Dao(...)");
                return model_Sentence_080Dao;
            case 9:
                a20.a it10 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it10, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication6);
                            ij.d.f34419e = new ij.d(lingoSkillApplication6);
                        }
                        break;
                    }
                }
                ij.d dVar6 = ij.d.f34419e;
                m.c(dVar6);
                Model_Sentence_090Dao model_Sentence_090Dao = ((DaoSession) dVar6.f34423d).getModel_Sentence_090Dao();
                m.e(model_Sentence_090Dao, "getModel_Sentence_090Dao(...)");
                return model_Sentence_090Dao;
            case 10:
                a20.a it11 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it11, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication7);
                            ij.d.f34419e = new ij.d(lingoSkillApplication7);
                        }
                        break;
                    }
                }
                ij.d dVar7 = ij.d.f34419e;
                m.c(dVar7);
                return dVar7.r();
            case 11:
                a20.a it12 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it12, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication8);
                            ij.d.f34419e = new ij.d(lingoSkillApplication8);
                        }
                        break;
                    }
                }
                ij.d dVar8 = ij.d.f34419e;
                m.c(dVar8);
                Model_Sentence_QADao model_Sentence_QADao = ((DaoSession) dVar8.f34423d).getModel_Sentence_QADao();
                m.e(model_Sentence_QADao, "getModel_Sentence_QADao(...)");
                return model_Sentence_QADao;
            case 12:
                a20.a it13 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it13, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication9);
                            ij.d.f34419e = new ij.d(lingoSkillApplication9);
                        }
                        break;
                    }
                }
                ij.d dVar9 = ij.d.f34419e;
                m.c(dVar9);
                Model_Word_010Dao model_Word_010Dao = ((DaoSession) dVar9.f34423d).getModel_Word_010Dao();
                m.e(model_Word_010Dao, EHjhWcesDUIsIw.TUclof);
                return model_Word_010Dao;
            case 13:
                a20.a it14 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it14, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication10);
                            ij.d.f34419e = new ij.d(lingoSkillApplication10);
                        }
                        break;
                    }
                }
                ij.d dVar10 = ij.d.f34419e;
                m.c(dVar10);
                PhraseDao phraseDao = ((DaoSession) dVar10.f34423d).getPhraseDao();
                m.e(phraseDao, "getPhraseDao(...)");
                return phraseDao;
            case 14:
                a20.a it15 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it15, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication11);
                            ij.d.f34419e = new ij.d(lingoSkillApplication11);
                        }
                        break;
                    }
                }
                ij.d dVar11 = ij.d.f34419e;
                m.c(dVar11);
                AckDao ackDao = ((DaoSession) dVar11.f34423d).getAckDao();
                m.e(ackDao, "getAckDao(...)");
                return ackDao;
            case 15:
                a20.a it16 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it16, "it");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication12);
                            ij.d.f34419e = new ij.d(lingoSkillApplication12);
                        }
                        break;
                    }
                }
                ij.d dVar12 = ij.d.f34419e;
                m.c(dVar12);
                UnitDao unitDao = ((DaoSession) dVar12.f34423d).getUnitDao();
                m.e(unitDao, "getUnitDao(...)");
                return unitDao;
            case 16:
                a20.a it17 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it17, "it");
                if (ij.n.f34440v == null) {
                    synchronized (ij.n.class) {
                        if (ij.n.f34440v == null) {
                            LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication13);
                            ij.n.f34440v = new ij.n(lingoSkillApplication13);
                        }
                        break;
                    }
                }
                ij.n nVar = ij.n.f34440v;
                m.c(nVar);
                return nVar.f34446f;
            case 17:
                a20.a it18 = (a20.a) obj2;
                m.f((e20.a) obj, "$this$factory");
                m.f(it18, "it");
                if (ij.n.f34440v == null) {
                    synchronized (ij.n.class) {
                        if (ij.n.f34440v == null) {
                            LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication14);
                            ij.n.f34440v = new ij.n(lingoSkillApplication14);
                        }
                        break;
                    }
                }
                ij.n nVar2 = ij.n.f34440v;
                m.c(nVar2);
                return nVar2.f34448h;
            case 18:
                e20.a single4 = (e20.a) obj;
                a20.a it19 = (a20.a) obj2;
                m.f(single4, "$this$single");
                m.f(it19, "it");
                return new ds.g((Context) single4.a(null, null, z.a(Context.class)), (n0) single4.a(null, null, z.a(n0.class)), (cu.g) single4.a(null, null, z.a(cu.g.class)), (b1) single4.a(null, null, z.a(b1.class)), (e0) single4.a(null, null, z.a(e0.class)));
            case 19:
                e20.a factory2 = (e20.a) obj;
                a20.a it20 = (a20.a) obj2;
                m.f(factory2, "$this$factory");
                m.f(it20, "it");
                return new hs.b((g0) factory2.a(null, null, z.a(g0.class)));
            case 20:
                e20.a factory3 = (e20.a) obj;
                a20.a it21 = (a20.a) obj2;
                m.f(factory3, "$this$factory");
                m.f(it21, "it");
                return new hs.g((g0) factory3.a(null, null, z.a(g0.class)));
            case 21:
                e20.a viewModel = (e20.a) obj;
                a20.a it22 = (a20.a) obj2;
                m.f(viewModel, "$this$viewModel");
                m.f(it22, "it");
                return new js.g((hs.b) viewModel.a(null, null, z.a(hs.b.class)), (n0) viewModel.a(null, null, z.a(n0.class)), (vt.c) viewModel.a(null, null, z.a(vt.c.class)), (g0) viewModel.a(null, null, z.a(g0.class)));
            case 22:
                e20.a viewModel2 = (e20.a) obj;
                a20.a parameters = (a20.a) obj2;
                m.f(viewModel2, "$this$viewModel");
                m.f(parameters, "parameters");
                n0 n0Var = (n0) viewModel2.a(null, null, z.a(n0.class));
                vt.c cVar = (vt.c) viewModel2.a(null, null, z.a(vt.c.class));
                vt.e eVar = (vt.e) viewModel2.a(null, null, z.a(vt.e.class));
                ur.a aVar = (ur.a) viewModel2.a(null, null, z.a(ur.a.class));
                wt.m mVar = (wt.m) viewModel2.a(null, null, z.a(wt.m.class));
                o0 o0Var = (o0) viewModel2.a(null, null, z.a(o0.class));
                hs.g gVar = (hs.g) viewModel2.a(null, null, z.a(hs.g.class));
                g0 g0Var = (g0) viewModel2.a(null, null, z.a(g0.class));
                Object objB = parameters.b(z.a(ChineseToneLesson.class));
                if (objB != null) {
                    return new r(n0Var, cVar, eVar, aVar, mVar, o0Var, gVar, g0Var, (ChineseToneLesson) objB, (av.z) viewModel2.a(null, null, z.a(av.z.class)));
                }
                throw new DefinitionParameterException(defpackage.e.k(ChineseToneLesson.class, new StringBuilder("No value found for type '"), '\''));
            case 23:
                e20.a viewModel3 = (e20.a) obj;
                a20.a it23 = (a20.a) obj2;
                m.f(viewModel3, "$this$viewModel");
                m.f(it23, "it");
                return new js.i((g0) viewModel3.a(null, null, z.a(g0.class)), (vt.c) viewModel3.a(null, null, z.a(vt.c.class)), (n0) viewModel3.a(null, null, z.a(n0.class)));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                e20.a viewModel4 = (e20.a) obj;
                a20.a it24 = (a20.a) obj2;
                m.f(viewModel4, "$this$viewModel");
                m.f(it24, "it");
                return new y((n) viewModel4.a(null, null, z.a(n.class)), (fv.c) viewModel4.a(null, null, z.a(fv.c.class)));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                e20.a viewModel5 = (e20.a) obj;
                a20.a aVar2 = (a20.a) obj2;
                m.f(viewModel5, "$this$viewModel");
                m.f(aVar2, "<destruct>");
                return new w((ChineseToneUnit) aVar2.a(z.a(ChineseToneUnit.class)), (g0) viewModel5.a(null, null, z.a(g0.class)), (vt.c) viewModel5.a(null, null, z.a(vt.c.class)));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar3;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r4.b(k.y(R.drawable.ic_lesson_index_download, sVar, 0), null, e2.n(o.f58481a, 24), 0L, sVar, 432, 8);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 27:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar4;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar2, R.string.remove_course_title), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131070);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar5;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar3, R.string.find_password), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            default:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar6;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ua.b(ub.a.e0(sVar4, R.string.email), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 131070);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
        }
    }
}
