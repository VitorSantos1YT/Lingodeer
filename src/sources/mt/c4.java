package mt;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import rt.ae;
import rt.bb;
import rt.qa;
import rt.qd;
import rt.u8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c4 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, i12, cls, obj, str, str2);
        this.f41311a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0183  */
    /* JADX WARN: Code duplicated, block: B:56:0x0193  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Iterable, java.lang.Object] */
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
    @Override // fz.c
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object objA;
        Object value3;
        Object objA2;
        Object value4;
        Object objA3;
        o3.a aVar;
        s0.l0 l0VarB;
        Integer numValueOf;
        switch (this.f41311a) {
            case 0:
                String str = (String) obj;
                uz.i1 i1Var = (uz.i1) ((rt.e3) this.receiver).A0.f4945c;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, ae.a((ae) value, null, str, null, 11)));
                return qy.b0.f48488a;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                rt.r5 r5Var = (rt.r5) this.receiver;
                r5Var.getClass();
                r5Var.r(new fr.r3(iIntValue, 5));
                rz.e0.B(ViewModelKt.getViewModelScope(r5Var), null, null, new rt.o5(r5Var, iIntValue, null, 2), 3);
                return qy.b0.f48488a;
            case 2:
                rt.y4 p4 = (rt.y4) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                rt.r5 r5Var2 = (rt.r5) this.receiver;
                r5Var2.getClass();
                r5Var2.r(new ot.e2(p4, 22));
                r5Var2.n();
                return qy.b0.f48488a;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rt.r5 r5Var3 = (rt.r5) this.receiver;
                r5Var3.getClass();
                r5Var3.r(new jt.n1(zBooleanValue, 5));
                return qy.b0.f48488a;
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                rt.r5 r5Var4 = (rt.r5) this.receiver;
                uz.i1 i1Var2 = r5Var4.M;
                rt.s4 s4Var = zBooleanValue2 ? rt.s4.SHUFFLE : rt.s4.IN_ORDER;
                Object value5 = i1Var2.getValue();
                rt.b5 b5Var = value5 instanceof rt.b5 ? (rt.b5) value5 : null;
                if (b5Var != null && b5Var.f49512e.f50630g != s4Var) {
                    r5Var4.r(new ot.e2(s4Var, 23));
                    if (zBooleanValue2) {
                        do {
                            value3 = i1Var2.getValue();
                            objA2 = (rt.c5) value3;
                            if (objA2 instanceof rt.b5) {
                                rt.b5 b5Var2 = (rt.b5) objA2;
                                int i11 = b5Var2.f49514g;
                                List list = b5Var2.f49513f;
                                int size = list.size();
                                if (i11 < 0 || i11 >= size) {
                                    objA2 = b5Var2;
                                } else {
                                    int i12 = i11 + 1;
                                    objA2 = rt.b5.a(b5Var2, false, null, null, null, ry.m.H0(ry.m.U0(list, i12), ns.o.S(ry.m.k0(list, i12))), 0, null, null, 479);
                                }
                            }
                        } while (!i1Var2.j(value3, objA2));
                    } else {
                        do {
                            value2 = i1Var2.getValue();
                            objA = (rt.c5) value2;
                            if (objA instanceof rt.b5) {
                                rt.b5 b5Var3 = (rt.b5) objA;
                                List list2 = b5Var3.f49513f;
                                int iW = ry.x.W(ry.n.W(list2, 10));
                                if (iW < 16) {
                                    iW = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                                for (Object obj2 : list2) {
                                    linkedHashMap.put(((rt.t4) obj2).f50421a, obj2);
                                }
                                ArrayList arrayList = new ArrayList(ry.n.W(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((rt.t4) it.next()).f50421a);
                                }
                                int i13 = b5Var3.f49514g;
                                ?? inOrderQueueIds = r5Var4.U;
                                kotlin.jvm.internal.m.f(inOrderQueueIds, "inOrderQueueIds");
                                if (i13 >= 0 && i13 < arrayList.size()) {
                                    int i14 = i13 + 1;
                                    List listU0 = ry.m.U0(arrayList, i14);
                                    List listK0 = ry.m.k0(arrayList, i14);
                                    Set setF1 = ry.m.f1(listK0);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : inOrderQueueIds) {
                                        if (setF1.contains((String) obj3)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    Set setF2 = ry.m.f1(arrayList2);
                                    ArrayList arrayListH0 = ry.m.H0(listU0, arrayList2);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : listK0) {
                                        if (!setF2.contains((String) obj4)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    arrayList = ry.m.H0(arrayListH0, arrayList3);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                int size2 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Object obj5 = arrayList.get(i15);
                                    i15++;
                                    rt.t4 t4Var = (rt.t4) linkedHashMap.get((String) obj5);
                                    if (t4Var != null) {
                                        arrayList4.add(t4Var);
                                    }
                                }
                                objA = rt.b5.a(b5Var3, false, null, null, null, arrayList4, 0, null, null, 479);
                            }
                        } while (!i1Var2.j(value2, objA));
                    }
                }
                return qy.b0.f48488a;
            case 5:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                rt.r5 r5Var5 = (rt.r5) this.receiver;
                r5Var5.getClass();
                r5Var5.r(new jt.n1(zBooleanValue3, 4));
                return qy.b0.f48488a;
            case 6:
                float fFloatValue = ((Number) obj).floatValue();
                rt.r5 r5Var6 = (rt.r5) this.receiver;
                r5Var6.getClass();
                r5Var6.r(new iv.m(4, fFloatValue));
                Object value6 = r5Var6.M.getValue();
                rt.b5 b5Var4 = value6 instanceof rt.b5 ? (rt.b5) value6 : null;
                if (b5Var4 != null && r5Var6.S && b5Var4.f49515h == rt.v4.PAUSED) {
                    r5Var6.f50337f.m(fFloatValue, false);
                }
                return qy.b0.f48488a;
            case 7:
                int iIntValue2 = ((Number) obj).intValue();
                rt.r5 r5Var7 = (rt.r5) this.receiver;
                r5Var7.getClass();
                r5Var7.r(new fr.r3(iIntValue2, 6));
                return qy.b0.f48488a;
            case 8:
                float fFloatValue2 = ((Number) obj).floatValue();
                rt.r5 r5Var8 = (rt.r5) this.receiver;
                r5Var8.getClass();
                r5Var8.r(new iv.m(2, fFloatValue2));
                return qy.b0.f48488a;
            case 9:
                float fFloatValue3 = ((Number) obj).floatValue();
                rt.r5 r5Var9 = (rt.r5) this.receiver;
                r5Var9.getClass();
                r5Var9.r(new iv.m(3, fFloatValue3));
                return qy.b0.f48488a;
            case 10:
                rt.w4 p11 = (rt.w4) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                rt.r5 r5Var10 = (rt.r5) this.receiver;
                r5Var10.getClass();
                r5Var10.j();
                uz.i1 i1Var3 = r5Var10.M;
                do {
                    value4 = i1Var3.getValue();
                    objA3 = (rt.c5) value4;
                    if (objA3 instanceof rt.b5) {
                        objA3 = rt.b5.a((rt.b5) objA3, false, null, p11, null, ry.r.f50854a, 0, rt.v4.IDLE, null, 23);
                    }
                } while (!i1Var3.j(value4, objA3));
                rz.e0.B(ViewModelKt.getViewModelScope(r5Var10), null, null, new ns.j(21, r5Var10, p11, null), 3);
                return qy.b0.f48488a;
            case 11:
                long jLongValue = ((Number) obj).longValue();
                rt.r5 r5Var11 = (rt.r5) this.receiver;
                r5Var11.getClass();
                r5Var11.s(new au.o(jLongValue, 19));
                return qy.b0.f48488a;
            case 12:
                int iIntValue3 = ((Number) obj).intValue();
                rt.r5 r5Var12 = (rt.r5) this.receiver;
                Object value7 = r5Var12.M.getValue();
                rt.b5 b5Var5 = value7 instanceof rt.b5 ? (rt.b5) value7 : null;
                if (b5Var5 != null && iIntValue3 >= 0 && iIntValue3 < b5Var5.f49513f.size()) {
                    r5Var12.p(iIntValue3);
                }
                return qy.b0.f48488a;
            case 13:
                rt.r4 p12 = (rt.r4) obj;
                kotlin.jvm.internal.m.f(p12, "p0");
                rt.r5 r5Var13 = (rt.r5) this.receiver;
                r5Var13.getClass();
                r5Var13.r(new ot.e2(p12, 24));
                return qy.b0.f48488a;
            case 14:
                u8 p13 = (u8) obj;
                kotlin.jvm.internal.m.f(p13, "p0");
                ((rt.j) this.receiver).g(p13);
                return qy.b0.f48488a;
            case 15:
                u8 p14 = (u8) obj;
                kotlin.jvm.internal.m.f(p14, "p0");
                ((rt.j) this.receiver).g(p14);
                return qy.b0.f48488a;
            case 16:
                ((rz.i1) this.receiver).j((Throwable) obj);
                return qy.b0.f48488a;
            case 17:
                KeyEvent keyEvent = ((q2.b) obj).f47410a;
                s0.f1 f1Var = (s0.f1) this.receiver;
                d1.f1 f1Var2 = f1Var.f51032f;
                boolean z11 = f1Var.f51030d;
                boolean z12 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    aVar = null;
                } else {
                    s0.f0 f0Var = f1Var.f51035i;
                    f0Var.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        f0Var.f51026a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = f0Var.f51026a;
                        if (num != null) {
                            f0Var.f51026a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        aVar = new o3.a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        aVar = null;
                    }
                }
                if (aVar != null) {
                    if (z11) {
                        f1Var.a(ns.o.K(aVar));
                        f1Var2.f22905a = null;
                    } else {
                        z12 = false;
                    }
                } else if (q2.c.c(keyEvent) != 2 || (l0VarB = f1Var.f51036j.b(keyEvent)) == null || (l0VarB.a() && !z11)) {
                    z12 = false;
                } else {
                    kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                    uVar.f38357a = true;
                    pr.a0 a0Var = new pr.a0(l0VarB, f1Var, uVar, 20);
                    o3.w wVar = f1Var.f51029c;
                    d1.p0 p0Var = new d1.p0(wVar, f1Var.f51033g, f1Var.f51027a.d(), f1Var2);
                    a0Var.invoke(p0Var);
                    if (!j3.x0.b(p0Var.f22962f, wVar.f44705b) || !kotlin.jvm.internal.m.a(p0Var.f22963g, wVar.f44704a)) {
                        f1Var.f51037k.invoke(o3.w.a(wVar, p0Var.f22963g, p0Var.f22962f, 4));
                    }
                    s0.t1 t1Var = f1Var.f51034h;
                    if (t1Var != null) {
                        t1Var.f51200e = true;
                    }
                    z12 = uVar.f38357a;
                }
                return Boolean.valueOf(z12);
            case 18:
                String p15 = (String) obj;
                kotlin.jvm.internal.m.f(p15, "p0");
                zr.b bVar = (zr.b) this.receiver;
                bVar.getClass();
                uz.i1 i1Var4 = bVar.f59294t;
                i1Var4.getClass();
                i1Var4.l(null, p15);
                return qy.b0.f48488a;
            case 19:
                kotlin.jvm.internal.m.f((Set) obj, "p0");
                w9.g gVar = (w9.g) this.receiver;
                ReentrantLock reentrantLock = gVar.f54803d;
                reentrantLock.lock();
                try {
                    List listA1 = ry.m.a1(gVar.f54802c.values());
                    reentrantLock.unlock();
                    Iterator it2 = listA1.iterator();
                    if (!it2.hasNext()) {
                        return qy.b0.f48488a;
                    }
                    ((w9.l) it2.next()).getClass();
                    throw null;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            case 20:
                long j11 = ((f2.b) obj).f26570a;
                y0.g gVar2 = (y0.g) this.receiver;
                gVar2.getClass();
                z0.e eVar = (z0.e) y2.f.i(gVar2, z0.f.f58418a);
                if (eVar != null) {
                    rz.e0.B(gVar2.H0(), null, null, new rt.h(gVar2, eVar, new y0.f(gVar2, j11), (vy.d) null, 29), 3);
                }
                return qy.b0.f48488a;
            case 21:
                ((u0.a) this.receiver).f52717b.a((fz.c) obj);
                return qy.b0.f48488a;
            case 22:
                qa p16 = (qa) obj;
                kotlin.jvm.internal.m.f(p16, "p0");
                bb bbVar = (bb) this.receiver;
                bbVar.getClass();
                uz.i1 i1Var5 = bbVar.O;
                i1Var5.getClass();
                i1Var5.l(null, p16);
                return qy.b0.f48488a;
            case 23:
                qa p17 = (qa) obj;
                kotlin.jvm.internal.m.f(p17, "p0");
                bb bbVar2 = (bb) this.receiver;
                bbVar2.getClass();
                uz.i1 i1Var6 = bbVar2.O;
                i1Var6.getClass();
                i1Var6.l(null, p17);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                int iIntValue4 = ((Number) obj).intValue();
                qd qdVar = (qd) this.receiver;
                qdVar.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(qdVar), null, null, new bp.h2(qdVar, iIntValue4, (vy.d) null, 11), 3);
                return qy.b0.f48488a;
            default:
                int iIntValue5 = ((Number) obj).intValue();
                qd qdVar2 = (qd) this.receiver;
                qdVar2.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(qdVar2), null, null, new bp.h2(qdVar2, iIntValue5, (vy.d) null, 11), 3);
                return qy.b0.f48488a;
        }
    }
}
