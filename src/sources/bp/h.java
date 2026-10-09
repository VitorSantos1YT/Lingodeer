package bp;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.Unit;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements tx.c, tx.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f4607b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f4608c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f4609d = new h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f4610e = new h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f4611f = new h(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f4612t = new h(5);
    public static final h H = new h(6);
    public static final h K = new h(7);
    public static final h L = new h(8);
    public static final h M = new h(9);
    public static final h N = new h(10);

    public /* synthetic */ h(int i11) {
        this.f4613a = i11;
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f4613a) {
            case 0:
                Throwable p4 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                p4.printStackTrace();
                break;
            case 1:
                Throwable p11 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                p11.printStackTrace();
                break;
            case 2:
                Throwable p12 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p12, "p0");
                p12.printStackTrace();
                break;
            case 3:
                Throwable p13 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p13, "p0");
                p13.printStackTrace();
                break;
            case 4:
            default:
                ff.h.C("Finish!");
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                cf.x.n();
                break;
            case 5:
                Throwable p14 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p14, "p0");
                p14.printStackTrace();
                break;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                fv.c cVar = new fv.c();
                kotlin.jvm.internal.m.c(arrayList);
                cVar.c(arrayList, new q5(0), false);
                break;
            case 7:
                Throwable p15 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p15, "p0");
                p15.printStackTrace();
                break;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                fv.c cVar2 = new fv.c();
                kotlin.jvm.internal.m.c(arrayList2);
                cVar2.c(arrayList2, new q5(1), false);
                break;
            case 9:
                Throwable p16 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p16, "p0");
                p16.printStackTrace();
                break;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            kotlin.jvm.internal.m.e(obj2, "next(...)");
            String lessonList = ((Unit) obj2).getLessonList();
            kotlin.jvm.internal.m.e(lessonList, "getLessonList(...)");
            int i11 = 0;
            List listW0 = oz.q.W0(lessonList, new String[]{";"}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listW0) {
                if (((String) obj3).length() > 0) {
                    arrayList2.add(obj3);
                }
            }
            int size = arrayList2.size();
            while (i11 < size) {
                Object obj4 = arrayList2.get(i11);
                i11++;
                long j11 = Long.parseLong((String) obj4);
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
                Object objLoad = dVar.p().load(Long.valueOf(j11));
                kotlin.jvm.internal.m.e(objLoad, "load(...)");
                arrayList.add((Lesson) objLoad);
            }
        }
        return arrayList;
    }
}
