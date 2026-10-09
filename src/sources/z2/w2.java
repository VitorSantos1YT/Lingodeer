package z2;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wz.d f58699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.f f58700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.d2 f58701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f58702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f58703e;

    public w2(wz.d dVar, l1.f fVar, l1.d2 d2Var, kotlin.jvm.internal.y yVar, View view) {
        this.f58699a = dVar;
        this.f58700b = fVar;
        this.f58701c = d2Var;
        this.f58702d = yVar;
        this.f58703e = view;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        boolean z11;
        rz.l lVarY = null;
        switch (u2.f58682a[event.ordinal()]) {
            case 1:
                rz.e0.B(this.f58699a, null, rz.d0.UNDISPATCHED, new v2(this.f58702d, this.f58701c, lifecycleOwner, this, this.f58703e, null), 1);
                return;
            case 2:
                l1.f fVar = this.f58700b;
                if (fVar != null) {
                    bq.f fVar2 = (bq.f) fVar.f39290c;
                    synchronized (fVar2.f4944b) {
                        try {
                            synchronized (fVar2.f4944b) {
                                z11 = fVar2.f4943a;
                            }
                            if (!z11) {
                                ArrayList arrayList = (ArrayList) fVar2.f4946d;
                                fVar2.f4946d = (ArrayList) fVar2.f4945c;
                                fVar2.f4945c = arrayList;
                                fVar2.f4943a = true;
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    ((vy.d) arrayList.get(i11)).resumeWith(qy.b0.f48488a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                l1.d2 d2Var = this.f58701c;
                synchronized (d2Var.f39259d) {
                    if (d2Var.f39275u) {
                        d2Var.f39275u = false;
                        lVarY = d2Var.y();
                    }
                    break;
                }
                if (lVarY != null) {
                    ((rz.m) lVarY).resumeWith(qy.b0.f48488a);
                    return;
                }
                return;
            case 3:
                l1.d2 d2Var2 = this.f58701c;
                synchronized (d2Var2.f39259d) {
                    d2Var2.f39275u = true;
                }
                return;
            case 4:
                this.f58701c.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
