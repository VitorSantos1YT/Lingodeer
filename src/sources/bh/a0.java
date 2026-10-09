package bh;

import com.lingodeer.data.model.CourseUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f4145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f4146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(a1 a1Var, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4142a = i11;
        this.f4145d = a1Var;
        this.f4146e = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4142a) {
            case 0:
                return new a0(this.f4145d, this.f4146e, dVar, 0);
            default:
                a0 a0Var = new a0(this.f4145d, this.f4146e, dVar, 1);
                a0Var.f4144c = obj;
                return a0Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4142a) {
            case 0:
                return ((a0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((a0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[LOOP:1: B:41:0x00f4->B:42:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0205 A[SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        eq.a aVar;
        Object objU;
        Object objU2;
        eq.b bVar;
        cm.a aVarB;
        HashMap map;
        Iterator it;
        CourseUnit courseUnit;
        ArrayList arrayListN;
        int size;
        int i11;
        int i12;
        Object obj2;
        int i13;
        long jLongValue;
        int i14;
        Integer num;
        int size2;
        int i15;
        int i16;
        Object obj3;
        int i17;
        long jLongValue2;
        int size3;
        int i18;
        Object objM;
        int i19 = this.f4142a;
        int i21 = 0;
        List list = this.f4146e;
        a1 a1Var = this.f4145d;
        vy.d dVar = null;
        int i22 = 1;
        int i23 = 2;
        switch (i19) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f4143b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        aVar = (eq.a) this.f4144c;
                        com.bumptech.glide.e.F(obj);
                        objU = obj;
                    } else {
                        if (i24 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (eq.b) this.f4144c;
                        com.bumptech.glide.e.F(obj);
                        objU2 = obj;
                    }
                    aVarB = cm.a.b((String) objU2);
                    map = new HashMap();
                    Objects.toString(bVar);
                    it = list.iterator();
                    while (it.hasNext()) {
                        courseUnit = (CourseUnit) it.next();
                        arrayListN = ks.b.n(courseUnit.getLessonList());
                        if (courseUnit.getLevelId() < bVar.f25737a) {
                            size3 = arrayListN.size();
                            i18 = i21;
                            while (i18 < size3) {
                                Object obj4 = arrayListN.get(i18);
                                i18++;
                                map.put(new Long(((Number) obj4).longValue()), new Integer(1));
                            }
                        } else if (courseUnit.getLevelId() != bVar.f25737a && courseUnit.getSortIndex() < bVar.f25738b) {
                            int size4 = arrayListN.size();
                            int i25 = i21;
                            while (i25 < size4) {
                                Object obj5 = arrayListN.get(i25);
                                i25++;
                                map.put(new Long(((Number) obj5).longValue()), new Integer(1));
                            }
                        } else if (courseUnit.getLevelId() == bVar.f25737a && courseUnit.getSortIndex() == bVar.f25738b) {
                            size = arrayListN.size();
                            i11 = i21;
                            i12 = i11;
                            while (i12 < size) {
                                obj2 = arrayListN.get(i12);
                                i12++;
                                i13 = i11 + 1;
                                if (i11 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                Iterator it2 = it;
                                jLongValue = ((Number) obj2).longValue();
                                i14 = bVar.f25739c;
                                if (i13 < i14) {
                                    map.put(new Long(jLongValue), new Integer(1));
                                } else if (i13 == i14) {
                                    map.put(new Long(jLongValue), new Integer(0));
                                }
                                it = it2;
                                i11 = i13;
                            }
                        }
                        Iterator it3 = it;
                        num = (Integer) aVarB.f7184b.get(new Long(courseUnit.getUnitId()));
                        if (num != null) {
                            size2 = arrayListN.size();
                            i15 = 0;
                            i16 = 0;
                            while (i16 < size2) {
                                obj3 = arrayListN.get(i16);
                                i16++;
                                i17 = i15 + 1;
                                if (i15 >= 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                jLongValue2 = ((Number) obj3).longValue();
                                if (i17 < num.intValue()) {
                                    map.put(new Long(jLongValue2), new Integer(1));
                                } else {
                                    if (i17 != num.intValue() && map.get(new Long(jLongValue2)) == null) {
                                        map.put(new Long(jLongValue2), new Integer(0));
                                    }
                                    i15 = i17;
                                }
                                i15 = i17;
                            }
                        }
                        it = it3;
                        i21 = 0;
                    }
                    return map;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVar = new gp.r(new c0(i22, a1Var, dVar));
                aVar = eq.b.f25736d;
                this.f4144c = aVar;
                this.f4143b = 1;
                objU = uz.x0.u(rVar, this);
                if (objU == aVar2) {
                    return aVar2;
                }
                String positionStr = (String) objU;
                aVar.getClass();
                kotlin.jvm.internal.m.f(positionStr, "positionStr");
                eq.b bVar2 = new eq.b();
                bVar2.a(positionStr);
                gp.r rVar2 = new gp.r(new c0(i23, a1Var, dVar));
                this.f4144c = bVar2;
                this.f4143b = 2;
                objU2 = uz.x0.u(rVar2, this);
                if (objU2 == aVar2) {
                    return aVar2;
                }
                bVar = bVar2;
                aVarB = cm.a.b((String) objU2);
                map = new HashMap();
                Objects.toString(bVar);
                it = list.iterator();
                while (it.hasNext()) {
                    courseUnit = (CourseUnit) it.next();
                    arrayListN = ks.b.n(courseUnit.getLessonList());
                    if (courseUnit.getLevelId() < bVar.f25737a) {
                        size3 = arrayListN.size();
                        i18 = i21;
                        while (i18 < size3) {
                            Object obj6 = arrayListN.get(i18);
                            i18++;
                            map.put(new Long(((Number) obj6).longValue()), new Integer(1));
                        }
                    } else if (courseUnit.getLevelId() != bVar.f25737a) {
                        if (courseUnit.getLevelId() == bVar.f25737a) {
                            size = arrayListN.size();
                            i11 = i21;
                            i12 = i11;
                            while (i12 < size) {
                                obj2 = arrayListN.get(i12);
                                i12++;
                                i13 = i11 + 1;
                                if (i11 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                Iterator it4 = it;
                                jLongValue = ((Number) obj2).longValue();
                                i14 = bVar.f25739c;
                                if (i13 < i14) {
                                    map.put(new Long(jLongValue), new Integer(1));
                                } else if (i13 == i14) {
                                    map.put(new Long(jLongValue), new Integer(0));
                                }
                                it = it4;
                                i11 = i13;
                            }
                        }
                    } else if (courseUnit.getLevelId() == bVar.f25737a) {
                        size = arrayListN.size();
                        i11 = i21;
                        i12 = i11;
                        while (i12 < size) {
                            obj2 = arrayListN.get(i12);
                            i12++;
                            i13 = i11 + 1;
                            if (i11 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            Iterator it5 = it;
                            jLongValue = ((Number) obj2).longValue();
                            i14 = bVar.f25739c;
                            if (i13 < i14) {
                                map.put(new Long(jLongValue), new Integer(1));
                            } else if (i13 == i14) {
                                map.put(new Long(jLongValue), new Integer(0));
                            }
                            it = it5;
                            i11 = i13;
                        }
                    }
                    Iterator it6 = it;
                    num = (Integer) aVarB.f7184b.get(new Long(courseUnit.getUnitId()));
                    if (num != null) {
                        size2 = arrayListN.size();
                        i15 = 0;
                        i16 = 0;
                        while (i16 < size2) {
                            obj3 = arrayListN.get(i16);
                            i16++;
                            i17 = i15 + 1;
                            if (i15 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            jLongValue2 = ((Number) obj3).longValue();
                            if (i17 < num.intValue()) {
                                map.put(new Long(jLongValue2), new Integer(1));
                            } else {
                                if (i17 != num.intValue()) {
                                }
                                i15 = i17;
                            }
                            i15 = i17;
                        }
                    }
                    it = it6;
                    i21 = 0;
                }
                return map;
            default:
                uz.j jVar = (uz.j) this.f4144c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f4143b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM = obj;
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                a0 a0Var = new a0(a1Var, list, dVar, i21);
                this.f4144c = jVar;
                this.f4143b = 1;
                objM = rz.e0.M(eVar, a0Var, this);
                if (objM == aVar3) {
                    return aVar3;
                }
                this.f4144c = null;
                this.f4143b = 2;
                if (jVar.emit((HashMap) objM, this) == aVar3) {
                    return aVar3;
                }
                return qy.b0.f48488a;
        }
    }
}
