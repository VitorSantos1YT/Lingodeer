package com.google.android.gms.measurement.internal;

import aj.uZCn.evRpcb;
import com.google.android.gms.internal.measurement.zzahn;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzac extends zzab {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzfn f12610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzad f12611h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzad zzadVar, String str, int i11, com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        super(str, i11);
        this.f12611h = zzadVar;
        this.f12610g = zzfnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int a() {
        return this.f12610g.z();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean c() {
        return false;
    }

    public final boolean g(Long l9, Long l11, com.google.android.gms.internal.measurement.zziu zziuVar, boolean z11) {
        boolean z12;
        boolean z13;
        Boolean boolD;
        Boolean boolF;
        Boolean boolF2;
        Boolean boolF3;
        Integer numValueOf;
        zzahn.a();
        zzic zzicVar = this.f12611h.f13202a;
        zzal zzalVar = zzicVar.f13097d;
        zzgn zzgnVar = zzicVar.f13103j;
        zzgu zzguVar = zzicVar.f13099f;
        boolean zR = zzalVar.r(this.f12604a, zzfy.D0);
        com.google.android.gms.internal.measurement.zzfn zzfnVar = this.f12610g;
        boolean zC = zzfnVar.C();
        boolean zD = zzfnVar.D();
        boolean zF = zzfnVar.F();
        if (zC || zD || zF) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && !z12) {
            zzic.m(zzguVar);
            zzgs zzgsVar = zzguVar.f12949n;
            Integer numValueOf2 = Integer.valueOf(this.f12605b);
            if (zzfnVar.y()) {
                numValueOf = Integer.valueOf(zzfnVar.z());
            } else {
                numValueOf = null;
            }
            zzgsVar.c(numValueOf2, numValueOf, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        com.google.android.gms.internal.measurement.zzfh zzfhVarB = zzfnVar.B();
        boolean zD2 = zzfhVarB.D();
        if (zziuVar.D()) {
            if (!zzfhVarB.A()) {
                zzic.m(zzguVar);
                zzguVar.f12945i.b(zzgnVar.c(zziuVar.A()), "No number filter for long property. property");
                z13 = zF;
                boolD = null;
            } else {
                z13 = zF;
                try {
                    boolF3 = zzab.f(new BigDecimal(zziuVar.E()), zzfhVarB.B(), 0.0d);
                } catch (NumberFormatException unused) {
                    boolF3 = null;
                }
                boolD = zzab.d(boolF3, zD2);
            }
        } else {
            z13 = zF;
            if (zziuVar.H()) {
                if (!zzfhVarB.A()) {
                    zzic.m(zzguVar);
                    zzguVar.f12945i.b(zzgnVar.c(zziuVar.A()), "No number filter for double property. property");
                    boolD = null;
                } else {
                    double dI = zziuVar.I();
                    try {
                        boolF2 = zzab.f(new BigDecimal(dI), zzfhVarB.B(), Math.ulp(dI));
                    } catch (NumberFormatException unused2) {
                        boolF2 = null;
                    }
                    boolD = zzab.d(boolF2, zD2);
                }
            } else {
                if (zziuVar.B()) {
                    if (!zzfhVarB.y()) {
                        if (!zzfhVarB.A()) {
                            zzic.m(zzguVar);
                            zzguVar.f12945i.b(zzgnVar.c(zziuVar.A()), "No string or number filter defined. property");
                        } else if (zzpk.K(zziuVar.C())) {
                            String strC = zziuVar.C();
                            com.google.android.gms.internal.measurement.zzfl zzflVarB = zzfhVarB.B();
                            if (!zzpk.K(strC)) {
                                boolF = null;
                            } else {
                                try {
                                    boolF = zzab.f(new BigDecimal(strC), zzflVarB, 0.0d);
                                } catch (NumberFormatException unused3) {
                                    boolF = null;
                                }
                            }
                            boolD = zzab.d(boolF, zD2);
                        } else {
                            zzic.m(zzguVar);
                            zzguVar.f12945i.c(zzgnVar.c(zziuVar.A()), zziuVar.C(), "Invalid user property value for Numeric number filter. property, value");
                        }
                    } else {
                        String strC2 = zziuVar.C();
                        com.google.android.gms.internal.measurement.zzfr zzfrVarZ = zzfhVarB.z();
                        zzic.m(zzguVar);
                        boolD = zzab.d(zzab.e(strC2, zzfrVarZ, zzguVar), zD2);
                    }
                } else {
                    zzic.m(zzguVar);
                    zzguVar.f12945i.b(zzgnVar.c(zziuVar.A()), "User property has no value, property");
                }
                boolD = null;
            }
        }
        zzic.m(zzguVar);
        zzguVar.f12949n.b(boolD == null ? evRpcb.YdeeJlAAcVi : boolD, "Property filter result");
        if (boolD == null) {
            return false;
        }
        this.f12606c = Boolean.TRUE;
        if (!z13 || boolD.booleanValue()) {
            if (!z11 || zzfnVar.C()) {
                this.f12607d = boolD;
            }
            if (boolD.booleanValue() && z12 && zziuVar.y()) {
                long jZ = zziuVar.z();
                if (l9 != null) {
                    jZ = l9.longValue();
                }
                if (zR && zzfnVar.C() && !zzfnVar.D() && l11 != null) {
                    jZ = l11.longValue();
                }
                if (zzfnVar.D()) {
                    this.f12609f = Long.valueOf(jZ);
                } else {
                    this.f12608e = Long.valueOf(jZ);
                }
            }
        }
        return true;
    }
}
