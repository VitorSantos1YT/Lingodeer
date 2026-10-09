package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bumptech.glide.e;
import fb.j;
import fb.t;
import fr.j3;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.f;
import m6.h;
import m6.n;
import m6.o;
import m6.u;
import rz.o0;
import rz.y;
import vy.d;
import wy.a;
import wz.m;
import xy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WorkerParameters f2017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f2018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f2019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f2020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2021k;

    public SessionWorker(Context context, WorkerParameters workerParameters, h hVar, u uVar, y yVar) {
        super(context, workerParameters);
        this.f2017g = workerParameters;
        this.f2018h = hVar;
        this.f2019i = uVar;
        this.f2020j = yVar;
        j jVar = this.f27111b.f2788b;
        hVar.getClass();
        Object obj = jVar.f27096a.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.f2021k = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(d dVar) {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i11 = oVar.f40914c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f40914c = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, (c) dVar);
            }
        } else {
            oVar = new o(this, (c) dVar);
        }
        Object objD = oVar.f40912a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = oVar.f40914c;
        if (i12 == 0) {
            e.F(objD);
            h2.d dVar2 = this.f2019i.f40930d;
            kb.e eVar = new kb.e(this, (d) null, 12);
            oVar.f40914c = 1;
            objD = vc.a.D(dVar2, eVar, oVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(objD);
        }
        fb.u uVar = (fb.u) objD;
        if (uVar != null) {
            return uVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
        j jVar = new j(linkedHashMap);
        j3.V(jVar);
        return new t(jVar);
    }

    @Override // androidx.work.CoroutineWorker
    public final y d() {
        return this.f2020j;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, n.f40911a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, h hVar, u uVar, y yVar, int i11, f fVar) {
        h hVar2 = (i11 & 4) != 0 ? n.f40911a : hVar;
        u uVar2 = (i11 & 8) != 0 ? new u() : uVar;
        if ((i11 & 16) != 0) {
            yz.f fVar2 = o0.f50940a;
            yVar = m.f55536a;
        }
        this(context, workerParameters, hVar2, uVar2, yVar);
    }
}
