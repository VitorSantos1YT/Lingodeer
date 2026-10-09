package b0;

import android.content.Context;
import android.media.MediaRecorder;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.ExoPlayer;
import dt.h5;
import dt.p4;
import dt.x4;
import dt.y4;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l1.b3;
import rt.e3;
import rt.v2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3598c;

    public /* synthetic */ l0(int i11, Object obj, Object obj2) {
        this.f3596a = i11;
        this.f3597b = obj;
        this.f3598c = obj2;
    }

    @Override // l1.i0
    public final void dispose() {
        MediaRecorder mediaRecorder;
        int i11 = this.f3596a;
        vy.d dVar = null;
        Object obj = this.f3598c;
        Object obj2 = this.f3597b;
        switch (i11) {
            case 0:
                ((j0) obj2).f3569a.k((h0) obj);
                break;
            case 1:
                ((c2) obj2).f3467j.remove((c2) obj);
                break;
            case 2:
                c2 c2Var = (c2) obj2;
                c2Var.getClass();
                u1 u1Var = (u1) ((v1) obj).f3713b.getValue();
                if (u1Var != null) {
                    c2Var.f3466i.remove(u1Var.f3700a);
                }
                break;
            case 3:
                ((c2) obj2).f3466i.remove((y1) obj);
                break;
            case 4:
                ((LifecycleOwner) obj2).getLifecycle().removeObserver((androidx.lifecycle.compose.g) obj);
                break;
            case 5:
                ((LifecycleOwner) obj2).getLifecycle().removeObserver((p4) obj);
                break;
            case 6:
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                try {
                    y4.b((h5) obj);
                    exoPlayer.o(null);
                    exoPlayer.stop();
                    exoPlayer.release();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 7:
                ((ExoPlayer) obj2).B((x4) obj);
                break;
            case 8:
                j9.v vVar = (j9.v) obj2;
                vVar.getClass();
                m9.g gVar = vVar.f36257b;
                gVar.getClass();
                gVar.f41084p.remove((gr.r) obj);
                break;
            case 9:
                j0.o2 o2Var = (j0.o2) obj2;
                View view = (View) obj;
                int i12 = o2Var.f35372t - 1;
                o2Var.f35372t = i12;
                if (i12 == 0) {
                    WeakHashMap weakHashMap = z4.s0.f58893a;
                    z4.j0.m(view, null);
                    z4.s0.s(view, null);
                    view.removeOnAttachStateChangeListener(o2Var.f35373u);
                }
                break;
            case 10:
                ((j9.e) obj2).H.f41060j.removeObserver((k9.k) obj);
                break;
            case 11:
                Iterator it = ((List) ((b3) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((k9.i) obj).b().c((j9.e) it.next());
                }
                break;
            case 12:
                av.n nVar = (av.n) ((l1.b1) obj2).getValue();
                if (nVar != null) {
                    nVar.b();
                }
                av.b bVar = (av.b) ((l1.b1) obj).getValue();
                if (bVar != null && (mediaRecorder = bVar.f3110c) != null) {
                    mediaRecorder.reset();
                    bVar.f3110c.release();
                    bVar.f3110c = null;
                    break;
                }
                break;
            case 13:
                ((av.n) obj2).b();
                e3 e3Var = (e3) obj;
                e3Var.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(e3Var), null, null, new v2(e3Var, dVar, 0), 3);
                break;
            case 14:
                ((n0.x0) obj2).f43028c.j(obj);
                break;
            case 15:
                l1.b1 b1Var = (l1.b1) obj2;
                h0.k kVar = (h0.k) b1Var.getValue();
                if (kVar != null) {
                    h0.j jVar = new h0.j(kVar);
                    h0.i iVar = (h0.i) obj;
                    if (iVar != null) {
                        iVar.b(jVar);
                    }
                    b1Var.setValue(null);
                }
                break;
            case 16:
                ((s0.q1) obj2).f51145c.remove((fz.c) obj);
                break;
            case 17:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((z2.i0) obj);
                break;
            default:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((z2.j0) obj);
                break;
        }
    }
}
