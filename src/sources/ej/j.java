package ej;

import android.os.Build;
import android.util.Log;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.a2;
import n5.x0;
import n9.f0;
import qy.o;
import ry.r;
import ry.v;
import rz.b0;
import uz.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25691b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f25690a = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25690a) {
            case 0:
                j jVar = new j(2, 0, dVar);
                jVar.f25691b = obj;
                return jVar;
            case 1:
                j jVar2 = new j(2, 1, dVar);
                jVar2.f25691b = obj;
                return jVar2;
            case 2:
                j jVar3 = new j(2, 2, dVar);
                jVar3.f25691b = obj;
                return jVar3;
            case 3:
                j jVar4 = new j(2, 3, dVar);
                jVar4.f25691b = obj;
                return jVar4;
            case 4:
                j jVar5 = new j(2, 4, dVar);
                jVar5.f25691b = obj;
                return jVar5;
            default:
                j jVar6 = new j(2, 5, dVar);
                jVar6.f25691b = obj;
                return jVar6;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25690a) {
            case 0:
                return ((j) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((j) create((a2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((j) create((x0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((j) create((v) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                j jVar = (j) create((f0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                jVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                return ((j) create((z0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        boolean z11 = false;
        switch (this.f25690a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                try {
                    if (dj.b.f23431e == null) {
                        synchronized (dj.b.class) {
                            if (dj.b.f23431e == null) {
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                m.c(lingoSkillApplication);
                                dj.b.f23431e = new dj.b(lingoSkillApplication);
                            }
                        }
                    }
                    dj.b bVar = dj.b.f23431e;
                    m.c(bVar);
                    objL = bVar.a();
                    break;
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                return o.a(objL) == null ? (List) objL : r.f50854a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(((a2) this.f25691b) == a2.ShutDown);
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(!(((x0) this.f25691b) instanceof n5.f0));
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(((v) this.f25691b) != null);
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                f0 f0Var = (f0) this.f25691b;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    z11 = true;
                }
                if (z11) {
                    String message = "Sent " + f0Var;
                    m.f(message, "message");
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(((z0) this.f25691b) != z0.START);
        }
    }
}
