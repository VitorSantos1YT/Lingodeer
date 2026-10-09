package mt;

import h1.t7;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalDate f41372a;

    public e0(LocalDate localDate) {
        this.f41372a = localDate;
    }

    @Override // h1.t7
    public final boolean a(long j11) {
        return f0.h(j11).toEpochDay() >= this.f41372a.toEpochDay();
    }

    @Override // h1.t7
    public final boolean b(int i11) {
        return i11 >= this.f41372a.getYear();
    }
}
