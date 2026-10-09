package com.google.firebase.inappmessaging;

import c3.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.k;
import com.google.firebase.inappmessaging.internal.m;
import com.google.firebase.installations.FirebaseInstallationsApi;
import ex.f0;
import ex.f1;
import ex.i;
import ex.i0;
import ex.n0;
import ex.r;
import ex.s0;
import ex.u;
import ex.z;
import java.util.concurrent.Executor;
import nx.c;
import uw.d;
import uw.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInAppMessaging {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCallbacksFactory f19701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeveloperListenerManager f19702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseInstallationsApi f19703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f19704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f19705e;

    /* JADX WARN: Code duplicated, block: B:12:0x0097  */
    /* JADX WARN: Code duplicated, block: B:14:0x009f  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    public FirebaseInAppMessaging(InAppMessageStreamManager inAppMessageStreamManager, FirebaseInstallationsApi firebaseInstallationsApi, DisplayCallbacksFactory displayCallbacksFactory, DeveloperListenerManager developerListenerManager, Executor executor) throws Exception {
        d f0Var;
        d dVar;
        i0 i0Var;
        m mVar;
        d iVar;
        Object objCall;
        this.f19703c = firebaseInstallationsApi;
        this.f19701a = displayCallbacksFactory;
        this.f19702b = developerListenerManager;
        this.f19705e = executor;
        firebaseInstallationsApi.getId().addOnSuccessListener(executor, new a(27));
        Schedulers schedulers = inAppMessageStreamManager.f20017f;
        f1 f1Var = inAppMessageStreamManager.f20012a;
        f1 f1Var2 = inAppMessageStreamManager.f20021j.f19951b;
        f1 f1Var3 = inAppMessageStreamManager.f20013b;
        int i11 = d.f53244a;
        ax.d.a(f1Var, "source1 is null");
        ax.d.a(f1Var2, "source2 is null");
        ax.d.a(f1Var3, "source3 is null");
        int i12 = 1;
        n0 n0Var = new n0(new n20.a[]{f1Var, f1Var2, f1Var3}, 0);
        int i13 = d.f53244a;
        ax.d.b(3, "maxConcurrency");
        ax.d.b(i13, "bufferSize");
        if (n0Var instanceof bx.e) {
            Object objCall2 = ((bx.e) n0Var).call();
            if (objCall2 == null) {
                dVar = z.f26099b;
            } else {
                f0Var = new r(i12, objCall2, ax.d.f3260a);
            }
            u uVar = new u(dVar, new k(7));
            n nVar = schedulers.f20067a;
            ax.d.a(nVar, "scheduler is null");
            ax.d.b(i13, "bufferSize");
            i0Var = new i0(uVar, nVar, i13);
            mVar = new m(inAppMessageStreamManager, i12);
            ax.d.b(2, "prefetch");
            if (i0Var instanceof bx.e) {
                objCall = ((bx.e) i0Var).call();
                if (objCall == null) {
                    iVar = z.f26099b;
                } else {
                    iVar = new r(i12, objCall, mVar);
                }
            } else {
                iVar = new i(i0Var, mVar, c.IMMEDIATE);
            }
            n nVar2 = schedulers.f20068b;
            ax.d.a(nVar2, "scheduler is null");
            ax.d.b(i13, "bufferSize");
            i0 i0Var2 = new i0(iVar, nVar2, i13);
            com.google.firebase.database.android.d dVar2 = new com.google.firebase.database.android.d(this, i12);
            s0 s0Var = s0.INSTANCE;
            ax.d.a(s0Var, "onSubscribe is null");
            i0Var2.d(new lx.c(dVar2, s0Var));
        }
        f0Var = new f0(n0Var, i13);
        dVar = f0Var;
        u uVar2 = new u(dVar, new k(7));
        n nVar3 = schedulers.f20067a;
        ax.d.a(nVar3, "scheduler is null");
        ax.d.b(i13, "bufferSize");
        i0Var = new i0(uVar2, nVar3, i13);
        mVar = new m(inAppMessageStreamManager, i12);
        ax.d.b(2, "prefetch");
        if (i0Var instanceof bx.e) {
            objCall = ((bx.e) i0Var).call();
            if (objCall == null) {
                iVar = z.f26099b;
            } else {
                iVar = new r(i12, objCall, mVar);
            }
        } else {
            iVar = new i(i0Var, mVar, c.IMMEDIATE);
        }
        n nVar4 = schedulers.f20068b;
        ax.d.a(nVar4, "scheduler is null");
        ax.d.b(i13, "bufferSize");
        i0 i0Var3 = new i0(iVar, nVar4, i13);
        com.google.firebase.database.android.d dVar3 = new com.google.firebase.database.android.d(this, i12);
        s0 s0Var2 = s0.INSTANCE;
        ax.d.a(s0Var2, "onSubscribe is null");
        i0Var3.d(new lx.c(dVar3, s0Var2));
    }
}
