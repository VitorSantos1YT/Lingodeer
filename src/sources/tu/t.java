package tu;

import androidx.lifecycle.ViewModel;
import com.adjust.sdk.Constants;
import java.util.Calendar;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f52624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f52625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f52626c;

    public t() {
        i1 i1VarC = x0.c(new qy.l(0L, 0L));
        this.f52625b = i1VarC;
        this.f52626c = i1VarC;
        Calendar calendar = Calendar.getInstance();
        Object objClone = calendar.clone();
        kotlin.jvm.internal.m.d(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) objClone;
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        int i11 = (9 - calendar2.get(7)) % 7;
        calendar2.add(6, i11 != 0 ? i11 : 7);
        this.f52624a = new s(calendar2, calendar, this, calendar2.getTimeInMillis(), 0);
        long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        long j11 = 86400000;
        i1VarC.l(null, new qy.l(Long.valueOf(timeInMillis / j11), Long.valueOf((timeInMillis % j11) / ((long) Constants.ONE_HOUR))));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        s sVar = this.f52624a;
        if (sVar != null) {
            sVar.cancel();
        }
    }
}
