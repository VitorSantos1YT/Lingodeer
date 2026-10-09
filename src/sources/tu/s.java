package tu;

import android.os.CountDownTimer;
import androidx.lifecycle.ViewModel;
import com.adjust.sdk.Constants;
import java.util.Calendar;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Calendar f52621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Calendar f52622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewModel f52623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Calendar calendar, Calendar calendar2, ViewModel viewModel, long j11, int i11) {
        super(j11, 3600000L);
        this.f52620a = i11;
        this.f52621b = calendar;
        this.f52622c = calendar2;
        this.f52623d = viewModel;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        int i11 = this.f52620a;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j11) {
        switch (this.f52620a) {
            case 0:
                long timeInMillis = this.f52621b.getTimeInMillis() - this.f52622c.getTimeInMillis();
                long j12 = 86400000;
                long j13 = timeInMillis / j12;
                long j14 = (timeInMillis % j12) / ((long) Constants.ONE_HOUR);
                i1 i1Var = ((t) this.f52623d).f52625b;
                qy.l lVar = new qy.l(Long.valueOf(j13), Long.valueOf(j14));
                i1Var.getClass();
                i1Var.l(null, lVar);
                break;
            default:
                long timeInMillis2 = this.f52621b.getTimeInMillis() - this.f52622c.getTimeInMillis();
                long j15 = 86400000;
                long j16 = timeInMillis2 / j15;
                long j17 = (timeInMillis2 % j15) / ((long) Constants.ONE_HOUR);
                i1 i1Var2 = ((m0) this.f52623d).H;
                qy.l lVar2 = new qy.l(Long.valueOf(j16), Long.valueOf(j17));
                i1Var2.getClass();
                i1Var2.l(null, lVar2);
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
