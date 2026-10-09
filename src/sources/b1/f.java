package b1;

import android.os.Looper;
import android.view.View;
import b7.a0;
import b7.f0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import f7.g0;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3779c;

    public /* synthetic */ f(g0 g0Var, int i11, boolean z11) {
        this.f3777a = 2;
        this.f3779c = g0Var;
        this.f3778b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f3777a;
        int i12 = this.f3778b;
        Object obj = this.f3779c;
        switch (i11) {
            case 0:
                ((IntConsumer) obj).accept(i12);
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.R.get();
                if (view != null) {
                    sideSheetBehavior.A(view, i12, false);
                }
                break;
            case 2:
                g0 g0Var = (g0) obj;
                g7.f fVar = g0Var.Y;
                int i13 = ((f7.e) g0Var.f26741a[i12].f26734e).f26700b;
                fVar.N(fVar.M(), 1033, new g2.a(19));
                break;
            case 3:
                f7.x xVar = (f7.x) ((ob.l) obj).f44823c;
                String str = f0.f3975a;
                b7.c cVar = xVar.f26935a.f26644i0;
                f7.w wVar = new f7.w(i12);
                cVar.getClass();
                int i14 = 1;
                b7.a.j(Looper.myLooper() == ((a0) cVar.f3960c).f3950a.getLooper());
                cVar.f3958a++;
                cVar.d(new b2.c(i14, cVar, wVar));
                cVar.i(Integer.valueOf(i12));
                break;
            case 4:
                ((q4.a) obj).i(i12);
                break;
            default:
                ((z6.a) obj).f58927b.onAudioFocusChange(i12);
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i11, int i12) {
        this.f3777a = i12;
        this.f3779c = obj;
        this.f3778b = i11;
    }
}
