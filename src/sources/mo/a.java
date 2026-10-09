package mo;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
import o20.w;
import ob.d;
import wc.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41170c;

    public /* synthetic */ a(Object obj, int i11, int i12) {
        this.f41168a = i12;
        this.f41170c = obj;
        this.f41169b = i11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f41168a) {
            case 0:
                int i11 = ((bm.a) this.f41170c).f4463e;
                int i12 = this.f41169b;
                switch (i11) {
                    case 0:
                        return hz.b.C(i12);
                    case 1:
                        return hz.b.E(i12);
                    case 2:
                        return hz.b.y(i12);
                    case 3:
                        return hz.b.H(i12);
                    case 4:
                        return hz.b.A(i12);
                    case 5:
                        return hz.b.D(i12);
                    case 6:
                        return hz.b.z(i12);
                    case 7:
                        return hz.b.B(i12);
                    default:
                        return hz.b.F(i12);
                }
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) ((w) this.f41170c).f44617b;
                Long lJ = workDatabase.A().j("next_job_scheduler_id");
                int i13 = 0;
                int iLongValue = lJ != null ? (int) lJ.longValue() : 0;
                workDatabase.A().k(new d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f41169b) {
                    workDatabase.A().k(new d("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i13 = iLongValue;
                }
                return Integer.valueOf(i13);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f41170c;
                boolean z11 = lottieAnimationView.L;
                int i14 = this.f41169b;
                if (!z11) {
                    return l.g(i14, lottieAnimationView.getContext(), null);
                }
                Context context = lottieAnimationView.getContext();
                return l.g(i14, context, l.l(context, i14));
        }
    }
}
