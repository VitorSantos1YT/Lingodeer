package mt;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.ie;
import rt.je;
import rt.ke;
import rt.le;
import rt.se;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.a2 f41476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41477c;

    public /* synthetic */ g1(rt.a2 a2Var, l1.b1 b1Var, int i11) {
        this.f41475a = i11;
        this.f41476b = a2Var;
        this.f41477c = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f41475a) {
            case 0:
                se filter = (se) obj;
                kotlin.jvm.internal.m.f(filter, "filter");
                rt.a2 a2Var = this.f41476b;
                uz.i1 i1Var = a2Var.K;
                if (!kotlin.jvm.internal.m.a(i1Var.getValue(), filter)) {
                    i1Var.l(null, filter);
                    a2Var.h((List) a2Var.f49421d.getValue(), (String) a2Var.H.getValue(), (ke) a2Var.f49423f.getValue(), filter);
                }
                this.f41477c.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            default:
                r6 selection = (r6) obj;
                kotlin.jvm.internal.m.f(selection, "selection");
                this.f41477c.setValue(Boolean.FALSE);
                boolean z11 = selection instanceof q6;
                rt.a2 a2Var2 = this.f41476b;
                if (z11) {
                    je jeVar = ((q6) selection).f41814a;
                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                    Instant instantNow = Instant.now();
                    LocalDate localDateL = instantNow.atZone(zoneIdSystemDefault).l();
                    ie ieVar = new ie(jeVar.e(), jeVar.c());
                    kotlin.jvm.internal.m.c(localDateL);
                    kotlin.jvm.internal.m.c(zoneIdSystemDefault);
                    a2Var2.a(ieVar, localDateL, instantNow, zoneIdSystemDefault);
                } else {
                    if (!(selection instanceof p6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    le leVar = ((p6) selection).f41776a;
                    ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
                    Instant instantNow2 = Instant.now();
                    LocalDate localDateL2 = instantNow2.atZone(zoneIdSystemDefault2).l();
                    kotlin.jvm.internal.m.c(localDateL2);
                    long j11 = leVar.f50034a;
                    long j12 = leVar.f50035b;
                    long jMin = Math.min(j11, j12);
                    long jMax = Math.max(j11, j12);
                    int iN = (int) hz.b.n(jMin - localDateL2.toEpochDay(), 0L, 2147483647L);
                    ie ieVar2 = new ie(iN, Integer.valueOf((int) hz.b.n(jMax - localDateL2.toEpochDay(), iN, 2147483647L)));
                    kotlin.jvm.internal.m.c(zoneIdSystemDefault2);
                    a2Var2.a(ieVar2, localDateL2, instantNow2, zoneIdSystemDefault2);
                }
                return qy.b0.f48488a;
        }
    }
}
