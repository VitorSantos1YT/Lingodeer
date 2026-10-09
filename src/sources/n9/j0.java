package n9;

import android.os.Build;
import android.util.Log;
import androidx.drawerlayout.widget.ktFt.FpIL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import mt.j5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1.s0 f43603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7.j f43604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.u f43605c = new ob.u(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ob.u f43606d = new ob.u(22);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i f43607e = m.d(new kb.e(this, (vy.d) null, 25));

    public j0(d1.s0 s0Var, c7.j jVar) {
        this.f43603a = s0Var;
        this.f43604b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(j0 j0Var, gh.o oVar, xy.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i11 = i0Var.f43590e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i0Var.f43590e = i11 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(j0Var, cVar);
            }
        } else {
            i0Var = new i0(j0Var, cVar);
        }
        Object objInvoke = i0Var.f43588c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = i0Var.f43590e;
        boolean z11 = true;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objInvoke);
            d1.s0 s0Var = j0Var.f43603a;
            i0Var.f43586a = j0Var;
            i0Var.f43587b = oVar;
            i0Var.f43590e = 1;
            objInvoke = s0Var.invoke(i0Var);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = i0Var.f43587b;
            j0Var = i0Var.f43586a;
            com.bumptech.glide.e.F(objInvoke);
        }
        j0 j0Var2 = j0Var;
        gh.o oVar2 = (gh.o) objInvoke;
        if (oVar2 == oVar) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
        }
        j5 j5Var = new j5(0, j0Var2, j0.class, "invalidate", "invalidate()V", 0, 6);
        oVar2.getClass();
        ie.o oVar3 = oVar2.f29234a;
        oVar3.getClass();
        if (oVar3.f34405b) {
            j5Var.invoke();
        } else {
            ReentrantLock reentrantLock = (ReentrantLock) oVar3.f34406c;
            try {
                reentrantLock.lock();
                if (!oVar3.f34405b) {
                    ((ArrayList) oVar3.f34407d).add(j5Var);
                    z11 = false;
                }
                if (z11) {
                    j5Var.invoke();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (oVar != null) {
            j5 j5Var2 = new j5(0, j0Var2, j0.class, "invalidate", "invalidate()V", 0, 7);
            ie.o oVar4 = oVar.f29234a;
            ReentrantLock reentrantLock2 = (ReentrantLock) oVar4.f34406c;
            try {
                reentrantLock2.lock();
                ((ArrayList) oVar4.f34407d).remove(j5Var2);
                reentrantLock2.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        }
        if (oVar != null) {
            ie.o oVar5 = oVar.f29234a;
            ArrayList arrayList = (ArrayList) oVar5.f34407d;
            boolean z12 = false;
            if (!oVar5.f34405b) {
                ReentrantLock reentrantLock3 = (ReentrantLock) oVar5.f34406c;
                try {
                    reentrantLock3.lock();
                    if (oVar5.f34405b) {
                        reentrantLock3.unlock();
                    } else {
                        z12 = true;
                        oVar5.f34405b = true;
                        List<fz.a> listA1 = ry.m.a1(arrayList);
                        arrayList.clear();
                        reentrantLock3.unlock();
                        for (fz.a aVar2 : listA1) {
                            kotlin.jvm.internal.m.f(aVar2, FpIL.aEmN);
                            aVar2.invoke();
                        }
                    }
                } catch (Throwable th3) {
                    reentrantLock3.unlock();
                    throw th3;
                }
            }
            if (z12 && Build.ID != null && Log.isLoggable("Paging", 3)) {
                String message = "Invalidated PagingSource " + oVar;
                kotlin.jvm.internal.m.f(message, "message");
            }
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            String message2 = "Generated new PagingSource " + oVar2;
            kotlin.jvm.internal.m.f(message2, "message");
        }
        return oVar2;
    }
}
