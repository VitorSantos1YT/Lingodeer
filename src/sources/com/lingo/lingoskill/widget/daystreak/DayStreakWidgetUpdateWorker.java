package com.lingo.lingoskill.widget.daystreak;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bumptech.glide.e;
import fb.u;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import qy.o;
import vy.d;
import wy.a;
import xq.i;
import xq.l;
import xy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DayStreakWidgetUpdateWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayStreakWidgetUpdateWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        m.f(appContext, "appContext");
        m.f(workerParams, "workerParams");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d dVar) throws Throwable {
        l lVar;
        Object objL;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i11 = lVar.f56194c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f56194c = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, (c) dVar);
            }
        } else {
            lVar = new l(this, (c) dVar);
        }
        Object obj = lVar.f56192a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = lVar.f56194c;
        try {
            if (i12 == 0) {
                e.F(obj);
                i iVar = i.f56187b;
                Context context = this.f27110a;
                m.e(context, "getApplicationContext(...)");
                lVar.f56194c = 1;
                if (iVar.c(context, lVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.F(obj);
            }
            objL = u.a();
        } catch (Throwable th2) {
            objL = e.l(th2);
        }
        Throwable thA = o.a(objL);
        if (thA == null) {
            return objL;
        }
        if (thA instanceof CancellationException) {
            throw thA;
        }
        return u.a();
    }
}
