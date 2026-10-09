package jp;

import android.view.Choreographer;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.TravelCategory;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f36543a = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36543a) {
            case 0:
                return new t0(2, 0, dVar);
            case 1:
                return new t0(2, 1, dVar);
            case 2:
                return new t0(2, 2, dVar);
            case 3:
                return new t0(2, 3, dVar);
            case 4:
                return new t0(2, 4, dVar);
            case 5:
                return new t0(2, 5, dVar);
            case 6:
                return new t0(2, 6, dVar);
            case 7:
                return new t0(2, 7, dVar);
            case 8:
                return new t0(2, 8, dVar);
            default:
                return new t0(2, 9, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36543a) {
            case 0:
                t0 t0Var = (t0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                t0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                t0 t0Var2 = (t0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                t0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                ((t0) create((String) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
                return Boolean.TRUE;
            case 3:
                t0 t0Var3 = (t0) create((uz.j) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                t0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 4:
                t0 t0Var4 = (t0) create((uz.j) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                t0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 5:
                return ((t0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                t0 t0Var5 = (t0) create(bool, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                t0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 7:
                return ((t0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                t0 t0Var6 = (t0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                t0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            default:
                return ((t0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f36543a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                cf.x.n().hasFindPerfectTime = Boolean.TRUE;
                cf.x.n().updateEntry("hasFindPerfectTime");
                long jCurrentTimeMillis = System.currentTimeMillis();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                cf.x.n().learnAlarmTime = simpleDateFormat.format(new Date(jCurrentTimeMillis));
                cf.x.n().updateEntry("learnAlarmTime");
                er.c.h();
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.TRUE;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication2);
                            dj.b.f23431e = new dj.b(lingoSkillApplication2);
                        }
                        break;
                    }
                }
                dj.b bVar = dj.b.f23431e;
                kotlin.jvm.internal.m.c(bVar);
                List<TravelCategory> listA = bVar.a();
                ArrayList arrayList = new ArrayList(ry.n.W(listA, 10));
                for (TravelCategory travelCategory : listA) {
                    qy.q qVar = fv.b.f28186a;
                    w4.c.w(fv.b.T(travelCategory.getCategoryId()), 7L, fv.b.S(travelCategory.getCategoryId()), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    if (!new File(((fv.a) obj2).f28184c).exists()) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                return cf.x.n().jpSyllableWritingFinishedLessons;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
            default:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Choreographer.getInstance();
        }
    }
}
