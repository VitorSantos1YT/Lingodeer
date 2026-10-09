package b0;

import android.view.View;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.WordDao;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingodeer.database.model.LanguageHistoryEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3586a;

    public /* synthetic */ k2(int i11) {
        this.f3586a = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // fz.c
    public final Object invoke(Object obj) {
        Object obj2;
        int i11;
        String lastRegex;
        boolean z11 = false;
        switch (this.f3586a) {
            case 0:
                return new o(((Integer) obj).intValue());
            case 1:
                return Integer.valueOf((int) ((o) obj).f3626a);
            case 2:
                return new o(((v3.f) obj).f53489a);
            case 3:
                return new v3.f(((o) obj).f3626a);
            case 4:
                v3.g gVar = (v3.g) obj;
                return new p(v3.g.a(gVar.f53490a), Float.intBitsToFloat((int) (gVar.f53490a & 4294967295L)));
            case 5:
                p pVar = (p) obj;
                return new v3.g((((long) Float.floatToRawIntBits(pVar.f3630a)) << 32) | (((long) Float.floatToRawIntBits(pVar.f3631b)) & 4294967295L));
            case 6:
                f2.e eVar = (f2.e) obj;
                return new p(Float.intBitsToFloat((int) (eVar.f26584a >> 32)), Float.intBitsToFloat((int) (eVar.f26584a & 4294967295L)));
            case 7:
                p pVar2 = (p) obj;
                return new f2.e((((long) Float.floatToRawIntBits(pVar2.f3630a)) << 32) | (((long) Float.floatToRawIntBits(pVar2.f3631b)) & 4294967295L));
            case 8:
                f2.b bVar = (f2.b) obj;
                return new p(Float.intBitsToFloat((int) (bVar.f26570a >> 32)), Float.intBitsToFloat((int) (bVar.f26570a & 4294967295L)));
            case 9:
                p pVar3 = (p) obj;
                return new f2.b((((long) Float.floatToRawIntBits(pVar3.f3630a)) << 32) | (((long) Float.floatToRawIntBits(pVar3.f3631b)) & 4294967295L));
            case 10:
                long j11 = ((v3.j) obj).f53492a;
                return new p((int) (j11 >> 32), (int) (j11 & 4294967295L));
            case 11:
                p pVar4 = (p) obj;
                return new v3.j((((long) Math.round(pVar4.f3630a)) << 32) | (((long) Math.round(pVar4.f3631b)) & 4294967295L));
            case 12:
                long j12 = ((v3.l) obj).f53498a;
                return new p((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 13:
                p pVar5 = (p) obj;
                int iRound = Math.round(pVar5.f3630a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(pVar5.f3631b);
                if (iRound2 < 0) {
                    iRound2 = 0;
                }
                return new v3.l((((long) iRound) << 32) | (((long) iRound2) & 4294967295L));
            case 14:
                f2.c cVar = (f2.c) obj;
                return new r(cVar.f26572a, cVar.f26573b, cVar.f26574c, cVar.f26575d);
            case 15:
                r rVar = (r) obj;
                return new f2.c(rVar.f3651a, rVar.f3652b, rVar.f3653c, rVar.f3654d);
            case 16:
                return Float.valueOf(((o) obj).f3626a);
            case 17:
                return qy.b0.f48488a;
            case 18:
                return qy.b0.f48488a;
            case 19:
                return Boolean.valueOf(((Word) obj).getWordType() != 1);
            case 20:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return qy.b0.f48488a;
            case 21:
                LanguageHistoryEntity it = (LanguageHistoryEntity) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return it.getId();
            case 22:
                kotlin.jvm.internal.m.f((View) obj, "it");
                uv.r.h();
                tp.g gVar2 = uv.k.f53220a;
                if (((uv.s) gVar2.f52461b).c()) {
                    gVar2.o(ns.o.f44007a);
                }
                return qy.b0.f48488a;
            case 23:
                int i12 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ?? arrayList = new ArrayList();
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            ij.d.f34419e = new ij.d(lingoSkillApplication);
                        }
                    }
                }
                ij.d dVar = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar);
                Iterator<Object> it2 = dVar.p().loadAll().iterator();
                while (true) {
                    int i13 = 24;
                    if (!it2.hasNext()) {
                        if (ij.d.f34419e == null) {
                            synchronized (ij.d.class) {
                                if (ij.d.f34419e == null) {
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication2);
                                    ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                }
                            }
                        }
                        ij.d dVar2 = ij.d.f34419e;
                        kotlin.jvm.internal.m.c(dVar2);
                        WordDao wordDao = ((DaoSession) dVar2.f34423d).getWordDao();
                        kotlin.jvm.internal.m.e(wordDao, "getWordDao(...)");
                        List listD = wordDao.queryBuilder().d();
                        kotlin.jvm.internal.m.e(listD, "list(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listD) {
                            if (((Word) obj3).getWordType() != 1) {
                                arrayList2.add(obj3);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            Object obj4 = null;
                            if (i14 >= size) {
                                ry.m.y0(arrayList3, ";", null, null, new k2(i13), 30);
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                            kotlin.jvm.internal.m.c(lingoSkillApplication3);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication3);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar3 = ij.d.f34419e;
                                kotlin.jvm.internal.m.c(dVar3);
                                List listD2 = dVar3.u().queryBuilder().d();
                                kotlin.jvm.internal.m.e(listD2, "list(...)");
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj5 : listD2) {
                                    Sentence sentence = (Sentence) obj5;
                                    int size2 = arrayList.size();
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < size2) {
                                            obj2 = arrayList.get(i15);
                                            i15++;
                                            qi.a aVar = (qi.a) obj2;
                                            if (aVar.f47798a != 1 || aVar.f47799b != sentence.getSentenceId()) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    if (obj2 == null) {
                                        arrayList4.add(obj5);
                                    }
                                }
                                ry.m.y0(arrayList4, ";", null, null, new k2(25), 30);
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = arrayList.size();
                                int i16 = 0;
                                while (i16 < size3) {
                                    Object obj6 = arrayList.get(i16);
                                    i16++;
                                    qi.a aVar2 = (qi.a) obj6;
                                    if (aVar2.f47798a == 0 && aVar2.f47800c == 5) {
                                        arrayList5.add(obj6);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                int size4 = arrayList.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    Object obj7 = arrayList.get(i17);
                                    i17++;
                                    qi.a aVar3 = (qi.a) obj7;
                                    if (aVar3.f47798a == 0 && aVar3.f47800c == 9) {
                                        arrayList6.add(obj7);
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList();
                                int size5 = arrayList.size();
                                int i18 = 0;
                                while (i18 < size5) {
                                    Object obj8 = arrayList.get(i18);
                                    i18++;
                                    qi.a aVar4 = (qi.a) obj8;
                                    if (aVar4.f47798a == 0 && aVar4.f47800c == 10) {
                                        arrayList7.add(obj8);
                                    }
                                }
                                arrayList5.size();
                                arrayList6.size();
                                arrayList7.size();
                                return qy.b0.f48488a;
                            }
                            Object obj9 = arrayList2.get(i14);
                            i14++;
                            Word word = (Word) obj9;
                            int size6 = arrayList.size();
                            ?? r13 = z11;
                            while (true) {
                                if (r13 < size6) {
                                    Object obj10 = arrayList.get(r13);
                                    int i19 = r13 + 1;
                                    qi.a aVar5 = (qi.a) obj10;
                                    i11 = size;
                                    if (aVar5.f47798a == 0 && aVar5.f47799b == word.getWordId()) {
                                        obj4 = obj10;
                                    } else {
                                        size = i11;
                                        r13 = i19;
                                    }
                                } else {
                                    i11 = size;
                                }
                            }
                            if (obj4 == null) {
                                arrayList3.add(obj9);
                            }
                            size = i11;
                            z11 = false;
                        }
                        break;
                    } else {
                        Lesson lesson = (Lesson) it2.next();
                        if (lesson != null && (lastRegex = lesson.getLastRegex()) != null && lastRegex.length() != 0) {
                            a5.f fVar = new a5.f(i13, z11);
                            String lastRegex2 = lesson.getLastRegex();
                            kotlin.jvm.internal.m.e(lastRegex2, "getLastRegex(...)");
                            arrayList.addAll(fVar.t(lastRegex2, String.valueOf(lesson.getLessonId())));
                        }
                    }
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Word it3 = (Word) obj;
                int i21 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f(it3, "it");
                return String.valueOf(it3.getWordId());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Sentence it4 = (Sentence) obj;
                int i22 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f(it4, "it");
                return String.valueOf(it4.getSentenceId());
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                int i23 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f((View) obj, "it");
                boolean z12 = xt.b.f56282d;
                xt.b.f56282d = !z12;
                if (z12) {
                    ff.h.C("只做一题已关闭");
                } else {
                    ff.h.C("只做一题已打开");
                }
                return qy.b0.f48488a;
            case 27:
                int i24 = UpdateLessonActivity.W;
                kotlin.jvm.internal.m.f((View) obj, "it");
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Byte b3 = (Byte) obj;
                b3.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b3}, 1));
            default:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
        }
    }
}
