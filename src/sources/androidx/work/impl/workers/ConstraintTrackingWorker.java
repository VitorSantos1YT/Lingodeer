package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b0.g;
import com.bumptech.glide.e;
import ed.c;
import fb.l;
import fb.r;
import fb.u;
import fb.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import jr.i0;
import kotlin.jvm.internal.m;
import mb.i;
import mv.f0;
import ob.p;
import ob.s;
import rb.b;
import rb.f;
import rz.e0;
import rz.y;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WorkerParameters f2813g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        m.f(appContext, "appContext");
        m.f(workerParameters, "workerParameters");
        this.f2813g = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, v vVar, c cVar, p pVar, xy.c cVar2) {
        b bVar;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i11 = bVar.f49062c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f49062c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(constraintTrackingWorker, cVar2);
            }
        } else {
            bVar = new b(constraintTrackingWorker, cVar2);
        }
        Object objL = bVar.f49060a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = bVar.f49062c;
        if (i12 == 0) {
            e.F(objL);
            g gVar = new g(vVar, cVar, pVar, (d) null, 8);
            bVar.f49062c = 1;
            objL = e0.l(gVar, bVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(objL);
        }
        m.e(objL, "delegate: ListenableWork….cancel()\n        }\n    }");
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object f(ConstraintTrackingWorker constraintTrackingWorker, xy.c cVar) {
        rb.c cVar2;
        v vVar;
        ConstraintTrackingWorker constraintTrackingWorker2;
        int i11;
        WorkerParameters workerParameters = constraintTrackingWorker.f2813g;
        Context applicationContext = constraintTrackingWorker.f27110a;
        WorkerParameters workerParameters2 = constraintTrackingWorker.f27111b;
        if (cVar instanceof rb.c) {
            cVar2 = (rb.c) cVar;
            int i12 = cVar2.f49067e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar2.f49067e = i12 - Integer.MIN_VALUE;
            } else {
                cVar2 = new rb.c(constraintTrackingWorker, cVar);
            }
        } else {
            cVar2 = new rb.c(constraintTrackingWorker, cVar);
        }
        rb.c cVar3 = cVar2;
        Object objM = cVar3.f49065c;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = cVar3.f49067e;
        if (i13 == 0) {
            e.F(objM);
            Object obj = workerParameters2.f2788b.f27096a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || str.length() == 0) {
                int i14 = f.f49073a;
                l.b().getClass();
                return new r();
            }
            gb.p pVarE = gb.p.E(applicationContext);
            m.e(pVarE, "getInstance(applicationContext)");
            s sVarE = pVarE.f28955c.E();
            String string = workerParameters2.f2787a.toString();
            m.e(string, "id.toString()");
            p pVarN = sVarE.n(string);
            if (pVarN == null) {
                return new r();
            }
            i iVar = pVarE.f28962j;
            m.e(iVar, "workManagerImpl.trackers");
            c cVar4 = new c(iVar);
            if (!cVar4.a(pVarN)) {
                int i15 = f.f49073a;
                l.b().getClass();
                return new fb.s();
            }
            int i16 = f.f49073a;
            l.b().getClass();
            try {
                l lVar = workerParameters2.f2793g;
                m.e(applicationContext, "applicationContext");
                v vVarA = lVar.a(applicationContext, str, workerParameters);
                o20.a aVar2 = workerParameters.f2792f.f47697d;
                m.e(aVar2, "workerParameters.taskExecutor.mainThreadExecutor");
                try {
                    y yVarP = e0.p(aVar2);
                    vVar = vVarA;
                    try {
                        i0 i0Var = new i0(constraintTrackingWorker, vVar, cVar4, pVarN, null, 21);
                        cVar3.f49063a = constraintTrackingWorker;
                        cVar3.f49064b = vVar;
                        cVar3.f49067e = 1;
                        objM = e0.M(yVarP, i0Var, cVar3);
                        if (objM == aVar) {
                            return aVar;
                        }
                        constraintTrackingWorker2 = constraintTrackingWorker;
                        return (u) objM;
                    } catch (CancellationException e8) {
                        e = e8;
                        constraintTrackingWorker2 = constraintTrackingWorker;
                    }
                } catch (CancellationException e10) {
                    e = e10;
                    vVar = vVarA;
                }
            } catch (Throwable unused) {
                int i17 = f.f49073a;
                l.b().getClass();
                pVarE.f28954b.getClass();
                return new r();
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v vVar2 = cVar3.f49064b;
            ConstraintTrackingWorker constraintTrackingWorker3 = cVar3.f49063a;
            try {
                e.F(objM);
                vVar = vVar2;
                constraintTrackingWorker2 = constraintTrackingWorker3;
                try {
                    return (u) objM;
                } catch (CancellationException e11) {
                    e = e11;
                }
            } catch (CancellationException e12) {
                e = e12;
                vVar = vVar2;
                constraintTrackingWorker2 = constraintTrackingWorker3;
            }
        }
        AtomicInteger atomicInteger = constraintTrackingWorker2.f27112c;
        AtomicInteger atomicInteger2 = constraintTrackingWorker2.f27112c;
        if (atomicInteger.get() != -256 || (e instanceof rb.a)) {
            if (Build.VERSION.SDK_INT < 31) {
                i11 = -512;
            } else if (atomicInteger2.get() != -256) {
                i11 = atomicInteger2.get();
            } else {
                if (!(e instanceof rb.a)) {
                    throw new IllegalStateException("Unreachable");
                }
                i11 = ((rb.a) e).f49059a;
            }
            vVar.f27112c.compareAndSet(-256, i11);
        }
        if (e instanceof rb.a) {
            return new fb.s();
        }
        throw e;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(d dVar) {
        ExecutorService backgroundExecutor = this.f27111b.f2790d;
        m.e(backgroundExecutor, "backgroundExecutor");
        return e0.M(e0.p(backgroundExecutor), new f0(this, null, 14), dVar);
    }
}
