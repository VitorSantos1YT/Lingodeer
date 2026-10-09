package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzahn;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaa extends zzab {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzff f12602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzad f12603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzad zzadVar, String str, int i11, com.google.android.gms.internal.measurement.zzff zzffVar) {
        super(str, i11);
        this.f12603h = zzadVar;
        this.f12602g = zzffVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final int a() {
        return this.f12602g.z();
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzab
    public final boolean c() {
        return this.f12602g.E();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0273  */
    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:111:0x02af  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:131:0x0304  */
    /* JADX WARN: Code duplicated, block: B:133:0x030a  */
    /* JADX WARN: Code duplicated, block: B:135:0x031e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0324  */
    /* JADX WARN: Code duplicated, block: B:139:0x032c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0336  */
    /* JADX WARN: Code duplicated, block: B:150:0x0359  */
    /* JADX WARN: Code duplicated, block: B:153:0x0362  */
    /* JADX WARN: Code duplicated, block: B:158:0x0399 A[EDGE_INSN: B:158:0x0399->B:161:0x03c3 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ac A[EDGE_INSN: B:159:0x03ac->B:161:0x03c3 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6]] */
    /* JADX WARN: Code duplicated, block: B:201:0x033d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c3 A[EDGE_INSN: B:234:0x03c3->B:161:0x03c3 BREAK  A[LOOP:1: B:59:0x0183->B:64:0x01a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x0189  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6 A[LOOP:1: B:59:0x0183->B:64:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0216  */
    /* JADX WARN: Code duplicated, block: B:91:0x0246  */
    /* JADX WARN: Code duplicated, block: B:96:0x025a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean g(Long l9, Long l11, com.google.android.gms.internal.measurement.zzhs zzhsVar, long j11, zzbd zzbdVar, boolean z11) {
        HashSet hashSet;
        Iterator it;
        e eVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfh zzfhVar;
        boolean z12;
        String strF;
        Object obj;
        Boolean boolF;
        Boolean boolF2;
        String str;
        com.google.android.gms.internal.measurement.zzfl zzflVarB;
        long j12;
        Boolean boolF3;
        com.google.android.gms.internal.measurement.zzhw zzhwVar;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzfh zzfhVar2;
        Boolean boolF4;
        int i11;
        zzahn.a();
        zzad zzadVar = this.f12603h;
        zzic zzicVar = zzadVar.f13202a;
        zzal zzalVar = zzicVar.f13097d;
        zzgu zzguVar = zzicVar.f13099f;
        zzgn zzgnVar = zzicVar.f13103j;
        zzfx zzfxVar = zzfy.F0;
        String str2 = this.f12604a;
        boolean zR = zzalVar.r(str2, zzfxVar);
        com.google.android.gms.internal.measurement.zzff zzffVar = this.f12602g;
        long j13 = zzffVar.J() ? zzbdVar.f12693e : j11;
        zzic.m(zzguVar);
        zzgs zzgsVar = zzguVar.f12949n;
        zzgs zzgsVar2 = zzguVar.f12945i;
        boolean zIsLoggable = Log.isLoggable(zzguVar.q(), 2);
        int i12 = this.f12605b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            zzic.m(zzguVar);
            zzgsVar.d("Evaluating filter. audience, filter, event", Integer.valueOf(i12), zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null, zzgnVar.a(zzffVar.A()));
            zzic.m(zzguVar);
            zzpk zzpkVar = zzadVar.f13552b.f13601g;
            zzpg.U(zzpkVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (zzffVar.y()) {
                i11 = 0;
                zzpk.B(sb2, 0, "filter_id", Integer.valueOf(zzffVar.z()));
            } else {
                i11 = 0;
            }
            zzpk.B(sb2, i11, "event_name", zzpkVar.f13202a.f13103j.a(zzffVar.A()));
            String strX = zzpk.x(zzffVar.G(), zzffVar.H(), zzffVar.J());
            if (!strX.isEmpty()) {
                zzpk.B(sb2, 0, "filter_type", strX);
            }
            if (zzffVar.E()) {
                zzpk.C(sb2, 1, "event_count_filter", zzffVar.F());
            }
            if (zzffVar.C() > 0) {
                sb2.append("  filters {\n");
                Iterator it4 = zzffVar.B().iterator();
                while (it4.hasNext()) {
                    zzpkVar.u(sb2, 2, (com.google.android.gms.internal.measurement.zzfh) it4.next());
                }
            }
            zzpk.v(1, sb2);
            sb2.append("}\n}\n");
            zzgsVar.b(sb2.toString(), "Filter definition");
        }
        if (!zzffVar.y() || zzffVar.z() > 256) {
            zzic.m(zzguVar);
            zzgsVar2.c(zzgu.o(str2), String.valueOf(zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z13 = zzffVar.G() || zzffVar.H() || zzffVar.J();
        if (z11 && !z13) {
            zzic.m(zzguVar);
            zzgsVar.c(Integer.valueOf(i12), zzffVar.y() ? Integer.valueOf(zzffVar.z()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strD = zzhsVar.D();
        if (!zzffVar.E()) {
            hashSet = new HashSet();
            it = zzffVar.B().iterator();
            while (true) {
                if (it.hasNext()) {
                    eVar = new e(0);
                    it2 = zzhsVar.A().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzffVar.B().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zR = zR;
                                    zzguVar = zzguVar;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                if (zzfhVar.C()) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                strF = zzfhVar.F();
                                if (strF.isEmpty()) {
                                    obj = eVar.get(strF);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zR = zR;
                                                zzguVar = zzguVar;
                                                if (obj == null) {
                                                    zzic.m(zzguVar);
                                                    zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "Unknown param type. event, param");
                                                    break;
                                                }
                                                zzic.m(zzguVar);
                                                zzgsVar.c(zzgnVar.a(strD), zzgnVar.b(strF), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzfhVar.y()) {
                                                if (zzfhVar.A()) {
                                                    zR = zR;
                                                    zzguVar = zzguVar;
                                                    zzic.m(zzguVar);
                                                    zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (zzpk.K(str)) {
                                                    zR = zR;
                                                    zzguVar = zzguVar;
                                                    zzic.m(zzguVar);
                                                    zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                zzflVarB = zzfhVar.B();
                                                if (zzpk.K(str)) {
                                                    zR = zR;
                                                    zzguVar = zzguVar;
                                                    j12 = 0;
                                                    boolF3 = zzab.f(new BigDecimal(str), zzflVarB, 0.0d);
                                                } else {
                                                    boolF3 = null;
                                                }
                                                if (boolF3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolF3.booleanValue() == z12) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                zzguVar = zzguVar;
                                                zR = zR;
                                            } else {
                                                com.google.android.gms.internal.measurement.zzfr zzfrVarZ = zzfhVar.z();
                                                zzic.m(zzguVar);
                                                boolF3 = zzab.e((String) obj, zzfrVarZ, zzguVar);
                                            }
                                            j12 = 0;
                                            if (boolF3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolF3.booleanValue() == z12) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            zzguVar = zzguVar;
                                            zR = zR;
                                        } else if (zzfhVar.A()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolF2 = zzab.f(new BigDecimal(dDoubleValue), zzfhVar.B(), Math.ulp(dDoubleValue));
                                            if (boolF2 != null) {
                                                if (boolF2.booleanValue() == z12) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            zzic.m(zzguVar);
                                            zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "No number filter for double param. event, param");
                                        }
                                    } else if (zzfhVar.A()) {
                                        boolF = zzab.f(new BigDecimal(((Long) obj).longValue()), zzfhVar.B(), 0.0d);
                                        if (boolF != null) {
                                            if (boolF.booleanValue() == z12) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        zzic.m(zzguVar);
                                        zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "No number filter for long param. event, param");
                                    }
                                } else {
                                    zzic.m(zzguVar);
                                    zzgsVar2.b(zzgnVar.a(strD), "Event has empty param name. event");
                                }
                            }
                        } else {
                            zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                            if (!hashSet.contains(zzhwVar.z())) {
                                if (zzhwVar.C()) {
                                    String strZ = zzhwVar.z();
                                    if (zzhwVar.C()) {
                                        lValueOf = Long.valueOf(zzhwVar.D());
                                    } else {
                                        lValueOf = null;
                                    }
                                    eVar.put(strZ, lValueOf);
                                } else if (zzhwVar.G()) {
                                    String strZ2 = zzhwVar.z();
                                    if (zzhwVar.G()) {
                                        dValueOf = Double.valueOf(zzhwVar.H());
                                    } else {
                                        dValueOf = null;
                                    }
                                    eVar.put(strZ2, dValueOf);
                                } else if (zzhwVar.A()) {
                                    eVar.put(zzhwVar.z(), zzhwVar.B());
                                } else {
                                    zzic.m(zzguVar);
                                    zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(zzhwVar.z()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                    if (zzfhVar2.F().isEmpty()) {
                        zzic.m(zzguVar);
                        zzgsVar2.b(zzgnVar.a(strD), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(zzfhVar2.F());
                    }
                }
                zR = zR;
                zzguVar = zzguVar;
                break;
            }
        }
        try {
            boolF4 = zzab.f(new BigDecimal(j13), zzffVar.F(), 0.0d);
        } catch (NumberFormatException unused) {
            boolF4 = null;
        }
        if (boolF4 != null) {
            if (boolF4.booleanValue()) {
                hashSet = new HashSet();
                it = zzffVar.B().iterator();
                while (true) {
                    if (it.hasNext()) {
                        eVar = new e(0);
                        it2 = zzhsVar.A().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = zzffVar.B().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zR = zR;
                                        zzguVar = zzguVar;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    zzfhVar = (com.google.android.gms.internal.measurement.zzfh) it3.next();
                                    if (zzfhVar.C() || !zzfhVar.D()) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    strF = zzfhVar.F();
                                    if (strF.isEmpty()) {
                                        obj = eVar.get(strF);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zR = zR;
                                                    zzguVar = zzguVar;
                                                    if (obj == null) {
                                                        zzic.m(zzguVar);
                                                        zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    zzic.m(zzguVar);
                                                    zzgsVar.c(zzgnVar.a(strD), zzgnVar.b(strF), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (zzfhVar.y()) {
                                                    if (zzfhVar.A()) {
                                                        zR = zR;
                                                        zzguVar = zzguVar;
                                                        zzic.m(zzguVar);
                                                        zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (zzpk.K(str)) {
                                                        zR = zR;
                                                        zzguVar = zzguVar;
                                                        zzic.m(zzguVar);
                                                        zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    zzflVarB = zzfhVar.B();
                                                    if (zzpk.K(str)) {
                                                        boolF3 = null;
                                                    } else {
                                                        try {
                                                            zR = zR;
                                                            zzguVar = zzguVar;
                                                            j12 = 0;
                                                            try {
                                                                boolF3 = zzab.f(new BigDecimal(str), zzflVarB, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolF3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zR = zR;
                                                            zzguVar = zzguVar;
                                                            j12 = 0;
                                                        }
                                                    }
                                                    if (boolF3 != null) {
                                                        break;
                                                    }
                                                    if (boolF3.booleanValue() == z12) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    zzguVar = zzguVar;
                                                    zR = zR;
                                                } else {
                                                    com.google.android.gms.internal.measurement.zzfr zzfrVarZ2 = zzfhVar.z();
                                                    zzic.m(zzguVar);
                                                    boolF3 = zzab.e((String) obj, zzfrVarZ2, zzguVar);
                                                }
                                                j12 = 0;
                                                if (boolF3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolF3.booleanValue() == z12) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                zzguVar = zzguVar;
                                                zR = zR;
                                            } else if (zzfhVar.A()) {
                                                zzic.m(zzguVar);
                                                zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolF2 = zzab.f(new BigDecimal(dDoubleValue2), zzfhVar.B(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolF2 = null;
                                                }
                                                if (boolF2 != null) {
                                                    if (boolF2.booleanValue() == z12) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (zzfhVar.A()) {
                                            zzic.m(zzguVar);
                                            zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(strF), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolF = zzab.f(new BigDecimal(((Long) obj).longValue()), zzfhVar.B(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolF = null;
                                            }
                                            if (boolF != null) {
                                                if (boolF.booleanValue() == z12) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        zzic.m(zzguVar);
                                        zzgsVar2.b(zzgnVar.a(strD), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it2.next();
                                if (!hashSet.contains(zzhwVar.z())) {
                                    if (zzhwVar.C()) {
                                        String strZ3 = zzhwVar.z();
                                        if (zzhwVar.C()) {
                                            lValueOf = Long.valueOf(zzhwVar.D());
                                        } else {
                                            lValueOf = null;
                                        }
                                        eVar.put(strZ3, lValueOf);
                                    } else if (zzhwVar.G()) {
                                        String strZ4 = zzhwVar.z();
                                        if (zzhwVar.G()) {
                                            dValueOf = Double.valueOf(zzhwVar.H());
                                        } else {
                                            dValueOf = null;
                                        }
                                        eVar.put(strZ4, dValueOf);
                                    } else if (zzhwVar.A()) {
                                        eVar.put(zzhwVar.z(), zzhwVar.B());
                                    } else {
                                        zzic.m(zzguVar);
                                        zzgsVar2.c(zzgnVar.a(strD), zzgnVar.b(zzhwVar.z()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        zzfhVar2 = (com.google.android.gms.internal.measurement.zzfh) it.next();
                        if (zzfhVar2.F().isEmpty()) {
                            zzic.m(zzguVar);
                            zzgsVar2.b(zzgnVar.a(strD), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(zzfhVar2.F());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zR = zR;
        zzguVar = zzguVar;
        break;
        zzic.m(zzguVar);
        zzgsVar.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f12606c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f12607d = bool2;
        if (!z13 || !zzhsVar.E()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(zzhsVar.F());
        if (zzffVar.H()) {
            if (zR && zzffVar.E()) {
                lValueOf2 = l9;
            }
            this.f12609f = lValueOf2;
            return true;
        }
        if (zR && zzffVar.E()) {
            lValueOf2 = l11;
        }
        this.f12608e = lValueOf2;
        return true;
    }
}
