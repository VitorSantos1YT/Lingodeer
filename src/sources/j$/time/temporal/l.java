package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35175b;

    public /* synthetic */ l(int i11, int i12) {
        this.f35174a = i12;
        this.f35175b = i11;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        switch (this.f35174a) {
            case 0:
                int i11 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i12 = this.f35175b;
                if (i11 == i12) {
                    return temporal;
                }
                int i13 = i11 - i12;
                return temporal.b(i13 >= 0 ? 7 - i13 : -i13, ChronoUnit.DAYS);
            default:
                int i14 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i15 = this.f35175b;
                if (i14 == i15) {
                    return temporal;
                }
                int i16 = i15 - i14;
                return temporal.c(i16 >= 0 ? 7 - i16 : -i16, ChronoUnit.DAYS);
        }
    }
}
