package jp;

import android.os.CountDownTimer;
import androidx.lifecycle.ViewModelKt;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;
import gp.l1;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AdVideoPromptActivity adVideoPromptActivity, long j11, int i11) {
        super(j11, 10L);
        this.f36515a = i11;
        this.f36516b = adVideoPromptActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f36515a) {
            case 0:
                AdVideoPromptActivity adVideoPromptActivity = (AdVideoPromptActivity) this.f36516b;
                ((hj.g) adVideoPromptActivity.j()).f32587d.setVisibility(8);
                ((hj.g) adVideoPromptActivity.j()).f32585b.setVisibility(0);
                break;
            case 1:
                AdVideoPromptActivity adVideoPromptActivity2 = (AdVideoPromptActivity) this.f36516b;
                ((hj.g) adVideoPromptActivity2.j()).f32587d.setVisibility(8);
                ((hj.g) adVideoPromptActivity2.j()).f32585b.setVisibility(0);
                break;
            default:
                l1 l1Var = (l1) this.f36516b;
                uz.i1 i1Var = l1Var.f29436c;
                i1Var.getClass();
                i1Var.l(null, "00 : 00 : 00");
                rz.e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new gp.o0(l1Var, null, 3), 3);
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j11) {
        switch (this.f36515a) {
            case 0:
                ((hj.g) ((AdVideoPromptActivity) this.f36516b).j()).f32587d.setProgress(j11);
                break;
            case 1:
                ((hj.g) ((AdVideoPromptActivity) this.f36516b).j()).f32587d.setProgress(j11);
                break;
            default:
                uz.i1 i1Var = ((l1) this.f36516b).f29436c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long days = timeUnit.toDays(j11);
                long millis = j11 - TimeUnit.DAYS.toMillis(days);
                long hours = timeUnit.toHours(millis);
                long millis2 = millis - TimeUnit.HOURS.toMillis(hours);
                long minutes = timeUnit.toMinutes(millis2);
                long seconds = timeUnit.toSeconds(millis2 - TimeUnit.MINUTES.toMillis(minutes));
                String str = days >= 2 ? String.format("%02d : %02d : %02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3)) : String.format("%02d : %02d : %02d", Arrays.copyOf(new Object[]{Long.valueOf((days * ((long) 24)) + hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3));
                i1Var.getClass();
                i1Var.l(null, str);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j11, l1 l1Var) {
        super(j11, 1000L);
        this.f36515a = 2;
        this.f36516b = l1Var;
    }
}
